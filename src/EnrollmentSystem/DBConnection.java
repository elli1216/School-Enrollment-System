/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnrollmentSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author elli
 */
public class DBConnection {
    
    //this database in from microsoft sql server
    static final String url = "jdbc:sqlserver://DESKTOP-8F9F0I1;Database=SMS;encrypt=true;trustServerCertificate=true;IntegratedSecurity=true";
    static final String username = "sa";
    static final String password = "1216";
    
    public static Connection getConnection() {

        
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return con;
    }
}
