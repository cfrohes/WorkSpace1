

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	//INITIALIZATION
	public void init() {
		System.out.println("THIS IS INIT AND INIT EXECUTED");
	}
	//BUSINESS LOGIC
	public void service(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("THIS IS SERVER SERVING THE SERVICES");
	}
	//DESTROY LOGIC
	public void destroy() {
		System.out.println("THIS IS DESTROY AND EXECUTED");
	}

}
