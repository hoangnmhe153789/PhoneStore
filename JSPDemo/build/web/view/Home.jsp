<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Shop Homepage - Start Bootstrap Template</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="css/home/assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/home/css/styles.css" rel="stylesheet" />
        <style>
            a.disabled {
    pointer-events: none;
}
        </style>
    </head>
    <body>
        <!-- Navigation-->
        <%@ include file="navbar.jsp" %>
        <!-- Header-->
        

        <div class="container ">
            <header class="bg-dark py-5" style="background-image: linear-gradient(90deg, rgb(44, 44, 252), rgb(250, 155, 165));">
            <div class="container px-4 px-lg-5 my-5">
                <div class="text-center text-white">
                    <h1 class="display-4 fw-bolder">Shopping in style</h1>
                    <p class="lead fw-normal text-white-50 mb-0">Best device with the best price</p>
                </div>
            </div>
        </header>
            <div class="row mt-5">
                <div class="col-md-2">
                    <h5>Brand</h5>
                    <a style="color: black; text-decoration: none;" class="mt-3" href="HomeController?cateId=0&type=1">All Product</a><br>
                    <c:forEach items="${requestScope.cateList}" var="brand">
                        <a style="color: black; text-decoration: none;" class="mt-3" href="HomeController?cateId=${brand.cateID}&type=1">${brand.cateName}</a><br>
                    </c:forEach>
                </div>
                <div class="col-md-10" >
                    <c:if test="${requestScope.mess != null}">
                        <div style="color: red; margin-left: 5%;">${mess}</div>
                    </c:if>
                    <section class="py-5">
                        <div class="container px-4 px-lg-5 mt-0">
                            <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 ">
                                <c:forEach items="${requestScope.productList}" var="p">
                                    <div class="col mb-5">
                                        <div class="card h-100">
                                            <!-- Product image-->
                                            <img  class="card-img-top" src="image/${p.image}" alt="..." />
                                            <!-- Product details-->
                                            <div class="card-body p-4">
                                                <div class="text-center">
                                                    <!-- Product name-->
                                                    <h5 class="fw-bolder">${p.pname}</h5>
                                                    <!-- Product price-->
                                                    ${p.price}
                                                </div>
                                            </div>
                                            <!-- Product actions-->
                                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                                <div class="text-center"><a  class="btn btn-outline-dark mt-auto" href="HomeController?service=addToCart&pid=${p.pid}">Add To Cart</a></div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
            <div class="row">
                <div class="col-md-8">
                </div>
            </div>
        </div>
        <!-- Section-->

        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2021</p></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="css/home/js/scripts.js"></script>
    </body>
</html>
