

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Secondservelt")
public class Secondservelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Th static servelt is started ");
	}
	
	public Secondservelt(){
		System.out.println("The constructor methood is called bro !");
	}
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("The system is instalized !");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("The server response will handle back the server response bro !");
	}
	
	public void destroy() {
		
	}

}
