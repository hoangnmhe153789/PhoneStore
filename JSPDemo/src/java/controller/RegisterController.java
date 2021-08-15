/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOCustomer1;
import model.DBConnect;

/**
 *
 * @author ACER
 */
public class RegisterController extends HttpServlet {

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
        request.getRequestDispatcher("view/register.jsp").forward(request, response);
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

        DBConnect conn = new DBConnect();
        DAOCustomer1 dao = new DAOCustomer1(conn);
       
        try {
            
         if (!cName.matches("^(?=\\s*\\S).*$")
                    || !cPhone.matches("^(?=\\s*\\S).*$")
                    || !cAddress.matches("^(?=\\s*\\S).*$")
                    || !username.matches("^(?=\\s*\\S).*$")
                    || !password.matches("^(?=\\s*\\S).*$")) {
                request.setAttribute("mess", "Can't let fill any info with blank spaces. Try again.");
                request.getRequestDispatcher("add/AddCustomer.jsp").forward(request, response);
            } else {
                dao.addCustomer(new Customer(cName, cPhone, cAddress, username, password, 1));
                request.getSession().setAttribute("admin", false);
                request.getSession().setAttribute("username", username);
                request.setAttribute("username", username);
//                     response.sendRedirect("HomeController");
                    response.sendRedirect("HomeController");
                
            }
         } catch (Exception e) {
             response.getWriter().print(e);
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
