package com.enigma;

import com.enigma.config.HibernateConfigs;
import com.enigma.Dao.StudentDao;
import com.enigma.model.Student;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.bind.v2.model.core.ID;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.Date;

public class StudentDetail extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String getIdStudent = req.getParameter("id");
        Integer idStudent = Integer.parseInt(getIdStudent);
        req.setAttribute("studentdao", StudentDao.getStudent(idStudent));
        req.getRequestDispatcher("student/detailStudent.jsp").forward(req,resp);
    }


}
