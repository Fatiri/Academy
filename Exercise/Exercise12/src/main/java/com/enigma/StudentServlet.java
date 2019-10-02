package com.enigma;

import com.enigma.Dao.StudentDao;
import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateConfigs.getSessionFactory().openSession(); // membuat session
        session.beginTransaction(); // memulai session
        List<Student> students = session.createQuery("from com.enigma.model.Student").getResultList(); // List query yg di select
        session.getTransaction().commit();
        req.setAttribute("students", students); // mengirim data menggunakan
        req.getRequestDispatcher("/student/studentList.jsp").forward(req, resp);
    }


}
