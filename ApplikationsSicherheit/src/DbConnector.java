
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
	
	public class DbConnector {
		private static DbConnector instance = new DbConnector();
		public static final String URL = "jdbc:mysql://127.0.0.1/login";
		public static final String USER = "root";
		public static final String PASSWORD = "Gg24682468";
	    public static void main(String args[]){

	        Connection conn = null;
	        java.sql.Statement stmt = null;
	        ResultSet rs = null;


	        try {
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);
System.out.println("SUCCESS");
	            // Do something with the Connection
	            stmt = conn.createStatement();
	            rs = stmt.executeQuery("SELECT * FROM users");
	            int test = rs.findColumn(USER);

	            System.out.println(test);

	        } catch (SQLException ex) {
	            // handle any errors
	            System.out.println("SQLException: " + ex.getMessage());
	            System.out.println("SQLState: " + ex.getSQLState());
	            System.out.println("VendorError: " + ex.getErrorCode());
	        }
	    }
	}  
