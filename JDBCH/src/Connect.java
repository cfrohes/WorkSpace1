import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
			//STEP-1 LOAD THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loading....");
			
			//STEP-2 ESTABLISH CONNECTION
			
			//Connection con = DriverManager.getConnection("jdbc://localhost:3306/julyjdbc", "root", "root");
			String url = "jdbc:mysql://localhost:3306/julyjdbc";
            String username = "root";
            String password = "root";

            // Establishing the connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established..");
		
            //STEP-3 STATEMENT CREATED
            stmt = con.createStatement();
            System.out.println("Statement medium created..");
            
            //STEP-4 QUERYING
             String sql = "select * from kodnest";
              rs = stmt.executeQuery(sql);
             System.out.println("Quary executed and result in java..");
            
             
             //STEP-5 DISPLAYING THE RESULT
             
             System.out.println("ID" + " | " + "NAME" + " | " + "MARKS");
             while(rs.next()) {
            	 System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3));
             }
             
             
             
            
             
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				 //STEP-6 CLOSE THE RESOURSES
	             con.close();
	             stmt.close();
	             rs.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
        
	}

}
