<%-- 
    Document   : ViewCart
    Created on : Jun 27, 2021, 1:19:55 PM
    Author     : ACER
--%>

<%@page import="entity.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            td{
                text-align: center;
            }
            input{
                text-align: center;
                width: 15px;
                display: inline-block
            }
        </style>
        <script>
            function myFunction() {
                document.getElementById("formsearch").submit();
            }
        </script>
    </head>
    <body>
        <h3>Cart</h3>
        <%
            boolean isEmpty = (Boolean) request.getAttribute("empty");
            String username = (String) request.getSession().getAttribute("username");
            if (username != null) {
            } else {
                response.sendRedirect("LoginController");
            }
            String mess = (String) request.getAttribute("mess");
            
            %><%if (mess != null){%>
            <div <%if(!isEmpty){%>style="color: red;"<%}%>><%=mess%></div>
            <%}
                if(isEmpty){ 
            } else {
            ArrayList<Product> plist = (ArrayList<Product>) request.getAttribute("Cart");
            double total = 0;
           
        %>
        
        <form action="CartController" method="POST" id="formsearch">
            <table border="1" style="width: 50%">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total</th>
                        <th>Remove</th>
                    </tr>
                </thead>
                <tbody>
                    <%for (Product p : plist) {%>
                    <tr>
                        <td><%=p.getPid()%><input type="hidden" name="pid" value="<%=p.getPid()%>"></td>
                        <td><%=p.getPname()%></td>
                        <td><a <%if (p.getQuantity() == 1) {%>onclick =" return confirm('are you sure you want to remove <%=p.getPname()%>')"<%}%>href="QuantityController?service=minus&pid=<%=p.getPid()%>">-</a> 
                            <input type="text" onchange="myFunction();" name="quantity" value="<%=p.getQuantity()%>"><a href="QuantityController?service=add&pid=<%=p.getPid()%>">+</a></td>
                        <td><%=p.getPrice()%></td>
                        <td><%=(p.getQuantity() * p.getPrice())%></td>
                        <%total += p.getQuantity() * p.getPrice();%>
                        <td>  <a href="CartController?service=remove&pid=<%=p.getPid()%>" onclick ="return confirm('are you sure')">Delete</a></td>
                    </tr>
                    <%}%>  
                </tbody>
            </table >
        </form>
        <table  style="width: 50%">
            <tr>
                <td style="width: 15%"><a href="CartController?service=clear">Clear All</a></td>
                <td style="width: 15%"><a href="CartController?service=checkout&total=<%=total%>">Check Out</a></td>
                <td style=" text-align: left;padding-left: 32%">Total: &nbsp;&nbsp;&nbsp;&nbsp;<%=total%></td>
            </tr>
        </table>
        <%}%>
        <a style="border: 1px solid black" href="ProductController">
            Product Page
        </a>
    </body>
</html>
