/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BillBuy;
import model.Providers;
import model.machineBuy;

/**
 *
 * @author Admin
 */
public class machineBuyDAO extends DBContext {

    public ArrayList<machineBuy> list() {
        ArrayList<machineBuy> buy = new ArrayList<>();
        try {
            String sql = "select l.seri,l.nameMachine,l.IDBillBuy, l.model,l.price, lb.dateInput,l.newness, pv.Name as pname from listBuy l\n"
                    + "                    join listBillBuy lb on l.IDBillBuy = lb.id\n"
                    + "                    join Provider pv on pv.id = lb.ProviderID";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Providers pv = new Providers();
                pv.setName(rs.getString("pname"));
                machineBuy d = new machineBuy();
                d.setName(rs.getString("nameMachine"));
                d.setModel(rs.getString("model"));
                d.setSeri(rs.getString("seri"));
                d.setPrice(rs.getInt("price"));
                d.setNewness(rs.getInt("newness"));
                BillBuy bb = new BillBuy();
                bb.setId(rs.getInt("idbillbuy"));
                bb.setDateinput(rs.getDate("dateInput"));
                bb.setProv(pv);
                d.setBb(bb);
                buy.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(machineBuyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buy;
    }

    public machineBuy getBuybySeri(String seri) {
        try {
            String sql = "SELECT [IDBillBuy]\n"
                    + "      ,[Seri]\n"
                    + "      ,[nameMachine]\n"
                    + "      ,[model]\n"
                    + "      ,[Price]\n"
                    + "      ,[Newness]\n"
                    + "      ,[Depreciation]\n"
                    + "  FROM [listBuy]\n"
                    + "WHERE Seri = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, seri);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                machineBuy mb = new machineBuy();
                mb.setBillbuy_id(rs.getInt("IDBillBuy"));
                mb.setSeri(rs.getString("Seri"));
                mb.setName(rs.getString("nameMachine"));
                mb.setModel(rs.getString("model"));
                mb.setPrice(rs.getInt("Price"));
                mb.setNewness(rs.getInt("Newness"));
                mb.setDepreciation(rs.getInt("Depreciation"));
                return mb;
            }
        } catch (SQLException ex) {
            Logger.getLogger(machineBuyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insert(machineBuy mb) {
        try {
            String sql = "INSERT INTO [listBuy]\n"
                    + "           ([IDBillBuy]\n"
                    + "           ,[Seri]\n"
                    + "           ,[nameMachine]\n"
                    + "           ,[model]\n"
                    + "           ,[Price]\n"
                    + "           ,[Newness]\n"
                    + "           ,[Depreciation])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, mb.getBillbuy_id());
            stm.setString(2, mb.getSeri());
            stm.setString(3, mb.getName());
            stm.setString(4, mb.getModel());
            stm.setInt(5, mb.getPrice());
            stm.setInt(6, mb.getNewness());
            stm.setInt(7, mb.getDepreciation());
            stm.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    public void update(machineBuy mb, String seri) {
        try {
            String sql = "UPDATE [listBuy]\n"
                    + "   SET [IDBillBuy] = ?\n"
                    + "      ,[Seri] = ?\n"
                    + "      ,[nameMachine] = ?\n"
                    + "      ,[model] = ?\n"
                    + "      ,[Price] = ?\n"
                    + "      ,[Newness] = ?\n"
                    + "      ,[Depreciation] = ?\n"
                    + " WHERE Seri = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, mb.getBillbuy_id());
            stm.setString(2, mb.getSeri());
            stm.setString(3, mb.getName());
            stm.setString(4, mb.getModel());
            stm.setInt(5, mb.getPrice());
            stm.setInt(6, mb.getNewness());
            stm.setInt(7, mb.getDepreciation());
            stm.setString(8, seri);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(machineBuyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
