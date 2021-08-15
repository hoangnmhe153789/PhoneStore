/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Admin;
import entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author ACER
 */
public class DAOAdmin {

    Connection conn = null;

    public DAOAdmin(DBConnect dbconn) {
        conn = dbconn.conn;
    }

    //insert, update, delete: number of records
    public int addAdmin(Admin cus) {
        int n = 0;
        try {
            String sql = "insert into Admin(username,password) VALUES(?,?)";
            PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1, cus.getUsername());
            state.setString(2, cus.getPassword());
            n = state.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    //Confirm Admin Exitence
    public boolean isExit(String username) {
        boolean exit = false;
        try {
            String sql = "Select * From Admin Where username = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exit;
    }

    public int ChangePassword(Admin cus, String newPassword) {
        int n = 0;
        //Check if the account exited
        if (isExit(cus.getUsername())) {
            try {
                String sql = "Update Admin set password = ? Where adminID = ? ";
                PreparedStatement stm = conn.prepareStatement(sql);
                stm.setString(1, newPassword);
                stm.setInt(2, cus.getAdminID());
                n = stm.executeUpdate();
                System.out.println("Successful");
            } catch (SQLException ex) {
                Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Admin Account doesn't exit");
        }
        return n;
    }

    public int UpdateAdmin(Admin cus) {
        int n = 0;
        try {
            String sql = "Update Admin set username = ?, password = ? Where adminID = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, cus.getUsername());
            stm.setString(2, cus.getPassword());
            stm.setInt(3, cus.getAdminID());
            n = stm.executeUpdate();
            System.out.println(n + " row effect");
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public void Display() {
        String sql = "select * from Admin";
        try {
            //Statement state=conn.createStatement();
            //TYPE_FORWARD_ONLY:pointer top --> down
            //TYPE_SCROLL_SENSITIVE: top <--> down; thread safe
            //CONCUR_READ_ONLY: not modify resultset
            //CONCUR_UPDATABLE: modify resultset
            Statement state = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = state.executeQuery(sql);
            //   ResultSet rs = dbconn.getData(sql);
            while (rs.next()) {
                Admin a = new Admin();
                a.setAdminID(rs.getInt("adminID"));
                a.setUsername(rs.getString("username"));
                a.setPassword((rs.getString("password")));
                System.out.println(a);
            }
//            while(rs.previous()){
//            }
            //PreparedStatement pre=conn.prepareStatement(sql, 0, 0);
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Sort by Username
    public ArrayList<Admin> sortByUsername() {
        ArrayList<Admin> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Admin ORDER BY username";
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Admin a = new Admin(rs.getString("username"), rs.getString("password"));
                list.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    //By Username
    public ArrayList<Admin> find(String username) {
        ArrayList<Admin> list = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Admin ";
            if (!"".equals(username)) {
                sql += " WHERE username like ?";
            }
            PreparedStatement stm = conn.prepareStatement(sql);
            if (!"".equals(username)) {
                stm.setString(1, "%" + username + "%");
            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Admin a = new Admin();
                a.setAdminID(rs.getInt("adminID"));
                a.setUsername(rs.getString("username"));
                a.setPassword((rs.getString("password")));
                list.add(a);
            }
        } catch (SQLException ex) {

            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public int deleteAdminByID(int id) {
        int n = 0;
        String sql = "DELETE FROM Admin WHERE adminID = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, id);
            n = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int deleteAdminByUsername(String username) {
        int n = 0;

        String sql = "DELETE FROM Admin WHERE username = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, username);
            n = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public boolean login(String username, String password) {

        String sql = "SELECT * FROM Admin WHERE username = ? and password = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Admin getOne(int adminId) {
        Admin a = new Admin();
        try {
            String sql = "SELECT * FROM Admin WHERE adminID = ?";
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            stm.setInt(1, adminId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                a = new Admin(rs.getInt("adminID"), rs.getString("username"), rs.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        DAOAdmin dao = new DAOAdmin(dbconn);
//        Admin a = new Admin();
//        a.setAdminID(12);
//        a.setUsername("aaa1234");
//        a.setPassword("1234567");
//        String s = "abc";
//        System.out.println((s.matches("^(?=\\s*\\S).*$")) ? "Match" : "Doesn't Match");
        System.out.println(dao.login("nmh123", "123456789"));
        

    }
}
