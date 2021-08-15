<%-- 
    Document   : AddCategory
    Created on : Jun 16, 2021, 9:14:56 AM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="mess" value="${requestScope.mess}"></c:set>
        <form action="CategoryController" method="POST">

            <table border="1">
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="cateName" ></td>
                </tr>
                
                <tr>
                    <td>Status:</td>
                    <td>
                        <input type="radio" name="status" checked=""  value="1">Enable
                        <input type="radio" name="status"  value="0">Disable
                    </td>
                </tr>
            </table>
            <div style="color: red;"><c:if test="${mess != null}"><c:out value="${mess}"></c:out> </c:if></div>
            <input type="submit" name="submit" value="Add"> 
            <input type="reset" value="Clear Data">
        </form>
   
    </body>
</html>
