import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtilityclass {
	 static {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver is registered");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

	    public static Connection getDBConnection() throws SQLException {

	        String url = "jdbc:mysql://localhost:3306/jdbclearning";
	        String userName = "root";
	        String password = "sujith";

	        return DriverManager.getConnection(url, userName, password);
	    }

	    public static void closeResource(Connection connect, Statement pstmt ) throws SQLException {

	        if (connect != null)
	            connect.close();
	        if(pstmt!= null)
	        		pstmt.close();
	    }
}
