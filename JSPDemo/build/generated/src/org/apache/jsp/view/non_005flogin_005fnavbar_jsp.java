package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class non_005flogin_005fnavbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Beautiful Bootstrap Navbar with Menu Icons</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background: #eeeeee;\n");
      out.write("                font-family: 'Varela Round', sans-serif;\n");
      out.write("            }\n");
      out.write("            .navbar {\n");
      out.write("                color: #fff;\n");
      out.write("                background: #926dde !important;\n");
      out.write("                padding: 5px 16px;\n");
      out.write("                border-radius: 0;\n");
      out.write("                border: none;\n");
      out.write("                box-shadow: 0 0 4px rgba(0,0,0,.1);\n");
      out.write("            }\n");
      out.write("            .navbar img {\n");
      out.write("                border-radius: 50%;\n");
      out.write("                width: 36px;\n");
      out.write("                height: 36px;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-brand {\n");
      out.write("                color: #efe5ff;\n");
      out.write("                padding-left: 0;\n");
      out.write("                padding-right: 50px;\n");
      out.write("                font-size: 24px;\t\t\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-brand:hover, .navbar .navbar-brand:focus {\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-brand i {\n");
      out.write("                font-size: 25px;\n");
      out.write("                margin-right: 5px;\n");
      out.write("            }\n");
      out.write("            .search-box {\n");
      out.write("                position: relative;\n");
      out.write("            }\t\n");
      out.write("            .search-box input {\n");
      out.write("                padding-right: 35px;\n");
      out.write("                min-height: 38px;\n");
      out.write("                border: none;\n");
      out.write("                background: #faf7fd;\n");
      out.write("                border-radius: 3px !important;\n");
      out.write("            }\n");
      out.write("            .search-box input:focus {\t\t\n");
      out.write("                background: #fff;\n");
      out.write("                box-shadow: none;\n");
      out.write("            }\n");
      out.write("            .search-box .input-group-addon {\n");
      out.write("                min-width: 35px;\n");
      out.write("                border: none;\n");
      out.write("                background: transparent;\n");
      out.write("                position: absolute;\n");
      out.write("                right: 0;\n");
      out.write("                z-index: 9;\n");
      out.write("                padding: 10px 7px;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            .search-box i {\n");
      out.write("                color: #a0a5b1;\n");
      out.write("                font-size: 19px;\n");
      out.write("            }\n");
      out.write("            .navbar .nav-item i {\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .navbar .nav-item span {\n");
      out.write("                position: relative;\n");
      out.write("                top: 3px;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-nav > a {\n");
      out.write("                color: #efe5ff;\n");
      out.write("                padding: 8px 15px;\n");
      out.write("                font-size: 14px;\t\t\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-nav > a:hover, .navbar .navbar-nav > a:focus {\n");
      out.write("                color: #fff;\n");
      out.write("                text-shadow: 0 0 4px rgba(255,255,255,0.3);\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-nav > a > i {\n");
      out.write("                display: block;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-item i {\n");
      out.write("                font-size: 16px;\n");
      out.write("                min-width: 22px;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-item .material-icons {\n");
      out.write("                font-size: 21px;\n");
      out.write("                line-height: 16px;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                margin-top: -2px;\n");
      out.write("            }\n");
      out.write("            .navbar .nav-item.open > a, .navbar .nav-item.open > a:hover, .navbar .nav-item.open > a:focus {\n");
      out.write("                color: #fff;\n");
      out.write("                background: none !important;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu {\n");
      out.write("                border-radius: 1px;\n");
      out.write("                border-color: #e5e5e5;\n");
      out.write("                box-shadow: 0 2px 8px rgba(0,0,0,.05);\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu a {\n");
      out.write("                color: #777 !important;\n");
      out.write("                padding: 8px 20px;\n");
      out.write("                line-height: normal;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu a:hover, .navbar .dropdown-menu a:focus {\n");
      out.write("                color: #333 !important;\n");
      out.write("                background: transparent !important;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-nav .active a, .navbar .navbar-nav .active a:hover, .navbar .navbar-nav .active a:focus {\n");
      out.write("                color: #fff;\n");
      out.write("                text-shadow: 0 0 4px rgba(255,255,255,0.2);\n");
      out.write("                background: transparent !important;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-nav .user-action {\n");
      out.write("                padding: 9px 15px;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-toggle {\n");
      out.write("                border-color: #fff;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-toggle .icon-bar {\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-toggle:focus, .navbar .navbar-toggle:hover {\n");
      out.write("                background: transparent;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-nav .open .dropdown-menu {\n");
      out.write("                background: #faf7fd;\n");
      out.write("                border-radius: 1px;\n");
      out.write("                border-color: #faf7fd;\n");
      out.write("                box-shadow: 0 2px 8px rgba(0,0,0,.05);\n");
      out.write("            }\n");
      out.write("            .navbar .divider {\n");
      out.write("                background-color: #e9ecef !important;\n");
      out.write("            }\n");
      out.write("            @media (min-width: 1200px){\n");
      out.write("                .form-inline .input-group {\n");
      out.write("                    width: 350px;\n");
      out.write("                    margin-left: 30px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media (max-width: 1199px){\n");
      out.write("                .navbar .navbar-nav > a > i {\n");
      out.write("                    display: inline-block;\t\t\t\n");
      out.write("                    text-align: left;\n");
      out.write("                    min-width: 30px;\n");
      out.write("                    position: relative;\n");
      out.write("                    top: 4px;\n");
      out.write("                }\n");
      out.write("                .navbar .navbar-collapse {\n");
      out.write("                    border: none;\n");
      out.write("                    box-shadow: none;\n");
      out.write("                    padding: 0;\n");
      out.write("                }\n");
      out.write("                .navbar .navbar-form {\n");
      out.write("                    border: none;\t\t\t\n");
      out.write("                    display: block;\n");
      out.write("                    margin: 10px 0;\n");
      out.write("                    padding: 0;\n");
      out.write("                }\n");
      out.write("                .navbar .navbar-nav {\n");
      out.write("                    margin: 8px 0;\n");
      out.write("                }\n");
      out.write("                .navbar .navbar-toggle {\n");
      out.write("                    margin-right: 0;\n");
      out.write("                }\n");
      out.write("                .input-group {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-xl navbar-dark bg-dark\">\n");
      out.write("            <a href=\"#\" class=\"navbar-brand\"><i class=\"fa fa-cube\"></i>Phone<b>Store</b></a>  \t\t\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <!-- Collection of nav links, forms, and other content for toggling -->\n");
      out.write("            <div id=\"navbarCollapse\" class=\"collapse navbar-collapse justify-content-start\">\t\t\n");
      out.write("                <div class=\"navbar-nav ml-auto\">\n");
      out.write("                    <a href=\"#\" class=\"nav-item nav-link active\"><i class=\"fa fa-home\"></i><span>Home</span></a>\n");
      out.write("                    <a href=\"#\" class=\"nav-item nav-link\"><i class=\"fa fa-gears\"></i><span>Projects</span></a>\n");
      out.write("                    <a href=\"#\" class=\"nav-item nav-link\"><i class=\"fa fa-users\"></i><span>Team</span></a>\t\t\n");
      out.write("                            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
        out.write("                                ");
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
        out.write("                                    <a href=\"CartController\" class=\"nav-item nav-link\"><i class=\"fa fa-shopping-cart\"></i><span>Cart</span></a>\n");
        out.write("                            <div class=\"nav-item dropdown\">\n");
        out.write("                                <a href=\"#\" data-toggle=\"dropdown\" class=\"nav-item nav-link dropdown-toggle user-action\"><img src=\"https://www.tutorialrepublic.com/examples/images/avatar/3.jpg\" class=\"avatar\" alt=\"Avatar\"> Antonio Moreno <b class=\"caret\"></b></a>\n");
        out.write("                                <div class=\"dropdown-menu\">\n");
        out.write("                                    <a href=\"ProfileController\" class=\"dropdown-item\"><i class=\"fa fa-user-o\"></i> Profile</a>\n");
        out.write("                                    <a href=\"#\" class=\"dropdown-item\"><i class=\"fa fa-calendar-o\"></i> Calendar</a>\n");
        out.write("                                    <a href=\"#\" class=\"dropdown-item\"><i class=\"fa fa-sliders\"></i> Settings</a>\n");
        out.write("                                    <div class=\"divider dropdown-divider\"></div>\n");
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
        out.write("                            <a href=\"LoginController\" class=\"nav-item nav-link\"><i class=\"fa fa-sign-in\"></i><span>Login</span></a>\n");
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
