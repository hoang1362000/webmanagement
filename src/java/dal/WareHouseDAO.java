/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.WareHouse;

/**
 *
 * @author Admin
 */
public class WareHouseDAO extends DBContext{
        public ArrayList<WareHouse> getallWareHouse(){
        ArrayList<WareHouse> wh = new ArrayList<>();
        try {
            String sql = "select * from warehouse";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                WareHouse listwh = new WareHouse();
                listwh.setSeri(rs.getString("Seri"));
                wh.add(listwh);
            }
        } catch (Exception e) {
        }
        return wh;
    }
}
