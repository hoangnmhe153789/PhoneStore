/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.BillDetail;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOBill;
import model.DAOBillDetail;
import model.DAOCategory;
import model.DAOCustomer1;
import model.DAOProduct;
import model.DBConnect;

/**
 *
 * @author ACER
 */
public class BillDetailController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BillDetailController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BillDetailController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("admin") != null) {
            boolean admin_raw = (Boolean) request.getSession().getAttribute("admin");
            if (admin_raw ) {
                String pid = request.getParameter("pid");
                String oid = request.getParameter("oid");
                DBConnect db = new DBConnect();
                request.setAttribute("CustomerList", new DAOCustomer1(db).findCustomerByName(""));
                request.setAttribute("CategoryList", new DAOCategory(db).getList());
                request.setAttribute("ProductList", new DAOProduct(db).getList(0));
                request.setAttribute("BillList", new DAOBill(db).getList());
                DAOBillDetail dao = new DAOBillDetail(db);
                if (oid != null && oid.length() > 0 && pid != null && pid.length() > 0) {
                    setAttributAndSend(request, pid, oid);
                    String service = request.getParameter("service");
                    if (service != null) {
                        if (service.equals("update")) {
                            request.setAttribute("BillDetail", dao.getOne(pid, oid));
                            request.getRequestDispatcher("update/UpdateBillDetail.jsp").forward(request, response);
                        } else if (service.equals("delete")) {
                            dao.delete(pid, oid);
                            service = "";
                            response.sendRedirect("BillDetailController");
                        }
                    } else {
                        request.getRequestDispatcher("view/ViewBillDetail.jsp").forward(request, response);
                    }
                } else {
                    String service = request.getParameter("service");
                    if (service != null && service.equals("add")) {
                        response.getWriter().print("Hello");
                        request.getRequestDispatcher("add/AddBillDetail.jsp").forward(request, response);

                    } else {
                        //if ((oid != null && oid.length() > 0) || (pid != null && pid.length() > 0)) {
                        boolean condition1 = (oid != null && oid.length() > 0);
                        boolean condition2 = (pid != null && pid.length() > 0);
                        if (oid != null && oid.length() > 0) {
                            pid = "";
                        }
                        if (pid != null && pid.length() > 0) {
                            oid = "";
                        }
                        if (!condition1 && !condition2) {
                            pid = "";
                            oid = "";
                        }
                        setAttributAndSend(request, pid, oid);
                        request.getRequestDispatcher("view/ViewBillDetail.jsp").forward(request, response);
                    }
                }
            } else {
                request.getRequestDispatcher("view/401.jsp").forward(request, response);
            }
        }else{
             request.getRequestDispatcher("view/401.jsp").forward(request, response);
        }

    }

    private void setAttributAndSend(HttpServletRequest request, String pid, String oid) throws ServletException, IOException {
        request.setAttribute("pid", pid);
        request.setAttribute("oid", oid);

        request.setAttribute("AllList", new DAOBillDetail(new DBConnect()).getAllList(oid, pid));
        // request.setAttribute("count", new DAOBillDetail(new DBConnect()).findByOID_PID(pid, oid).size());

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int result = 0;
        String service = request.getParameter("service");
        String pid = request.getParameter("pid");
        String oid = request.getParameter("oid");
        String raw_quantity = request.getParameter("quantity");
        String raw_money = request.getParameter("money");
        String raw_total = request.getParameter("total");
        try {

            int quantity = (Integer.parseInt(raw_quantity));
            double money = Double.parseDouble(raw_money);
            double total = Double.parseDouble(raw_total);

            DBConnect db = new DBConnect();
            DAOBillDetail dao = new DAOBillDetail(db);
            BillDetail b = new BillDetail(pid, oid, quantity, money, total);
            if (service.equals("update")) {
                result = dao.update(b);
                if (result < 1) {
                    if (result == -1) {

                    }
                    if (result == 0) {

                    }
                } else {
                    response.sendRedirect("BillDetailController");
                }
            } else {
                result = dao.addBillDetail(b);
//                response.getWriter().print(result);

                if (result == -1 || result == 0) {
                    response.getWriter().print(result);

                } else {
                    response.sendRedirect("BillDetailController");
                }
            }
        } catch (NumberFormatException e) {

            String message = "You have input word '" + e.toString().split(":")[2] + "' in number section."
                    + "\nPls enter Number.";
            response.getWriter().print(message);
//            request.setAttribute("message", message);
//            request.setAttribute("pid", pid);
//            request.setAttribute("oid", oid);
//            request.setAttribute("quantity", raw_quantity);
//            request.setAttribute("money", raw_money);
//            request.setAttribute("total", raw_total);
//            request.getRequestDispatcher("update/UpdateBillDetail.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
