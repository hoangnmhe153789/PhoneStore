/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOBill;
import model.DAOCustomer1;
import model.DBConnect;

/**
 *
 * @author ACER
 */
public class CustomerController extends HttpServlet {

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
                DBConnect conn = new DBConnect();
                DAOCustomer1 dao = new DAOCustomer1(conn);
                String cid = request.getParameter("cid");
                String service = request.getParameter("service");
                if (cid != null && cid.length() > 0) {
                    int idValue = Integer.parseInt(cid);
                    if (service.equals("update")) {
                        //Update
                        request.setAttribute("Customer", dao.getOne(idValue));
                        request.getRequestDispatcher("update/UpdateCustomer.jsp").forward(request, response);
                    } else if (service.equals("delete")) {
                        //Delete
                        dao.deleteCustomer(idValue);
                        response.sendRedirect("CustomerController");
                    } else if (service.equals("change")) {
                        int status = Integer.parseInt(request.getParameter("status"));
                        if (status == 0) {
                            status = 1;
                        } else {
                            status = 0;
                        }
                        Customer temp = dao.getOne(idValue);
                        temp.setStatus(status);
                        dao.updateCustomer(temp);
                        response.sendRedirect("CustomerController");
                    } else if (service.equals("bill")) {
                        DBConnect dbcon = new DBConnect();
                        DAOBill dao_bill = new DAOBill(dbcon);
                        String cname = request.getParameter("cname");
                        request.setAttribute("billList", dao_bill.findByCname(cname));
                        request.getRequestDispatcher("view/ViewBill.jsp").forward(request, response);
                    }
                } else {
                    if (service != null && service.equals("add")) {
                        request.getRequestDispatcher("add/AddCustomer.jsp").forward(request, response);
                    } else {
                        ArrayList<Customer> list = dao.getList();
                        request.setAttribute("list", list);
                        request.getRequestDispatcher("view/ViewCustomer.jsp").forward(request, response);
                    }

                }
            } else {
                request.getRequestDispatcher("view/401.jsp").forward(request, response);
            }
        } else {
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

        String cName = request.getParameter("cName");
        String cPhone = request.getParameter("cPhone");
        String cAddress = request.getParameter("cAddress");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        int status = Integer.parseInt(request.getParameter("status"));
        DBConnect conn = new DBConnect();
        DAOCustomer1 dao = new DAOCustomer1(conn);
        String submit = request.getParameter("submit");
        if (submit.equals("Add")) {
            if (!cName.matches("^(?=\\s*\\S).*$")
                    || !cPhone.matches("^(?=\\s*\\S).*$")
                    || !cAddress.matches("^(?=\\s*\\S).*$")
                    || !username.matches("^(?=\\s*\\S).*$")
                    || !password.matches("^(?=\\s*\\S).*$")) {
                request.setAttribute("mess", "Can't let fill any info with blank spaces. Try again.");
                request.getRequestDispatcher("add/AddCustomer.jsp").forward(request, response);
            } else {
                dao.addCustomer(new Customer(cName, cPhone, cAddress, username, password, status));
                response.sendRedirect("CustomerController");
            }
        } else if (submit.equals("Update")) {
            int cateId = Integer.parseInt(request.getParameter("cid"));
            Customer c = dao.getOne(cateId);
            if (c.getPassword().equals(password)) {
                if (!cName.matches("^(?=\\s*\\S).*$")
                        || !cPhone.matches("^(?=\\s*\\S).*$")
                        || !cAddress.matches("^(?=\\s*\\S).*$")
                        || !username.matches("^(?=\\s*\\S).*$")
                        || !password.matches("^(?=\\s*\\S).*$")) {
                    request.setAttribute("Customer", dao.getOne(cateId));
                    request.setAttribute("mess", "Can't let fill any info with blank spaces. Try again.");
                    request.getRequestDispatcher("update/UpdateCustomer.jsp").forward(request, response);
                } else {
                    dao.updateCustomer(new Customer(cateId, cName, cPhone, cAddress, username, password, status));
                    response.sendRedirect("CustomerController");
                }
            } else {
                request.setAttribute("Customer", dao.getOne(cateId));
                request.setAttribute("mess", "Wrong pass. Try again.");
                request.getRequestDispatcher("update/UpdateCustomer.jsp").forward(request, response);
            }
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
