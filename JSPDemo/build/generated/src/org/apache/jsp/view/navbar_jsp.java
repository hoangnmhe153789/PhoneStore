package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<title>Bootstrap All in One Navbar</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Merienda+One\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("\tbackground: #eeeeee;\n");
      out.write("}\n");
      out.write(".form-inline {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("}\n");
      out.write(".navbar-header.col {\n");
      out.write("\tpadding: 0 !important;\n");
      out.write("}\n");
      out.write(".navbar {\t\t\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tpadding-left: 16px;\n");
      out.write("\tpadding-right: 16px;\n");
      out.write("\tborder-bottom: 1px solid #d6d6d6;\n");
      out.write("\tbox-shadow: 0 0 4px rgba(0,0,0,.1);\n");
      out.write("}\n");
      out.write(".nav-link img {\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\twidth: 36px;\n");
      out.write("\theight: 36px;\n");
      out.write("\tmargin: -8px 0;\n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin-right: 10px;\n");
      out.write("}\n");
      out.write(".navbar .navbar-brand {\n");
      out.write("\tcolor: #555;\n");
      out.write("\tpadding-left: 0;\n");
      out.write("\tpadding-right: 50px;\n");
      out.write("\tfont-family: 'Merienda One', sans-serif;\n");
      out.write("}\n");
      out.write(".navbar .navbar-brand i {\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\tmargin-right: 5px;\n");
      out.write("}\n");
      out.write(".search-box {\n");
      out.write("\tposition: relative;\n");
      out.write("}\t\n");
      out.write(".search-box input {\n");
      out.write("\tbox-shadow: none;\n");
      out.write("\tpadding-right: 35px;\n");
      out.write("\tborder-radius: 3px !important;\n");
      out.write("}\n");
      out.write(".search-box .input-group-addon {\n");
      out.write("\tmin-width: 35px;\n");
      out.write("\tborder: none;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tright: 0;\n");
      out.write("\tz-index: 9;\n");
      out.write("\tpadding: 7px;\n");
      out.write("\theight: 100%;\n");
      out.write("}\n");
      out.write(".search-box i {\n");
      out.write("\tcolor: #a0a5b1;\n");
      out.write("\tfont-size: 19px;\n");
      out.write("}\n");
      out.write(".navbar .nav-item i {\n");
      out.write("\tfont-size: 18px;\n");
      out.write("}\n");
      out.write(".navbar .dropdown-item i {\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tmin-width: 22px;\n");
      out.write("}\n");
      out.write(".navbar .nav-item.open > a {\n");
      out.write("\tbackground: none !important;\n");
      out.write("}\n");
      out.write(".navbar .dropdown-menu {\n");
      out.write("\tborder-radius: 1px;\n");
      out.write("\tborder-color: #e5e5e5;\n");
      out.write("\tbox-shadow: 0 2px 8px rgba(0,0,0,.05);\n");
      out.write("}\n");
      out.write(".navbar .dropdown-menu a {\n");
      out.write("\tcolor: #777;\n");
      out.write("\tpadding: 8px 20px;\n");
      out.write("\tline-height: normal;\n");
      out.write("}\n");
      out.write(".navbar .dropdown-menu a:hover, .navbar .dropdown-menu a:active {\n");
      out.write("\tcolor: #333;\n");
      out.write("}\t\n");
      out.write(".navbar .dropdown-item .material-icons {\n");
      out.write("\tfont-size: 21px;\n");
      out.write("\tline-height: 16px;\n");
      out.write("\tvertical-align: middle;\n");
      out.write("\tmargin-top: -2px;\n");
      out.write("}\n");
      out.write(".navbar .badge {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground: #f44336;\n");
      out.write("\tfont-size: 11px;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tmin-width: 10px;\n");
      out.write("\tpadding: 4px 6px 0;\n");
      out.write("\tmin-height: 18px;\n");
      out.write("\ttop: 5px;\n");
      out.write("}\n");
      out.write(".navbar a.notifications, .navbar a.messages {\n");
      out.write("\tposition: relative;\n");
      out.write("\tmargin-right: 10px;\n");
      out.write("}\n");
      out.write(".navbar a.messages {\n");
      out.write("\tmargin-right: 20px;\n");
      out.write("}\n");
      out.write(".navbar a.notifications .badge {\n");
      out.write("\tmargin-left: -8px;\n");
      out.write("}\n");
      out.write(".navbar a.messages .badge {\n");
      out.write("\tmargin-left: -4px;\n");
      out.write("}\t\n");
      out.write(".navbar .active a, .navbar .active a:hover, .navbar .active a:focus {\n");
      out.write("\tbackground: transparent !important;\n");
      out.write("}\n");
      out.write("@media (min-width: 1200px){\n");
      out.write("\t.form-inline .input-group {\n");
      out.write("\t\twidth: 300px;\n");
      out.write("\t\tmargin-left: 30px;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("@media (max-width: 1199px){\n");
      out.write("\t.form-inline {\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\tmargin-bottom: 10px;\n");
      out.write("\t}\n");
      out.write("\t.input-group {\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head> \n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-xl navbar-light bg-light\">\n");
      out.write("\t<a href=\"#\" class=\"navbar-brand\"><i class=\"fa fa-cube\"></i>Brand<b>Name</b></a>\n");
      out.write("\t<button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t</button>\n");
      out.write("\t<!-- Collection of nav links, forms, and other content for toggling -->\n");
      out.write("\t<div id=\"navbarCollapse\" class=\"collapse navbar-collapse justify-content-start\">\n");
      out.write("\t\t<div class=\"navbar-nav\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"nav-item nav-link\">About</a>\n");
      out.write("\t\t\t<div class=\"nav-item dropdown\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Services</a>\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\">Web Design</a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\">Web Development</a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\">Graphic Design</a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\">Digital Marketing</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<a href=\"#\" class=\"nav-item nav-link\">Blog</a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"nav-item nav-link\">Contact</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<form class=\"navbar-form form-inline\">\n");
      out.write("\t\t\t<div class=\"input-group search-box\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"search\" class=\"form-control\" placeholder=\"Search by Name\">\n");
      out.write("\t\t\t\t<span class=\"input-group-addon\"><i class=\"material-icons\">&#xE8B6;</i></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<div class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"nav-item nav-link notifications\"><i class=\"fa fa-bell-o\"></i><span class=\"badge\">1</span></a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"nav-item nav-link messages\"><i class=\"fa fa-envelope-o\"></i><span class=\"badge\">10</span></a></a>\n");
      out.write("\t\t\t<div class=\"nav-item dropdown\">\n");
      out.write("\t\t\t\t<a href=\"#\" data-toggle=\"dropdown\" class=\"nav-link dropdown-toggle user-action\"><img src=\"/examples/images/avatar/2.jpg\" class=\"avatar\" alt=\"Avatar\"> Paula Wilson <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\"><i class=\"fa fa-user-o\"></i> Profile</a></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\"><i class=\"fa fa-calendar-o\"></i> Calendar</a></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\"><i class=\"fa fa-sliders\"></i> Settings</a></a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-divider\"></div>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\"><i class=\"material-icons\">&#xE8AC;</i> Logout</a></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("</body>\n");
      out.write("</html>    ");
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
}
