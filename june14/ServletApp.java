

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("The servelt is getting started bro !");
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		if("sujith".equals(name) && "madanapalle".equals(city)) {
		    System.out.println("This is the correct sujith logged in");
		} else {
		    System.out.println("He is not the right user bro");
		}
	}

}
