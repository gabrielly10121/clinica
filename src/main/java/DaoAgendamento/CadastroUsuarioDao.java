/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;

import EntidadesAgendamento.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class CadastroUsuarioDao {
    
    public void usuario (Usuario usuario ) throws SQLException{
        
        Connection cdu= DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        
        String sql = "INSERT INTO Usuario (REGISTRO_USUARIO, IDENTIFICACAO_USUARIO, SENHA_ACESSO, CADASTRO_FUNCIONARIO, CADASTRO_PACIENTE"
                + " CADASTRO_ESPECIALIDADE, CADASTRO_MEDICO, AGENDAMENTO_CONSULTA, MODULO_ADMINISTRATIVO, MODULO_AGENDAMENTO, MODULO_ATENDIMENTO) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, usuario.getregistro_usuario());
            ps.setString(2, usuario.getidentificacao_usuario());
            ps.setString(3, usuario.getsenha_acesso());
            ps.setString(4, usuario.getcadastro_funcionario());
            ps.setString(5, usuario.getcadastro_usuario());
            ps.setString(6, usuario.getcadastro_paciente());
            ps.setString(7, usuario.getcadastro_especialidade());
            ps.setString(8, usuario.getcadastro_medico());
            ps.setString(9, usuario.getagendamento_consulta());
            ps.setString(10, usuario.getcancelamento_consulta());
            ps.setString(11, usuario.getmodulo_administrativo());
            ps.setString(12, usuario.getmodulo_agendamento());
            ps.setString(13, usuario.getmodulo_atendimento());
            ps.execute();
            ps.close();
        }
    }

  