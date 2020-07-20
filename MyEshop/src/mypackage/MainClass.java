package mypackage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Customer;

public class MainClass {
   

    public static void main(String[] args) {
        
            Database db = new Database();
            //read customers
            ResultSet rs = db.getResults("SELECT * FROM customers;");
            printCustomerResults(rs);
            //read sales
            rs = db.getResults("SELECT * FROM sales;");
            printSalesResults(rs);
            
            //read one 
            ResultSet rs2 = db.getOneResult("Customers", 2);
            printCustomerResults(rs2);
            
            //read one result with variable field
            rs2 =db.getOneResultByField("Sales" ,"products_id", "1");
             printSalesResults(rs2);
            
             //insert at customers
//             public static int insertRecordToCustomers(String first_name,String last_name,String email)
//             public static int insertRecordToCustomers(Customer customer)

             Customer customer = new Customer(0,"George","Pasparakis","paspa@hotmail.com");
            // System.out.println("Records inserted: "+insertRecordToCustomers(customer, db) );
             rs = db.getResults("SELECT * FROM customers;");
             printCustomerResults(rs);
             
             //UPDATE `Customers` SET `email` = 'paspa2@hotmail.com' WHERE `email` = 'paspa@hotmail.com'
             //UPDATE `Customers` SET `email` = ? WHERE `email` = ?
             //public static int updateRecordFromCustomersWithEmail(String newEmail, String oldEmail,Database db)
             String query = "UPDATE `Customers` SET `email` = ? WHERE `email` = ?";
             String newEmail = "paspa2@hotmail.com";
             String oldEmail = "paspa@hotmail.com";
             int result = updateRecordFromCustomersWithEmail(query, newEmail, oldEmail, db);
             System.out.println("Records updated : "+ result);
    }

    
    public static int insertRecordToCustomers(Customer customer,Database db){
        int result =0;
        String customer_data = "'"+customer.getFirst_name()+"'"+","+ "'"+customer.getLast_name()+"'"+","+"'"+customer.getEmail()+"'";
       String sql = "INSERT INTO `Customers` (`first_name`,`last_name`,`email`) VALUES ("+ customer_data+");";
       db.setStatement();
       Statement st = db.getStatement();
        try {
            result = st.executeUpdate(sql);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        }
    }
    
    
    public static int deleteRecordFromCustomersWithId(int id,Database db){
        int result =0;       
       String sql = String.format("DELETE FROM `Customers` WHERE `id` = '%d'",id );
       db.setStatement();
       Statement st = db.getStatement();
        try {
            result = st.executeUpdate(sql);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        }
    }
    
    
    
    public static void printCustomerResults(ResultSet rs){
        try {
//            rs.last(); // phgainw sthn teytaia grammh
//            System.out.println("Rows : " + rs.getRow());
         //   rs.first(); // phgainw sthn prwth grammi
            while (rs.next()){
                System.out.println("Customer's id: " + rs.getString(1)
                    + " ,First Name: " + rs.getString(2)
                    + " ,Last Name: " + rs.getString(3)
                    + " Email: " + rs.getString(4));        
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public static void printSalesResults(ResultSet rs){
         try {
//            rs.last(); 
//            System.out.println("Rows : " + rs.getRow());
          //  rs.first(); 
            while(rs.next()){
                System.out.println("Sale's id: "    + rs.getString(1)
                    + " ,Customer's id: "       + rs.getString(2)
                    + " ,Product's id: "        + rs.getString(3)
                    + " Quantity: "             + rs.getString(4)   
                    + " Unit Price: "           + rs.getString(5)
                    + " Purchase Date & Time: " + rs.getString(6)); 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
public static int updateRecordFromCustomersWithEmail(String query,String newEmail,String oldEmail,Database db){
    int result = 0;
        try {            
            //Step 1 via connection prepare the PreparedStatement(pst)
            //String query = "UPDATE `Customers` SET `email` = ? WHERE `email` = ?";
            db.setPreparedStatement(query);
            //Step 2 get the pst via Database db
            PreparedStatement pst = db.getPreparedStatement();
            //Step 3 set the parameteres
            pst.setString(1, newEmail);
            pst.setString(2, oldEmail);
            // Step 4 execute (update) query
            result = pst.executeUpdate();
            return result;         
        } catch (SQLException ex) {          
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        }
}
    
    
   
    
}

//       Product product = new Product();
//       Sale sale = new Sale();
//       
//       List<Customer> customers = new ArrayList<Customer>();
//       List<Product> products = new ArrayList<Product>();
//       List<Sale> sales = new ArrayList<Sale>();
