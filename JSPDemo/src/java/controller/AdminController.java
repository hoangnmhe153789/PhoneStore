/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOAdmin;
import model.DAOBill;
import model.DBConnect;

/**
 *
 * @author ACER
 */
public class AdminController extends HttpServlet {

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
            out.println("<title>Servlet AdminController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminController at " + request.getContextPath() + "</h1>");
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
            if (admin_raw) {
                String service = request.getParameter("service");
                if (service != null && service.length() > 0) {
                    request.getSession().removeAttribute("username");
                    response.sendRedirect("LoginController");
                } else {
                    request.setAttribute("dayincome", new DAOBill(new DBConnect()).dayIncome());
                    request.setAttribute("monthincome", new DAOBill(new DBConnect()).monthIncome());
                    request.setAttribute("yearincome", new DAOBill(new DBConnect()).yearIncome());
                    request.setAttribute("billList", new DAOBill(new DBConnect()).findByCname(""));
                    request.getRequestDispatcher("view/Admin.jsp").forward(request, response);
                }
            }else{
                request.getRequestDispatcher("view/401.jsp").forward(request, response);
            }

//        request.getRequestDispatcher("view/Login.jsp").forward(request, response);
//        String service = request.getParameter("service");
//        String adminId = request.getParameter("adminId");
//        DBConnect db = new DBConnect();
//        DAOAdmin dao = new DAOAdmin(db);
//        if (adminId != null && adminId.length() > 0) {
//            int idValue = Integer.parseInt(adminId);
//
//            if (service.equals("add")) {
//                response.sendRedirect("add/AddAdmin.jsp");
//            } else if (service.equals("update")) {
//                request.setAttribute("Admin", dao.getOne(idValue));
//                request.getRequestDispatcher("update/UpdateAdmin.jsp").forward(request, response);
//            } else if (service.equals("delete")) {
//                dao.deleteAdminByID(idValue);
//                response.sendRedirect("AdminController");
//            } else {
//                request.setAttribute("adminList", new DAOAdmin(db).find(""));
//                request.getRequestDispatcher("view/ViewAdmin.jsp").forward(request, response);
//            }
//        } else {
//            if (service != null) {
//                if (service.equals("add")) {
//                    request.getRequestDispatcher("add/AddAdmin.jsp").forward(request, response);
//                }
//            } else {
//                request.setAttribute("adminList", new DAOAdmin(db).find(""));
//                request.getRequestDispatcher("view/ViewAdmin.jsp").forward(request, response);
//            }
//        }
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username.matches("^(?=\\s*\\S).*$")) {
                if (password.matches("^(?=\\s*\\S).*$")) {
                    if (username.equals("hoang") && password.equals("123")) {
                        request.getSession().setAttribute("username", username);
                        request.setAttribute("username", username);
                        request.getRequestDispatcher("view/Detail.jsp").forward(request, response);
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
//        try {
//            int count = 1;
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
//            String id_value = request.getParameter("adminId");
//            DBConnect db = new DBConnect();
//            DAOAdmin dao = new DAOAdmin(db);
//            String submit = request.getParameter("submit");
//            if (submit.equals("Update")) {
//                int adminId = Integer.parseInt(request.getParameter("adminId"));
//                Admin a = dao.getOne(adminId);
//                if (password.equals(a.getPassword())) {
//                    String newPassword = request.getParameter("newPassword");
//                    String reNewPass = request.getParameter("reNewPassword");
//                    if (newPassword.length() < 8) {
//                        request.setAttribute("Admin", a);
//                        request.setAttribute("mess", "New Password must have at least 8 charaters. Try again.");
//                        System.out.println(request.getRequestDispatcher("update/UpdateAdmin.jsp"));
//                        request.getRequestDispatcher("update/UpdateAdmin.jsp").forward(request, response);
//                    } else {
//                        if (newPassword.equals(reNewPass)) {
//                            dao.UpdateAdmin(new Admin(adminId, username, newPassword));
//                            System.out.println(request.getRequestDispatcher("AdminController"));
//                            response.sendRedirect("AdminController");
//                        } else {
//                            request.setAttribute("Admin", a);
//                            request.setAttribute("mess", "The confirm password and the new password doesn't match. Try again.");
//                            System.out.println(request.getRequestDispatcher("update/UpdateAdmin.jsp"));
//                            request.getRequestDispatcher("update/UpdateAdmin.jsp").forward(request, response);
//                        }
//                    }
//                } else {
//                    request.setAttribute("Admin", a);
//                    request.setAttribute("mess", "Wrong password. Try again.");
//                    System.out.println(request.getRequestDispatcher("update/UpdateAdmin.jsp"));
//                    request.getRequestDispatcher("update/UpdateAdmin.jsp").forward(request, response);
//                }
//            } else {
//                if (!dao.isExit(username)) {
//                     if (password.length() < 8) {
//                        request.setAttribute("mess","Password must have at least 8 charaters . Try again.");
//                        request.getRequestDispatcher("add/AddAdmin.jsp").forward(request, response);
//                    } else {
//                        dao.addAdmin(new Admin(username, password));
//                        response.sendRedirect("AdminController");
//                    }
//                } else {
//                   request.setAttribute("mess", "Username " + username + " have been used. Try again.");
//                    request.getRequestDispatcher("add/AddAdmin.jsp").forward(request, response);
//                }
//            }
//        } catch (IOException e) {
//            response.getWriter().print(e);
//        }

        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
