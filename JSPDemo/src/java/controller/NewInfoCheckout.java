/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Bill;
import entity.BillDetail;
import entity.Customer;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOBill;
import model.DAOBillDetail;
import model.DAOCustomer1;
import model.DAOProduct;
import model.DBConnect;

/**
 *
 * @author ACER
 */
public class NewInfoCheckout extends HttpServlet {

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
            out.println("<title>Servlet NewInfoCheckout</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewInfoCheckout at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        String receiver = request.getParameter("receiver");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        ArrayList<Product> products = (ArrayList<Product>) request.getSession().getAttribute("Cart");
        if (receiver != null && phone != null && address != null) {
            if (receiver.length() > 0 && phone.length() > 0 && address.length() > 0) {
                DBConnect db = new DBConnect();
                DAOCustomer1 daoCus = new DAOCustomer1(db);
                HttpSession session = request.getSession();
                
                String username = (String) request.getSession().getAttribute("username");
                Customer customer = daoCus.getOneByUsername(username);
                request.setAttribute("customer", customer);
                request.setAttribute("receiver", receiver);
                request.setAttribute("phone", phone);
                request.setAttribute("address", address);
                DAOBill daoBill = new DAOBill(db);
                DAOProduct daoPro = new DAOProduct(db);
                java.util.Date utilDate = new java.util.Date();
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                
                Double total = Double.parseDouble(request.getSession().getAttribute("total").toString());
                //Add to Bill
                Bill bill = new Bill(String.valueOf((daoBill.greatestID() + 1)),sqlDate.toString(), receiver, phone, address, total, 1, customer.getCid());
                daoBill.addBill(bill);
                //Add to Bill Detail
                DAOBillDetail daoBDetail = new DAOBillDetail(new DBConnect());
                request.setAttribute("products", products);
                request.setAttribute("total", total);
                request.setAttribute("time", sqlDate.toString());
                
                for (Product p : products) {
                    daoPro.updateQuantity(p.getPid(), (daoPro.maxQuantity(p.getPid()) - p.getQuantity()));
                    BillDetail bdetail = new BillDetail(p.getPid(), bill.getoID(), p.getQuantity(), p.getPrice(), (p.getQuantity() * p.getPrice()));
                    daoBDetail.addBillDetail(bdetail);
                }
                ArrayList<Product> product = new DAOProduct(db).getList(0);
                product.forEach((p) -> {
                    session.removeAttribute(p.getPid());
                });
                session.removeAttribute("Cart");
                request.setAttribute("mess", "Cart is empty");
                request.setAttribute("empty", true);
                request.getRequestDispatcher("view/Invoice.jsp").forward(request, response);
            }else{
                request.setAttribute("Cart", products);
                request.setAttribute("empty", false);
                request.setAttribute("mess", "Can user alternative info if they are empty.");
                request.getRequestDispatcher("view/CartModel.jsp").forward(request, response);
            }
        }else{
            request.setAttribute("Cart", products);
            request.setAttribute("empty", false);
            request.setAttribute("mess", "Can user alternative info if they are empty.");
            request.getRequestDispatcher("view/CartModel.jsp").forward(request, response);
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
