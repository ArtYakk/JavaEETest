
<%--
  Created by IntelliJ IDEA.
  User: artem
  Date: 26.06.2023
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>First JSP</title>
</head>

<body>
    <h1>Testing JSP</h1>
    <p>
        <%
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
        %>
        <%=
        "Hello, " + name + " " + surname
        %>
    </p>

</body>

</html>
