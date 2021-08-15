package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/view/navbar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            .social-link {\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                color: #666;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                transition: all 0.3s;\n");
      out.write("                font-size: 0.9rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .social-link:hover,\n");
      out.write("            .social-link:focus {\n");
      out.write("                background: #ddd;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #555;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("       <script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!-- Navigation-->\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Bootstrap All in One Navbar</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Merienda+One\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background: #eeeeee;\n");
      out.write("            }\n");
      out.write("            .form-inline {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .navbar-header.col {\n");
      out.write("                padding: 0 !important;\n");
      out.write("            }\n");
      out.write("            .navbar {\t\t\n");
      out.write("                background: #fff;\n");
      out.write("                padding-left: 16px;\n");
      out.write("                padding-right: 16px;\n");
      out.write("                border-bottom: 1px solid #d6d6d6;\n");
      out.write("                box-shadow: 0 0 4px rgba(0,0,0,.1);\n");
      out.write("            }\n");
      out.write("            .nav-link img {\n");
      out.write("                border-radius: 50%;\n");
      out.write("                width: 36px;\n");
      out.write("                height: 36px;\n");
      out.write("                margin: -8px 0;\n");
      out.write("                float: left;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-brand {\n");
      out.write("                color: #555;\n");
      out.write("                padding-left: 0;\n");
      out.write("                padding-right: 50px;\n");
      out.write("                font-family: 'Merienda One', sans-serif;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-brand i {\n");
      out.write("                font-size: 20px;\n");
      out.write("                margin-right: 5px;\n");
      out.write("            }\n");
      out.write("            .search-box {\n");
      out.write("                position: relative;\n");
      out.write("            }\t\n");
      out.write("            .search-box input {\n");
      out.write("                box-shadow: none;\n");
      out.write("                padding-right: 35px;\n");
      out.write("                border-radius: 3px !important;\n");
      out.write("            }\n");
      out.write("            .search-box .input-group-addon {\n");
      out.write("                min-width: 35px;\n");
      out.write("                border: none;\n");
      out.write("                background: transparent;\n");
      out.write("                position: absolute;\n");
      out.write("                right: 0;\n");
      out.write("                z-index: 9;\n");
      out.write("                padding: 7px;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            .search-box i {\n");
      out.write("                color: #a0a5b1;\n");
      out.write("                font-size: 19px;\n");
      out.write("            }\n");
      out.write("            .navbar .nav-item i {\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-item i {\n");
      out.write("                font-size: 16px;\n");
      out.write("                min-width: 22px;\n");
      out.write("            }\n");
      out.write("            .navbar .nav-item.open > a {\n");
      out.write("                background: none !important;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu {\n");
      out.write("                border-radius: 1px;\n");
      out.write("                border-color: #e5e5e5;\n");
      out.write("                box-shadow: 0 2px 8px rgba(0,0,0,.05);\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu a {\n");
      out.write("                color: #777;\n");
      out.write("                padding: 8px 20px;\n");
      out.write("                line-height: normal;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu a:hover, .navbar .dropdown-menu a:active {\n");
      out.write("                color: #333;\n");
      out.write("            }\t\n");
      out.write("            .navbar .dropdown-item .material-icons {\n");
      out.write("                font-size: 21px;\n");
      out.write("                line-height: 16px;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                margin-top: -2px;\n");
      out.write("            }\n");
      out.write("            .navbar .badge {\n");
      out.write("                color: #fff;\n");
      out.write("                background: #f44336;\n");
      out.write("                font-size: 11px;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                position: absolute;\n");
      out.write("                min-width: 10px;\n");
      out.write("                padding: 4px 6px 0;\n");
      out.write("                min-height: 18px;\n");
      out.write("                top: 5px;\n");
      out.write("            }\n");
      out.write("            .navbar a.notifications, .navbar a.messages {\n");
      out.write("                position: relative;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .navbar a.messages {\n");
      out.write("                margin-right: 20px;\n");
      out.write("            }\n");
      out.write("            .navbar a.notifications .badge {\n");
      out.write("                margin-left: -8px;\n");
      out.write("            }\n");
      out.write("            .navbar a.messages .badge {\n");
      out.write("                margin-left: -4px;\n");
      out.write("            }\t\n");
      out.write("            .navbar .active a, .navbar .active a:hover, .navbar .active a:focus {\n");
      out.write("                background: transparent !important;\n");
      out.write("            }\n");
      out.write("            @media (min-width: 1200px){\n");
      out.write("                .form-inline .input-group {\n");
      out.write("                    width: 300px;\n");
      out.write("                    margin-left: 30px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media (max-width: 1199px){\n");
      out.write("                .form-inline {\n");
      out.write("                    display: block;\n");
      out.write("                    margin-bottom: 10px;\n");
      out.write("                }\n");
      out.write("                .input-group {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-xl navbar-light bg-light\">\n");
      out.write("            <a href=\"#\" class=\"navbar-brand\"><i class=\"fa fa-cube\"></i>HE<b>153789</b></a>\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <!-- Collection of nav links, forms, and other content for toggling -->\n");
      out.write("            <div id=\"navbarCollapse\" class=\"collapse navbar-collapse justify-content-start\">\n");
      out.write("                <div class=\"navbar-nav\">\n");
      out.write("                    <a href=\"HomeController\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                    <a href=\"#\" class=\"nav-item nav-link\">About</a>\n");
      out.write("                    <a href=\"CartModelController\" class=\"nav-item nav-link\">Cart</a>\n");
      out.write("                    <div class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Services</a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">Web Design</a>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">Web Development</a>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">Graphic Design</a>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">Digital Marketing</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"navbar-nav ml-auto\">\n");
      out.write("                    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>    ");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"bg-light\">\n");
      out.write("            <div class=\"container py-5\">\n");
      out.write("                <div class=\"row h-100 align-items-center py-5\">\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <h1 class=\"display-4\">About us page</h1>\n");
      out.write("                        <p class=\"lead text-muted mb-0\">Create a minimal about us page using Bootstrap 4.</p>\n");
      out.write("                        <p class=\"lead text-muted\">Snippet by <a href=\"https://bootstrapious.com/snippets\" class=\"text-muted\"> \n");
      out.write("                                <u>Bootstrapious</u></a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 d-none d-lg-block\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834136/illus_kftyh4.png\" alt=\"\" class=\"img-fluid\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"bg-white py-5\">\n");
      out.write("            <div class=\"container py-5\">\n");
      out.write("                <div class=\"row align-items-center mb-5\">\n");
      out.write("                    <div class=\"col-lg-6 order-2 order-lg-1\"><i class=\"fa fa-bar-chart fa-2x mb-3 text-primary\"></i>\n");
      out.write("                        <h2 class=\"font-weight-light\">Lorem ipsum dolor sit amet</h2>\n");
      out.write("                        <p class=\"font-italic text-muted mb-4\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><a href=\"#\" class=\"btn btn-light px-5 rounded-pill shadow-sm\">Learn More</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-5 px-5 mx-auto order-1 order-lg-2\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834139/img-1_e25nvh.jpg\" alt=\"\" class=\"img-fluid mb-4 mb-lg-0\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                    <div class=\"col-lg-5 px-5 mx-auto\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834136/img-2_vdgqgn.jpg\" alt=\"\" class=\"img-fluid mb-4 mb-lg-0\"></div>\n");
      out.write("                    <div class=\"col-lg-6\"><i class=\"fa fa-leaf fa-2x mb-3 text-primary\"></i>\n");
      out.write("                        <h2 class=\"font-weight-light\">Lorem ipsum dolor sit amet</h2>\n");
      out.write("                        <p class=\"font-italic text-muted mb-4\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><a href=\"#\" class=\"btn btn-light px-5 rounded-pill shadow-sm\">Learn More</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"bg-light py-5\">\n");
      out.write("            <div class=\"container py-5\">\n");
      out.write("                <div class=\"row mb-4\">\n");
      out.write("                    <div class=\"col-lg-5\">\n");
      out.write("                        <h2 class=\"display-4 font-weight-light\">Our team</h2>\n");
      out.write("                        <p class=\"font-italic text-muted\">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row text-center\">\n");
      out.write("                    <!-- Team item-->\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 mb-5\">\n");
      out.write("                        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834132/avatar-4_ozhrib.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\n");
      out.write("                            <h5 class=\"mb-0\">A B C</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\n");
      out.write("                            <ul class=\"social mb-0 list-inline mt-3\">\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End-->\n");
      out.write("\n");
      out.write("                    <!-- Team item-->\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 mb-5\">\n");
      out.write("                        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834130/avatar-3_hzlize.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\n");
      out.write("                            <h5 class=\"mb-0\">Nguyen Minh Hoang</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\n");
      out.write("                            <ul class=\"social mb-0 list-inline mt-3\">\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End-->\n");
      out.write("\n");
      out.write("                    <!-- Team item-->\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 mb-5\">\n");
      out.write("                        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834133/avatar-2_f8dowd.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\n");
      out.write("                            <h5 class=\"mb-0\">X Y Z</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\n");
      out.write("                            <ul class=\"social mb-0 list-inline mt-3\">\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End-->\n");
      out.write("\n");
      out.write("                    <!-- Team item-->\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 mb-5\">\n");
      out.write("                        <div class=\"bg-white rounded shadow-sm py-5 px-4\"><img src=\"https://res.cloudinary.com/mhmd/image/upload/v1556834133/avatar-1_s02nlg.png\" alt=\"\" width=\"100\" class=\"img-fluid rounded-circle mb-3 img-thumbnail shadow-sm\">\n");
      out.write("                            <h5 class=\"mb-0\">John Tarly</h5><span class=\"small text-uppercase text-muted\">CEO - Founder</span>\n");
      out.write("                            <ul class=\"social mb-0 list-inline mt-3\">\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-facebook-f\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                <li class=\"list-inline-item\"><a href=\"#\" class=\"social-link\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End-->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\"bg-light pb-5\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <p class=\"font-italic text-muted mb-0\">&copy; Copyrights Company.com All rights reserved.</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"nav-item dropdown\">\n");
        out.write("                                <a href=\"#\" data-toggle=\"dropdown\" class=\"nav-link dropdown-toggle user-action\"><img src=\"css/profile/image/avatar.jpg\" class=\"avatar\" alt=\"Avatar\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <b class=\"caret\"></b></a>\n");
        out.write("                                <div class=\"dropdown-menu\">\n");
        out.write("                                    <a href=\"ProfileController?service=view\" class=\"dropdown-item\"><i class=\"fa fa-user-o\"></i> Profile</a>\n");
        out.write("                                    <a href=\"#\" class=\"dropdown-item\"><i class=\"fa fa-calendar-o\"></i> Calendar</a>\n");
        out.write("                                    <a href=\"#\" class=\"dropdown-item\"><i class=\"fa fa-sliders\"></i> Settings</a>\n");
        out.write("                                    <div class=\"dropdown-divider\"></div>\n");
        out.write("                                    <a href=\"ProfileController?service=logout\" class=\"dropdown-item\"><i class=\"material-icons\">&#xE8AC;</i> Logout</a>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <a href=\"LoginController\" class=\"nav-item nav-link\"><span>Login</span></a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
