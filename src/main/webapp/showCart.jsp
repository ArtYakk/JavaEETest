<%--
  Created by IntelliJ IDEA.
  User: artem
  Date: 27.06.2023
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
    <%@ page import="logic.Cart" %>

    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p> Наименование: <%= cart.getName() %></p>
    <p> Количество: <%= cart.getQuantity() %></p>
</body>
</html>
