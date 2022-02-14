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
    <h2>Welcome to your Dashboard</h2>

    <table style="text-align:center; margin-left:auto;">
        <tr>
            <td>&nbsp;&nbsp; <a href='<c:url value="login"/>'>logout</a> </td>
        </tr>
    </table>
    <br/>


    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td>&nbsp;&nbsp; <a href='<c:url value="studentdetails"/>'>manage students</a> </td>
            <td> To manage students
                <br/>Add New Students
                <br/>Update Student Details
                <br/>Delete an existing student
            </td>
        </tr>
        <tr>
            <td>&nbsp;&nbsp; <a href='<c:url value="classdetails"/>'>manage Classes</a> </td>

            <td> To manage Classes
                <br/>Add New Class
                <br/>Update Class
                <br/>Delete an existing Class

            </td>
        </tr>
        <tr>
            <td>&nbsp;&nbsp; <a href='<c:url value="teacherdetails"/>'>Manage Teachers</a> </td>

            <td> Manage Teachers
                <br/>Add New Teachers
                <br/>Update Teacher Details
                <br/>Delete an existing Teacher
            </td>
        </tr>
        <tr>
            <td>&nbsp;&nbsp; <a href='<c:url value="subjectdetails"/>'>Manage Subjects</a> </td>

            <td> To manage Subjects
                <br/>Add New Subjesct
                <br/>Update Subject Details, Assign a Teacher, Designate a Class
                <br/>Delete an existing Subject
            </td>
        </tr>
    </table>

</div>
<%@include file='footer.html' %>

</body>
</html>
