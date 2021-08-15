<%-- 
    Document   : ViewAdmin
    Created on : Jun 9, 2021, 9:43:58 AM
    Author     : ACER
--%>

<%@page import="entity.Admin"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="model.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="AdminController" method="GET">
            <h2>Administrator List</h2>
            <a href="AdminController?service=add">Add a new Administrator</a>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Username</th>
                <th>Password</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            <%
                ArrayList<Admin> list = (ArrayList<Admin>)request.getAttribute("adminList");
                for (Admin a : list) {
            %>
            <tr>
                <td><%=a.getAdminID()%></td>
                <td><%=a.getUsername()%></td>
                <td>********</td>
                <td><a href="AdminController?service=update&adminId=<%=a.getAdminID()%>">Update</a></td>
                <td><a href="AdminController?service=delete&adminId=<%=a.getAdminID()%>"  onclick ="return confirm('are you sure')">Delete</a></td>
            </tr>
            <%}%>
        </table>
        </form>
    </body>
</html>
