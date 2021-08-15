<%-- 
    Document   : ViewBillDetail
    Created on : Jun 13, 2021, 2:10:13 PM
    Author     : ACER
--%>

<%@page import="entity.Category"%>
<%@page import="entity.Bill"%>
<%@page import="entity.Product"%>
<%@page import="entity.BillDetail"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css" rel="stylesheet" />
        <link href="css/admin/css/styles.css" rel="stylesheet" />
        <script src="https:cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

        <script>
            function myFunction() {
                document.getElementById("formsearch").submit();
            }
        </script>
    </head>
    <body>
        <%@ include file="AdminNavbar.jsp" %>
        <div class="container">
            <form action="BillDetailController" method="GET" id="formsearch">
                <%
                    String pid = (String) request.getAttribute("pid");
                    String oid = (String) request.getAttribute("oid");
                    ArrayList<ArrayList> allList = (ArrayList<ArrayList>) request.getAttribute("AllList");
                    //All List attributes
                    ArrayList<Product> products = (ArrayList<Product>) allList.get(4);
                    ArrayList<Category> cates = (ArrayList<Category>) allList.get(2);
                    ArrayList<BillDetail> bdetails = (ArrayList<BillDetail>) allList.get(0);
                    Product p;
                    Category c;
                    BillDetail bd;

                    ArrayList<Product> ProductList = (ArrayList<Product>) request.getAttribute("ProductList");
                    ArrayList<Bill> BillList = (ArrayList<Bill>) request.getAttribute("BillList");
                    //getAllList
                %>

                <h2>Bill Detail List</h2>

                <a href="BillDetailController?service=add">Add A New Bill Detail</a>
                <br>
                <div class="card-body">
                    <p>Filter by Product and Bill</p><br>
                    Select Product:
                    <select name="pid" id="pid" onchange="myFunction();">
                        <option value="">----</option>
                        <% for (Product pro : ProductList) {%>
                        <option <% if (pro.getPid().equals(pid)) {%> 
                            selected="selected"
                            <%}%> 
                            value="<%=pro.getPid()%>">
                            <%=pro.getPname()%>
                        </option>
                        <%}%>
                    </select>
                    Select Order's ID:
                    <select  name="oid" id="oid" onchange="myFunction();">
                        <option value="">----</option>
                        <% for (Bill b : BillList) {%>
                        <option  <% if (b.getoID().equals(oid)) {%> 
                            selected
                            <%}%>  value="<%=b.getoID()%>">
                            <%=b.getoID()%>
                        </option>
                        <%}%>
                    </select>
                    <%double total = 0;%>
                    <table id="datatablesSimple" border = "1">
                        <thead>
                            <tr>
                                <th>Order</th>
                                <th>Product</th>
                                <th>Quantity</th>
                                <th>Price</th>
                                <th>Total</th>
                                <th>Category</th>
                                <th>Update</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%for (int i = 0; i < bdetails.size(); i++) {
                                    p = products.get(i);
                                    c = cates.get(i);
                                    bd = bdetails.get(i);
                            %>
                            <tr>
                                <td><%=bd.getoID()%></td>
                                <td><%=(p.getPname())%></td>
                                <td><%=bd.getQuantity()%></td>
                                <td><%=bd.getMoney()%></td>
                                <td><%=bd.getTotal()%></td><%total += bd.getTotal();%>
                                <td><%=(c.getCateName())%></td>
                                <td><a href="BillDetailController?service=update&pid=<%=bd.getPid()%>&oid=<%=bd.getoID()%>">Update</a></td>
                                <td><a href="BillDetailController?service=delete&pid=<%=bd.getPid()%>&oid=<%=bd.getoID()%>" onclick ="return confirm('are you sure')">Delete</a></td>
                            </tr>
                            <%}%>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td><%=total%></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        </tbody>
                    </table>
            </form>
        </div>
    </div>
    <script src="css/admin/js/scripts.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
    <script src="css/admin/js/datatables-simple-demo.js"></script>
</body>
</html>
