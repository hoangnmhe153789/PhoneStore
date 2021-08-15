/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Admin;
import entity.Bill;
import entity.Customer;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class DAOBill {

    Connection conn = null;

    public DAOBill(DBConnect dbconn) {
        conn = dbconn.conn;
    }

    //insert, update, delete: number of records
    public int addBill(Bill b) {
        int n = 0;
        String sql = "insert into Bill values(?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, b.getoID());
            pre.setString(2, b.getDateCreate());
            pre.setString(3, b.getCname());
            pre.setString(4, b.getCphone());
            pre.setString(5, b.getcAddress());
            pre.setDouble(6, b.getTotal());
            pre.setInt(7, b.getStatus());
            pre.setInt(8, b.getCid());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public Bill findByID(String oId) {
        try {
            String sql = "SELECT * FROM Bill WHERE oId = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, oId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {

                Bill a = new Bill(oId, rs.getString("dateCreate"), rs.getString("cname"), rs.getString("cphone"), rs.getString("cAddress"), rs.getDouble("total"), rs.getInt("status"), rs.getInt("cid"));
                return a;
            }
        } catch (SQLException ex) {

            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ArrayList<Bill> findByCname(String cname) {
        ArrayList<Bill> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Bill b inner join Customer c on b.cid = c.cid ";
            if(cname != null && cname.length()>0){
                sql +=" WHERE username = ?";
            }
            PreparedStatement stm = conn.prepareStatement(sql);
            if(cname != null && cname.length()>0){
                stm.setString(1, cname);
            }
            
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Bill a = new Bill(rs.getString("oid"), rs.getString("dateCreate"), rs.getString("cname"), rs.getString("cphone"), rs.getString("cAddress"), rs.getDouble("total"), rs.getInt("status"), rs.getInt("cid"));
                list.add(a);
            }
        } catch (SQLException ex) {

            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public int delete(String oid) {
        int n = 0;
        String sql = "Update Bill set status = -1 WHERE oid = ?";
        try {
            PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1, oid);
            n = state.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int update(Bill b) {
        int n = 0;
        String sql = "UPDATE Bill SET dateCreate = ? , cname = ? , cphone = ?, cAddress = ?,total = ?,[status] = ?, cid = ? WHERE oid = ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, b.getDateCreate());
            pre.setString(2, b.getCname());
            pre.setString(3, b.getCphone());
            pre.setString(4, b.getcAddress());
            pre.setDouble(5, b.getTotal());
            pre.setInt(6, b.getStatus());
            pre.setInt(7, b.getCid());
            pre.setString(8, b.getoID());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public ArrayList<Bill> sortByDOB() {
        ArrayList<Bill> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Bill ORDER BY dateCreate";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Bill a = new Bill(rs.getString("oid"), rs.getString("dateCreate"), rs.getString("cname"), rs.getString("cphone"), rs.getString("cAddress"), rs.getDouble("total"), rs.getInt("status"), rs.getInt("cid"));
                list.add(a);
            }
        } catch (SQLException ex) {

            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    public static String givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("US-ASCII"));
        return generatedString;
    }

    public ArrayList<Bill> getList() {
        ArrayList<Bill> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Bill ";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Bill a = new Bill(rs.getString("oid"), rs.getString("dateCreate"), rs.getString("cname"), rs.getString("cphone"), rs.getString("cAddress"), rs.getDouble("total"), rs.getInt("status"), rs.getInt("cid"));
                list.add(a);
            }
        } catch (SQLException ex) {

            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    public ArrayList<Bill> getListOfCustomer() {
        ArrayList<Bill> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Bill ";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Bill a = new Bill(rs.getString("oid"), rs.getString("dateCreate"), rs.getString("cname"), rs.getString("cphone"), rs.getString("cAddress"), rs.getDouble("total"), rs.getInt("status"), rs.getInt("cid"));
                list.add(a);
            }
        } catch (SQLException ex) {

            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    public int greatestID(){
        int max = 0; 
        try {
            String sql = "SELECT oid FROM Bill ";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                if(max < rs.getInt("oid")){
                    max = rs.getInt("oid");
                }
            }
        } catch (SQLException ex) {

            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }

    public double dayIncome(){
        double income = 0;
        
        String sql ="SELECT Sum(total) as 'income' FROM Bill WHERE Month(dateCreate) = MONTH(GETDATE()) And YEAR(dateCreate) = YEAR((GETDATE())) and DAY(dateCreate) = DAY(GETDATE())";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                income = rs.getDouble("income");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return income;
    }
    
    public double monthIncome(){
        double income = 0;
        
        String sql ="SELECT Sum(total) as 'income' FROM Bill WHERE Month(dateCreate) = MONTH(GETDATE()) And YEAR(dateCreate) = YEAR((GETDATE()))";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                income = rs.getDouble("income");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return income;
    }
    
    public double yearIncome(){
        double income = 0;
        
        String sql ="SELECT Sum(total) as 'income' FROM Bill WHERE YEAR(dateCreate) = YEAR((GETDATE()))";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                income = rs.getDouble("income");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return income;
    }
    
    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        DAOBill dao = new DAOBill(dbconn);
//        Bill b = new Bill("10", "1998-01-01", "Mrs E", "123456789", "avn", 10000, 1, 4);
//        dao.addBill(b);
//        java.util.Date utilDate = new java.util.Date();
//        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//        System.out.println(sqlDate);
         System.out.println(dao.yearIncome());
    }

    
}
