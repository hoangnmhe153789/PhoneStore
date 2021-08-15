package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Product;
import java.util.ArrayList;

public final class CartModel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-color: #eeeeee\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-background {\n");
      out.write("                background-color: rgb(204, 199, 199)\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media(max-width:991px) {\n");
      out.write("                #heading {\n");
      out.write("                    padding-left: 50px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #prc {\n");
      out.write("                    margin-left: 70px;\n");
      out.write("                    padding-left: 110px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #quantity {\n");
      out.write("                    padding-left: 48px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #produc {\n");
      out.write("                    padding-left: 40px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #total {\n");
      out.write("                    padding-left: 54px\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media(max-width:767px) {\n");
      out.write("                .mobile {\n");
      out.write("                    font-size: 10px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                h5 {\n");
      out.write("                    font-size: 14px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                h6 {\n");
      out.write("                    font-size: 9px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #mobile-font {\n");
      out.write("                    font-size: 11px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #prc {\n");
      out.write("                    font-weight: 700;\n");
      out.write("                    margin-left: -45px;\n");
      out.write("                    padding-left: 105px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #quantity {\n");
      out.write("                    font-weight: 700;\n");
      out.write("                    padding-left: 6px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #produc {\n");
      out.write("                    font-weight: 700;\n");
      out.write("                    padding-left: 0px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #total {\n");
      out.write("                    font-weight: 700;\n");
      out.write("                    padding-left: 9px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #image {\n");
      out.write("                    width: 60px;\n");
      out.write("                    height: 60px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .col {\n");
      out.write("                    width: 100%\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #zero-pad {\n");
      out.write("                    padding: 2%;\n");
      out.write("                    margin-left: 10px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #footer-font {\n");
      out.write("                    font-size: 12px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #heading {\n");
      out.write("                    padding-top: 15px\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" />\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function myFunction() {\n");
      out.write("                document.getElementById(\"formsearch\").submit();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: linear-gradient(90deg, rgb(44, 44, 252), rgb(250, 155, 165));\">\n");
      out.write("        \n");
      out.write("        <form action=\"CartModelController\" method=\"POST\" id=\"formsearch\">\n");
      out.write("            <div class=\"container bg-white rounded-top mt-5\" id=\"zero-pad\">\n");
      out.write("                <div class=\"row d-flex justify-content-center\">\n");
      out.write("                    <div class=\"col-lg-10 col-12 pt-3\">\n");
      out.write("                    <div class=\"d-flex\">\n");
      out.write("                        <div class=\"pt-1\">\n");
      out.write("                            <h3>Shopping Cart</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                     ");

                                boolean isEmpty = (Boolean) request.getAttribute("empty");
                                String username = (String) request.getSession().getAttribute("username");
                                if (username != null) {
                                } else {
                                    response.sendRedirect("LoginController");
                                }
                                String mess = (String) request.getAttribute("mess");

                            
if (mess != null) {
      out.write("\n");
      out.write("                            <div ");
if (!isEmpty) {
      out.write("style=\"color: red;\"");
}
      out.write('>');
      out.print(mess);
      out.write("</div>\n");
      out.write("                            ");
}
                                if (isEmpty) {
                                } else {
                                    ArrayList<Product> plist = (ArrayList<Product>) request.getAttribute("Cart");
                                    double total = 0;
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                    <div class=\"d-flex flex-column pt-4\">\n");
      out.write("                        <div>\n");
      out.write("                            <h5 class=\"text-uppercase font-weight-normal\"></h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"font-weight-normal\">2 items</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex flex-row px-lg-5 mx-lg-5 mobile\" id=\"heading\">\n");
      out.write("                        <div style=\"\" class=\"px-lg-5 ml-lg-4 \" id=\"produc\">PRODUCTS</div>\n");
      out.write("                        <div  class=\"px-lg-5 ml-lg-3\" id=\"prc\">PRICE</div>\n");
      out.write("                        <div class=\"px-lg-5 ml-lg-4\" id=\"quantity\">QUANTITY</div>\n");
      out.write("                        <div class=\"px-lg-5 ml-lg-4\" id=\"total\">TOTAL</div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
for (Product p : plist) {
      out.write("\n");
      out.write("                            <div class=\"d-flex flex-row justify-content-between align-items-center pt-lg-4 pt-2 pb-3 border-bottom mobile\">\n");
      out.write("                            <input type=\"hidden\" name=\"pid\" value=\"");
      out.print(p.getPid());
      out.write("\">\n");
      out.write("                        <div class=\"d-flex flex-row align-items-center\">\n");
      out.write("                            <div><img src=\"https://images.unsplash.com/photo-1529374255404-311a2a4f1fd9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60\" width=\"150\" height=\"150\" alt=\"\" id=\"image\"></div>\n");
      out.write("                            <div class=\"d-flex flex-column pl-md-3 pl-1\">\n");
      out.write("                                <div>\n");
      out.write("                                    <h6>");
      out.print(p.getPname());
      out.write("</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pl-md-0 pl-1\"><b>");
      out.print(p.getPrice());
      out.write("</b></div>\n");
      out.write("                        <div class=\"pl-md-0 pl-0\"> <a class=\"fa fa-minus-square text-secondary\"></a><span class=\"px-md-3 px-1\">\n");
      out.write("                               <input style=\"width: 40px; text-align: center;\" type=\"text\" onchange=\"myFunction();\" name=\"quantity\" value=\"");
      out.print(p.getQuantity());
      out.write("\">\n");
      out.write("                            </span>\n");
      out.write("                            <a class=\"fa fa-plus-square text-secondary\"></a> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pl-md-0 pl-1\"><b>");
      out.print(p.getPrice() * p.getQuantity());
      out.write("</b></div>\n");
      out.write("                        <div class=\"close\">&times;</div>\n");
      out.write("                    </div>\n");
      out.write("                            ");
}
      out.write(" \n");
      out.write("                      ");
}
      out.write("\n");
      out.write("                      </div>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"container bg-light rounded-bottom py-4\" id=\"zero-pad\">\n");
      out.write("            <div class=\"row d-flex justify-content-center\">\n");
      out.write("                <div class=\"col-lg-10 col-12\">\n");
      out.write("                    <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                        <div> <a href=\"HomeController\"><button class=\"btn btn-sm bg-light border border-dark\">GO BACK</button></a> </div>\n");
      out.write("                        <div class=\"px-md-0 px-1\" id=\"footer-font\"> <b class=\"pl-md-4\">SUBTOTAL<span class=\"pl-md-4\">$61.78</span></b> </div>\n");
      out.write("                        <div> <button class=\"btn btn-sm bg-dark text-white px-lg-5 px-3\">CONTINUE</button> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </form>    \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("        \n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js \"  crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"  crossorigin=\"anonymous\"></script>\n");
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
