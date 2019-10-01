package com.enigma;

import com.enigma.model.Direction;
import com.enigma.model.Robot;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RobotMove extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String coordinate = req.getParameter("inputCoordinat");
        String[] var1 = coordinate.split(",");
        Direction dir = Direction.valueOf(var1[2].toUpperCase());
        Robot var2 = new Robot(Integer.parseInt(var1[0]), Integer.parseInt(var1[1]), dir);
        String bensin = req.getParameter("inputBensin");
        var2.setBatry(Integer.parseInt(bensin));
        String intrksi = req.getParameter("inputIntruksi");
        var2.setCommands(intrksi);
        var2.run();
        String hasilAkhir = var2.print();
        req.setAttribute("hasil", hasilAkhir);
        req.getRequestDispatcher("/hasil/hasilnya.jsp").forward(req,resp);
    }
}
