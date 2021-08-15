package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/view/navbar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Shop Homepage - Start Bootstrap Template</title>\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"css/home/assets/favicon.ico\" />\n");
      out.write("        <!-- Bootstrap icons-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/home/css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navigation-->\n");
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
      out.write("                    <a href=\"#\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                    <a href=\"#\" class=\"nav-item nav-link\">About</a>\n");
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
      out.write("        <!-- Header-->\n");
      out.write("        <header class=\"bg-dark py-5\">\n");
      out.write("            <div class=\"container px-4 px-lg-5 my-5\">\n");
      out.write("                <div class=\"text-center text-white\">\n");
      out.write("                    <h1 class=\"display-4 fw-bolder\">Shop in style</h1>\n");
      out.write("                    <p class=\"lead fw-normal text-white-50 mb-0\">With this shop hompeage template</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <h5>Brand</h5>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-10\" >\n");
      out.write("                    <section class=\"py-5\">\n");
      out.write("                        <div class=\"container px-4 px-lg-5 mt-0\">\n");
      out.write("                            <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 \">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Section-->\n");
      out.write("\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"py-5 bg-dark\">\n");
      out.write("            <div class=\"container\"><p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2021</p></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"css/home/js/scripts.js\"></script>\n");
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
        out.write("                                <a href=\"#\" data-toggle=\"dropdown\" class=\"nav-link dropdown-toggle user-action\"><img src=\"https://www.tutorialrepublic.com/examples/images/avatar/3.jpg\" class=\"avatar\" alt=\"Avatar\"> Paula Wilson <b class=\"caret\"></b></a>\n");
        out.write("                                <div class=\"dropdown-menu\">\n");
        out.write("                                    <a href=\"ProfileController\" class=\"dropdown-item\"><i class=\"fa fa-user-o\"></i> Profile</a>\n");
        out.write("                                    <a href=\"#\" class=\"dropdown-item\"><i class=\"fa fa-calendar-o\"></i> Calendar</a>\n");
        out.write("                                    <a href=\"#\" class=\"dropdown-item\"><i class=\"fa fa-sliders\"></i> Settings</a>\n");
        out.write("                                    <div class=\"dropdown-divider\"></div>\n");
        out.write("                                    <a href=\"#\" class=\"dropdown-item\"><i class=\"material-icons\">&#xE8AC;</i> Logout</a>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cateList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("brand");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <a style=\"color: black; text-decoration: none;\" class=\"mt-3\" href=\"HomeController?cateId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a><br>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("p");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <div class=\"col mb-5\">\n");
          out.write("                                        <div class=\"card h-100\">\n");
          out.write("                                            <!-- Product image-->\n");
          out.write("                                            <img  class=\"card-img-top\" src=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"...\" />\n");
          out.write("                                            <!-- Product details-->\n");
          out.write("                                            <div class=\"card-body p-4\">\n");
          out.write("                                                <div class=\"text-center\">\n");
          out.write("                                                    <!-- Product name-->\n");
          out.write("                                                    <h5 class=\"fw-bolder\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                    <!-- Product price-->\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <!-- Product actions-->\n");
          out.write("                                            <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
          out.write("                                                <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add To Cart</a></div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
