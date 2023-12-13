/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;

import EntidadesAgendamento.ProntuarioPaciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class ProntuarioPacientesDao {

    private Connection con;
    
         public void cadastrar (ProntuarioPaciente prontuariopaciente ) throws SQLException{
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
    
   
        String sql = "INSERT INTO USUARIO (REGISTRO, REGISTRO_AGENDA, HISTORICO, RECEITUARIO, EXAME) "
                + "VALUES (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, prontuariopaciente.getRegistro());
            ps.setInt(2, prontuariopaciente.getRegistroAgenda());
            ps.setString(3, prontuariopaciente.gethistorico());
            ps.setString(4, prontuariopaciente.getreceituario());
            ps.setString(5, prontuariopaciente.getexame());
            ps.executeUpdate();
            con.close();
        }
         
          public void alterar (ProntuarioPaciente prontuariopaciente ) throws SQLException{
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
    
   
        String sql = "INSERT INTO USUARIO (REGISTRO, REGISTRO_AGENDA, HISTORICO, RECEITUARIO, EXAME) "
                + "VALUES (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, prontuariopaciente.getRegistro());
            ps.setInt(2, prontuariopaciente.getRegistroAgenda());
            ps.setString(3, prontuariopaciente.gethistorico());
            ps.setString(4, prontuariopaciente.getreceituario());
            ps.setString(5, prontuariopaciente.getexame());
            ps.executeUpdate();
            con.close();
        }
          
           public void excluir (ProntuarioPaciente prontuariopaciente ) throws SQLException{
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
    
   
        String sql = "INSERT INTO USUARIO (REGISTRO, REGISTRO_AGENDA, HISTORICO, RECEITUARIO, EXAME) "
                + "VALUES (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, prontuariopaciente.getRegistro());
            ps.setInt(2, prontuariopaciente.getRegistroAgenda());
            ps.setString(3, prontuariopaciente.gethistorico());
            ps.setString(4, prontuariopaciente.getreceituario());
            ps.setString(5, prontuariopaciente.getexame());
            ps.executeUpdate();
            con.close();
        }
           
            public void salvar (ProntuarioPaciente prontuariopaciente ) throws SQLException{
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
    
   
        String sql = "INSERT INTO USUARIO (REGISTRO, REGISTRO_AGENDA, HISTORICO, RECEITUARIO, EXAME) "
                + "VALUES (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, prontuariopaciente.getRegistro());
            ps.setInt(2, prontuariopaciente.getRegistroAgenda());
            ps.setString(3, prontuariopaciente.gethistorico());
            ps.setString(4, prontuariopaciente.getreceituario());
            ps.setString(5, prontuariopaciente.getexame());
            ps.executeUpdate();
            con.close();
        }
}
    

   