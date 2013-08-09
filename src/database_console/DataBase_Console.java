/*
 * This is my version of the VetSvcs UPC Database
 */
package database_console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Tyson Maurice Price
 */
public class DataBase_Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     try {   
        String host = "jdbc:derby://localhost:1527/Products";
        String uName = "tyson";
        String uPass = "gaston";
        Connection con = DriverManager.getConnection(host, uName, uPass);// TODO code application logic here
    
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM PROD_DESC";
        ResultSet rs = stmt.executeQuery(sql);
        
        rs.next();
        int UPC_CODE_col = rs.getInt("UPC_Code");
        String Manu_Info = rs.getString("Manu_Info");
        String Date_Found = rs.getString("Date_Found");
        String EST = rs.getString("EST");
        String Prod_Name = rs.getString("Prod_Name");
        String Prod_Code = rs.getString("Prod_Code");
        
        String p;
         p = UPC_CODE_col + " " + Manu_Info + " " + Date_Found + " " + EST + " " + Prod_Name + " " + Prod_Code;
        System.out.println(p);
     }
    catch (SQLException err) {
        System.out.println(err.getMessage());
    }
   }
}
