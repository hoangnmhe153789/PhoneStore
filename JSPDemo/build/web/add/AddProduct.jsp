<%-- 
    Document   : AddProduct
    Created on : Jun 16, 2021, 11:58:43 AM
    Author     : ACER
--%>

<%@page import="entity.Category"%>
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
            ArrayList<Category> cateList = (ArrayList<Category>) request.getAttribute("cateList");
            String mess = (String) request.getAttribute("mess");
        %>
        <form action="ProductController" method="POST">
            <h2>Add Product</h2>
            <table border="1">
                <tr>
                    <td>ID:</td>
                    <td><input type="text" required="" name="pid" ></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" required name="pname" ></td>
                </tr>
                <tr>
                    <td>Quantity:</td>
                    <td><input type="text" required name="quantity" ></td>
                </tr>
                <tr>
                    <td> Price:</td>
                    <td><input type="text" required name="price" ></td>
                </tr>
                <tr>
                    <td> Image:</td>
                    <td><input type="text" required name="image" ></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><input type="text" required name="description" ></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><input type="radio"  checked="" name="status" value="1">Enable<input type="radio"  name="status" value="0">Disable</td>

                </tr>
                <tr>
                    <td>Category ID:</td>
                    <td>
                        <select name="cid" id="cid">
                            <option value="0">Choose Category</option>
                            <%for (Category c : cateList) {%>

                            <option value="<%=c.getCateID()%>">
                                <%=c.getCateName()%>
                            </option>
                            <%}%>
                        </select>
                    </td>
                </tr>
            </table>
                        <div style="color: red;"><%=(mess!=null)?mess:""%></div>
                        <input type="submit" name="submit" value="Add"> 
                        <input type="reset" value="Clear Data">
        </form>
    </body>
</html>
