package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("//Template\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>Login - SB Admin</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"../css/login/css/styles.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-primary\" >\n");
      out.write("        <div id=\"layoutAuthentication\"style=\"background-image:\">\n");
      out.write("            <div id=\"layoutAuthentication_content\">\n");
      out.write("                <main>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row justify-content-center\" style=\"padding-top: 10%;\">\n");
      out.write("                            <div class=\"col-lg-5\">\n");
      out.write("                                <div  class=\"card shadow-lg border-0 rounded-lg mt-5\">\n");
      out.write("                                    <div class=\"card-header\"><h3 class=\"text-center font-weight-light my-4\">Login</h3></div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <form>\n");
      out.write("                                            <div class=\"form-floating mb-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                <input class=\"form-control\" id=\"inputEmail\" type=\"email\" placeholder=\"name@example.com\" />\n");
      out.write("                                                <label for=\"inputEmail\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i>&nbsp;&nbsp;Username</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-floating mb-3\">\n");
      out.write("                                                <input class=\"form-control\" id=\"inputPassword\" type=\"password\" placeholder=\"Password\" />\n");
      out.write("                                                <label for=\"inputPassword\"><i class=\"fa fa-lock\" aria-hidden=\"true\"></i>&nbsp;&nbsp;Password</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-check mb-3\">\n");
      out.write("                                                <input class=\"form-check-input\" id=\"inputRememberPassword\" type=\"checkbox\" value=\"\" />\n");
      out.write("                                                <label class=\"form-check-label\" for=\"inputRememberPassword\">Remember Password</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"d-flex align-items-center justify-content-between mt-4 mb-0\">\n");
      out.write("                                                <a class=\"btn btn-primary\" href=\"index.html\" style=\"width:20%; display:block;\">Login</a><br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"small\" href=\"password.html\">Forgot Password?</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-footer text-center py-3\">\n");
      out.write("                                        <div class=\"small\"><a href=\"register.html\">Need an account? Sign up!</a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"layoutAuthentication_footer\">\n");
      out.write("                <footer class=\"py-4 bg-light mt-auto\">\n");
      out.write("                    <div class=\"container-fluid px-4\">\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("                            <div class=\"text-muted\">Copyright &copy; Your Website 2021</div>\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"#\">Privacy Policy</a>\n");
      out.write("                                &middot;\n");
      out.write("                                <a href=\"#\">Terms &amp; Conditions</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
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
}
