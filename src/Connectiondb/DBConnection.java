/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connectiondb;

import java.sql.*;
import javax.swing.JOptionPane;


public class DBConnection {
    Connection dbconnection;
    
    public static Connection Connectdb(){ 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection dbconnection = DriverManager.getConnection("jdbc:mysql://localhost/db_debating_app", "root", "");
            return dbconnection;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}