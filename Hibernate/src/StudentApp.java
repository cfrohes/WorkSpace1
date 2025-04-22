import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentApp {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/julyjdbc?user=root&password=root";
		Student s = new Student(6, 124, "Dharshana", 22);
		String sql = "insert into Kodnest values(?,?,?)";
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			ps.setInt(1, s.id);
			//ps.setInt(2, s.pwd);
			ps.setString(2, s.name);
			ps.setInt(3,s.age);
			
			int nora = ps.executeUpdate();
			System.out.println(nora);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
