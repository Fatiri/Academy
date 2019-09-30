package com.enigma;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String name = req.getParameter("name");
        String output = "<html>"+
                        "<body>"+
                        "<h1>"+name+"</h1>"+
                        "</body>"+
                        "</html>";

        resp.setContentType("text/html");
        resp.getWriter().print(output);
    }
}
