<%-- 
    Document   : Invoice
    Created on : Jul 19, 2021, 12:01:15 PM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" crossorigin="anonymous"></script>




        <style>
            .card {
                margin-bottom: 1.5rem
            }

            .card {
                position: relative;
                display: -ms-flexbox;
                display: flex;
                -ms-flex-direction: column;
                flex-direction: column;
                min-width: 0;
                word-wrap: break-word;
                background-color: #fff;
                background-clip: border-box;
                border: 1px solid #c8ced3;
                border-radius: .25rem
            }

            .card-header:first-child {
                border-radius: calc(0.25rem - 1px) calc(0.25rem - 1px) 0 0
            }

            .card-header {
                padding: .75rem 1.25rem;
                margin-bottom: 0;
                background-color: #f0f3f5;
                border-bottom: 1px solid #c8ced3
            }
        </style>
    </head>
    <body style="background-image: linear-gradient(90deg, rgb(44, 44, 252), rgb(250, 155, 165));" >
        <div class="container">
            <div class="container-fluid">
                <div id="ui-view" data-select2-id="ui-view">
                    <div>
                        <div class="card">
                            <div class="card-header">Invoice
                                <strong></strong>
                                <a class="btn btn-sm btn-secondary float-right mr-1 d-print-none" href="#" onclick="javascript:window.print();" data-abc="true">
                                    <i class="fa fa-print"></i> Print</a>
                               <a class="btn btn-sm btn-info float-right mr-1 d-print-none" href="HomeController" data-abc="true">
                                <i class="fa fa-save"></i> Back to shopping</a>
                            </div>
                            <div class="card-body">
                                <div class="row mb-4">
                                    <div class="col-sm-4">
                                        <h6 class="mb-3">From:</h6>
                                        <div>
                                            <strong>HE153789.com</strong>
                                        </div>
                                        <div>Binh Yen</div>
                                        <div>Hoa Lac, Thach That, Ha Noi</div>
                                        <div>Email: HE153789@gmail.com</div>
                                        <div>Phone: 0356659901</div>
                                    </div>
                                    <div class="col-sm-4">
                                        <h6 class="mb-3">To:</h6>
                                        <div>
                                            <strong>Revicer</strong>
                                        </div>
                                        
                                        <div>${requestScope.receiver}</div>
                                        <div>${requestScope.phone}</div>
                                        <div>${requestScope.address}</div>
                                        
                                    </div>
                                    <div class="col-sm-4">
                                        <h6 class="mb-3">Order:</h6>
                                        <div>
                                            <strong>Order By</strong>
                                        </div>
                                        <div>${requestScope.customer.cname}</div>
                                        <div>${requestScope.customer.cphone}</div>
                                        <div>${requestScope.customer.cAddress}</div>
                                    </div>
                                </div>
                                <div class="table-responsive-sm">
                                    <table class="table table-striped">
                                        <thead>
                                            <tr>
                                                <th class="center">#</th>
                                                <th>Item</th>
                                                <th>Description</th>
                                                <th class="center">Quantity</th>
                                                <th class="right">Unit Cost</th>
                                                <th class="right">Total</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${requestScope.products}" var="p">
                                            <tr>
                                                <td class="center">${p.pid}</td>
                                                <td class="left">${p.pname}</td>
                                                <td class="left">${p.description}</td>
                                                <td class="center">${p.quantity}</td>
                                                <td class="right">${p.price}</td>
                                                <td class="right">${p.price * p.quantity}</td>
                                            </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="row">
                                    <div class="col-lg-4 col-sm-5">Thank you for trusted in us. Hopping you will have good time with our product</div>
                                    <div class="col-lg-4 col-sm-5 ml-auto">
                                        <table class="table table-clear">
                                            <tbody>
                                                <tr>
                                                    
                                                </tr>
                                                
                                                <tr>
                                                    <td class="left">
                                                        <strong>Total</strong>
                                                    </td>
                                                    <td class="right">
                                                        <strong>${requestScope.total}</strong>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
