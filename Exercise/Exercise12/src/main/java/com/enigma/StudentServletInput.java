package com.enigma;

import com.enigma.Dao.StudentDao;
import com.enigma.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class StudentServletInput extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("ID")) ;
        String name = req.getParameter("name");
        String birthPlace = req.getParameter("birthPlace");
        Date birthDate =  java.sql.Date.valueOf(req.getParameter("birthDate"));
        String gender = req.getParameter("gender");
        Student student= new Student(id,name,birthPlace,birthDate,gender);

        StudentDao.create(student);
        resp.sendRedirect("student-table.pl");
    }

}
