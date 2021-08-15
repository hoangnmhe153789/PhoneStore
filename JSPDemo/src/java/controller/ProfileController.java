/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Bill;
import entity.BillDetail;
import entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOBill;
import model.DAOBillDetail;
import model.DAOCustomer1;
import model.DBConnect;

/**
 *
 * @author ACER
 */
public class ProfileController extends HttpServlet {

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
            out.println("<title>Servlet ProfileController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProfileController at " + request.getContextPath() + "</h1>");
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
        DBConnect context = new DBConnect();
        String service = request.getParameter("service");
        if (service.equals("view")) {
            String username = (String) request.getSession().getAttribute("username");
            Customer c = new DAOCustomer1(context).getOneByUsername(username);
            request.setAttribute("customer", c);
            request.setAttribute("BillDetails", new DAOBill(new DBConnect()).findByCname(username));
            request.getRequestDispatcher("view/ViewProfile.jsp").forward(request, response);
        } else if (service.equals("changeStatus")) {
            String oid = request.getParameter("oid");
            DAOBill dao = new DAOBill(context);
            Bill b = dao.findByID(oid);
            int status = b.getStatus();
            status = (status == 0) ? -1 : status;
            b.setStatus(status);
            dao.update(b);
            String username = (String) request.getSession().getAttribute("username");
            Customer c = new DAOCustomer1(context).getOneByUsername(username);
            request.setAttribute("customer", c);
            request.setAttribute("BillDetails", new DAOBill(new DBConnect()).findByCname(username));
            request.getRequestDispatcher("view/ViewProfile.jsp").forward(request, response);
        } else {
            request.getSession().removeAttribute("username");
            request.getSession().removeAttribute("Cart");
            response.sendRedirect("LoginController");
        }

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
        processRequest(request, response);
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
