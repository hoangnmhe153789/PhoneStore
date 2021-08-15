/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOCategory;
import model.DAOProduct;
import model.DBConnect;

/**
 *
 * @author ACER
 */
public class HomeController extends HttpServlet {

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
            out.println("<title>Servlet HomeController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HomeController at " + request.getContextPath() + "</h1>");
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
        String service = request.getParameter("service");
        String pid = request.getParameter("pid");
        DBConnect db = new DBConnect();
        DAOProduct dao = new DAOProduct(db);
        DAOCategory cated = new DAOCategory(db);
        request.setAttribute("cateList", cated.getList());
        HttpSession session = request.getSession();
        if (pid != null && pid.length() > 0) {
            switch (service) {
                case "addToCart":
                    if (dao.maxQuantity(pid) > 0) {
                        Product product = dao.getOne(pid);
                        if (session.getAttribute(pid) != null) {
                            product.setQuantity(Integer.parseInt(session.getAttribute(pid).toString()));
                        } else {
                            request.getSession().setAttribute(pid, 1);
                            product.setQuantity(1);
                        }
                        int quantity = 1;
                        if (request.getSession().getAttribute("Cart") != null) {
                            boolean exit = false;
                            ArrayList<Product> Cart = (ArrayList<Product>) request.getSession().getAttribute("Cart");
                            for (Product pr : Cart) {
                                if (pr.getPid().equals(product.getPid())) {
                                    pr.setQuantity(pr.getQuantity() + 1);
                                    quantity = pr.getQuantity();
                                    exit = true;
                                }
                            }
                            
                            if (!exit) {
                                Cart.add(product);
                                request.getSession().setAttribute(pid, quantity);
                                request.getSession().setAttribute("Cart", Cart);
                                request.setAttribute("mess", "Add Successfull");
                            }
                            
                            String cidString = request.getParameter("cid");
                            if (cidString == null || cidString.length() == 0) {
                                cidString = "0";
                            }
                            int cid = Integer.parseInt(cidString.trim());
                            request.setAttribute("cidString", cidString);
                            request.setAttribute("productList", dao.getList(cid));
                            request.getRequestDispatcher("view/Home.jsp").forward(request, response);
                        } else {
                            ArrayList<Product> Cart = new ArrayList<>();
                            Cart.add(product);
                            request.getSession().setAttribute("Cart", Cart);
                            request.setAttribute("mess", "Add Successfull");
                            String cidString = request.getParameter("cid");
                            if (cidString == null || cidString.length() == 0) {
                                cidString = "0";
                            }
                            int cid = Integer.parseInt(cidString.trim());
                            request.setAttribute("cidString", cidString);
                            request.setAttribute("productList", dao.getList(cid));
                            request.getRequestDispatcher("view/Home.jsp").forward(request, response);
                        }
                    }else{
                        request.setAttribute("mess", "Product "+pid+" no longer have supplies.");
                        String cidString = request.getParameter("cid");
                        if (cidString == null || cidString.length() == 0) {
                            cidString = "0";
                        }
                        int cid = Integer.parseInt(cidString.trim());
                        request.setAttribute("cidString", cidString);
                        request.setAttribute("productList", dao.getList(cid));
                        request.getRequestDispatcher("view/Home.jsp").forward(request, response);
                    }
                    //
                    break;
                case "update":
                    //Transpot data to updateController
                    Product p = dao.getOne(pid);
                    request.setAttribute("product", p);
                    request.getRequestDispatcher("update/UpdateProduct.jsp").forward(request, response);
                    break;
                default:
                    //Delete Code
                    dao.deleteProduct(pid);
                    response.sendRedirect("ProductController");
                    break;
            }
        } else {
            if (service != null && service.equals("add")) {
                request.getRequestDispatcher("add/AddProduct.jsp").forward(request, response);

            } else {
                String cidString = request.getParameter("cateId");
                if (cidString == null || cidString.length() == 0) {
                    cidString = "0";
                }
                int cid = Integer.parseInt(cidString.trim());
                request.setAttribute("cidString", cidString);
                request.setAttribute("productList", dao.getList(cid));
                request.getRequestDispatcher("view/Home.jsp").forward(request, response);
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
        String service = request.getParameter("service");
        String pid = request.getParameter("pid");
        DBConnect db = new DBConnect();
        DAOProduct dao = new DAOProduct(db);
        DAOCategory cated = new DAOCategory(db);
        request.setAttribute("cateList", cated.getList());
        HttpSession session = request.getSession();
        if (pid != null && pid.length() > 0) {
            switch (service) {
                case "addToCart":
                    if (dao.maxQuantity(pid) > 0) {
                        Product product = dao.getOne(pid);
                        if (session.getAttribute(pid) != null) {
                            product.setQuantity(Integer.parseInt(session.getAttribute(pid).toString()));
                        } else {
                            request.getSession().setAttribute(pid, 1);
                            product.setQuantity(1);
                        }
                        int quantity = 1;
                        if (request.getSession().getAttribute("Cart") != null) {
                            boolean exit = false;
                            ArrayList<Product> Cart = (ArrayList<Product>) request.getSession().getAttribute("Cart");
                            for (Product pr : Cart) {
                                if (pr.getPid().equals(product.getPid())) {
                                    pr.setQuantity(pr.getQuantity() + 1);
                                    quantity = pr.getQuantity();
                                    exit = true;
                                }
                            }
                            
                            if (!exit) {
                                Cart.add(product);
                                request.getSession().setAttribute(pid, quantity);
                                request.getSession().setAttribute("Cart", Cart);
                                request.setAttribute("mess", "Add Successfull");
                            }
                            
                            String cidString = request.getParameter("cid");
                            if (cidString == null || cidString.length() == 0) {
                                cidString = "0";
                            }
                            int cid = Integer.parseInt(cidString.trim());
                            request.setAttribute("cidString", cidString);
                            request.setAttribute("productList", dao.getList(cid));
                            request.getRequestDispatcher("view/ViewProduct.jsp").forward(request, response);
                        } else {
                            ArrayList<Product> Cart = new ArrayList<>();
                            Cart.add(product);
                            request.getSession().setAttribute("Cart", Cart);
                            request.setAttribute("mess", "Add Successfull");
                            String cidString = request.getParameter("cid");
                            if (cidString == null || cidString.length() == 0) {
                                cidString = "0";
                            }
                            int cid = Integer.parseInt(cidString.trim());
                            request.setAttribute("cidString", cidString);
                            request.setAttribute("productList", dao.getList(cid));
                            request.getRequestDispatcher("view/ViewProduct.jsp").forward(request, response);
                        }
                    }else{
                        request.setAttribute("mess", "Product "+pid+" no longer have supplies.");
                        String cidString = request.getParameter("cid");
                        if (cidString == null || cidString.length() == 0) {
                            cidString = "0";
                        }
                        int cid = Integer.parseInt(cidString.trim());
                        request.setAttribute("cidString", cidString);
                        request.setAttribute("productList", dao.getList(cid));
                        request.getRequestDispatcher("view/ViewProduct.jsp").forward(request, response);
                    }
                    //
                    break;
                case "update":
                    //Transpot data to updateController
                    Product p = dao.getOne(pid);
                    request.setAttribute("product", p);
                    request.getRequestDispatcher("update/UpdateProduct.jsp").forward(request, response);
                    break;
                default:
                    //Delete Code
                    dao.deleteProduct(pid);
                    response.sendRedirect("ProductController");
                    break;
            }
        } else {
            if (service != null && service.equals("add")) {
                request.getRequestDispatcher("add/AddProduct.jsp").forward(request, response);

            } else {
                String cidString = request.getParameter("cid");
                if (cidString == null || cidString.length() == 0) {
                    cidString = "0";
                }
                int cid = Integer.parseInt(cidString.trim());
                request.setAttribute("cidString", cidString);
                request.setAttribute("productList", dao.getList(cid));
                request.getRequestDispatcher("view/ViewProduct.jsp").forward(request, response);
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
