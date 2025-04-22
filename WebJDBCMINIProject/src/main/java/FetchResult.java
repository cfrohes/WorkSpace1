

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchResult
 */
@WebServlet("/FetchResult")
public class FetchResult extends HttpServlet {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs =null;
	PrintWriter pw = null;
	String sql = "SELECT * FROM student WHERE id = ?";
	String dpath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/servlet?user=root&password=root";
//Initialization Logic	
	public void init() {
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Business Logic
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html");//multi purpouse mail extention
			
			pw =res.getWriter();
			String id = req.getParameter("id");
			int cid = Integer.parseInt(id);
			ps.setInt(1, cid);
			rs = ps.executeQuery();
			if (rs.next() == true) {
				pw.println("<!DOCTYPE html><html><head><title>Your RESULT!</title></head><center>");
				pw.println("<table border> <tr><th>ID</th><th>PASSWORD</th><th>NAME</th><th>AGE</th>");
				pw.println("<td>" + rs.getInt(1) + "</td><td>" +rs.getInt(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getInt(4));
				pw.println("</center></body></html>");
				
			}else {
				pw.println("<!DOCTYPE html><html><head><title>Your RESULT!</title></head><center><body>");
				pw.println("INVALID ID PLESE TRY AGAIN");
				pw.println("<a href='http://localhost:9090/WebJDBCMINIProject/'>CLICK HERE</center></body></html>");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Resourse CleanUp logic
	public void destroy() {
		try {
			con.close();
			ps.close();
			rs.close();
			pw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
