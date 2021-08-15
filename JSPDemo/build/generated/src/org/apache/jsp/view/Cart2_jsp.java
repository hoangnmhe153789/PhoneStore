package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("    background-color: #eeeeee\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer-background {\n");
      out.write("    background-color: rgb(204, 199, 199)\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media(max-width:991px) {\n");
      out.write("    #heading {\n");
      out.write("        padding-left: 50px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #prc {\n");
      out.write("        margin-left: 70px;\n");
      out.write("        padding-left: 110px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #quantity {\n");
      out.write("        padding-left: 48px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #produc {\n");
      out.write("        padding-left: 40px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #total {\n");
      out.write("        padding-left: 54px\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media(max-width:767px) {\n");
      out.write("    .mobile {\n");
      out.write("        font-size: 10px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h5 {\n");
      out.write("        font-size: 14px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h6 {\n");
      out.write("        font-size: 9px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #mobile-font {\n");
      out.write("        font-size: 11px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #prc {\n");
      out.write("        font-weight: 700;\n");
      out.write("        margin-left: -45px;\n");
      out.write("        padding-left: 105px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #quantity {\n");
      out.write("        font-weight: 700;\n");
      out.write("        padding-left: 6px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #produc {\n");
      out.write("        font-weight: 700;\n");
      out.write("        padding-left: 0px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #total {\n");
      out.write("        font-weight: 700;\n");
      out.write("        padding-left: 9px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #image {\n");
      out.write("        width: 60px;\n");
      out.write("        height: 60px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .col {\n");
      out.write("        width: 100%\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #zero-pad {\n");
      out.write("        padding: 2%;\n");
      out.write("        margin-left: 10px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #footer-font {\n");
      out.write("        font-size: 12px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #heading {\n");
      out.write("        padding-top: 15px\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" />\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container bg-white rounded-top mt-5\" id=\"zero-pad\">\n");
      out.write("    <div class=\"row d-flex justify-content-center\">\n");
      out.write("        <div class=\"col-lg-10 col-12 pt-3\">\n");
      out.write("            <div class=\"d-flex\">\n");
      out.write("                <div class=\"pt-1\">\n");
      out.write("                    <h4>My T-shirt</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ml-auto p-2\"><a href=\"#\" class=\"text-dark text-decoration-none\" id=\"mobile-font\">LOGIN</a></div>\n");
      out.write("                <div class=\"p-2\"><a href=\"#\" class=\"text-dark text-decoration-none a\" id=\"mobile-font\">HELP</a></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"d-flex flex-column pt-4\">\n");
      out.write("                <div>\n");
      out.write("                    <h5 class=\"text-uppercase font-weight-normal\">shopping bag</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"font-weight-normal\">2 items</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"d-flex flex-row px-lg-5 mx-lg-5 mobile\" id=\"heading\">\n");
      out.write("                <div class=\"px-lg-5 mr-lg-5\" id=\"produc\">PRODUCTS</div>\n");
      out.write("                <div class=\"px-lg-5 ml-lg-5\" id=\"prc\">PRICE</div>\n");
      out.write("                <div class=\"px-lg-5 ml-lg-1\" id=\"quantity\">QUANTITY</div>\n");
      out.write("                <div class=\"px-lg-5 ml-lg-3\" id=\"total\">TOTAL</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"d-flex flex-row justify-content-between align-items-center pt-lg-4 pt-2 pb-3 border-bottom mobile\">\n");
      out.write("                \n");
      out.write("                <div class=\"d-flex flex-row align-items-center\">\n");
      out.write("                    <div><img src=\"https://images.unsplash.com/photo-1529374255404-311a2a4f1fd9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60\" width=\"150\" height=\"150\" alt=\"\" id=\"image\"></div>\n");
      out.write("                    <div class=\"d-flex flex-column pl-md-3 pl-1\">\n");
      out.write("                        <div>\n");
      out.write("                            <h6>COTTON</h6>\n");
      out.write("                        </div>\n");
      out.write("                        <div><span class=\"pl-2\">Apple Product</span></div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"pl-md-0 pl-1\"><b>$9.99</b></div>\n");
      out.write("                <div class=\"pl-md-0 pl-2\"> <span class=\"fa fa-minus-square text-secondary\"></span><span class=\"px-md-3 px-1\">2</span><span class=\"fa fa-plus-square text-secondary\"></span> </div>\n");
      out.write("                <div class=\"pl-md-0 pl-1\"><b>$19.98</b></div>\n");
      out.write("                <div class=\"close\">&times;</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"d-flex flex-row justify-content-between align-items-center pt-4 pb-3 mobile\">\n");
      out.write("                <div class=\"d-flex flex-row align-items-center\">\n");
      out.write("                    <div><img src=\"https://images.unsplash.com/photo-1529374255404-311a2a4f1fd9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60\" width=\"150\" height=\"150\" alt=\"\" id=\"image\"></div>\n");
      out.write("                    <div class=\"d-flex flex-column pl-md-3 pl-1\">\n");
      out.write("                        <div>\n");
      out.write("                            <h6>WHITE T-SHIRT</h6>\n");
      out.write("                        </div>\n");
      out.write("                        <div>Art.No:<span class=\"pl-2\">056289891</span></div>\n");
      out.write("                        <div>Color:<span class=\"pl-3\">White</span></div>\n");
      out.write("                        <div>Size:<span class=\"pl-4\"> XL</span></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"pl-md-0 pl-1\"><b>$20.9</b></div>\n");
      out.write("                <div class=\"pl-md-0 pl-2\"> <span class=\"fa fa-minus-square text-secondary\"></span><span class=\"px-md-3 px-1\">2</span><span class=\"fa fa-plus-square text-secondary\"></span> </div>\n");
      out.write("                <div class=\"pl-md-0 pl-1\"><b>$41.8</b></div>\n");
      out.write("                <div class=\"close\">&times;</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container bg-light rounded-bottom py-4\" id=\"zero-pad\">\n");
      out.write("    <div class=\"row d-flex justify-content-center\">\n");
      out.write("        <div class=\"col-lg-10 col-12\">\n");
      out.write("            <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                <div> <button class=\"btn btn-sm bg-light border border-dark\">GO BACK</button> </div>\n");
      out.write("                <div class=\"px-md-0 px-1\" id=\"footer-font\"> <b class=\"pl-md-4\">SUBTOTAL<span class=\"pl-md-4\">$61.78</span></b> </div>\n");
      out.write("                <div> <button class=\"btn btn-sm bg-dark text-white px-lg-5 px-3\">CONTINUE</button> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
