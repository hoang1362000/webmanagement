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

/**
 *
 * @author Admin
 */
public class BillBuyDAO extends DBContext{
    public ArrayList<BillBuy> getallBillBuy() {
        ArrayList<BillBuy> billbuy = new ArrayList<>();
        try {
            String sql = "select * from listBillBuy";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                BillBuy bb = new BillBuy();
                bb.setId(rs.getInt("id"));
                bb.setDateinput(rs.getDate("DateInput"));
                billbuy.add(bb);
            }
        } catch (SQLException ex) {
        }
        return billbuy;
    }
    public void insert(BillBuy bb) {
        try {
            String sql = "INSERT INTO [listBillBuy]\n"
                    + "           ([id]\n"
                    + "           ,[DateInput]\n"
                    + "           ,[ProviderID])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, bb.getId());
            stm.setDate(2, bb.getDateinput());
            stm.setInt(3, bb.getProv().getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("error");
        }
    }
}
