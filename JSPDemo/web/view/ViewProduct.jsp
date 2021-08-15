<%@page import="entity.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Product"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="model.DAOCategory"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="model.DAOProduct,model.DBConnect"%>
<!--<%@page import="model.DBConnect"%>-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Administrator</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/admin/css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
        <script>
            function myFunction() {
                document.getElementById("formsearch").submit();
            }
        </script>
        
    </head>
    <body>
        <%@ include file="AdminNavbar.jsp" %>
        <div class="container">
        <h2>Product List</h2>
        
        <form action="ProductController" method="GET" id="formsearch">
            Choose Category ID:<select onchange="myFunction();" name="cid">
                <option value="">Choose Category</option>
                <%
                    String cid_raw = (String) request.getAttribute("cidString");
                    ArrayList<Category> cateList = (ArrayList<Category>) request.getAttribute("cateList");
                    for(Category c : cateList) {
                        int cid = Integer.parseInt(cid_raw);
                %>
                <option<%if (cid == c.getCateID()) {%> 
                    selected="selected" 
                    <%}%>
                    value="<%=c.getCateID()%>">
                    <%=c.getCateName()%>
                </option>
                <%}%>
            </select>
        </form>
            <a href="ProductController?service=add">Add New Product</a>
        <%
            ArrayList<Product> plist = (ArrayList<Product>) request.getAttribute("productList");
        %>
        <br>
        <%
            String mess = (String)request.getAttribute("mess");
        %>
        <div><%=(mess!=null)?mess:""%></div>
        <table id="datatablesSimple">
            <thead>
                <tr>
                    <th>Product ID</th>
                    <th>Name</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Category ID</th>
                    <th>Image</th>
                    <th>Update</th>
                    <th >Delete</th>
                </tr>
            </thead>
            <tbody>
                <%for (Product p : plist) {%>
                <tr>
                    <td><%=p.getPid()%></td>
                    <td><%=p.getPname()%></td>
                    <td><%=p.getQuantity()%></td>
                    <td><%=p.getPrice()%></td>
                    <td><%=p.getCateID()%></td>
                    <td><img src="image/<%=p.getImage()%>" style="width:150px;height:150px;" alt="A beautiful phone"></td>
                    <td ><a href="ProductController?service=update&pid=<%=p.getPid()%>">Update</a></td>
                    <td > <a href="ProductController?service=delete&pid=<%=p.getPid()%>" onclick ="return confirm('are you sure')">Delete</a></td>
                    
                </tr>
                <%}%>
            </tbody>
        </table>
            </div>
             <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="css/admin/js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="css/admin/assets/demo/chart-area-demo.js"></script>
        <script src="css/admin/assets/demo/chart-bar-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="css/admin/js/datatables-simple-demo.js"></script>
    </body>
</html>
