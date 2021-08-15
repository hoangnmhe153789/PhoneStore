<%-- 
    Document   : AddBill
    Created on : Jun 15, 2021, 11:15:09 PM
    Author     : ACER
--%>

<%@page import="entity.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<Customer> clist = (ArrayList<Customer>) request.getAttribute("clist");
            java.util.Date utilDate = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        %>
        <form action="BillController" method="POST">

            <table border="1">
                <tr>
                    <td>Order ID:</td>
                    <td><input type="text" required="" name="oid" ></td>
                </tr>
                <tr>
                    <td>Date Create:</td>
                    <td><input type="text" required name="datecreate" value="<%=sqlDate%>"></td>
                </tr>
                <tr>
                    <td>Customer Name:</td>
                    <td><input type="text" required name="cname" ></td>
                </tr>
                <tr>
                    <td> Customer Phone:</td>
                    <td><input type="text" required name="cphone" ></td>
                </tr>
                <tr>
                    <td> Customer Address:</td>
                    <td><input type="text" required name="caddress" ></td>
                </tr>
                <tr>
                    <td>Total:</td>
                    <td><input type="text" required name="total" ></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><input type="radio" name="status" checked="" value="1" />Enable
                        <input type="radio"  name="status" value="0" />Disable
                    </td>
                </tr>
                <tr>
                    <td>Choose Customer ID:</td><td>
                    
                        <select name="cid" id="cid">
                            <%   for (Customer c : clist) {%>
                            <option value="<%= c.getCid()%>"><%= c.getCid()+"-"+c.getCname()%></option>
                            <%}%>
                        </select>
                    </td>
                </tr>
            </table>
                        <input type="submit" name="submit" value="Add"> 
            <input type="reset" value="Clear Data">
        </form>
    </body>
</html>
