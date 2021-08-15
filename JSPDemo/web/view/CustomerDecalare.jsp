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
                            </div>
                        </div>
                        <br>
                        <div class="container justify-content-between ">
                            <div class="container ml-lg-4"> 
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Receiver</label>
                                    <input type="email" class="form-control" id="exampleInputEmail1"  placeholder="Receiver">

                                </div><br>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Phone</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Phone">
                                </div>
                                <br>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Address</label>
                                    <input type="email" class="form-control" id="exampleInputEmail1"  placeholder="Address">
                                </div>
                                <br>
                            </div>

                        </div>
                    </div>  
                </div>
                <div class="container bg-light rounded-bottom py-4" id="zero-pad">
                    <div class="row d-flex justify-content-center">
                        <div class="col-lg-10 col-12">
                            <div class="d-flex justify-content-between align-items-center">
                                <div> <button class="btn btn-sm bg-light border border-dark"><a style="text-decoration: none; color: black;" href="HomeController">GO BACK</a></button> </div>
                                <div> <button class="btn btn-sm bg-dark text-white px-lg-5 px-3"><a href="">Use default info</a></button></div>
                                <div> <button class="btn btn-sm bg-dark text-white px-lg-5 px-3" >CONTINUE</button></div>
                            </div>
                        </div>
                    </div>
                </div>
                </div>
        </form> 
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js "  crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"  crossorigin="anonymous"></script>
    </body>
</html>
