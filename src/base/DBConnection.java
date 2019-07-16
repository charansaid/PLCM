package base;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.postgresql.PGConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Array;

public class DBConnection {

	// Connection object
       static PGConnection con = null;
       // Statement object
       public static Statement stmt;
       // Constant for Database URL
       public static String DB_URL = "jdbc:postgresql://localhost:5432/plcm";   

     // Constant for Database Username
       public static String DB_USER = "postgres";
       // Constant for Database Password
       public static String DB_PASSWORD = "root";
       @BeforeTest

       public void setUp() throws Exception {
              try{
                     // Make the database connection
                     String dbClass = "org.postgresql.Driver";
                     Class.forName(dbClass).newInstance();
                     System.out.print("Establishing the DB connectivity with PGSql server..."+"\n\n");
                     // Get connection to DB
                     Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                     System.out.print("DB connectivity established with PGSql server..."+"\n\n");
                     // Statement object to send the SQL statement to the Database
                     stmt = con.createStatement();
                     }
                     catch (Exception e)
                     {
                           e.printStackTrace();
                     }
       }
       @Test
       public void test() {
    	   int i = 0;
              try{
            	  System.out.print("Fetching the details from PGSql server..."+"\n\n");
              String query = "select * from entity_info";
//              String update = "update entity_info set entity_api_type ='SOAP' where entity_id='900'";
              
              // Get the contents of userinfo table from DB
              ResultSet res = stmt.executeQuery(query);
//              stmt.executeQuery(update);
              // Print the result untill all the records are printed
              // res.next() returns true if there is any next record else returns false
              while (res.next())
              {
                  for (i = 1; i <= 10 ;i++)
                		  {
            	  System.out.print(res.getString(1));
              System.out.print("\t" + res.getString(2));
                		  }
              }
              }
              catch(Exception e)
              {
                     e.printStackTrace();
              }     
       }

       @AfterTest
       public void tearDown() throws Exception {
              // Close DB connection
              if (con != null) {
            	  con.wait();
              }
       }
}