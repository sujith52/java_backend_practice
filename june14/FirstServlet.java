

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("The frst servlet was dispatched bro !");
		
		response.setContentType("text/html");
		RequestDispatcher reqdispatch = request.getRequestDispatcher("/SecondServelet");
		
		reqdispatch.forward(request, response);
		
		PrintWriter wrtr = response.getWriter();
		wrtr.println("<h1>This was a response from servelt one bro !</h1>");
		wrtr.close();
	}

}
