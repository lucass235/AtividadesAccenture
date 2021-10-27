import java.lang.Exception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SQLExceptionActivity {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/activity1";
		String user = "root";
		String pass = "abcd1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established! \n");
			cn.close();
		} catch (ClassNotFoundException e) {
			System.err.println("Classe nao encontrada!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Obrigado por usar nosso programa");
		}
	}
}
