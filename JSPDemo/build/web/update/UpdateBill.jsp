<%-- 
    Document   : BillUpdate
    Created on : Jun 10, 2021, 11:18:28 AM
    Author     : ACER
--%>

<%@page import="entity.Bill"%>
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
            Bill b = (Bill) request.getAttribute("Bill");
        %>
        <form action="BillController" method="POST">

            <table border="1">
                <tr>
                    <td>Order ID:</td>
                    <td><input type="text" readonly name="oid" value="<%=b.getoID()%>"></td>
                </tr>
                <tr>
                    <td>Date Create:</td>
                    <td><input type="text" required name="datecreate" value="<%=b.getDateCreate()%>"></td>
                </tr>
                <tr>
                    <td>Customer Name:</td>
                    <td><input type="text" required name="cname" value="<%=b.getCname()%>"></td>
                </tr>
                <tr>
                    <td> Customer Phone:</td>
                    <td><input type="text" required name="cphone" value="<%=b.getCphone()%>"></td>
                </tr>
                <tr>
                    <td> Customer Address:</td>
                    <td><input type="text" required name="caddress" value="<%=b.getcAddress()%>"></td>
                </tr>
                <tr>
                    <td>Total:</td>
                    <td><input type="text" required name="total" value="<%=b.getTotal()%>"></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td>
                        <input type="radio"<%if(b.getStatus()==1){%>checked=""<%}%> name="status" value="1" />Done<br>
                        <input type="radio" <%if(b.getStatus()==0){%>checked=""<%}%> name="status" value="0" />Delivering<br>
                        <input type="radio"<%if(b.getStatus()==-1){%>checked=""<%}%> name="status" value="-1" />Cancel
                    </td>
                </tr>
                <tr>
                    <td>Choose Customer ID:</td><td>
                    
                        <select name="cid" id="cid">
                            <%   for (Customer c : clist) {%>
                            <option 
                                <%if (c.getCid() == b.getCid()) {%>
                                selected="selected"  
                                <%}%>
                                value="<%= c.getCid()%>"><%= c.getCid()+"-"+c.getCname()%></option>
                            <%}%>
                        </select>
                    </td>
                </tr>
            </table>
                        <input type="submit" name="submit" value="Update"> 
            <input type="reset" value="Clear Data">
        </form>
    </body>
</html>
