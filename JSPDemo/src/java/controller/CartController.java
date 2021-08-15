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
import java.util.ArrayList;
import java.util.Iterator;
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
public class CartController extends HttpServlet {

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
            out.println("<title>Servlet CartController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartController at " + request.getContextPath() + "</h1>");
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
        DBConnect db = new DBConnect();
        DAOCustomer1 daoCus = new DAOCustomer1(db);
        ArrayList<Product> products = (ArrayList<Product>) request.getSession().getAttribute("Cart");
        HttpSession session = request.getSession();
        if (products != null) {
            String service = request.getParameter("service");
            if (service != null && service.length() > 0) {
                if (service.equals("checkout")) {
                    String username = (String) request.getSession().getAttribute("username");
                    Customer customer = daoCus.getOneByUsername(username);
                    DAOBill daoBill = new DAOBill(db);
                    DAOProduct daoPro = new DAOProduct(db);
                    java.util.Date utilDate = new java.util.Date();
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                    Double total = Double.parseDouble(request.getParameter("total"));
                    //Add to Bill
                    Bill bill = new Bill(String.valueOf((daoBill.greatestID() + 1)), sqlDate.toString(), customer.getCname(), customer.getCphone(), customer.getcAddress(), total, 1, customer.getCid());
                    daoBill.addBill(bill);
                    //Add to Bill Detail
                    DAOBillDetail daoBDetail = new DAOBillDetail(db);
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
                    //redirect to cart
                    request.setAttribute("mess", "Cart is empty");
                    request.setAttribute("empty", true);
                    request.getRequestDispatcher("view/ViewCart.jsp").forward(request, response);
                } else if (service.equals("clear")) {
                    ArrayList<Product> product = new DAOProduct(db).getList(0);
                    product.forEach((p) -> {
                        session.removeAttribute(p.getPid());
                    });
                    request.setAttribute("empty", true);
                    session.removeAttribute("Cart");
                    request.setAttribute("mess", "Cart is empty");
                    request.getRequestDispatcher("view/ViewCart.jsp").forward(request, response);
                } else if (service.equals("remove")) {
                    String pid = request.getParameter("pid");
                    //Iterator<Product> iList = products.iterator();
                    try {
                        for (Iterator<Product> iList = products.iterator(); iList.hasNext();) {
                            Product p = iList.next();
                            if (p.getPid().equals(pid)) {
                                iList.remove();
                                session.removeAttribute(pid);
                            }
                        }
                        if (products.size() == 0) {
                            request.setAttribute("empty", true);
                            request.setAttribute("mess", "Cart is empty");
                            request.getRequestDispatcher("view/ViewCart.jsp").forward(request, response);
                        } else {
                            request.setAttribute("empty", false);
                            request.setAttribute("Cart", products);
                            request.getRequestDispatcher("view/ViewCart.jsp").forward(request, response);
                        }

                    } catch (IOException | ServletException e) {
                        response.getWriter().print(e);
                    }
                }
            } else {
                request.setAttribute("empty", false);
                request.setAttribute("Cart", products);
                request.getRequestDispatcher("view/ViewCart.jsp").forward(request, response);
            }

        } else {
            request.setAttribute("empty", true);
            request.setAttribute("mess", "Cart is empty");
            request.getRequestDispatcher("view/ViewCart.jsp").forward(request, response);

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
        String pid[] = request.getParameterValues("pid");
        String quantity[] = request.getParameterValues("quantity");
        DBConnect db = new DBConnect();
        DAOProduct dao = new DAOProduct(db);
        HttpSession session = request.getSession();
        ArrayList<Product> products = (ArrayList<Product>) session.getAttribute("Cart");
        for (int i = 0; i < pid.length; i++) {
            int maxQuantity = dao.maxQuantity(pid[i]);
            if (maxQuantity < Integer.parseInt(quantity[i])) {
                session.setAttribute(pid[i], maxQuantity);
                products.get(i).setQuantity(maxQuantity);
                request.setAttribute("mess", "Product "+ pid[i] +" have only "+ maxQuantity + " in the store.\n");
            } else {
                session.setAttribute(pid[i], quantity[i]);
                products.get(i).setQuantity(Integer.parseInt(quantity[i]));
            }
        }
        request.setAttribute("Cart", products);
        request.setAttribute("empty", false);
        
        request.getRequestDispatcher("view/ViewCart.jsp").forward(request, response);
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
