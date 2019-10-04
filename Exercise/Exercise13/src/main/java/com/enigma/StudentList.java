package com.enigma;

import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("from com.enigma.model.Student").getResultList();
        session.getTransaction().commit();
        req.setAttribute("studentList", students);
        req.getRequestDispatcher("/student/studentList.jsp").forward(req,resp);

    }
}
