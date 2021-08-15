<%-- 
    Document   : UpdateCategory
    Created on : Jun 10, 2021, 10:53:17 PM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="entity.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>


    </head>
    <body>
        <c:set var="cate" value="${requestScope.category}"></c:set>  
        <c:set var="mess" value="${requestScope.mess}"></c:set>
            <form action="CategoryController" method="POST">

                <table border="1">
                    <tr>
                        <td>ID:</td>
                        <td><input type="text" readonly name="cateId" value="${cate.cateID}"></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" required="" name="cateName" value="${cate.cateName}"></td>
                </tr>

                <tr>
                    <td>Status:</td>
                    <td>
                        <input type="radio" name="status" <c:if test="${cate.status == 1}"> checked="" </c:if> value="1">Enable
                        <input type="radio" name="status" <c:if test="${cate.status == 0}"> checked="" </c:if> value="0">Disable
                        </td>
                    </tr>
                </table>
                <div style="color: red;"><c:if test="${mess != null}"><c:out value="${mess}"></c:out> </c:if></div>
            <input type="submit" name="submit" value="Update"> 
            <input type="reset" value="Clear Data">
        </form>
    </body>
</html>
