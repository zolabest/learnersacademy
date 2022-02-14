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
    <title>View Subject</title>
</head>
<body>


<table>
    <tr>
        <th>subject Id</th>
        <th>&nbsp;Subject Name</th>
        <th>&nbsp;Subject Language</th>
        <th>&nbsp;Class Id</th>
        <th>&nbsp;Teacher Id</th>
    </tr>
    <c:forEach items="${Subjects}" var="subject" varStatus="tagStatus">
        <tr>
            <td>${subject.subjectId}</td>
            <td>&nbsp;${subject.subName}</td>
            <td>&nbsp;${subject.subLang}</td>
            <td>&nbsp;${subject.classId}</td>
            <td>&nbsp;${subject.teacherId}</td>
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

<form id="subjects"  action = "" method = "POST" >
    <h2 style="text-align:center">Add Subject </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td> <label for =  "subName"> Subject Name</label> </td>
            <td><input type = "text" name = "subName" /> </td>
        </tr>

        <tr>
            <td> <label for =  "subLang"> Subject Language</label> </td>
            <td><input type = "text" name = "subLang" /> </td>
        </tr>

        <tr>
            <td><label for = "classId">Class Id</label></td>
            <td><input type = "text" name ="classId" /></td>
        </tr>

        <tr>
            <td> <label for =  "teacherId"> Teacher Id</label> </td>
            <td><input type = "text" name = "teacherId" /> </td>
        </tr>

        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Add New Subject"/>
            </td>
        </tr>
    </table>
</form>

<br/>
<br/>

<form  action = "deletesubjects" method = "DELETE" >
    <h2 style="text-align:center">Delete Student </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td> <label for =  "subjectId"> Subject Id</label> </td>
            <td><input type = "text" name = "subjectId" /> </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value = "Delete Sybject"></td>
        </tr>
    </table>
</form>

<br/>
<br/>

<form  action="updatesubjects" method="PUT">
    <h2 style="text-align:center">Update Subject </h2>
    <table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
        <tr>
            <td> <label for =  "subjectId"> Subject Id</label> </td>
            <td><input type = "text" name = "subjectId" /> </td>
        </tr>
        <tr>
            <td> <label for =  "subName"> Subject Name</label> </td>
            <td><input type = "text" name = "subName" /> </td>
        </tr>

        <tr>
            <td> <label for =  "subLang"> Subject Language</label> </td>
            <td><input type = "text" name = "subLang" /> </td>
        </tr>

        <tr>
            <td><label for = "classId">Class Id</label></td>
            <td><input type = "text" name ="classId" /></td>
        </tr>

        <tr>
            <td> <label for =  "teacherId"> Teacher Id</label> </td>
            <td><input type = "text" name = "teacherId" /> </td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value = "Submit"></td>
        </tr>

    </table>
</form>

</body>
</html>