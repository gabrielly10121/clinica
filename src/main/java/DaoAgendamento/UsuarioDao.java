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
public class UsuarioDao {
    
    public void cadastrar (Usuario usuario ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Usuario (REGISTRO_USUARIO, IDENTIFICACAO_USUARIO, SENHA_ACESSO, CADASTRO_FUNCIONARIO, CADASTRO_PACIENTE"
                    + " CADASTRO_ESPECIALIDADE, CADASTRO_MEDICO, AGENDAMENTO_CONSULTA, MODULO_ADMINISTRATIVO, MODULO_AGENDAMENTO, MODULO_ATENDIMENTO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, usuario.getRegistroUsuario());
            ps.setString(2, usuario.getIdentificacaoUsuario());
            ps.setString(3, usuario.getSenhaAcesso());
            ps.setString(4, usuario.getCadastroFuncionario());
            ps.setString(5, usuario.getCadastroUsuario());
            ps.setString(6, usuario.getCadastroPaciente());
            ps.setString(7, usuario.getCadastroEspecialidade());
            ps.setString(8, usuario.getCadastroMedico());
            ps.setString(9, usuario.getAgendamentoConsulta());
            ps.setString(10, usuario.getCancelamentoConsulta());
            ps.setString(11, usuario.getModuloAdministrativo());
            ps.setString(12, usuario.getModuloAgendamento());
            ps.setString(13, usuario.getModuloAtendimento());
            ps.executeUpdate();
        }
        }
    public void alterar (Usuario usuario ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Usuario (REGISTRO_USUARIO, IDENTIFICACAO_USUARIO, SENHA_ACESSO, CADASTRO_FUNCIONARIO, CADASTRO_PACIENTE"
                    + " CADASTRO_ESPECIALIDADE, CADASTRO_MEDICO, AGENDAMENTO_CONSULTA, MODULO_ADMINISTRATIVO, MODULO_AGENDAMENTO, MODULO_ATENDIMENTO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, usuario.getRegistroUsuario());
            ps.setString(2, usuario.getIdentificacaoUsuario());
            ps.setString(3, usuario.getSenhaAcesso());
            ps.setString(4, usuario.getCadastroFuncionario());
            ps.setString(5, usuario.getCadastroUsuario());
            ps.setString(6, usuario.getCadastroPaciente());
            ps.setString(7, usuario.getCadastroEspecialidade());
            ps.setString(8, usuario.getCadastroMedico());
            ps.setString(9, usuario.getAgendamentoConsulta());
            ps.setString(10, usuario.getCancelamentoConsulta());
            ps.setString(11, usuario.getModuloAdministrativo());
            ps.setString(12, usuario.getModuloAgendamento());
            ps.setString(13, usuario.getModuloAtendimento());
            ps.executeUpdate();
        }
        }
    public void excluir (Usuario usuario ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Usuario (REGISTRO_USUARIO, IDENTIFICACAO_USUARIO, SENHA_ACESSO, CADASTRO_FUNCIONARIO, CADASTRO_PACIENTE"
                    + " CADASTRO_ESPECIALIDADE, CADASTRO_MEDICO, AGENDAMENTO_CONSULTA, MODULO_ADMINISTRATIVO, MODULO_AGENDAMENTO, MODULO_ATENDIMENTO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, usuario.getRegistroUsuario());
            ps.setString(2, usuario.getIdentificacaoUsuario());
            ps.setString(3, usuario.getSenhaAcesso());
            ps.setString(4, usuario.getCadastroFuncionario());
            ps.setString(5, usuario.getCadastroUsuario());
            ps.setString(6, usuario.getCadastroPaciente());
            ps.setString(7, usuario.getCadastroEspecialidade());
            ps.setString(8, usuario.getCadastroMedico());
            ps.setString(9, usuario.getAgendamentoConsulta());
            ps.setString(10, usuario.getCancelamentoConsulta());
            ps.setString(11, usuario.getModuloAdministrativo());
            ps.setString(12, usuario.getModuloAgendamento());
            ps.setString(13, usuario.getModuloAtendimento());
            ps.executeUpdate();
        }
        }
    public void salvar (Usuario usuario ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Usuario (REGISTRO_USUARIO, IDENTIFICACAO_USUARIO, SENHA_ACESSO, CADASTRO_FUNCIONARIO, CADASTRO_PACIENTE"
                    + " CADASTRO_ESPECIALIDADE, CADASTRO_MEDICO, AGENDAMENTO_CONSULTA, MODULO_ADMINISTRATIVO, MODULO_AGENDAMENTO, MODULO_ATENDIMENTO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, usuario.getRegistroUsuario());
            ps.setString(2, usuario.getIdentificacaoUsuario());
            ps.setString(3, usuario.getSenhaAcesso());
            ps.setString(4, usuario.getCadastroFuncionario());
            ps.setString(5, usuario.getCadastroUsuario());
            ps.setString(6, usuario.getCadastroPaciente());
            ps.setString(7, usuario.getCadastroEspecialidade());
            ps.setString(8, usuario.getCadastroMedico());
            ps.setString(9, usuario.getAgendamentoConsulta());
            ps.setString(10, usuario.getCancelamentoConsulta());
            ps.setString(11, usuario.getModuloAdministrativo());
            ps.setString(12, usuario.getModuloAgendamento());
            ps.setString(13, usuario.getModuloAtendimento());
            ps.executeUpdate();
        }
        }
    }

  