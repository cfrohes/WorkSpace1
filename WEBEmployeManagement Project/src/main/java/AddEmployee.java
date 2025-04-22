

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String designation = req.getParameter("designation");
		String salary = req.getParameter("salary");
		PreparedStatement ps = null;
		Connection con = null;
		
		String dburl = "jdbc:mysql://localhost:3360/employeejdbcproject?user=root&password=root"; 
		String sql = "insert into employee (id, name, designation, salary) values(?, ?, ?, ?)";
		
		try {
			con = DriverManager.getConnection(dburl);
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, designation);
            ps.setString(4, salary);
			
            

            int result = ps.executeUpdate();
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            if (result > 0) {
                out.println("<h1>Employee added successfully!</h1>");
            } else {
                out.println("<h1>Failed to add employee.</h1>");
            }
            
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
