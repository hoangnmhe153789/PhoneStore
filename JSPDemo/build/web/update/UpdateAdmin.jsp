<%-- 
    Document   : UpdateAdmin
    Created on : Jun 11, 2021, 11:46:31 AM
    Author     : ACER
--%>

<%@page import="entity.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            Admin b = (Admin) request.getAttribute("Admin");
            String mess = (String)request.getAttribute("mess");
        %>
    </head>
    <body>
        <form action="AdminController" method="POST">

            <table border="1">
                <tr>
                    <td>ID:</td>
                    <td><input type="text" readonly name="adminId" value="<%=b.getAdminID()%>"></td>
                </tr>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" readonly name="username" value="<%=b.getUsername()%>"></td>
                </tr>
                
                <tr>
                    <td>Old Password:</td>
                    <td><input type="password" required="" name="password" value=""></td>
                </tr>
                <tr>
                    <td>New Password:</td>
                    <td><input type="password" required="" name="newPassword" ></td>
                </tr>
                <tr>
                    <td>Confirm New Password:</td>
                    <td><input type="password" required="" name="reNewPassword" ></td>
                </tr>
            </table>
                    <div style="color: red;"><%=(mess!=null)?mess:""%></div>
            <input type="submit" name="submit" value="Update"> 
            <input type="reset" value="Clear Data">
        </form>
    </body>
</html>
