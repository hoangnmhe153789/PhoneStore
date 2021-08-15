package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"../css/cart.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" />\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <div class=\" container-fluid my-5 \">\n");
      out.write("                <div class=\"row justify-content-center \">\n");
      out.write("                    <div class=\"col-xl-10\">\n");
      out.write("                        <div class=\"card shadow-lg \">\n");
      out.write("                            <div class=\"row p-2 mt-3 justify-content-between mx-sm-2\">\n");
      out.write("                                <div class=\"col\">\n");
      out.write("                                    <p class=\"text-muted space mb-0 shop\"> Shop No.78618K</p>\n");
      out.write("                                    <p class=\"text-muted space mb-0 shop\">Store Locator</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col\">\n");
      out.write("                                    <div class=\"row justify-content-start \">\n");
      out.write("                                        <div class=\"col\"> <img class=\"irc_mi img-fluid cursor-pointer \" src=\"https://i.imgur.com/jFQo2lD.png\" width=\"70\" height=\"70\"> </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-auto\"> <img class=\"irc_mi img-fluid bell\" src=\"https://i.imgur.com/uSHMClk.jpg\" width=\"30\" height=\"30\"> </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row mx-auto justify-content-center text-center\">\n");
      out.write("                                <div class=\"col-12 mt-3 \">\n");
      out.write("                                    <nav aria-label=\"breadcrumb\" class=\"second \">\n");
      out.write("                                        <ol class=\"breadcrumb indigo lighten-6 first \">\n");
      out.write("                                            <li class=\"breadcrumb-item font-weight-bold \"><a class=\"black-text text-uppercase \" href=\"#\"><span class=\"mr-md-3 mr-1\">BACK TO SHOP</span></a><i class=\"fa fa-angle-double-right \" aria-hidden=\"true\"></i></li>\n");
      out.write("                                            <li class=\"breadcrumb-item font-weight-bold\"><a class=\"black-text text-uppercase\" href=\"#\"><span class=\"mr-md-3 mr-1\">SHOPPING BAG</span></a><i class=\"fa fa-angle-double-right text-uppercase \" aria-hidden=\"true\"></i></li>\n");
      out.write("                                            <li class=\"breadcrumb-item font-weight-bold\"><a class=\"black-text text-uppercase active-2\" href=\"#\"><span class=\"mr-md-3 mr-1\">CHECKOUT</span></a></li>\n");
      out.write("                                        </ol>\n");
      out.write("                                    </nav>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row justify-content-around\">\n");
      out.write("                                <div class=\"col-md-5\">\n");
      out.write("                                    <div class=\"card border-0\">\n");
      out.write("                                        <div class=\"card-header pb-0\">\n");
      out.write("                                            <h2 class=\"card-title space \">Checkout</h2>\n");
      out.write("                                            <p class=\"card-text text-muted mt-4 space\">SHIPPING DETAILS</p>\n");
      out.write("                                            <hr class=\"my-0\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-body\">\n");
      out.write("                                            <div class=\"row justify-content-between\">\n");
      out.write("                                                <div class=\"col-auto mt-0\">\n");
      out.write("                                                    <p><b>BBBootstrap Team Vasant Vihar 110020 New Delhi India</b></p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-auto\">\n");
      out.write("                                                    <p><b>BBBootstrap@gmail.com</b> </p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"row mt-4\">\n");
      out.write("                                                <div class=\"col\">\n");
      out.write("                                                    <p class=\"text-muted mb-2\">PAYMENT DETAILS</p>\n");
      out.write("                                                    <hr class=\"mt-0\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\"> <label for=\"NAME\" class=\"small text-muted mb-1\">NAME ON CARD</label> <input type=\"text\" class=\"form-control form-control-sm\" name=\"NAME\" id=\"NAME\" aria-describedby=\"helpId\" placeholder=\"BBBootstrap Team\"> </div>\n");
      out.write("                                            <div class=\"form-group\"> <label for=\"NAME\" class=\"small text-muted mb-1\">CARD NUMBER</label> <input type=\"text\" class=\"form-control form-control-sm\" name=\"NAME\" id=\"NAME\" aria-describedby=\"helpId\" placeholder=\"4534 5555 5555 5555\"> </div>\n");
      out.write("                                            <div class=\"row no-gutters\">\n");
      out.write("                                                <div class=\"col-sm-6 pr-sm-2\">\n");
      out.write("                                                    <div class=\"form-group\"> <label for=\"NAME\" class=\"small text-muted mb-1\">VALID THROUGH</label> <input type=\"text\" class=\"form-control form-control-sm\" name=\"NAME\" id=\"NAME\" aria-describedby=\"helpId\" placeholder=\"06/21\"> </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <div class=\"form-group\"> <label for=\"NAME\" class=\"small text-muted mb-1\">CVC CODE</label> <input type=\"text\" class=\"form-control form-control-sm\" name=\"NAME\" id=\"NAME\" aria-describedby=\"helpId\" placeholder=\"183\"> </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"row mb-md-5\">\n");
      out.write("                                                <div class=\"col\"> <button type=\"button\" name=\"abc\" id=\"abc\" class=\"btn btn-lg btn-block \">PURCHASE $37 SEK</button> </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-5\">\n");
      out.write("                                    <div class=\"card border-0 \">\n");
      out.write("                                        <div class=\"card-header card-2\">\n");
      out.write("                                            <p class=\"card-text text-muted mt-md-4 mb-2 space\">YOUR ORDER <span class=\" small text-muted ml-2 cursor-pointer\">EDIT SHOPPING BAG</span> </p>\n");
      out.write("                                            <hr class=\"my-2\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-body pt-0\">\n");
      out.write("                                            <div class=\"row justify-content-between\">\n");
      out.write("                                                <div class=\"col-auto col-md-7\">\n");
      out.write("                                                    <div class=\"media flex-column flex-sm-row\"> <img class=\" img-fluid\" src=\"https://i.imgur.com/6oHix28.jpg\" width=\"62\" height=\"62\">\n");
      out.write("                                                        <div class=\"media-body my-auto\">\n");
      out.write("                                                            <div class=\"row \">\n");
      out.write("                                                                <div class=\"col-auto\">\n");
      out.write("                                                                    <p class=\"mb-0\"><b>EC-GO Bag Standard</b></p><small class=\"text-muted\">1 Week Subscription</small>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\" pl-0 flex-sm-col col-auto my-auto\">\n");
      out.write("                                                    <p class=\"boxed-1\">2</p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\" pl-0 flex-sm-col col-auto my-auto \">\n");
      out.write("                                                    <p><b>179 SEK</b></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr class=\"my-2\">\n");
      out.write("                                            <div class=\"row justify-content-between\">\n");
      out.write("                                                <div class=\"col-auto col-md-7\">\n");
      out.write("                                                    <div class=\"media flex-column flex-sm-row\"> <img class=\" img-fluid \" src=\"https://i.imgur.com/9MHvALb.jpg\" width=\"62\" height=\"62\">\n");
      out.write("                                                        <div class=\"media-body my-auto\">\n");
      out.write("                                                            <div class=\"row \">\n");
      out.write("                                                                <div class=\"col\">\n");
      out.write("                                                                    <p class=\"mb-0\"><b>EC-GO Bag Standard</b></p><small class=\"text-muted\">2 Week Subscription</small>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"pl-0 flex-sm-col col-auto my-auto\">\n");
      out.write("                                                    <p class=\"boxed\">3</p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"pl-0 flex-sm-col col-auto my-auto\">\n");
      out.write("                                                    <p><b>179 SEK</b></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr class=\"my-2\">\n");
      out.write("                                            <div class=\"row justify-content-between\">\n");
      out.write("                                                <div class=\"col-auto col-md-7\">\n");
      out.write("                                                    <div class=\"media flex-column flex-sm-row\"> <img class=\" img-fluid \" src=\"https://i.imgur.com/6oHix28.jpg\" width=\"62\" height=\"62\">\n");
      out.write("                                                        <div class=\"media-body my-auto\">\n");
      out.write("                                                            <div class=\"row \">\n");
      out.write("                                                                <div class=\"col\">\n");
      out.write("                                                                    <p class=\"mb-0\"><b>EC-GO Bag Standard</b></p><small class=\"text-muted\">2 Week Subscription</small>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"pl-0 flex-sm-col col-auto my-auto\">\n");
      out.write("                                                    <p class=\"boxed-1\">2</p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"pl-0 flex-sm-col col-auto my-auto\">\n");
      out.write("                                                    <p><b>179 SEK</b></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr class=\"my-2\">\n");
      out.write("                                            <div class=\"row \">\n");
      out.write("                                                <div class=\"col\">\n");
      out.write("                                                    <div class=\"row justify-content-between\">\n");
      out.write("                                                        <div class=\"col-4\">\n");
      out.write("                                                            <p class=\"mb-1\"><b>Subtotal</b></p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"flex-sm-col col-auto\">\n");
      out.write("                                                            <p class=\"mb-1\"><b>179 SEK</b></p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row justify-content-between\">\n");
      out.write("                                                        <div class=\"col\">\n");
      out.write("                                                            <p class=\"mb-1\"><b>Shipping</b></p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"flex-sm-col col-auto\">\n");
      out.write("                                                            <p class=\"mb-1\"><b>0 SEK</b></p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row justify-content-between\">\n");
      out.write("                                                        <div class=\"col-4\">\n");
      out.write("                                                            <p><b>Total</b></p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"flex-sm-col col-auto\">\n");
      out.write("                                                            <p class=\"mb-1\"><b>537 SEK</b></p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <hr class=\"my-0\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"row mb-5 mt-4 \">\n");
      out.write("                                                <div class=\"col-md-7 col-lg-6 mx-auto\"><button type=\"button\" class=\"btn btn-block btn-outline-primary btn-lg\">ADD GIFT CODE</button></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js\"  crossorigin=\"anonymous\"></script>\n");
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
