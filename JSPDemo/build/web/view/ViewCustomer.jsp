<%-- 
   Document   : ViewCustomer
   Created on : Jun 8, 2021, 9:39:17 PM
   Author     : ACER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entity.Customer"%>
<%@page import="model.DBConnect"%>
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

    </head>
    <body>
        <%@ include file="AdminNavbar.jsp" %>
        <div class="container">
            <h2>Customer List</h2>
            <%
                ArrayList<Customer> list = (ArrayList) request.getAttribute("list");
            %>
            <a href="CustomerController?service=add">Add New Customer</a><br>

            <div class="card-header">
                <i class="fas fa-table me-1"></i>
                Income Report
            </div>
            <div class="card-body">
                <table id="datatablesSimple" border = "1">
                    <thead>
                        <tr>
                            <th>Customer ID</th>
                            <th>Customer Name</th>
                            <th>Customer Phone</th>
                            <th>Customer Address</th>
                            <th>Username</th>
                            <th>Password</th>
                            <th>Status</th>
                            <th>Update</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%for (Customer c : list) {%>
                        <tr>
                            <td><%=c.getCid()%></td>
                            <td><%=c.getCname()%></td>
                            <td><%=c.getCphone()%></td>
                            <td><%=c.getcAddress()%></td>
                            <td><%=c.getUsername()%></td>
                            <td>**********</td>
                            <td><a href="CustomerController?service=change&cid=<%=c.getCid()%>&status=<%=c.getStatus()%>"><button style="width: 80%;" type="button" class="btn btn-dark"><%=(c.getStatus() == 1) ? "Enable" : "Disable"%></button></a></td>
                            <td><a href="CustomerController?service=update&cid=<%=c.getCid()%>">Update</a></td>
                            <td><a href="CustomerController?service=bill&cid=<%=c.getCid()%>&cname=<%=c.getCname()%>">Bill</a></td>
                            <td><a href="CustomerController?service=delete&cid=<%=c.getCid()%>" onclick ="return confirm('are you sure')">Delete</a></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
        </div>
        <script src="css/admin/js/scripts.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="css/admin/js/datatables-simple-demo.js"></script>
    </body>               
</html>
