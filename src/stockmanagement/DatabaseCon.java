/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasas
 */
public class DatabaseCon {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/Stockmanagement";
    String username = "root";
    String password = "";
    
    public Connection connect(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            con = DriverManager.getConnection(url,username,password);
            //JOptionPane.showMessageDialog(null, "Connected");
            return con;
        } catch (SQLException e) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
}

