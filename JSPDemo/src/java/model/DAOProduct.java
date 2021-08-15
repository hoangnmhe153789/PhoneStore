/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DAOProduct {

    Connection conn = null;
    DBConnect dbconn = null;

    public DAOProduct(DBConnect dbconn) {
        conn = dbconn.conn;
        this.dbconn = dbconn;
    }

    public ArrayList<Product> sortByName() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product ORDER BY pname";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setCateID(rs.getInt("cateID"));
                Product a = new Product(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
                list.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Product getOne(String pid) {
        try {
            String sql = "SELECT * FROM Product ";

            if (pid != null && pid.length() > 0) {
                sql += " Where pid = ? ";
            }
            PreparedStatement stm = conn.prepareStatement(sql);
            if (pid != null && pid.length() > 0) {
                stm.setString(1, pid);
            }

            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Category c = new Category();
                c.setCateID(rs.getInt("cateID"));
                return new Product(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean isExited(String pid) {
        try {
            String sql = "SELECT * FROM Product ";

            if (pid != null && pid.length() > 0) {
                sql += " Where pid = ? ";
            }
            PreparedStatement stm = conn.prepareStatement(sql);
            if (pid != null && pid.length() > 0) {
                stm.setString(1, pid);
            }

            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<Product> getList(int cid) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product ";

            if (cid > 0) {
                sql += " Where cateid = ? ";
            }
            PreparedStatement stm = conn.prepareStatement(sql);
            if (cid > 0) {
                stm.setInt(1, cid);
            }

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                list.add(new Product(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int addProduct(Product pro) {
        int n = 0;
        String preSql = "Insert into Product Values(?,?,?,?,?,?,?,?)";
        try {
            // ? has index begin 1
            PreparedStatement pre = conn.prepareStatement(preSql);
            //pre.setDataType(index of ?, value);
            // dataType of data ?
            pre.setString(2, pro.getPname());
            pre.setInt(3, pro.getQuantity());
            pre.setDouble(4, pro.getPrice());
            pre.setString(5, pro.getImage());
            pre.setString(6, pro.getDescription());
            pre.setInt(7, pro.getStatus());
            pre.setInt(8, pro.getCateID());
            pre.setString(1, pro.getPid());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "update Product set pname='" + pro.getPname()
                + "',quantity=" + pro.getQuantity() + ","
                + "price=" + pro.getPrice() + ",image='" + pro.getImage()
                + "',description='" + pro.getDescription() + "',"
                + "status=" + pro.getStatus() + ",cateID=" + pro.getCateID() + " "
                + "where pid='" + pro.getPid() + "'";
//        try {
//            Statement state=conn.createStatement();
//            n=state.executeUpdate(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return n;
    }

    public int updateProduct(Product pro) {
        int n = 0;
        String preSql = "update Product set pname=?,quantity=?"
                + ",price=?,image=?,description=?,status=?"
                + ",cateID=? where pid=?";
        try {
            // ? has index begin 1
            PreparedStatement pre = conn.prepareStatement(preSql);
            //pre.setDataType(index of ?, value);
            // dataType of data ?
            pre.setString(1, pro.getPname());
            pre.setInt(2, pro.getQuantity());
            pre.setDouble(3, pro.getPrice());
            pre.setString(4, pro.getImage());
            pre.setString(5, pro.getDescription());
            pre.setInt(6, pro.getStatus());
            pre.setInt(7, pro.getCateID());
            pre.setString(8, pro.getPid());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "update Product set pname='" + pro.getPname()
                + "',quantity=" + pro.getQuantity() + ","
                + "price=" + pro.getPrice() + ",image='" + pro.getImage()
                + "',description='" + pro.getDescription() + "',"
                + "status=" + pro.getStatus() + ",cateID=" + pro.getCateID() + " "
                + "where pid='" + pro.getPid() + "'";
//        try {
//            Statement state=conn.createStatement();
//            n=state.executeUpdate(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return n;
    }

    public int updateQuantity(String pid, int quantity) {
        int n = 0;
        String sql = "update Product set "
                + "quantity = " + quantity + "  "
                + "where pid='" + pid + "'";
        try {
            Statement state = conn.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int updatePrice(String pid, double price) {
        int n = 0;
        return n;
    }

    public int changeStatus(String pid, int status) {
        int n = 0;
        return n;
    }

    public void dislayAllProduct() {
        String sql = "select * from Product";
        try {
            //ResultSet.TYPE_FORWARD_ONLY: default-
            // con trỏ duyệt qua các bản ghi chỉ chạy 1 chiều
            // từ trên xuống
            //TYPE_SCROLL_SENSITIVE: con trỏ scroll,sensitive:
            // thread 
            //CONCUR_READ_ONLY: default: resultset is readonly
            //CONCUR_UPDATABL: modify data of resultset
            Statement state = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = state.executeQuery(sql);
            //ResultSet rs=dbconn.getData(sql);
            while (rs.next()) {
                //dataType is dataType of fieldName;
                //index start 1: left --> right
                //rs.getDataType(index|fieldName);
                String pid = rs.getString("pid");//rs.getString(1)
                String pname = rs.getString(2);//rs.getString("pname");
                int quantity = rs.getInt(3);//rs.getInt("quantity")
                double price = rs.getDouble("price");
                String image = rs.getString(5),
                        description = rs.getString(6);
                int status = rs.getInt(7),
                        cateID = rs.getInt(8);
                Product pro = new Product(pid, pname, quantity, price, image, description, status, cateID);
                System.out.println(pro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void displayProductQuantity(int quan) {
        String sql = "select pname, quantity "
                + "from product where quantity>" + quan;
        ResultSet rs = dbconn.getData(sql);
        try {
            while (rs.next()) {
                System.out.println("Name:" + rs.getString(1)
                        + "\t quantity:" + rs.getInt(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int deleteProduct(String pid) {
        int n = 0;
        // Product -- 1 --n-->Bill
        // check foreign key
        String sql = "select * from BillDetail where pid='" + pid + "'";
        //getdata
        ResultSet rs = dbconn.getData(sql);
        try {
            if (rs.next()) {
                // productid is exited --> change status
                String stChanger = "UPDATE Product SET status = 0 WHERE pid = ?";
                PreparedStatement stm = conn.prepareStatement(stChanger);
                stm.setString(1, pid);
                stm.executeUpdate();
            } else {
                //delete
                // n=...
                String deleleSQL = "DELETE FROM Product WHERE pid = ?";
                PreparedStatement stm = conn.prepareStatement(deleleSQL);
                stm.setString(1, pid);
                stm.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int maxQuantity(String id) {
        int quantity = 0;

        String sql = "SELECT quantity FROM Product ";
        if (id != null && !id.equals("0") && !id.equals("")) {
            sql += " WHERE pid = ?";
        } else {
            return 0;
        }
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                quantity = rs.getInt("quantity");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quantity;
    }

    public static void main(String[] args) {
        DBConnect dbcon = new DBConnect();
        DAOProduct dao = new DAOProduct(dbcon);
        // dao.dislayAllProduct();
//        Product p = new Product("sample123", "sample", 0, 0, "sample", "sample", 0, 1);
//        dao.addProduct(p);
        System.out.println(dao.maxQuantity("1"));
    }

}
