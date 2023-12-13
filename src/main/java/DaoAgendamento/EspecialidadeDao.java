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
public class EspecialidadeDao {
    
    public void cadastrar (Especialidades especialidade ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Especialidade (CODIGO_ESPECIALIDADE, DESCRICAO_ESPECIALIDADE) "
                    + "VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, especialidade.getCodigoEspecialidade());
            ps.setString(2, especialidade.getDescricaoEspecialidade());
            ps.executeUpdate();
        }
        
        }
     public void alterar (Especialidades especialidade ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Especialidade (CODIGO_ESPECIALIDADE, DESCRICAO_ESPECIALIDADE) "
                    + "VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, especialidade.getCodigoEspecialidade());
            ps.setString(2, especialidade.getDescricaoEspecialidade());
            ps.executeUpdate();
        }
        
        }
      public void excluir (Especialidades especialidade ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Especialidade (CODIGO_ESPECIALIDADE, DESCRICAO_ESPECIALIDADE) "
                    + "VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, especialidade.getCodigoEspecialidade());
            ps.setString(2, especialidade.getDescricaoEspecialidade());
            ps.executeUpdate();
        }
        
        }
       public void salvar (Especialidades especialidade ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Especialidade (CODIGO_ESPECIALIDADE, DESCRICAO_ESPECIALIDADE) "
                    + "VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, especialidade.getCodigoEspecialidade());
            ps.setString(2, especialidade.getDescricaoEspecialidade());
            ps.executeUpdate();
        }
        
        }
    }
    

