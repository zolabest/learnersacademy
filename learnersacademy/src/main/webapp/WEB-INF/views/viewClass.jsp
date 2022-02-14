<%@page import="java.util.List" %>
<%@page import="java.util.Date" %>
<%@page import="com.fullstack.learnersacademy.model.ClassDetails" %>
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
        <th>Class Id</th>
        <th>&nbsp;Standard</th>
        <th>&nbsp;Division</th>

    </tr>
    <c:forEach items="${ClassDetails}" var="classes" varStatus="tagStatus">
        <tr>
            <td>&nbsp;${classes.classId}</td>
            <td>&nbsp;${classes.standard}</td>
            <td>&nbsp;${classes.division}</td>
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

<form id="classes" action = "addclasses" method = "POST" >
    <h2 style="text-align:center">Add Class </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td> <label for =  "standard"> Class Standard</label> </td>
            <td><input type = "text" name = "standard" /> </td>
        </tr>
        <tr>
            <td><label for = "division">Class Division</label></td>
            <td><input type = "text" name ="division" /></td>
        </tr>

        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Add New Class"/>
            </td>
        </tr>
    </table>
</form>

<br/>
<br/>

<form  action = "deleteclasses" method = "DELETE" >
    <h2 style="text-align:center">Delete Class </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td> <label for =  "classId"> Class Id</label> </td>
            <td><input type = "text" name = "classId" /> </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value = "Delete Class"></td>
        </tr>
    </table>
</form>

<br/>
<br/>

<form  action="updateclasses" method="PUT">
    <h2 style="text-align:center">Update Class </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td>Class Id</td>
            <td><input type="text" name="classId" placeholder="Class Id"></td>
        </tr>

        <tr>
            <td>Class Standard </td>
            <td><input type="text" name="standard" placeholder="standard"></td>
        </tr>

        <tr>
            <td>Class Division</td>
            <td><input type="text" name="division" placeholder="class division"></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value = "Update Class"></td>
        </tr>

    </table>
</form>

</body>
</html>