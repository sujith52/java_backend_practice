import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model 
{
	private String name ;
	private String email;
	private String upassword;
	private String city;
	private Connection connect;
	private PreparedStatement pstmt = null;
	int row;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int register() 
	{
		try {
			connect = JDBCUtilityclass.getDBConnection();
			String sql="INSERT INTO userinfo(uname,email,upassword,ucity) VALUES(?,?,?,?)";
			pstmt = connect.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, upassword);
			pstmt.setString(4, city);
			
			 row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				JDBCUtilityclass.closeResource(connect, pstmt);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return row;
	}
	
}
