/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Gabri
 */
public class AgendamentoDao {

    
    
       private static final String url = "jdbc:mysql://localhost:3306/Clinica";
       private static final String user = "root";
       private static final String password = "root";
       
       private static Connection conn;
       public static Connection getAgendamentoDao(){
           
           return null;
           try{
           if(conn == null){
           }else {
               try {
                   conn = DriverManager.getConnection(url, user, password);
                   return conn;
               
               } catch (SQLException ex) {
                   Logger.getLogger(AgendamentoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           
           return null;
           
       }
       
    }
}



    