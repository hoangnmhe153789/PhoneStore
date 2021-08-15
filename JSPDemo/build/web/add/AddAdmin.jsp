<%-- 
    Document   : AddAdmin
    Created on : Jun 15, 2021, 9:40:23 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String mess = (String)request.getAttribute("mess");
        %>
        <form action="AdminController" method="POST">
            <table border="1">
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username" ></td>
                </tr>
                
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password" ></td>
                </tr>
            </table>
            <div style="color: red;"><%=(mess!=null)?mess:""%></div>
            <input type="submit" name="submit" value="Add"> 
            <input type="reset" value="Clear Data">
        </form>
    </body>
</html>
