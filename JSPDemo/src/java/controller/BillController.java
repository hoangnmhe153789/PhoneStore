/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Bill;
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
public class BillController extends HttpServlet {

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
            if (admin_raw) {
                String cname = request.getParameter("cname");
                String oid = request.getParameter("oid");
                DBConnect dbcon = new DBConnect();
                DAOBill dao = new DAOBill(dbcon);
                if (oid != null && oid.length() > 0) {
                    String service = request.getParameter("service");
                    if (service != null && service.length() > 0) {
                        if (service.equals("update")) {
                            //Update
                            DAOCustomer1 cusdao = new DAOCustomer1(dbcon);
                            request.setAttribute("clist", cusdao.findCustomerByName(""));
                            request.setAttribute("Bill", dao.findByID(oid));
                            request.getRequestDispatcher("update/UpdateBill.jsp").forward(request, response);
                        } else if (service.equals("delete")) {
                            //Delete
                            dao.delete(oid);
                            response.sendRedirect("BillController");
                        } else if (service.equals("detail")) {
                            //View detail of the bill
                            request.setAttribute("pid", "");
                            request.setAttribute("oid", oid);
                            request.setAttribute("BillDetailList", new DAOBillDetail(dbcon).findByOID_PID(oid, oid));
                            request.getRequestDispatcher("BillDetailController").forward(request, response);
                        } else if (service.equals("changeStatus")) {
                            Bill b = dao.findByID(oid);
                            int status = b.getStatus();
                            status += (status < 1) ? 1 : -2;
                            b.setStatus(status);
                            dao.update(b);
                            response.sendRedirect("BillController");
                        }
                    }
                } else {
                    String service = request.getParameter("service");
                    if (service != null && service.equals("add")) {
                        request.setAttribute("clist", new DAOCustomer1(dbcon).findCustomerByName(""));
                        request.getRequestDispatcher("add/AddBill.jsp").forward(request, response);
                    } else {
                        try {
                            if (cname.length() == 0) {
                                cname = "";
                            }
                        } catch (Exception e) {
                            response.getWriter().print("Loi String");
                            cname = "";
                        }
                        request.setAttribute("billList", dao.findByCname(cname));
                        request.getRequestDispatcher("view/ViewBill.jsp").forward(request, response);
                    }
                }
            }else{
                 request.getRequestDispatcher("view/401.jsp").forward(request, response);
            }
        }else{
             request.getRequestDispatcher("view/401.jsp").forward(request, response);
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
        String oid = request.getParameter("oid");
        String date = request.getParameter("datecreate");
        String cname = request.getParameter("cname");
        String cphone = request.getParameter("cphone");
        String caddress = request.getParameter("caddress");
        String total = request.getParameter("total");
        String st = request.getParameter("status");
        String cid = request.getParameter("cid");
        Bill b = new Bill(oid, date, cname, cphone, caddress, Double.parseDouble(total), Integer.parseInt(st), Integer.parseInt(cid));
        DBConnect db = new DBConnect();
        DAOBill dao = new DAOBill(db);
        String submit = request.getParameter("submit");
        if (submit.equals("Add")) {
            dao.addBill(b);

        } else {
            dao.update(b);
        }

        response.sendRedirect("BillController");
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
