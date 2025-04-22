import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchingData {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/julyjdbc";
		String username = "root";
		String password = "root";
		String sql = "select * from kodnest where id=?";
		try {
			
			//STEP - 1 LOADING DRIVERS
			Class.forName(path);
			
			//STEP - 2 ESTABLISHING CONNECTIONS
			con = DriverManager.getConnection(url, username, password);
			
			
			//STEP - 3 CREATING PREPARED_STATEMENT
			ps = con.prepareStatement(sql);
			int id = sc.nextInt();
			ps.setInt(1, id);
			
			//STEP - 4 QUERING
			rs = ps.executeQuery();
			
			//STEP - 5 DISPLAY THE RESULT
			if(rs.next()) {
				System.out.println(rs.getInt(1) + " " +rs.getString(2)+ " " + rs.getInt(3));
				
			}else {
				System.out.println("INCORRECT USER ID");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				ps.close();
				rs.close();
				sc.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
