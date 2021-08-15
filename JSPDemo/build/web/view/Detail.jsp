<%-- 
    Document   : Detail
    Created on : Jun 21, 2021, 1:43:19 PM
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
        <c:set value="${sessionScope.username}" var="username"/>
        <c:choose>
            <c:when  test="${username != null}">
                <h3 style="text-transform: capitalize">Hello:<c:out value="${username}"/></h3>
                <a href="CategoryController">Category Manager Page</a><br><br>
                <a href="ProductController">Product Manager Page</a><br><br>
                <a href="BillController">Bill Manager Page</a><br><br>
            </c:when>
            <c:otherwise>
                <c:redirect url="../LoginController"/>
            </c:otherwise>
        </c:choose>
        
    </body>
</html>
