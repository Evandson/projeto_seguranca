/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Evandson
 */
public class ConnectionFactory {
    
    public static Connection getConnection(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                return (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/appseg", "root", "root");
            } catch (SQLException e) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
            } catch (ClassNotFoundException e){
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
                throw new RuntimeException("Erro ClassNotFoundException em ConnectionFactory", e);
            }
        return null;
    }   
}