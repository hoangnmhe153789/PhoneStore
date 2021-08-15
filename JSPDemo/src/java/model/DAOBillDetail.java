/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Admin;
import entity.Bill;
import entity.BillDetail;
import entity.Category;
import entity.Customer;
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
 * @author ACER
 */
public class DAOBillDetail {

    Connection conn = null;

    public DAOBillDetail(DBConnect dbconn) {
        conn = dbconn.conn;
    }

    public int addBillDetail(BillDetail cus) {
        int n = 0;
        String checkSql = "SELECT * FROM Bill where oid = ?";
        try {

            PreparedStatement state = conn.prepareStatement(checkSql);
            state.setString(1, cus.getoID());
            ResultSet rs = state.executeQuery();
            if (rs.next()) {
                String sql = "insert into BillDetail(pid,oID,quantity,price,total) VAlUES(?,?,?,?,?)";
                state = conn.prepareStatement(sql);
                state.setString(2, cus.getoID());
                state.setString(1, cus.getPid());
                state.setInt(3, cus.getQuantity());
                state.setDouble(4, cus.getMoney());
                state.setDouble(5, cus.getTotal());
                try {
                    n = state.executeUpdate();
                } catch (SQLException e) {
                    return -1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBillDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public ArrayList<BillDetail> sortByPID() {
        ArrayList<BillDetail> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM BillDetail ORDER BY pid";
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                BillDetail a = new BillDetail();
                a.setoID(rs.getString(2));
                a.setPid(rs.getString(1));
                a.setQuantity(rs.getInt(3));
                a.setMoney(rs.getDouble(4));
                a.setTotal(rs.getDouble(5));
                list.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<ArrayList> getAllList(String oid, String pid) {
        ArrayList listOfAll = new ArrayList<>();
        ArrayList<BillDetail> billDetailList = new ArrayList<>();
        ArrayList<Customer> cusList = new ArrayList<>();
        ArrayList<Category> cateList = new ArrayList<>();
        ArrayList<Bill> billList = new ArrayList<>();
        ArrayList<Product> pList = new ArrayList<>();
        try {
            String sql = "Select * From BillDetail bd \n"
                    + "left join Bill b on b.oID = bd.oID\n"
                    + "                   left join Product p on p.pid = bd.pid\n"
                    + "                  left join Category c on c.cateID = p.cateID\n"
                    + "                   left join Customer cm on cm.cid = b.cid";
            if (oid != null && oid.length() > 0 && pid != null && pid.length() > 0) {
                sql += " WHERE bd.oid = ? and bd.pid = ?";

            } else if (oid != null && oid.length() > 0) {
                sql += " WHERE bd.oid = ? ";

            } else if (pid != null && pid.length() > 0) {
                sql += " WHERE bd.pid = ?";

            }
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            if (oid != null && oid.length() > 0 && pid != null && pid.length() > 0) {
                stm.setString(1, oid);
                stm.setString(2, pid);

            } else if (oid != null && oid.length() > 0) {
                stm.setString(1, oid);

            } else if (pid != null && pid.length() > 0) {
                stm.setString(1, pid);

            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                BillDetail a = new BillDetail();
                a.setoID(rs.getString("oid"));
                a.setPid(rs.getString("pid"));
                a.setQuantity(rs.getInt("quantity"));
                a.setMoney(rs.getDouble("price"));
                a.setTotal(rs.getDouble("total"));
                billDetailList.add(a);

                int cid = rs.getInt("cid");//rs.getInt(1);
                String cname = rs.getString("cname");//rs.getString("cname");
                String cphone = rs.getString("cphone"),
                        cAddress = rs.getString("cAddress"),
                        username = rs.getString("username"),
                        password = rs.getString("password");
                int status = rs.getInt("status");
                Customer cus = new Customer(cid, cname, cphone, cAddress, username, password, status);
                cusList.add(cus);

                Bill b = new Bill(rs.getString("oid"), rs.getString("dateCreate"), rs.getString("cname"), rs.getString("cphone"), rs.getString("cAddress"), rs.getDouble("total"), rs.getInt("status"), rs.getInt("cid"));
                billList.add(b);

                Category ca = new Category();
                ca.setCateID(rs.getInt("cateID"));
                ca.setCateName(rs.getString("cateName"));
                ca.setStatus(rs.getInt("status"));
                cateList.add(ca);

                Product p = new Product(rs.getString("pid"), rs.getString("pname"), rs.getInt("quantity"), rs.getDouble("price"), rs.getString("image"), rs.getString("description"), rs.getInt("status"), rs.getInt("cid"));
                pList.add(p);
            }
            listOfAll.add(billDetailList);
            listOfAll.add(cusList);
            listOfAll.add(cateList);
            listOfAll.add(billList);
            listOfAll.add(pList);

        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listOfAll;
    }

    public int delete(String pid, String oid) {
        int n = 0;
        try {
            String sql = "DELETE FROM BillDetail  WHERE oid like ? and pid like ?";
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            stm.setString(1, "%" + oid + "%");
            stm.setString(2, "%" + pid + "%");
            try {
                n = stm.executeUpdate();
            } catch (SQLException e) {
                return -1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int update(BillDetail cus) {
        int n = 0;
        String sql = "UPDATE BillDetail SET quantity= ? ,price= ? ,total = ?  WHERE  pid= ? and oID= ? ";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setInt(1, cus.getQuantity());
            pre.setDouble(2, cus.getMoney());
            pre.setDouble(3, cus.getTotal());
            pre.setString(4, cus.getPid());
            pre.setString(5, cus.getoID());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCategory.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return n;
    }

    public ArrayList<BillDetail> findByOID_PID(String pid, String oid) {
        ArrayList<BillDetail> list = new ArrayList<>();
        try {

            String sql = "SELECT * FROM BillDetail ";
            if (oid != null && oid.length() > 0 && pid != null && pid.length() > 0) {
                sql += " WHERE oid = ? and pid = ?";

            } else if (oid != null && oid.length() > 0) {
                sql += " WHERE oid = ? ";

            } else if (pid != null && pid.length() > 0) {
                sql += " WHERE pid = ?";

            }
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            if (oid != null && oid.length() > 0 && pid != null && pid.length() > 0) {
                stm.setString(1, oid);
                stm.setString(2, pid);

            } else if (oid != null && oid.length() > 0) {
                stm.setString(1, oid);

            } else if (pid != null && pid.length() > 0) {
                stm.setString(1, pid);

            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                BillDetail a = new BillDetail();
                a.setoID(rs.getString(2));
                a.setPid(rs.getString(1));
                a.setQuantity(rs.getInt(3));
                a.setMoney(rs.getDouble(4));
                a.setTotal(rs.getDouble(5));
                list.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<BillDetail> FilterByOID_PID(String pid, String oid) {
        ArrayList<BillDetail> list = new ArrayList<>();
        try {

            String sql = "SELECT * FROM BillDetail ";
            if (oid != null && oid.length() > 0 && pid != null && pid.length() > 0) {
                sql += " WHERE oid = ? and pid like ?";

            } else if (oid != null && oid.length() > 0) {
                sql += " WHERE oid like ? ";

            } else if (pid != null && pid.length() > 0) {
                sql += " WHERE pid like ?";

            }
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            if (oid != null && oid.length() > 0 && pid != null && pid.length() > 0) {
                stm.setString(1, "%" + oid + "%");
                stm.setString(2, "%" + pid + "%");

            } else if (oid != null && oid.length() > 0) {
                stm.setString(1, "%" + oid + "%");

            } else if (pid != null && pid.length() > 0) {
                stm.setString(1, "%" + pid + "%");

            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                BillDetail a = new BillDetail();
                a.setoID(rs.getString(2));
                a.setPid(rs.getString(1));
                a.setQuantity(rs.getInt(3));
                a.setMoney(rs.getDouble(4));
                a.setTotal(rs.getDouble(5));
                list.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<BillDetail> Display() {
        ArrayList<BillDetail> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM BillDetail ";
            PreparedStatement stm = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                BillDetail a = new BillDetail();
                a.setoID(rs.getString(2));
                a.setPid(rs.getString(1));
                a.setQuantity(rs.getInt(3));
                a.setMoney(rs.getDouble(4));
                a.setTotal(rs.getDouble(5));
                list.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public BillDetail getOne(String pid, String oid) {
        BillDetail a = new BillDetail();
        try {

            String sql = "SELECT * FROM BillDetail ";
            if (oid != null && oid.length() > 0 && pid != null && pid.length() > 0) {
                sql += " WHERE oid like ? and pid like ?";
                PreparedStatement stm = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);

                stm.setString(1, "%" + oid + "%");
                stm.setString(2, "%" + pid + "%");
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                    a = new BillDetail();
                    a.setoID(rs.getString(2));
                    a.setPid(rs.getString(1));
                    a.setQuantity(rs.getInt(3));
                    a.setMoney(rs.getDouble(4));
                    a.setTotal(rs.getDouble(5));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public ArrayList<BillDetail> getBillByCustomer(String username, String oid, String pid) {
        String sql = "SELECT bd.oID,b.dateCreate,p.pname,bd.price,bd.quantity,bd.total \n"
                + "FROM Bill b left join Customer c on b.cid = c.cid\n"
                + "			left join BillDetail bd on b.oID = bd.oID\n"
                + "			left join Product p on bd.pid = p.pid \n";
        if (username != null && username.length() > 0
                && oid != null && oid.length() > 0
                && pid != null && pid.length() > 0) {
            sql += " Where c.username = ? AND b.oid = ? AND p.pid = ?";
        } else if (oid != null && oid.length() > 0) {
            sql += " WHERE bd.oid = ?";
        } else if (username != null && username.length() > 0) {
            sql += " WHERE c.username = ?";
        } else if (pid != null && pid.length() > 0) {
            sql += " WHERE p.pid = ?";
        }

        ArrayList<BillDetail> list = new ArrayList<>();
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            if (username != null && username.length() > 0
                    && oid != null && oid.length() > 0
                    && pid != null && pid.length() > 0) {
                stm.setString(1, username);
                stm.setString(2, oid);
                stm.setString(3, pid);
            } else if (oid != null && oid.length() > 0) {
                stm.setString(1, oid);

            } else if (username != null && username.length() > 0) {
                stm.setString(1, username);
            } else if (pid != null && pid.length() > 0) {
                stm.setString(1, pid);
            }

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Bill b = new Bill();
                b.setCustomer(new DAOCustomer1(new DBConnect()).getOneByUsername(username));
                b.setDateCreate(rs.getString("dateCreate"));
                Product p = new Product();
                p.setPname(rs.getString("pname"));
                BillDetail bd = new BillDetail();
                bd.setoID(rs.getString("oid"));
                bd.setProduct(p);
                bd.setMoney(rs.getDouble("price"));
                bd.setQuantity(rs.getInt("quantity"));
                bd.setTotal(rs.getDouble("total"));
                bd.setBill(b);
                list.add(bd);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOBillDetail.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        DAOBillDetail dao = new DAOBillDetail(dbconn);
//        ArrayList<BillDetail> list =  dao.sortByPID();
//        for(BillDetail b :list){
//            System.out.println(b);
//        }

//        ArrayList<Customer> cuss;
//        ArrayList<ArrayList> listOfAll = dao.getAllList("1", "");
//        ArrayList<Category> products = listOfAll.get(2);
//        Category p = products.get(3);
//        System.out.println(p);
//        BillDetail b = new BillDetail("p122", "1", 100, 100000, 1000000);
//        System.out.println(dao.addBillDetail(b));;
//        System.out.println(dao.getOne("2", "1"));
        for (BillDetail b : dao.getBillByCustomer("nmh123", "", "")) {
            System.out.println(b.getBill().getCustomer().getUsername());
        }
    }
}
