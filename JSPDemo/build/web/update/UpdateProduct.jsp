<%-- 
    Document   : UpdateProduct
    Created on : Jun 9, 2021, 2:58:08 PM
    Author     : ACER
--%>

<%@page import="entity.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Product p = (Product) request.getAttribute("product");
            String mess = (String) request.getAttribute("mess");
            ArrayList<Category> cateList = (ArrayList<Category>) request.getAttribute("cateList");
        %>
        <form action="ProductController" method="POST">
            <h2>Update Product</h2>
            <table border="1">
                <tr>
                    <td>ID:</td>
                    <td><input type="text" readonly name="pid" value="<%=p.getPid()%>"><input type="hidden" name="pidd" value="<%=p.getPid()%>"></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" required name="pname" value="<%=p.getPname()%>"></td>
                </tr>
                <tr>
                    <td>Quantity:</td>
                    <td><input type="text" required name="quantity" value="<%=p.getQuantity()%>"></td>
                </tr>
                <tr>
                    <td> Price:</td>
                    <td><input type="text" required name="price" value="<%=p.getPrice()%>"></td>
                </tr>
                <tr>
                    <td> Image:</td>
                    <td><input type="text" required name="image" value="<%=p.getImage()%>"></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><input type="text" required name="description" value="<%=p.getDescription()%>"></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><input type="radio" <%if(p.getStatus() == 1){%> checked=""<%}%> name="status" value="1">Enable<input type="radio" <%if(p.getStatus() == 0){%> checked=""<%}%> name="status" value="0">Disable</td>

                </tr>
                <tr>
                    <td>Category ID:</td>
                    <td>
                        <select name="cid" id="cid">
                            <option value="0">Choose Category</option>
                            <%for (Category c : cateList) {%>

                            <option value="<%=c.getCateID()%>" <%if (c.getCateID() == p.getCateID()) {%> selected="selected"<%}%> >
                                <%=c.getCateName()%>
                            </option>
                            <%}%>
                        </select>
                    </td>
                </tr>
            </table>
                        <div style="color: red;"><%=(mess!=null)?mess:""%></div>
                        <input type="submit" name="submit" value="Update"> 
                        <input type="reset" value="Clear Data">
        </form>
    </body>
</html>
