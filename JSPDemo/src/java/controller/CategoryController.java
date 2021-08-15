/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Category;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOCategory;
import model.DBConnect;

/**
 *
 * @author ACER
 */
public class CategoryController extends HttpServlet {

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
        String cateId = request.getParameter("cateId");
        DBConnect db = new DBConnect();
        DAOCategory dao = new DAOCategory(db);
        String service = request.getParameter("service");
        if (cateId != null && cateId.length() > 0) {
            int cateId_value = Integer.parseInt(cateId);
            if (service.equals("update")) {
                //Update
                request.setAttribute("category", dao.getOne(cateId_value));
                request.getRequestDispatcher("update/UpdateCategory.jsp").forward(request, response);
            } else if (service.equals("delete")) {
                //Delete
                dao.Delete(cateId_value);
                response.sendRedirect("CategoryController");
            }
        } else {
            if (service != null) {
                if (service.equals("add")) {
                    request.getRequestDispatcher("add/AddCategory.jsp").forward(request, response);
                }
            } else {
                //View Page
                cateId = "";
                request.setAttribute("cateId", cateId);
                request.setAttribute("cateList", dao.getList());
                request.getRequestDispatcher("view/ViewCategory.jsp").forward(request, response);
            }
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
        String cateName = request.getParameter("cateName");
        int status = Integer.parseInt(request.getParameter("status"));
        DBConnect db = new DBConnect();
        DAOCategory dao = new DAOCategory(db);
        String submit = request.getParameter("submit");
        if (submit != null) {
            if (submit.equals("Update")) {
                int cateId = Integer.parseInt(request.getParameter("cateId"));
                if (cateName != null) {
                    if (!cateName.matches("^(?=\\s*\\S).*$")) {
                        //Check if catename full of blank
                        request.setAttribute("category", dao.getOne(cateId));
                        request.setAttribute("mess", "Category's name can't be fill with blank space empty.");
                        request.getRequestDispatcher("update/UpdateCategory.jsp").forward(request, response);
                    } else {
                        //update
                        dao.update(new Category(cateId, cateName, status));
                        response.sendRedirect("CategoryController");
                    }
                } else {
                    //Check if cateName is blank
                    request.setAttribute("category", dao.getOne(cateId));
                    request.setAttribute("mess", "Categor's can't be empty. Try again.");
                    request.getRequestDispatcher("update/UpdateCategory.jsp").forward(request, response);
                }
            } else if (submit.equals("Add")) {
                if (cateName != null && cateName.length() > 0) {
                    if (dao.exited(cateName)) {
                        request.setAttribute("mess", "Category's name have been used. Try again.");
                        request.getRequestDispatcher("add/AddCategory.jsp").forward(request, response);
                    } else {
                        if (!cateName.matches("^(?=\\s*\\S).*$")) {
                            //Check if catename full of blank

                            request.setAttribute("mess", "Category's name can't be fill with blank space empty. Try again.");
                            request.getRequestDispatcher("add/AddCategory.jsp").forward(request, response);
                        } else {
                            //add
                            dao.addCategory(new Category(cateName, status));
                            response.sendRedirect("CategoryController");
                        }
                    }
                } else {
                    //Check if cateName is blank
                    request.setAttribute("mess", "Categor's can't be empty. Try again.");
                    request.getRequestDispatcher("add/AddCategory.jsp").forward(request, response);
                }
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
