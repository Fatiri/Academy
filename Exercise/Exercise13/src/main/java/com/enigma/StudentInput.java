package com.enigma;

import com.enigma.config.HibernateConfigs;
import com.enigma.dao.StudentDao;
import com.enigma.model.Student;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class StudentInput extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Integer student = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String birthPlace = req.getParameter("birthPlace");
        Date birthDate = java.sql.Date.valueOf(req.getParameter("birthDate"));
        String gender = req.getParameter("gender");
        Student students = new Student(student,name,birthPlace,birthDate,gender);
        StudentDao.create(students);
        resp.sendRedirect("studentList");
    }
}
