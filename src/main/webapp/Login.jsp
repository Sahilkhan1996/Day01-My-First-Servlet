<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 03-Feb-23
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login success page</title>
</head>
<body>
<h3>Hi <%=request.getAttribute("user")%> Login successfull.</h3>
<a href="index.html">Login Page</a>
</body>
</html>