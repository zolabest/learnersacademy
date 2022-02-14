<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h2>Learner's Academy School Managment System</h2>
<h2>User Login</h2>
<form id="register"  action = "login" method = "POST" >
    <table>
        <tr>
            <td> <label for =  "username"> User Name</label> </td>
            <td><input type = "text" name = "username" /> </td>
        </tr>
        <tr>
            <td><label for = "password">password</label></td>
            <td><input type = "password" name ="password" /></td>
        </tr>
        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Submit"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>