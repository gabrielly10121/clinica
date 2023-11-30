/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;

import EntidadesAgendamento.Especialidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class CadastroEspecialidadeDao {
    
    public void especialidade (Especialidades especialidade ) throws SQLException{
        
        Connection cde= DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        
        String sql = "INSERT INTO Especialidade (CODIGO_ESPECIALIDADE, DESCRICAO_ESPECIALIDADE) "
                + "VALUES (?,?)";
        PreparedStatement ps = null;
        
       
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, especialidade.getcodigo_especialidade());
            ps.setString(2, especialidade.getdescricao_especialidade());
            ps.execute();
            ps.close();
        
        }
    }
    
}
