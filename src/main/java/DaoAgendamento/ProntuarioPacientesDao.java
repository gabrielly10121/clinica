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
    
    Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
    
    public void protuariopaciente (ProntuarioPaciente prontuariopaciente ) throws SQLException{
        String sql = "INSERT INTO USUARIO (REGISTRO, REGISTRO_AGENDA, HISTORICO, RECEITUARIO, EXAME) "
                + "VALUES (?,?,?,?,?)";
        PreparedStatement ps = null;
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, prontuariopaciente.getregistro());
            ps.setInt(2, prontuariopaciente.getregistro_agenda());
            ps.setString(3, prontuariopaciente.gethistorico());
            ps.setString(4, prontuariopaciente.getreceituario());
            ps.setString(5, prontuariopaciente.getexame());
            ps.execute();
            ps.close();
        }
    }

   