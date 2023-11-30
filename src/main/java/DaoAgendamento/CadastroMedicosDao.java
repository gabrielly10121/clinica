/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;

import EntidadesAgendamento.Medicos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class CadastroMedicosDao {
    
    public void medicos (Medicos medicos ) throws SQLException{
        
        Connection cdm= DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        
        String sql = "INSERT INTO Medicos (CODIGO_MEDICO, NOME_MEDICO, CODIGO_ESPECIALIDADE, CRM) "
                + "VALUES (?,?,?,?)";
        PreparedStatement ps = null;
        
       
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, medicos.getcodigo_medico());
            ps.setString(2, medicos.getnome_medico());
            ps.setInt(3, medicos.getcodigo_especialidade());
            ps.setString(4, medicos.getcrm());
            ps.execute();
            ps.close();
        
        }
    }

    