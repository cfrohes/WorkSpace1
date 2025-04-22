

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Greet")
public class Greet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
		String name = req.getParameter("un");
		PrintWriter pw = res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head><title>Names</title></head>");
		pw.println("<body>");
		pw.println("<p> HELLO "+ name +" WELCOME TO THE FROHES WORLD ");
		pw.println("</body>");
		pw.println("</html>");
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
