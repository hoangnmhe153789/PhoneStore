<%-- 
    Document   : UpdateCustomer
    Created on : Jun 11, 2021, 9:33:12 AM
    Author     : ACER
--%>

<%@page import="entity.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Customer c = (Customer) request.getAttribute("Customer");
            String mess = (String) request.getAttribute("mess");
        %>
        <h2>Update Customer</h2>
        <div>Don't need to fill passwords if don't change password</div>
        <form action="CustomerController" method="POST">
            <table border="1">
                <tr>
                    <td>Customer ID</td>
                    <td><input readonly type="text" name="cid" value="<%=c.getCid()%>"></td>
                </tr>
                <tr>
                    <td>Customer Name</td>
                    <td><input type="text" required="" name="cName" value="<%=c.getCname()%>"></td>
                </tr>
                <tr>
                    <td>Phone</td>
                    <td><input type="text" required name="cPhone" value="<%=c.getCphone()%>"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" required name="cAddress" value="<%=c.getcAddress()%>"></td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><input type="text" required  name="username" value="<%=c.getUsername()%>"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password"  name="password" value=""></td>
                </tr>
                <tr>
                    <td>Status</td>
                    <td>
                        <input <%if(c.getStatus()==1){%>
                            checked
                            <%}%>  type="radio" name="status" value="1">Enable 
                        <input<%if(c.getStatus()==0){%>
                            checked
                            <%}%> 
                            type="radio" name="status" value="0">Disable
                    </td>
                </tr>
            </table>
                            <div style="color: red;"><%=(mess!=null)?mess:""%></div>
                            <input type="submit" name="submit" value="Update"> 
            <input type="reset" value="Clear Data">
        </form>
    </body>
</html>
