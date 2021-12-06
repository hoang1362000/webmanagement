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
import model.Providers;

/**
 *
 * @author Admin
 */
public class ProvidersDAO extends DBContext {

    public ArrayList<Providers> list() {
        ArrayList<Providers> provider = new ArrayList<>();
        try {
            String sql = "select * from provider";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Providers pv = new Providers();
                pv.setId(rs.getInt("id"));
                pv.setName(rs.getString("name"));
                pv.setAddress(rs.getString("address"));
                provider.add(pv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProvidersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return provider;
    }

}
