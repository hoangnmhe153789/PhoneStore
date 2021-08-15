package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Invoice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js\" />\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .card {\n");
      out.write("                margin-bottom: 1.5rem\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card {\n");
      out.write("                position: relative;\n");
      out.write("                display: -ms-flexbox;\n");
      out.write("                display: flex;\n");
      out.write("                -ms-flex-direction: column;\n");
      out.write("                flex-direction: column;\n");
      out.write("                min-width: 0;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("                background-color: #fff;\n");
      out.write("                background-clip: border-box;\n");
      out.write("                border: 1px solid #c8ced3;\n");
      out.write("                border-radius: .25rem\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-header:first-child {\n");
      out.write("                border-radius: calc(0.25rem - 1px) calc(0.25rem - 1px) 0 0\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-header {\n");
      out.write("                padding: .75rem 1.25rem;\n");
      out.write("                margin-bottom: 0;\n");
      out.write("                background-color: #f0f3f5;\n");
      out.write("                border-bottom: 1px solid #c8ced3\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div id=\"ui-view\" data-select2-id=\"ui-view\">\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\">Invoice\n");
      out.write("                                <strong>#BBB-10010110101938</strong>\n");
      out.write("                                <a class=\"btn btn-sm btn-secondary float-right mr-1 d-print-none\" href=\"#\" onclick=\"javascript:window.print();\" data-abc=\"true\">\n");
      out.write("                                    <i class=\"fa fa-print\"></i> Print</a>\n");
      out.write("                                <a class=\"btn btn-sm btn-info float-right mr-1 d-print-none\" href=\"#\" data-abc=\"true\">\n");
      out.write("                                    <i class=\"fa fa-save\"></i> Save</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"row mb-4\">\n");
      out.write("                                    <div class=\"col-sm-4\">\n");
      out.write("                                        <h6 class=\"mb-3\">From:</h6>\n");
      out.write("                                        <div>\n");
      out.write("                                            <strong>BBBootstrap.com</strong>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>42, Awesome Enclave</div>\n");
      out.write("                                        <div>New York City, New york, 10394</div>\n");
      out.write("                                        <div>Email: admin@bbbootstrap.com</div>\n");
      out.write("                                        <div>Phone: +48 123 456 789</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4\">\n");
      out.write("                                        <h6 class=\"mb-3\">To:</h6>\n");
      out.write("                                        <div>\n");
      out.write("                                            <strong>BBBootstrap.com</strong>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>42, Awesome Enclave</div>\n");
      out.write("                                        <div>New York City, New york, 10394</div>\n");
      out.write("                                        <div>Email: admin@bbbootstrap.com</div>\n");
      out.write("                                        <div>Phone: +48 123 456 789</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4\">\n");
      out.write("                                        <h6 class=\"mb-3\">Details:</h6>\n");
      out.write("                                        <div>Invoice\n");
      out.write("                                            <strong>#BBB-10010110101938</strong>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>April 30, 2019</div>\n");
      out.write("                                        <div>VAT: NYC09090390</div>\n");
      out.write("                                        <div>Account Name: BBBootstrap Inc</div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <strong>SWIFT code: 99 8888 7777 6666 5555</strong>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"table-responsive-sm\">\n");
      out.write("                                    <table class=\"table table-striped\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th class=\"center\">#</th>\n");
      out.write("                                                <th>Item</th>\n");
      out.write("                                                <th>Description</th>\n");
      out.write("                                                <th class=\"center\">Quantity</th>\n");
      out.write("                                                <th class=\"right\">Unit Cost</th>\n");
      out.write("                                                <th class=\"right\">Total</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            \n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"center\">1</td>\n");
      out.write("                                                <td class=\"left\">Iphone 10</td>\n");
      out.write("                                                <td class=\"left\">Apple iphoe 10 with extended warranty</td>\n");
      out.write("                                                <td class=\"center\">16</td>\n");
      out.write("                                                <td class=\"right\">$999,00</td>\n");
      out.write("                                                <td class=\"right\">$999,00</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            \n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-4 col-sm-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</div>\n");
      out.write("                                    <div class=\"col-lg-4 col-sm-5 ml-auto\">\n");
      out.write("                                        <table class=\"table table-clear\">\n");
      out.write("                                            <tbody>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"left\">\n");
      out.write("                                                        <strong>Subtotal</strong>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"right\">$8.497,00</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"left\">\n");
      out.write("                                                        <strong>Discount (20%)</strong>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"right\">$1,699,40</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"left\">\n");
      out.write("                                                        <strong>VAT (10%)</strong>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"right\">$679,76</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"left\">\n");
      out.write("                                                        <strong>Total</strong>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"right\">\n");
      out.write("                                                        <strong>$7.477,36</strong>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                        <a class=\"btn btn-success\" href=\"#\" data-abc=\"true\">\n");
      out.write("                                            <i class=\"fa fa-usd\"></i> Proceed to Payment</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
