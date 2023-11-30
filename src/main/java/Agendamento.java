import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Agendamento {
	
	static String senha = "root";
	static String usuario = "root";
	static String host = "jdbc:mysql://localhost:3306/";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(host, usuario, senha);		
	}

}