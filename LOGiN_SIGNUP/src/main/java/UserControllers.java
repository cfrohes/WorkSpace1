


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserControllers
 */
@WebServlet("/UserControllers")
public class UserControllers extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
	try {
	String id=req.getParameter("id");
	int cid=Integer.parseInt(id);
	String pwd=req.getParameter ("pwd");
	String name=req.getParameter ("name");
	String email=req.getParameter("email");
	String phone=req.getParameter("phone");
	ModelComponent component=new ModelComponent();//VERY IMPORTANT
	int result=component.storeUser(cid, pwd, name, email, phone);
	if (result == 1) {
		res.sendRedirect("/LOGiN_SIGNUP/Regsuccess.html");
	} else {
		res.sendRedirect("/LOGiN_SIGNUP/Regfailure.html");
	}
	}
	catch (Exception e) {
	e.printStackTrace();

	}
	}

}
