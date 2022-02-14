<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Learners Academy</title>
</head>
<body>

<h1 style="Color:blue">Learner's Academy</h1>

<div style="text-align:center;">


    <table style="text-align:center; margin-left:auto;">
        <tr>

            <td>&nbsp;&nbsp; <a href='<c:url value="login"/>'>logout</a> </td>

        </tr>

    </table>
    <br/>


    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td>&nbsp;&nbsp;manage students</a>&nbsp;&nbsp;</td>
        </tr>

        <tr>
            <td>&nbsp;&nbsp; <a href='<c:url value="students"/>'>display all students, add new Students, Update Student Details and delete student</a> </td>

        </tr>

    </table>

</div>
<%@include file='footer.html' %>

</body>
</html>
