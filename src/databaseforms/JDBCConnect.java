package databaseforms;

import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class performs all the interactions between the JDBC and MySQL DB,
 * including managing the connection and querying the DB.
 * @author Madison Liddell
 */
public class JDBCConnect 
{
     // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/RealFakeEstate";
    //  Database credentials
    private static final String USER = "user";
    private static final String PASS = "pass";
    Connection conn;
    
    // Load the driver and connect to the DB
    JDBCConnect()
    {
        try {
            Class.forName(JDBC_DRIVER).newInstance();
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Close the connection
    void disconnect()
    {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
