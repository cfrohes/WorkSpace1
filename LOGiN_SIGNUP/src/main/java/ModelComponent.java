

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ModelComponent
 */
@WebServlet("/ModelComponent")
public class ModelComponent {
	String dpath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/amazon?user=root&password=root";
	Connection con = null;
	PreparedStatement ps1=null;
	PreparedStatement ps2=null;
	String sql="insert into users values(?,?,?,?,?)";
	String sql2="select * from users where name=? and pwd=?";
	ResultSet rs=null;
	int res=0;
	
	public ModelComponent() {
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection (url);
		} catch (Exception e) {
	e.printStackTrace();
		}
	}
	
	public int storeUser(int id, String pwd, String name, String email, String phone) {
	    int res = 0;
	    try {
	    	 System.out.println("Preparing to execute SQL query...");
	         ps1 = con.prepareStatement(sql); // Initialize PreparedStatement
	         System.out.println("PreparedStatement initialized.");
	        // I store all the data in the user table of Amazon
	        ps1.setInt(1, id);
	        ps1.setString(2, pwd);
	        ps1.setString(3, name);
	        ps1.setString(4, email);
	        ps1.setString(5, phone);
	        res = ps1.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return res;
	}

	public boolean loginUser(String name, String pwd) {
	    try {
	        ps2 = con.prepareStatement(sql2);
	        ps2.setString(1, name);
	        ps2.setString(2, pwd);
	        rs = ps2.executeQuery();
	        if (rs.next()) {
	            return true;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}
}