import java.sql.Connection;
import java.sql.DriverManager;
public class sqlconnection {
	public static void main(String[] args) {
		Connection con=null;
		try {
			con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlconnection","root","root");
			if (con!=null) {
				System.out.println("database is chonnected");
			}
		}catch(Exception e){
			System.out.println("not connected");
		}
	}
}
