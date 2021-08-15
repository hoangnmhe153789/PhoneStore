package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import model.DAOCategory;
import java.sql.ResultSet;
import model.DAOProduct;
import model.DBConnect;
import model.DBConnect;

public final class ViewProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!---->\n");
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
      out.write("        <form action=\"ProductFilter\" method=\"GET\" id=\"formsearch\">\n");
      out.write("            Choose Category ID:<select onchange=\"myFunction();\" name=\"cid\">\n");
      out.write("                ");
DBConnect dbcon = new DBConnect();
                    String raw = (String) request.getAttribute("cid");
                    int cid = (Integer) request.getAttribute("cid");
                    DAOCategory cated = new DAOCategory(dbcon);
                    ResultSet r = dbcon.getData("Select * From Category");
                    while (r.next()) {
                        int value = r.getInt("cateId");
      out.write("\n");
      out.write("\n");
      out.write("                ");
if (raw.length() > 0 && raw != null&& cid>0) {
      out.write("\n");
      out.write("                <option\n");
      out.write("                    ");
if (value == cid) {
      out.write(" \n");
      out.write("                    selected=\"selected\" \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    value=\"");
      out.print(r.getInt("cateId"));
      out.write("\">\n");
      out.write("                    ");
      out.print(r.getString("cateName"));
      out.write("\n");
      out.write("                </option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <option value=\"");
      out.print(r.getInt("cateId"));
      out.write("\">\n");
      out.write("                    ");
      out.print(r.getString("cateName"));
      out.write("\n");
      out.write("                </option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("        </form>\n");
      out.write("        ");
String sql = "Select * from Product";
            DAOProduct dao = new DAOProduct(dbcon);
            if (cid > 0) {
                sql += " Where cateId = " + cid;
            }
            ResultSet rs = dbcon.getData(sql);
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Product ID</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Image</th>\n");
      out.write("                    <th>Update</th>\n");
      out.write("                    <th>Delete</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
while (rs.next()) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                    <td><img src=\"image/");
      out.print(rs.getString(5));
      out.write("\" style=\"width:300px;height:300px;\" alt=\"A beautiful phone\"></td>\n");
      out.write("                    <td><a href=\"ProductController?service=update&pid=");
      out.print(rs.getString(1));
      out.write("\">Update</a></td>\n");
      out.write("                    <td><a href=\"ProductController?service=delete&pid=");
      out.print(rs.getString(1));
      out.write("\">Delete</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </tbody>\n");
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
