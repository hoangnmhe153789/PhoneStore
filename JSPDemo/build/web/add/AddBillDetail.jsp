<%-- 
    Document   : AddBillDetail
    Created on : Jun 15, 2021, 2:57:03 PM
    Author     : ACER
--%>

<%@page import="entity.Bill"%>
<%@page import="entity.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.BillDetail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            ArrayList<Product> ProductList = (ArrayList<Product>) request.getAttribute("ProductList");
            ArrayList<Bill> BillList = (ArrayList<Bill>) request.getAttribute("BillList");
        %>
        
        
        <form action="BillDetailController" method="POST">
            <table border="1">
                <tr>
                    <td>Product ID:</td>
                    <td>
                        <select name="pid" style="width: 100%;">
                            <%for(Product p : ProductList){%>
                            <option style="width: 100%;" value="<%=p.getPid()%>"><%=p.getPid()%>-<%=p.getPname()%></option>
                            <%}%>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Order ID:</td>
                    <td><select name="oid" style="width: 100%;">
                            <%for(Bill p : BillList){%>
                            <option value="<%=p.getoID()%>"><%=p.getoID()%></option>
                            <%}%>
                        </select></td>
                </tr>
                <tr>
                    <td>Quantity</td>
                    <td><input type="text" required name="quantity" value="">   </td>
                </tr>
                <tr>
                    <td>Money:</td>
                    <td><input type="text" required name="money" value=""></td>
                </tr>
                <tr>
                    <td> Total:</td>
                    <td><input type="text" required name="total" value=""></td>
                </tr>
                
            </table>
            <input type="hidden" value="add" name="service" id="service">
            <input type="submit" value="Add">
            <input type="reset" value="Reset">
        </form>
    
    </body>
</html>
