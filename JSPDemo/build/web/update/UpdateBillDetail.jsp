<%-- 
    Document   : UpdateBillDetail
    Created on : Jun 14, 2021, 10:07:28 AM
    Author     : ACER
--%>

<%@page import="entity.Bill"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Product"%>
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
            String mess = (String)request.getAttribute("message");
            boolean condition = (mess != null && mess.length() >0) ;
            String quantity = (String)request.getAttribute("quantity");
            String money = (String)request.getAttribute("money");
            String total = (String)request.getAttribute("total");
            BillDetail b = (BillDetail) request.getAttribute("BillDetail");
            ArrayList<Product> ProductList = (ArrayList<Product>) request.getAttribute("ProductList");
            ArrayList<Bill> BillList = (ArrayList<Bill>) request.getAttribute("BillList");
        %>
        <div<%if(!condition){%>
            hidden
            <%}%>><%=mess%>
        </div>
        
        <form action="BillDetailController" method="POST">
            <table border="1">
                <tr>
                    <td>Product ID:</td>
                    <td><input type="text" readonly name="pid" value="<%=b.getPid()%>"></td>
                </tr>
                <tr>
                    <td>Order ID:</td>
                    <td><input type="text" readonly name="oid" value="<%=b.getoID()%>"></td>
                </tr>
                <tr>
                    <td>Quantity</td>
                    <td><input type="text" required name="quantity" value="<%=condition ? quantity : b.getQuantity()%>">   </td>
                </tr>
                <tr>
                    <td>Money:</td>
                    <td><input type="text" required name="money" value="<%=condition ? money : b.getMoney()%>"></td>
                </tr>
                <tr>
                    <td> Total:</td>
                    <td><input type="text" required name="total" value="<%=condition ? total : b.getTotal()%>"></td>
                </tr>
                
            </table>
                <input type="hidden" value="update" name="service" id="service">
            <input type="submit" value="Update">
            <input type="reset" value="Reset">
        </form>
    </body>
</html>
