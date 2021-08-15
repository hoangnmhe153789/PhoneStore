package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DAOBill;
import model.DBConnect;
import java.sql.ResultSet;
import model.DAOProduct;

public final class ViewBill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function myFunction() {\n");
      out.write("                document.getElementById(\"formsearch\").submit();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            DBConnect dbcon = new DBConnect();
        
      out.write("\n");
      out.write("        <form action=\"BillController\" method=\"GET\" id=\"formsearch\">\n");
      out.write("            Customer Name:<input type=\"text\" id=\"cname\" name=\"cname\" onchange=\"myFunction();\">\n");
      out.write("        </form>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Order ID</th>\n");
      out.write("                <th>Date Create</th>\n");
      out.write("                <th>Customer Name</th>\n");
      out.write("                <th>Customer Phone</th>\n");
      out.write("                <th>Customer Address</th>\n");
      out.write("                <th>Total</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("                <th>Customer ID</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 String sql = "Select * from Bill";
                DAOBill dao = new DAOBill(dbcon);
                /* if (cid > 0) {
                    sql += " Where cateId = " + cid;
                }*/
                ResultSet rs = dbcon.getData(sql);
                while (rs.next()) {
                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("oid"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("dateCreate"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("cname"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("cphone"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("cAddress"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("total"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("status"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("cid"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
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
