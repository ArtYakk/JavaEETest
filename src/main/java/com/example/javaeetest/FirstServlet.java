package com.example.javaeetest;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet  extends javax.servlet.http.HttpServlet  {

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
       String name = req.getParameter("name");
       String surname = req.getParameter("surname");

        PrintWriter wr = resp.getWriter();
        wr.println("<html>");
        wr.println("<h1> Hello, " + name + " " + surname + "</h1>");
        wr.println("</html>");

        //resp.sendRedirect("/firstJSP.jsp");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/firstJSP.jsp");
        dispatcher.forward(req,resp);
    }

}
