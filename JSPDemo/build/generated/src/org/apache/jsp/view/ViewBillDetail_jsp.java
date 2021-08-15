package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Customer;
import entity.Bill;
import entity.Product;
import entity.BillDetail;
import java.util.ArrayList;

public final class ViewBillDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <form action=\"BillDetailController\" method=\"GET\" id=\"formsearch\">\n");
      out.write("            ");

                ArrayList<ArrayList> listOfAll = (ArrayList<ArrayList>) request.getAttribute("listOfAll");
                String pid = (String) request.getAttribute("pid");
                String oid = (String) request.getAttribute("oid");
                ArrayList<BillDetail> list = (ArrayList<BillDetail>) request.getAttribute("BillDetailList");
                ArrayList<Product> ProductList = (ArrayList<Product>) request.getAttribute("ProductList");
                ArrayList<Bill> BillList = (ArrayList<Bill>) request.getAttribute("BillList");
            
      out.write("\n");
      out.write("\n");
      out.write("            <h2>Bill Detail List</h2>\n");
      out.write("\n");
      out.write("            <a href=\"BillDetailController?service=add\">Add A New Bill Detail</a>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <p>Filter by Product and Bill</p><br>\n");
      out.write("            Select Product:\n");
      out.write("            <select name=\"pid\" id=\"pid\" onchange=\"myFunction();\">\n");
      out.write("                <option value=\"\">----</option>\n");
      out.write("                ");
 for (Product p : ProductList) {
      out.write("\n");
      out.write("                <option ");
 if (p.getPid().equals(pid)) {
      out.write(" \n");
      out.write("                    selected=\"selected\"\n");
      out.write("                    ");
}
      out.write(" \n");
      out.write("                    value=\"");
      out.print(p.getPid());
      out.write("\">\n");
      out.write("                    ");
      out.print(p.getPname());
      out.write("\n");
      out.write("                </option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            Select Bill ID:\n");
      out.write("            <select  name=\"oid\" id=\"oid\" onchange=\"myFunction();\">\n");
      out.write("                <option value=\"\">----</option>\n");
      out.write("                ");
 for (Bill b : BillList) {
      out.write("\n");
      out.write("                <option  ");
 if (b.getoID().equals(oid)) {
      out.write(" \n");
      out.write("                    selected\n");
      out.write("                    ");
}
      out.write("  value=\"");
      out.print(b.getoID());
      out.write("\">\n");
      out.write("                    ");
      out.print(b.getoID());
      out.write("\n");
      out.write("                </option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            ");
double total = 0;
      out.write("\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Product ID</th>\n");
      out.write("                        <th>Order ID</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("                        <th>Price</th>\n");
      out.write("                        <th>Total</th>\n");
      out.write("                        <th>Update</th>\n");
      out.write("                        <th>Delete</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
for (BillDetail bdetail : list) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(bdetail.getPid());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bdetail.getoID());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bdetail.getQuantity());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bdetail.getMoney());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bdetail.getTotal());
      out.write("</td>");
total += bdetail.getTotal();
      out.write("\n");
      out.write("                        <td><a href=\"BillDetailController?service=update&pid=");
      out.print(bdetail.getPid());
      out.write("&oid=");
      out.print(bdetail.getoID());
      out.write("\">Update</a></td>\n");
      out.write("                        <td><a href=\"BillDetailController?service=delete&pid=");
      out.print(bdetail.getPid());
      out.write("&oid=");
      out.print(bdetail.getoID());
      out.write("\" onclick =\"return confirm('are you sure')\">Delete</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Product ID</th>\n");
      out.write("                        <th>Order ID</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("                        <th>Price</th>\n");
      out.write("                        <th>Total</th>\n");
      out.write("                        <th>Update</th>\n");
      out.write("                        <th>Delete</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
for (int i = 0; i<10 ; i++){
                        
                            ArrayList<Product> products = (ArrayList<Product>) listOfAll.get(4);
                            Product pro = products.get(i);
                            ArrayList<Customer> cuss = (ArrayList<Customer>) listOfAll.get(1);
                            Customer cus = cuss.get(i);
                            ArrayList<BillDetail> billds = (ArrayList<BillDetail>) listOfAll.get(0);
                            BillDetail bills = billds.get(i);
                    
      out.write("\n");
      out.write("                                                   \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(pro.getPname());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(cus.getCname());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bills.getoID());
      out.write("</td>\n");
      out.write("                       \n");
      out.write("                        <td>");
      out.print(bills.getQuantity());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bills.getMoney());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bills.getTotal());
      out.write("</td>");
total += bills.getTotal();
      out.write("\n");
      out.write("                        <td><a href=\"BillDetailController?service=update&pid=");
      out.print(bills.getPid());
      out.write("&oid=");
      out.print(bills.getoID());
      out.write("\">Update</a></td>\n");
      out.write("                        <td><a href=\"BillDetailController?service=delete&pid=");
      out.print(bills.getPid());
      out.write("&oid=");
      out.print(bills.getoID());
      out.write("\" onclick =\"return confirm('are you sure')\">Delete</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <table border=\"1\" style=\"border-top: none;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td >\n");
      out.write("                        TOTAL\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(total);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
