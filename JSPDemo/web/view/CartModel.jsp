<%@page import="entity.Product"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                background-color: #eeeeee
            }

            .footer-background {
                background-color: rgb(204, 199, 199)
            }

            @media(max-width:991px) {
                #heading {
                    padding-left: 50px
                }

                #prc {
                    margin-left: 70px;
                    padding-left: 110px
                }

                #quantity {
                    padding-left: 48px
                }

                #produc {
                    padding-left: 40px
                }

                #total {
                    padding-left: 54px
                }
            }

            @media(max-width:767px) {
                .mobile {
                    font-size: 10px
                }

                h5 {
                    font-size: 14px
                }

                h6 {
                    font-size: 9px
                }

                #mobile-font {
                    font-size: 11px
                }

                #prc {
                    font-weight: 700;
                    margin-left: -45px;
                    padding-left: 105px
                }

                #quantity {
                    font-weight: 700;
                    padding-left: 6px
                }

                #produc {
                    font-weight: 700;
                    padding-left: 0px
                }

                #total {
                    font-weight: 700;
                    padding-left: 9px
                }

                #image {
                    width: 60px;
                    height: 60px
                }

                .col {
                    width: 100%
                }

                #zero-pad {
                    padding: 2%;
                    margin-left: 10px
                }

                #footer-font {
                    font-size: 12px
                }

                #heading {
                    padding-top: 15px
                }
                #innerbox
                {
                    width:250px; /* or whatever width you want. */
                    max-width:250px; /* or whatever width you want. */
                    display: inline-block;
                }
            }
        </style>

        <link rel="stylesheet" type="text/css" media="all" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" media="all" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" crossorigin="anonymous"></script>


        <script>
            function myFunction() {
                document.getElementById("formsearch").submit();
            }
            
            function myFunction1() {
                document.getElementById("checkoutForm").submit();
            }
            function showDiv() {
                document.getElementById('welcomeDiv').style.display = "inherit";
            }
        </script>
    </head>
    <body style="background-image: linear-gradient(90deg, rgb(44, 44, 252), rgb(250, 155, 165));">

        <form action="CartModelController" method="POST" id="formsearch">
            
            <div class="container bg-white rounded-top mt-5" id="zero-pad">
                <div class="row d-flex ">
                    <div class="col-lg-10 col-12 pt-3">
                        <div class="d-flex">
                            <div class="pt-1">
                                <h3>Shopping Cart</h3>
                                <div style="float: left;"> <button class="btn btn-sm bg-light border border-dark"><a style="text-decoration: none; color: black;" href="HomeController">GO BACK</a></button> </div>
                            </div>
                        </div>
                        <%
                            double total = 0;
                            boolean isEmpty = (Boolean) request.getAttribute("empty");
                            String username = (String) request.getSession().getAttribute("username");
                            if (username != null) {
                            } else {
                                response.sendRedirect("LoginController");
                            }
                            String mess = (String) request.getAttribute("mess");

                        %><%if (mess != null) {%>
                        <div <%if (!isEmpty) {%>style="color: red;"<%}%>><%=mess%></div>
                        <%}
                            if (isEmpty) {
                            } else {
                                ArrayList<Product> plist = (ArrayList<Product>) request.getAttribute("Cart");

                        %>

                        <div  class="d-flex flex-column pt-4">
                            <div>
                                <h5 class="text-uppercase font-weight-normal"></h5>
                            </div>
                            <div class="font-weight-normal"></div>
                        </div>
                        <div class="d-flex flex-row px-lg-5 mx-lg-5 mobile" id="heading">
                            <div style="" class="px-lg-5 ml-lg-3 " id="produc">PRODUCTS</div>
                            <div  class="px-lg-5 ml-lg-4" id="prc">PRICE</div>
                            <div class="px-lg-5 ml-lg-4" id="quantity">QUANTITY</div>
                            <div class="px-lg-5 ml-lg-5" id="total">TOTAL</div>
                        </div>
                        <%for (Product p : plist) {%>
                        <div class="d-flex flex-row justify-content-between align-items-center pt-lg-4 pt-2 pb-3 border-bottom mobile">
                            <input type="hidden" name="pid" value="<%=p.getPid()%>">
                            <div class="d-flex flex-row align-items-center">
                                <div><img src="image/<%=p.getImage()%>" width="150" height="150" alt="" id="image"></div>
                                <div class="d-flex flex-column pl-md-3 pl-1">
                                    <div>
                                        <h6><%=p.getPname()%></h6>
                                    </div>
                                </div>
                            </div>
                            <div class="pl-md-0 pl-1"><b><%=p.getPrice()%></b></div>
                            <div class="pl-md-0 pl-0"> <a href="QuantityController?service=minus&pid=<%=p.getPid()%>" <%if (p.getQuantity() == 1) {%>onclick =" return confirm('are you sure you want to remove <%=p.getPname()%>')"<%}%> class="fa fa-minus-square text-secondary" ></a><span class="px-md-3 px-1">
                                    <input style="width: 40px; text-align: center;" type="text" onchange="myFunction();" name="quantity" value="<%=p.getQuantity()%>">
                                </span>
                                <a href="QuantityController?service=add&pid=<%=p.getPid()%>" class="fa fa-plus-square text-secondary"></a> 
                            </div>

                            <div style="text-align: left;" class="pl-md-0 pl-1"><b><%=p.getPrice() * p.getQuantity()%><% total += p.getPrice() * p.getQuantity();%></b></div>

                            <div class="close"><a href="CartModelController?service=remove&pid=<%=p.getPid()%>"  onclick ="return confirm('are you sure you want to remove <%=p.getPname()%>')">&times;</a></div>
                        
                        </div>
                        <%}%>
                        
                        </form> 
                        <form action="NewInfoCheckout" method="Post" id="checkoutForm">
                        <div  id="welcomeDiv"  style="display:none;" > 
                            <div class="container ml-lg-4 mt-5"> 
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Receiver</label>
                                    <input type="text" name="receiver"  class="form-control"   placeholder="Receiver">

                                </div><br>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Phone</label>
                                    <input type="text" name="phone" class="form-control" placeholder="Phone">
                                </div>
                                <br>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Address</label>
                                    <input type="text" name="address" class="form-control"  placeholder="Address">
                                </div>
                                <br>
                                <div class="form-group"> <button  class="btn btn-sm bg-dark text-white px-lg-5 px-3" onclick="myFunction1();">Use Alternative Info</button></div>
                            </div>
                            
                        </div>
                        </form>
                    </div>
                </div>  
            </div>
            <div class="container bg-light rounded-bottom py-4" id="zero-pad">
                <div class="row d-flex justify-content-center">
                    <div class="col-lg-10 col-12">
                        <div class="d-flex justify-content-between align-items-center">
                            
                            <%if (!isEmpty) {%>                            
                            <div> <button  class="btn btn-sm bg-dark text-white px-lg-5 px-3"><a style="color: #ffffff; text-decoration: none;" onclick ="return confirm('are you sure you want to remove all product in the cart')" href="CartModelController?service=clear">CLEAR</a></button> </div>
                            <%}%>
                            <input type="button" name="answer" style="background-color: white; color: black; border: 1px solid black;" value="Change receive location" onclick="showDiv()" />
                            <div> 
                                <a href="CartModelController?service=checkout&total=<%=total%>"onclick ="return confirm('You will use default infomation to checkout?')"><button  class="btn btn-sm bg-dark text-white px-lg-5 px-3">
                                    Checkout
                                </button></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <%}
                request.getSession().setAttribute("total", total);
            %>             
           
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js "  crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"  crossorigin="anonymous"></script>
    </body>
</html>
