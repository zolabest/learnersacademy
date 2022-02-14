<%@page import="java.util.List" %>
<%@page import="java.util.Date" %>
<%@page import="com.fullstack.learnersacademy.model.Student" %>
<%@page import="javax.servlet.http.HttpSession" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>View Class</title>
</head>
<body>


<table>
    <tr>
        <th>Teacher Id</th>
        <th>&nbsp;Teacher Name</th>
        <th>&nbsp;teacher Category</th>
        <th>&nbsp;experience</th>
    </tr>
    <c:forEach items="${Teachers}" var="teacher" varStatus="tagStatus">
        <tr>
            <td>${teacher.teacherId}</td>
            <td>&nbsp;${teacher.teacherName}</td>
            <td>&nbsp;${teacher.teacherCategory}</td>
            <td>&nbsp;${teacher.experience}</td>
        </tr>
    </c:forEach>
</table>

<table style="text-align:center; margin-left:auto;">
    <tr>

        <td>&nbsp;&nbsp; <a href='<c:url value="login"/>'>logout</a> </td>

    </tr>
    <tr>

        <td>&nbsp;&nbsp; <a href='<c:url value="/"/>'>Dashboard</a> </td>

    </tr>
</table>
<br/>

<form id="students"  action = "" method = "POST" >
    <h2 style="text-align:center">Add Teacher </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td> <label for =  "teacherName"> Teacher Name</label> </td>
            <td><input type = "text" name = "teacherName" /> </td>
        </tr>
        <tr>
            <td><label for = "teacherCategory">teacher Category</label></td>
            <td><input type = "text" name ="teacherCategory" /></td>
        </tr>

        <tr>

            <td><label for="experience">Experience :</label> </td>
            <td><input type="text" name="experience"/></td>
        </tr>

        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Add New Student"/>
            </td>
        </tr>
    </table>
</form>

<br/>
<br/>

<form  action = "deleteteachers" method = "DELETE" >
    <h2 style="text-align:center">Delete Teacher </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td> <label for =  "teacherId"> Teacher Id</label> </td>
            <td><input type = "text" name = "teacherId" /> </td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value = "Submit"></td>
        </tr>

    </table>
</form>

<br/>
<br/>

<form  action="updateteachers" method="PUT">
    <h2 style="text-align:center">Update Teacher </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">

        <tr>
            <td> <label for =  "teacherId"> Teacher Id</label> </td>
            <td><input type = "text" name = "teacherId" /> </td>
        </tr>

        <tr>
            <td> <label for =  "teacherName"> Teacher Name</label> </td>
            <td><input type = "text" name = "teacherName" /> </td>
        </tr>

        <tr>
            <td><label for = "teacherCategory">teacher Category</label></td>
            <td><input type = "text" name ="teacherCategory" /></td>
        </tr>

        <tr>
            <td><label for="experience">Experience :</label> </td>
            <td><input type="text" name="experience"/></td>
        </tr>

        <tr>
            <td colspan = "2">
                <input type = "submit" value = "update Teacher"/>
            </td>
        </tr>



    </table>
</form>

</body>
</html>