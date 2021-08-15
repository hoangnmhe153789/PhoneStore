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

/**
 *
 * @author HP
 */
public class DAOCustomer1 {

    Connection conn = null;
    DBConnect dbconn = null;

    public DAOCustomer1(DBConnect dbconn) {
        conn = dbconn.conn;
        this.dbconn = dbconn;
    }

    
   public boolean login(String username, String password) {

        String sql = "SELECT * FROM Customer WHERE username = ? and password = ?";
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
    //insert, update, delete: number of records
    public int addCustomer(Customer cus) {

        int n = 0;
        String preSql = "insert into "
                + "Customer(cname,cphone,cAddress,username,password) "
                + "values(?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(preSql);
            //? has index start 1
//            pre.setDataType(index of ?, value);
//            DataType id data of ?
            pre.setString(1, cus.getCname());
            pre.setString(2, cus.getCphone());
            pre.setString(3, cus.getcAddress());
            pre.setString(4, cus.getUsername());
            pre.setString(5, cus.getPassword());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
//        String sql="insert into Customer(cname,cphone,cAddress,username,password) "
//                + "values('"+cus.getCname()+"','"+cus.getCphone()+"',"
//                + "'"+cus.getcAddress()+"','"+cus.getUsername()+"',"
//                + "'"+cus.getPassword()+"')";
//        try {
//            Statement state=conn.createStatement();
//            n=state.executeUpdate(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return n;
    }

    public int updateCustomer(Customer cus) {
        int n = 0;
        String sql = "update Customer set cname=?,cphone=?,cAddress=?,username=?,password=?, status=? where cid=?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
             pre.setString(1, cus.getCname());
            pre.setString(2, cus.getCphone());
            pre.setString(3, cus.getcAddress());
            pre.setString(4, cus.getUsername());
            pre.setString(5, cus.getPassword());
            pre.setInt(6, cus.getStatus());
            pre.setInt(7, cus.getCid());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int changeStatus(int cid, int status) {
        int n = 0;
        String preSql = "update Customer set status=? where cid=?";
        String sql = "update Customer set status=" + status + " where cid=" + cid;
        try {
            PreparedStatement pre = conn.prepareStatement(preSql);
            pre.setInt(1, status);
            pre.setInt(2, cid);
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int removeCustomer(int cid) {
        int n = 0;
        String sql = "DELETE FROM Customer WHERE cid = ?";
        PreparedStatement pre;
        try {
            pre = conn.prepareCall(sql);
            pre.setInt(1, cid);
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public ArrayList<Customer> findCustomerByName(String name) {
        ArrayList<Customer> list = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM Customer ";
            if(name.length() > 0){
                sql+=" where cname like ?";
            }
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            if(name.length() > 0){
                stm.setString(1, "%"+ name +"%");
            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int cid = rs.getInt("cid");//rs.getInt(1);
                String cname = rs.getString("cname");//rs.getString("cname");
                String cphone = rs.getString("cphone"),
                        cAddress = rs.getString(4),
                        username = rs.getString(5),
                        password = rs.getString(6);
                int status = rs.getInt(7);
                Customer cus = new Customer(cid, cname, cphone, cAddress, username, password, status);
                list.add(cus);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public ArrayList<Customer> getList() {
        ArrayList<Customer> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Customer";
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int cid = rs.getInt("cid");//rs.getInt(1);
                String cname = rs.getString(2);//rs.getString("cname");
                String cphone = rs.getString("cphone"),
                        cAddress = rs.getString(4),
                        username = rs.getString(5),
                        password = rs.getString(6);
                int status = rs.getInt(7);
                Customer cus = new Customer(cid, cname, cphone, cAddress, username, password, status);
                list.add(cus);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public ArrayList<Customer> sortByUsername() {
        ArrayList<Customer> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Customer ORDER BY cname";
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int cid = rs.getInt("cid");//rs.getInt(1);
                String cname = rs.getString(2);//rs.getString("cname");
                String cphone = rs.getString("cphone"),
                        cAddress = rs.getString(4),
                        username = rs.getString(5),
                        password = rs.getString(6);
                int status = rs.getInt(7);
                Customer cus = new Customer(cid, cname, cphone, cAddress, username, password, status);
                list.add(cus);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

     //Confirm Customer's Account Exitence
    public boolean isExit(String username,String password){
        boolean exit = false;
        try {
            String sql = "Select * From Customer Where username = ? and password = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs  = stm.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exit;
    }
    
    public int ChangePassword(Customer cus,String newPassword) {
        int n = 0;
        //Check if the account exited
        if(isExit(cus.getUsername(), cus.getPassword())){
            try {
                String sql = "Update Customer set password = ? Where cid = ? ";
                PreparedStatement stm  = conn.prepareStatement(sql);
                stm.setString(1, newPassword);
                stm.setInt(2,cus.getCid());
                n = stm.executeUpdate();
                System.out.println("Successful");
            } catch (SQLException ex) {
                Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Admin Account doesn't exit");
        }
        
        return n;
    }

    public Customer getOne(int cid) {
        String sql = "select * from Customer Where cid = ?";
        try {
            //Statement state=conn.createStatement();
            //TYPE_FORWARD_ONLY:pointer top --> down
            //TYPE_SCROLL_SENSITIVE: top <--> down; thread safe
            //CONCUR_READ_ONLY: not modify resultset
            //CONCUR_UPDATABLE: modify resultset
            PreparedStatement stm = conn.prepareStatement(sql);
            if(cid<0) return null; 
            stm.setInt(1, cid);
            ResultSet rs = stm.executeQuery();
            //   ResultSet rs = dbconn.getData(sql);
            while (rs.next()) {
//                rs.getDataType(index|fieldName);
//                DataType is dataype of fieldName;
                String cname = rs.getString(2);//rs.getString("cname");
                String cphone = rs.getString("cphone"),
                        cAddress = rs.getString(4),
                        username = rs.getString(5),
                        password = rs.getString(6);
                int status = rs.getInt(7);
                Customer cus = new Customer(cid, cname, cphone, cAddress, username, password, status);
                return cus;
            }
//            while(rs.previous()){
//            }
            //PreparedStatement pre=conn.prepareStatement(sql, 0, 0);
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Customer getOneByUsername(String username) {
        String sql = "select * from Customer Where username = ?";
        try {
            //Statement state=conn.createStatement();
            //TYPE_FORWARD_ONLY:pointer top --> down
            //TYPE_SCROLL_SENSITIVE: top <--> down; thread safe
            //CONCUR_READ_ONLY: not modify resultset
            //CONCUR_UPDATABLE: modify resultset
            PreparedStatement stm = conn.prepareStatement(sql);
            if(username.length()<=0) return null; 
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            //   ResultSet rs = dbconn.getData(sql);
            while (rs.next()) {
//                rs.getDataType(index|fieldName);
//                DataType is dataype of fieldName;
                int cid = rs.getInt(1);
                String cname = rs.getString(2);//rs.getString("cname");
                String cphone = rs.getString("cphone"),
                        cAddress = rs.getString(4),
                        password = rs.getString(6);
                int status = rs.getInt(7);
                Customer cus = new Customer(cid, cname, cphone, cAddress, username, password, status);
                return cus;
            }
//            while(rs.previous()){
//            }
            //PreparedStatement pre=conn.prepareStatement(sql, 0, 0);
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void displayAllCustomer() {
        String sql = "select * from Customer";
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
//                rs.getDataType(index|fieldName);
//                DataType is dataype of fieldName;
                int cid = rs.getInt("cid");//rs.getInt(1);
                String cname = rs.getString(2);//rs.getString("cname");
                String cphone = rs.getString("cphone"),
                        cAddress = rs.getString(4),
                        username = rs.getString(5),
                        password = rs.getString(6);
                int status = rs.getInt(7);
                Customer cus = new Customer(cid, cname, cphone, cAddress, username, password, status);
                System.out.println(cus);
            }
//            while(rs.previous()){
//            }
            //PreparedStatement pre=conn.prepareStatement(sql, 0, 0);
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public int deleteCustomer(int cid) {
        int n = 0;
        
        try {
            String stChanger = "UPDATE Customer SET status = 0 WHERE cid = ?";
            PreparedStatement stm = conn.prepareStatement(stChanger);
            stm.setInt(1, cid);
            n=stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        DAOCustomer1 dao = new DAOCustomer1(dbconn);
//        int n = dao.addCustomer(new Customer("Hai", "094343",
//                "Hai phong", "Hai123456", "abc123321"));
//        if (n > 0) {
//            System.out.println("inserted");
//        }
// //      c.setCid(5);
// //       System.out.println(dao.updateCustomer(c));
// //       dao.updateCustomer(new Customer(5,"Mr D", "123456789", "abcxyz", "SugarDDaddy", "daddy123456789",1));
//  //      System.out.println(dao.deleteCustomer(2));
        System.out.println(dao.addCustomer(new Customer("abcxxx", "0123456789", "Sontay", "abcxxx", "123456789", 1)));
        
    }
}
