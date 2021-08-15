<%-- 
    Document   : ViewCategory
    Created on : Jun 9, 2021, 9:32:52 AM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Category"%>
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
        <c:set var="count" value="${0}"/>
        <h2>Category List</h2>
        <a href="CategoryController?service=add">Add New Category</a>
        <table border="1">
            <tr>
                <th>Category Id</th>
                <th>Category Name</th>
                <th>Status</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${requestScope.cateList}" var="cates" begin="0" step="1" end="${requestScope.cateList.size()}">
                <tr>
                    <td><c:out value="${cates.cateID}"/>}</td>
                    <td><c:out value="${cates.cateName}"/></td>
                    <td><c:out value="${cates.status}"/></td>
                     <c:set var="count" value="${count+1}"/>
                    <td><a href="CategoryController?service=update&cateId=${cates.cateID}">Update</a></td>
                    <td><a href="CategoryController?service=delete&cateId=${cates.cateID}" onclick ="return confirm('are you sure')">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
