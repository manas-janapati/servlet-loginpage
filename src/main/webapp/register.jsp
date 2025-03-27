<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<div align="center">
    <h1>User Registration</h1>
    <form action="RegisterServlet" method="post">
        <table>
            <tr><td>Enter Name:</td><td><input type="text" name="txtName" required></td></tr>
            <tr><td>Enter Mobile No:</td><td><input type="text" name="txtMob" required></td></tr>
            <tr><td>Enter Email:</td><td><input type="text" name="txtEmail" required></td></tr>
            <tr><td>Enter Password:</td><td><input type="password" name="txtPwd" required></td></tr>
            <tr><td><input type="submit" value="Register"></td><td><input type="reset"></td></tr>
        </table>
    </form>
    <br>
    <a href="login.jsp">Already Registered? Login Here</a>
</div>
</body>
</html>
