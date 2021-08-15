/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOAdmin;
import model.DAOCustomer1;
import model.DBConnect;

/**
 *
 * @author ACER
 */
public class LoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        request.getRequestDispatcher("view/Login.jsp").forward(request, response);

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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        DBConnect db = new DBConnect();
        DAOAdmin daoAdmin = new DAOAdmin(db);
        DAOCustomer1 daoCustomer = new DAOCustomer1(db);
        if (username.matches("^(?=\\s*\\S).*$")) {
            if (password.matches("^(?=\\s*\\S).*$")) {
                if (daoAdmin.login(username, password)) {
                    request.getSession().setAttribute("username", username);
                    request.getSession().setAttribute("admin", true);
                    request.setAttribute("username", username);
//                    response.sendRedirect("HomeController");
//                    response.sendRedirect("view/Detail.jsp");
                    response.sendRedirect("AdminController");

                } else if (daoCustomer.login(username, password)) {
                    request.getSession().setAttribute("admin", false);
                    request.getSession().setAttribute("username", username);
                    request.setAttribute("username", username);
//                     response.sendRedirect("HomeController");
                    response.sendRedirect("HomeController");
                    //request.getRequestDispatcher("HomeController").forward(request, response);
                } else {
                    request.setAttribute("mess", "Incorrect username or password!");
                    request.getRequestDispatcher("view/Login.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("mess", "Can't let password empty or fill with blank");
                request.getRequestDispatcher("view/Login.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("mess", "Can't let username empty or fill with blank");
            request.getRequestDispatcher("view/Login.jsp").forward(request, response);
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
