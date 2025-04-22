import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SendRedirect")
public class SendRedirect extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.sendRedirect("Hello.html");
		}catch (Exception e) {
			e.printStackTrace();
		}
		}

}
