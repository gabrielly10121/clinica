/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;

import EntidadesAgendamento.Convenios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class ConveniosDao {
    
    public void cadastrar (Convenios convenios ) throws SQLException{
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        
        String sql = "INSERT INTO Convenios (CODIGO_CONVENIO, EMPRESA_CONVENIO, CNPJ, TELEFONE) "
                + "VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, convenios.getCodigoConvenio());
            ps.setString(2, convenios.getEmpresaConvenio());
            ps.setString(3, convenios.getCnpj());
            ps.setString(4, convenios.getTelefone());
            ps.execute();
            ps.close();
        
        }
    public void excluir (Convenios convenios ) throws SQLException{
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        
        String sql = "INSERT INTO Convenios (CODIGO_CONVENIO, EMPRESA_CONVENIO, CNPJ, TELEFONE) "
                + "VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, convenios.getCodigoConvenio());
            ps.setString(2, convenios.getEmpresaConvenio());
            ps.setString(3, convenios.getCnpj());
            ps.setString(4, convenios.getTelefone());
            ps.execute();
            ps.close();
        
        }
    public void alterar (Convenios convenios ) throws SQLException{
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        
        String sql = "INSERT INTO Convenios (CODIGO_CONVENIO, EMPRESA_CONVENIO, CNPJ, TELEFONE) "
                + "VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, convenios.getCodigoConvenio());
            ps.setString(2, convenios.getEmpresaConvenio());
            ps.setString(3, convenios.getCnpj());
            ps.setString(4, convenios.getTelefone());
            ps.execute();
            ps.close();
        
        }
    public void salvar (Convenios convenios ) throws SQLException{
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        
        String sql = "INSERT INTO Convenios (CODIGO_CONVENIO, EMPRESA_CONVENIO, CNPJ, TELEFONE) "
                + "VALUES (?,?,?,?)";
       PreparedStatement ps = con.prepareStatement(sql);
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, convenios.getCodigoConvenio());
            ps.setString(2, convenios.getEmpresaConvenio());
            ps.setString(3, convenios.getCnpj());
            ps.setString(4, convenios.getTelefone());
            ps.execute();
            ps.close();
        
        }
    }

    