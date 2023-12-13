/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;

import EntidadesAgendamento.Funcionario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class FuncionariosDao {
    
    public void cadastrar (Funcionario funcionario ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Funcionario (CODIGO_PACIENTE, NOME, NUMERO_RG, ORGAO_EMISSOR, NUMERO_CPF, ENDERECO,"
                    + " NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, TELEFONE, CELULAR, NUMERO_CTPS, NUMERO_PIS, DATA_NASCIMENTO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, funcionario.getCodigoFuncionario());
            ps.setString(2, funcionario.getNomeCompleto());
            ps.setString(3, funcionario.getNumeroRg());
            ps.setString(4, funcionario.getOrgaoEmissor());
            ps.setString(5, funcionario.getNumeroCpf());
            ps.setString(6, funcionario.getEndereco());
            ps.setString(7, funcionario.getNumero());
            ps.setString(8, funcionario.getComplemento());
            ps.setString(9, funcionario.getBairro());
            ps.setString(10, funcionario.getCidade());
            ps.setString(11, funcionario.getEstado());
            ps.setString(12, funcionario.getTelefone());
            ps.setString(13, funcionario.getCelular());
            ps.setString(14, funcionario.getNumeroCtps());
            ps.setString(15, funcionario.getNumeroPis());
            ps.setDate(16, (Date) funcionario.getDataNascimento());
            ps.executeUpdate();
            con.close();
        }
    }
    
    public void alterar (Funcionario funcionario ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Funcionario (CODIGO_PACIENTE, NOME, NUMERO_RG, ORGAO_EMISSOR, NUMERO_CPF, ENDERECO,"
                    + " NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, TELEFONE, CELULAR, NUMERO_CTPS, NUMERO_PIS, DATA_NASCIMENTO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, funcionario.getCodigoFuncionario());
            ps.setString(2, funcionario.getNomeCompleto());
            ps.setString(3, funcionario.getNumeroRg());
            ps.setString(4, funcionario.getOrgaoEmissor());
            ps.setString(5, funcionario.getNumeroCpf());
            ps.setString(6, funcionario.getEndereco());
            ps.setString(7, funcionario.getNumero());
            ps.setString(8, funcionario.getComplemento());
            ps.setString(9, funcionario.getBairro());
            ps.setString(10, funcionario.getCidade());
            ps.setString(11, funcionario.getEstado());
            ps.setString(12, funcionario.getTelefone());
            ps.setString(13, funcionario.getCelular());
            ps.setString(14, funcionario.getNumeroCtps());
            ps.setString(15, funcionario.getNumeroPis());
            ps.setDate(16, (Date) funcionario.getDataNascimento());
            ps.executeUpdate();
            con.close();
        }
    }
    
    public void excluir (Funcionario funcionario ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Funcionario (CODIGO_PACIENTE, NOME, NUMERO_RG, ORGAO_EMISSOR, NUMERO_CPF, ENDERECO,"
                    + " NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, TELEFONE, CELULAR, NUMERO_CTPS, NUMERO_PIS, DATA_NASCIMENTO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, funcionario.getCodigoFuncionario());
            ps.setString(2, funcionario.getNomeCompleto());
            ps.setString(3, funcionario.getNumeroRg());
            ps.setString(4, funcionario.getOrgaoEmissor());
            ps.setString(5, funcionario.getNumeroCpf());
            ps.setString(6, funcionario.getEndereco());
            ps.setString(7, funcionario.getNumero());
            ps.setString(8, funcionario.getComplemento());
            ps.setString(9, funcionario.getBairro());
            ps.setString(10, funcionario.getCidade());
            ps.setString(11, funcionario.getEstado());
            ps.setString(12, funcionario.getTelefone());
            ps.setString(13, funcionario.getCelular());
            ps.setString(14, funcionario.getNumeroCtps());
            ps.setString(15, funcionario.getNumeroPis());
            ps.setDate(16, (Date) funcionario.getDataNascimento());
            ps.executeUpdate();
            con.close();
        }
    }
    
    public void salvar (Funcionario funcionario ) throws SQLException{
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root")) {
            String sql = "INSERT INTO Funcionario (CODIGO_PACIENTE, NOME, NUMERO_RG, ORGAO_EMISSOR, NUMERO_CPF, ENDERECO,"
                    + " NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, TELEFONE, CELULAR, NUMERO_CTPS, NUMERO_PIS, DATA_NASCIMENTO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, funcionario.getCodigoFuncionario());
            ps.setString(2, funcionario.getNomeCompleto());
            ps.setString(3, funcionario.getNumeroRg());
            ps.setString(4, funcionario.getOrgaoEmissor());
            ps.setString(5, funcionario.getNumeroCpf());
            ps.setString(6, funcionario.getEndereco());
            ps.setString(7, funcionario.getNumero());
            ps.setString(8, funcionario.getComplemento());
            ps.setString(9, funcionario.getBairro());
            ps.setString(10, funcionario.getCidade());
            ps.setString(11, funcionario.getEstado());
            ps.setString(12, funcionario.getTelefone());
            ps.setString(13, funcionario.getCelular());
            ps.setString(14, funcionario.getNumeroCtps());
            ps.setString(15, funcionario.getNumeroPis());
            ps.setDate(16, (Date) funcionario.getDataNascimento());
            ps.executeUpdate();
            con.close();
        }
    }
        }
    
    