package com.funda.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Model3Conn {
	private static String url = "jdbc:mysql://211.253.8.161:3306";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "model3";     
    private static String password = "funda9123";  
    private static Connection con;
    
    
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println("��񿬰ῡ ����!"); 
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found."); 
        }
        return con;
    }

}
