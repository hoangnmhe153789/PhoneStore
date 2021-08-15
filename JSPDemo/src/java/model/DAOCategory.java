/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Bill;
import entity.Category;
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
//DAO database access object
public class DAOCategory {
    Connection conn=null;
    public DAOCategory(DBConnect dbconn) {
        conn=dbconn.conn;
    }
    //insert, update, delete -- return number of records
    public int addCategory(Category cate){
        int n=0;
        String sql="insert into Category(cateName, status) "
                + "values ('"+cate.getCateName()+
                "',"+cate.getStatus()+")";
        try {
            Statement state=conn.createStatement();
            n=state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
    public int update(Category cate){
        int n = 0;
        String sql = "UPDATE Category SET  cateName = ?, status = ? WHERE cateID = ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, cate.getCateName());
            pre.setInt(2, cate.getStatus());
            pre.setInt(3, cate.getCateID());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
    public int Delete(int cateId){
        String sql = "Update Category set status = 0 where cateId = ?";
        int n = 0;
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, cateId);
            n= stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
    public ArrayList<Category> getList(){
        ArrayList<Category> list = new ArrayList<>();
        String sql = "Select * From Category";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Category c = new Category();
                c.setCateID(rs.getInt("cateID"));
                c.setCateName(rs.getString("cateName"));
                c.setStatus(rs.getInt("status"));
                list.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public Category getOne(int cateId){
        Category c = new Category();
        String sql = "SELECT * FROM Category WHERE cateID = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, cateId);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                c = new Category(cateId, rs.getString("cateName"), rs.getInt("status"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    
    public void displayCateName(){
        
    }
    public static void main(String[] args) {
        DBConnect dbconn=new DBConnect();
        DAOCategory dao=new DAOCategory(dbconn);
//        Category c= dao.getOne(2);
//        System.out.println(c);
        System.out.println(dao.exited("iphone12"));
    }

    public boolean exited(String cateName) {
        boolean exit = false;
        try {
            String sql = "Select * From Category Where cateName = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, cateName);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exit;
    }
    
}
