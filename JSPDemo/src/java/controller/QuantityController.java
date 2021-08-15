/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOProduct;
import model.DBConnect;

/**
 *
 * @author ACER
 */
public class QuantityController extends HttpServlet {

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
        String service = request.getParameter("service");
        String pid = request.getParameter("pid");
        
        ArrayList<Product> products = (ArrayList<Product>) request.getSession().getAttribute("Cart");
        int maxQuantity = new DAOProduct(new DBConnect()).maxQuantity(pid);
        int quantity = Integer.parseInt(request.getSession().getAttribute(pid).toString());
        if (service.equals("add")) {
            if(quantity >= maxQuantity){
                request.setAttribute("mess", "Product "+ pid +" have only "+maxQuantity+" in store.");
            }else{
                quantity++;
            }
        } else {
            if (quantity > 1) {
                quantity--;
            } else {
                //Use Iterator because list.remove sometimes throw Exception
                for (Iterator<Product> iList = products.iterator(); iList.hasNext();) {
                    Product p = iList.next();
                    if (p.getPid().equals(pid)) {
                        iList.remove();
                        request.getSession().removeAttribute(pid);
                    }
                }
            }
        }
        if (products.size() == 0) {
            request.setAttribute("empty", true);
            request.getSession().removeAttribute("Cart");
            request.setAttribute("mess", "Cart is empty");
//            request.getRequestDispatcher("view/CartModel.jsp").forward(request, response);
//            request.getRequestDispatcher("view/CartModel.jsp").forward(request, response);
            response.sendRedirect("CartModelController");
        } else {
            for (Product p : products) {
                if (p.getPid().equals(pid)) {
                    p.setQuantity(quantity);
                }
            }
            request.setAttribute("empty", false);
            request.setAttribute("Cart", products);
            request.getSession().setAttribute(pid, quantity);
            //response.sendRedirect("CartController");
//            request.getRequestDispatcher("view/CartModel.jsp").forward(request, response);
           request.getRequestDispatcher("view/CartModel.jsp").forward(request, response);
//            response.sendRedirect("CartModelController");
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
