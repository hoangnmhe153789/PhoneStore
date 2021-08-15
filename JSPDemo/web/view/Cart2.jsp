<%-- 
    Document   : Cart2
    Created on : Jul 18, 2021, 4:38:35 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            }
        </style>

        <link rel="stylesheet" type="text/css" media="all" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" media="all" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" crossorigin="anonymous"></script>


    </head>
    <body style="background-image: linear-gradient(90deg, rgb(44, 44, 252), rgb(250, 155, 165));">
        <div class="container bg-white rounded-top mt-5" id="zero-pad">
            <div class="row d-flex justify-content-center">
                <div class="col-lg-10 col-12 pt-3">
                    <div class="d-flex">
                        <div class="pt-1">
                            <h3>Shopping Cart</h3>
                        </div>
                    </div>
                    <div class="d-flex flex-column pt-4">
                        <div>
                            <h5 class="text-uppercase font-weight-normal"></h5>
                        </div>
                        <div class="font-weight-normal">2 items</div>
                    </div>
                    <div class="d-flex flex-row px-lg-5 mx-lg-5 mobile" id="heading">
                        <div style="" class="px-lg-5 ml-lg-4 " id="produc">PRODUCTS</div>
                        <div  class="px-lg-5 ml-lg-3" id="prc">PRICE</div>
                        <div class="px-lg-5 ml-lg-4" id="quantity">QUANTITY</div>
                        <div class="px-lg-5 ml-lg-4" id="total">TOTAL</div>
                    </div>
                    
                    
                    <div class="d-flex flex-row justify-content-between align-items-center pt-lg-4 pt-2 pb-3 border-bottom mobile">

                        <div class="d-flex flex-row align-items-center">
                            <div><img src="https://images.unsplash.com/photo-1529374255404-311a2a4f1fd9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60" width="150" height="150" alt="" id="image"></div>
                            <div class="d-flex flex-column pl-md-3 pl-1">
                                <div>
                                    <h6>Iphone12</h6>
                                </div>
                            </div>
                        </div>
                        <div class="pl-md-0 pl-1"><b>1000.00</b></div>
                        <div class="pl-md-0 pl-0"> <a href="#" class="fa fa-minus-square text-secondary"></a><span class="px-md-3 px-1">2</span><span class="fa fa-plus-square text-secondary"></span> </div>
                        <div class="pl-md-0 pl-1"><b>4000.00</b></div>
                        <div class="close">&times;</div>
                    </div>
                    

                </div>
            </div>
        </div>
        <div class="container bg-light rounded-bottom py-4" id="zero-pad">
            <div class="row d-flex justify-content-center">
                <div class="col-lg-10 col-12">
                    <div class="d-flex justify-content-between align-items-center">
                        <div> <a href="HomeController"><button class="btn btn-sm bg-light border border-dark">GO BACK</button></a> </div>
                        <div class="px-md-0 px-1" id="footer-font"> <b class="pl-md-4">SUBTOTAL<span class="pl-md-4">$61.78</span></b> </div>
                        <div> <button class="btn btn-sm bg-dark text-white px-lg-5 px-3">CONTINUE</button> </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
