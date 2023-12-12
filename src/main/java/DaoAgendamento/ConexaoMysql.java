/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class ConexaoMysql {
    
    static String senha = "root";
	static String usuario = "root";
	static String host = "jdbc:mysql://localhost:3306/ClinicaMedica";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(host, usuario, senha);		
	}

}
    

