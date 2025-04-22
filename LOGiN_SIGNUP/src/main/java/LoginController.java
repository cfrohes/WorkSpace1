

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
		public void service(HttpServletRequest req, HttpServletResponse res)  {
			
		//get parameters from read string and call model
		try {
		String name=req.getParameter("name");
		String pwd = req.getParameter("pwd");
		ModelComponent component = new ModelComponent();
		
		boolean result=component.loginUser(name, pwd);
		if(result==true) {
			res.sendRedirect("/LOGiN_SIGNUP/dashboard.html");
		} else {
		res.sendRedirect("/LOGiN_SIGNUP/loginFailhtm");
		}
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		}
}

