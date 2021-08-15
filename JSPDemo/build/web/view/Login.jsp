<%-- 
    Document   : Login
    Created on : Jun 21, 2021, 1:07:42 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Login - SB Admin</title>
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
        <link href="css/login/css/styles.css" rel="stylesheet"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous">
            
        </script>
         <script>
            function myFunction() {
                document.getElementById("formsearch").submit();
            }
        </script>
    </head>
    <body class="bg-primary" style="background-image: linear-gradient(90deg, rgb(44, 44, 252), rgb(250, 155, 165));" >
        <div id="layoutAuthentication" >
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center" style="padding-top: 10%;">
                            <div class="col-lg-5">
                                <div  class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">Login</h3></div>
                                    <div class="card-body">
                                        <c:set var="mess" value="${requestScope.mess}" />
                                        <div style="color: red;">
                                            <c:if test="${mess != null}">
                                                <c:out value="${mess}"/>
                                            </c:if>
                                        </div>
                                        <form action="LoginController" method="POST" id="formsearch">
                                            <div class="form-floating mb-3">
                                                <input class="form-control" required="" name="username" id="inputEmail" type="text" placeholder="Username"  />
                                                <label for="inputEmail"><i class="fa fa-user" aria-hidden="true"></i>&nbsp;&nbsp;Username</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" name="password" required="" id="inputPassword" type="password" placeholder="Password" />
                                                <label for="inputPassword"><i class="fa fa-lock" aria-hidden="true"></i>&nbsp;&nbsp;Password</label>
                                            </div>
                                            <div class="form-check mb-3">
                                                <input class="form-check-input" id="inputRememberPassword" type="checkbox" value="" />
                                                <label class="form-check-label" for="inputRememberPassword">Remember Password</label>
                                            </div>
                                            <div class="d-flex align-items-center justify-content-between mt-4 mb-0">
                                                <a class="btn btn-primary" style="width:20%; display:block;" onclick="myFunction();">Login</a>
                                                <a class="small" href="password.html">Forgot Password?</a>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="card-footer text-center py-3">
                                        <div class="small"><a href="RegisterController">Need an account? Sign up!</a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
            <div id="layoutAuthentication_footer">
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2021</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="css/login/js/scripts.js"></script>
    </body>
</html>
