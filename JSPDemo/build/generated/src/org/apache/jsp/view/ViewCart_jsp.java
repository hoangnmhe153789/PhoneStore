package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Product;
import java.util.ArrayList;

public final class ViewCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            td{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h3>Cart</h3>\n");
      out.write("        ");

            String username = (String) request.getSession().getAttribute("username");
            if(username != null){
      out.write("\n");
      out.write("           ");
  }else{
                response.sendRedirect("../LoginController");
            }
            String mess = (String) request.getAttribute("mess");
            if (mess != null) {
      out.write("\n");
      out.write("        <div>");
      out.print(mess);
      out.write("</div>\n");
      out.write("        ");
}else{
             ArrayList<Product> plist = (ArrayList<Product>) request.getAttribute("Cart");
             double total = 0;
        
      out.write("\n");
      out.write("        <table border=\"1\" style=\"width: 50%\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Total</th>\n");
      out.write("                    <th>Remove</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
for (Product p : plist) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(p.getPid());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(p.getPname());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(p.getQuantity());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(p.getPrice());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print((p.getQuantity()*p.getPrice()));
      out.write("</td>\n");
      out.write("                    ");
total += p.getQuantity()*p.getPrice();
      out.write("\n");
      out.write("                    <td>  <a href=\"CartController?service=remove&pid=");
      out.print(p.getPid());
      out.write("\" onclick =\"return confirm('are you sure')\">Delete</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("  \n");
      out.write("            </tbody>\n");
      out.write("        </table >\n");
      out.write("            <table  style=\"width: 50%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"width: 15%\"><a href=\"CartController?service=clear\">Clear All</a></td>\n");
      out.write("                    <td style=\"width: 15%\"><a href=\"CartController?service=checkout&total=");
      out.print(total);
      out.write("\">Check Out</a></td>\n");
      out.write("                    <td style=\" text-align: left;padding-left: 32%\">Total: &nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(total);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            ");
}
      out.write("\n");
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
