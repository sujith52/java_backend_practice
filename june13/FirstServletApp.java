

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/FirstServlet")
public class FirstServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		PrintWriter writer = response.getWriter();		
		
//		writer.println("Hello "+ name);
//		writer.println("I know you are from "+city);
		
		writer.println("<html><head><title>Hello bro </title></head>");
		writer.println("<body><h1>The name is : "+name+"</h1><h1>The City is :"+city+"</h1></body>");
		writer.println("</html>");
		
		writer.close();
		
	}

}
