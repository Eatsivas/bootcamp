
package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vagos
 */
public class Database {
     //  ο  server  που θελουμε να συνδεθουμε

    private static final String DB_URL = "localhost:3306";
    //  πανε μεσω jdbc στη mysql(εδω αναλογα τη βαση πχ sqlserver,mysql κτλ) και μπες στο database eshop
    private static final String FULL_DB_URL = "jdbc:mysql://" + DB_URL + "/eshop?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
    // στοιχεια χρηστη 
    private static final String DB_USER = "root";
    private static final String DB_PASSWD = "Turin1985!";
    private static Connection connection = null;
    private static Statement statement = null;
    private static PreparedStatement pst = null;
    
    
    public Database(){  
        getConnection();
    }
    
    
    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(FULL_DB_URL, DB_USER, DB_PASSWD);
            return connection;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;  
        }      
    }
    
//         allos tropos gia exception (pio swstos)
    
//    public static Connection getConnection2() throws SQLException {
//    connection = DriverManager.getConnection(FULL_DB_URL, DB_USER, DB_PASSWD);
//            return connection;
//    
//    }
     
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public static Statement getStatement() {
        return statement;
    }

    public static void setStatement() {       
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static PreparedStatement getPreparedStatement() {
        return pst;
    }

    public static void setPreparedStatement(String query) {
        try {
            pst = connection.prepareStatement(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
   public static ResultSet getResults(String query){
        try {
            setStatement();
            ResultSet rs = statement.executeQuery(query); 
             return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
   }
   
       public static ResultSet getOneResult(String tableName, int id){
         try {
            setStatement();
            String query = "SELECT * FROM `" + tableName +"` WHERE `id` = "+ id;
            ResultSet rs = statement.executeQuery(query); 
             return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
                                 // string giati kai to query dinei string opote kai oi arithmoi san string pane
   public static ResultSet getOneResultByField(String tableName ,String fieldName, String fieldValue){
       try {
            setStatement();
            String query = "SELECT * FROM `" + tableName +"` WHERE `"+ fieldName + "`="+ fieldValue;
            ResultSet rs = statement.executeQuery(query); 
             return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
   }
   
   
}
