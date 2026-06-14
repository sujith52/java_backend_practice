

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/SecondServelet")
public class SecondServelet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter wrti = response.getWriter();
			wrti.println("</h1>This is the reponse from the servlet 2 bro</h1>");
			wrti.close();
		}

}
