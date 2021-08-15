<%-- 
    Document   : Profile
    Created on : Jul 13, 2021, 11:48:47 AM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" media="all" href="css/profile/style.css" />
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.25/js/dataTables.bootstrap4.min.js"></script>        
    </head>
    <body style="background-image: linear-gradient(90deg, rgb(44, 44, 252), rgb(250, 155, 165));">
        <c:set value="${requestScope.customer}" var="c"/>
        <div class="container emp-profile">
            
                <div class="row">
                    <div class="col-md-4">
                        <div class="profile-img">
                            <c:choose> 
                                <c:when test="${c.status == 1}">
                                    <img style=" width: 80%;float: left;" src="css/profile/image/man.jpg" alt="avatar"/>
                                </c:when>
                                <c:otherwise>
                                    <img style=" width: 80%; float: left;" src="css/profile/image/woman.jpg" alt="avatar"/>
                                </c:otherwise>
                            </c:choose>


                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="profile-head">
                            <h5>
                                ${sessionScope.username}
                            </h5><br><br><br><br><br>
                            <ul class="nav nav-tabs" id="myTab" role="tablist">
                                <li class="nav-item">
                                    <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">About</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Timeline</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">

                    </div>
                    
                    <div class="col-md-8">
                        <div class="tab-content profile-tab" id="myTabContent">
                            
                                <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <form action="CustomerController" method="Post">
                                    <div class="row">
                                    <div class="col-md-6">
                                        <label>User Id</label>
                                    </div>
                                    <div class="col-md-6">
                                        <input type="text" name="name" value="${c.cid}"><br>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Name</label>
                                    </div>
                                    <div class="col-md-6">
                                        <input type="text" name="name"value="${c.cname}"><br>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Email</label>
                                    </div>
                                    <div class="col-md-6">
                                        <input type="text" name="name" value="${c.cphone}"><br>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Phone</label>
                                    </div>
                                    <div class="col-md-6">
                                        <input type="text" name="name" value="${c.cAddress}"><br>
                                    </div>
                                </div>
                                
                                    </form>
                            </div>
                             
                            <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                                <table id="example" class="table table-striped table-bordered" style="width:100%">
                                    <thead>
                                        <tr>
                                            <th>OrderID</th>
                                            <th>Date</th>
                                            <th>Receiver Name</th>
                                            <th>Receiver Address</th>
                                            <th>Receiver Phone</th>
                                            <th>Total</th>
                                            <th>Status</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${requestScope.BillDetails}" var="bd">
                                            <tr>
                                                <td>${bd.oID}</td>
                                                <td>${bd.dateCreate}</td>
                                                <td>${bd.cname}</td>
                                                <td>${bd.cAddress}</td>
                                                <td>${bd.cphone}</td>
                                                <td>${bd.total}</td>
                                                <td>
                                                    <a href="ProfileController?service=changeStatus&oid=${bd.oID}"><button>
                                                            <c:choose>
                                                                <c:when test="${bd.status == 1}">
                                                                    Done
                                                                </c:when>
                                                                <c:when test="${bd.status == 0}">Delivering</c:when>
                                                                <c:otherwise>
                                                                    Cancel
                                                                </c:otherwise>
                                                             </c:choose>
                                                        </button></a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <div class="row">
                                    <div class="col-md-12">
                                        <label>Your Bio</label><br/>
                                        <p>Your detail description</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                     
        </div>
        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>

    </body>
</html>
