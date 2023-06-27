package com.example.javaeetest;

import logic.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet  extends javax.servlet.http.HttpServlet  {

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        HttpSession session = req.getSession();

        String user = (String)session.getAttribute("current_user");

        if(user == null){
            // response для анонимного полььзователя
            // авторизация
            // регистрация
            // session.setAttrubute("current_user", ID);
        } else {
            // response для авторизоывнного пользователя
        }
//        Cart cart = (Cart) session.getAttribute("cart");
//
//        String name = req.getParameter("name");
//        int quantity = Integer.parseInt(req.getParameter("quantity"));
//
//
//        if(cart == null){
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart", cart);
//
//        PrintWriter wr = resp.getWriter();
//
//        wr.println("<html>");
//        wr.println("<h1> Your count is " +  + "</h1>");
//        wr.println("</html>");

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(req,resp);
    }

}
