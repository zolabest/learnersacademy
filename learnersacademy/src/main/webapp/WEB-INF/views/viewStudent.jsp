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
        <th>Student Id</th>
        <th>&nbsp;Student Name</th>
        <th>&nbsp;DOB</th>
        <th>&nbsp;Class Id</th>
    </tr>
    <c:forEach items="${Students}" var="student" varStatus="tagStatus">
        <tr>
            <td>${student.studentId}</td>
            <td>&nbsp;${student.studentName}</td>
            <td>&nbsp;${student.studentDob}</td>
            <td>&nbsp;${student.classId}</td>
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
    <h2 style="text-align:center">Add Student </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td> <label for =  "studentName"> Student Name</label> </td>
            <td><input type = "text" name = "studentName" /> </td>
        </tr>
        <tr>
            <td><label for = "classId">Class Id</label></td>
            <td><input type = "text" name ="classId" /></td>
        </tr>

        <tr>

            <td><label for="studentDob">DoB :</label> </td>
            <td><input type="date" name="studentDob"/></td>
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

<form  action = "deletestudents" method = "DELETE" >
    <h2 style="text-align:center">Delete Student </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td> <label for =  "studentId"> Student Id</label> </td>
            <td><input type = "text" name = "studentId" /> </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value = "Submit"></td>
        </tr>
    </table>
</form>

<br/>
<br/>

<form  action="updatestudents" method="PUT">
    <h2 style="text-align:center">Update Student </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td>Student Id</td>
            <td><input type="text" name="studentId" placeholder="Student Id"></td>
        </tr>

        <tr>
            <td>Student Name</td>
            <td><input type="text" name="studentName" placeholder="Student Name"></td>
        </tr>

        <tr>
            <td>Date of Birth</td>
            <td><input type="date" name="studentDoB" placeholder="Date of Birth"></td>
        </tr>

        <tr>
            <td>Class Id</td>
            <td><input type="text" name="classId" placeholder="ClassId"></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value = "Submit"></td>
        </tr>

    </table>
</form>

</body>
</html>