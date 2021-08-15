<%-- 
    Document   : AddCustomer
    Created on : Jun 16, 2021, 9:47:33 AM
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
        <%String mess = (String) request.getAttribute("mess");%>
        <form action="CustomerController" method="POST">
            <h2>Add Customer</h2>
            <table border="1">
                <tr>
                    <td>Customer Name</td>
                    <td><input required type="text" name="cName" ></td>
                </tr>
                <tr>
                    <td>Phone</td>
                    <td><input type="text" required name="cPhone" ></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" required name="cAddress" ></td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><input type="text" required  name="username" ></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" required name="password" ></td>
                </tr>
                <tr>
                    <td>Status</td>
                    <td>
                        <input  type="radio" name="status" checked value="1">Enable 
                        <input type="radio" name="status" value="0">Disable
                    </td>
                </tr>
            </table>
            <div style="color: red;"><%=(mess!=null)?mess:""%></div>
            <input type="submit" name="submit" value="Add"> 
            <input type="reset" value="Clear Data">
        </form>
    </body>
</html>
