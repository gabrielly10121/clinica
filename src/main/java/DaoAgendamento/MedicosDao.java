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
public class MedicosDao {
    
    public void cadastrar (Medicos medicos ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Medicos (CODIGO_MEDICO, NOME_MEDICO, CODIGO_ESPECIALIDADE, CRM) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, medicos.getCodigoMedico());
            ps.setString(2, medicos.getNomeMedico());
            ps.setInt(3, medicos.getCodigoEspecialidade());
            ps.setString(4, medicos.getCrm());
            ps.executeUpdate();
        }
        
        }
    
    public void alterar (Medicos medicos ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Medicos (CODIGO_MEDICO, NOME_MEDICO, CODIGO_ESPECIALIDADE, CRM) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, medicos.getCodigoMedico());
            ps.setString(2, medicos.getNomeMedico());
            ps.setInt(3, medicos.getCodigoEspecialidade());
            ps.setString(4, medicos.getCrm());
            ps.executeUpdate();
        }
        
        }
    
    public void excluir (Medicos medicos ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Medicos (CODIGO_MEDICO, NOME_MEDICO, CODIGO_ESPECIALIDADE, CRM) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, medicos.getCodigoMedico());
            ps.setString(2, medicos.getNomeMedico());
            ps.setInt(3, medicos.getCodigoEspecialidade());
            ps.setString(4, medicos.getCrm());
            ps.executeUpdate();
        }
        
        }
    
    public void salvar (Medicos medicos ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Medicos (CODIGO_MEDICO, NOME_MEDICO, CODIGO_ESPECIALIDADE, CRM) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, medicos.getCodigoMedico());
            ps.setString(2, medicos.getNomeMedico());
            ps.setInt(3, medicos.getCodigoEspecialidade());
            ps.setString(4, medicos.getCrm());
            ps.executeUpdate();
        }
        
        }
    }

    