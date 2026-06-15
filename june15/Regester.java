

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@WebServlet("/Regester")
public class Regester extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("It was in the control of the servlet");
		
		String name = request.getParameter("uname");
		String emailid = request.getParameter("uemail");
		String upassword = request.getParameter("upassword");
		String city = request.getParameter("ucity");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbclearning";
			String user = "root";
			String unpassword ="sujith";
			Connection connect = DriverManager.getConnection(url, user,unpassword );
			
			String sql ="INSERT INTO userinfo(uname,email,upassword,ucity) VALUES(?,?,?,?)";
			 PreparedStatement  pstmt = connect.prepareStatement(sql);
			 pstmt.setString(1, name);
			 pstmt.setString(2, emailid);
			 pstmt.setString(3, upassword);
			 pstmt.setString(4, city);
			 
			 int rowseffected = pstmt.executeUpdate();
			 PrintWriter wrtr = response.getWriter();
			 if(rowseffected == 0) {
				 wrtr.println("<h1>The operation was failed </h1>");
				 
			 } else {
				 wrtr.println("<h1>The operation was sucess </h1>");
			 }
			 connect.close();
			 pstmt.close();
			 } catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
