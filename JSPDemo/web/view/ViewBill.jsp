
<%@page import="entity.Bill"%>
<%@page import="java.util.ArrayList"%>
<%-- 
    Document   : ViewBill
    Created on : Jun 9, 2021, 9:55:49 AM
    Author     : ACER
--%>

<%@page import="model.DAOBill"%>
<%@page import="model.DBConnect"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="model.DAOProduct"%>
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
            <h2>Bill List</h2>
            
            <div class="card-body">
                <a href="BillController?service=add">Add new Bill</a>
                <br>
                <table id="datatablesSimple" border = "1">
                    <thead>
                        <tr>
                            <th>Order ID</th>
                            <th>Date Create</th>
                            <th>Customer Name</th>
                            <th>Customer Phone</th>
                            <th>Customer Address</th>
                            <th>Total</th>
                            <th>Status</th>
                            <th>Customer ID</th>
                            <th>Detail</th>
                            <th>Update</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            ArrayList<Bill> list = (ArrayList<Bill>) request.getAttribute("billList");
                            for (Bill b : list) {
                        %>
                        <tr>
                            <td><%=b.getoID()%></td>
                            <td><%=b.getDateCreate()%></td>
                            <td><%=b.getCname()%></td>
                            <td><%=b.getCphone()%></td>
                            <td><%=b.getcAddress()%></td>
                            <td><%=b.getTotal()%></td>
                            <td><a href="BillController?service=changeStatus&oid=<%=b.getoID()%>"><button>
                                <%if (b.getStatus() == 1) {%>
                                Done
                                <%} else if (b.getStatus() == 0) {%>
                                Delivering
                                <%} else {%>
                                Cancel
                                <%}%>
                                </button> </a>
                            </td>
                            <td><%=b.getCid()%></td>
                            <td><a href="BillController?service=detail&oid=<%=b.getoID()%>">Detail</a></td>
                            <td><a href="BillController?service=update&oid=<%=b.getoID()%>" >Update</a></td>
                            <td><a onclick ="return confirm('are you sure you want to delete')" href="BillController?service=delete&oid=<%=b.getoID()%>">Delete</a></td>
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
