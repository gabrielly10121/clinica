/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;

import EntidadesAgendamento.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class CadastroFuncionariosDao {
    
    public void funcionario (Funcionario funcionario ) throws SQLException{
        
        Connection cdf= DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        
        String sql = "INSERT INTO Funcionario (CODIGO_PACIENTE, NOME, NUMERO_RG, ORGAO_EMISSOR, NUMERO_CPF, ENDERECO,"
                + " NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, TELEFONE, CELULAR, NUMERO_CTPS, NUMERO_PIS, DATA_NASCIMENTO) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setString(1, funcionario.getcodigo_funcionario());
            ps.setString(2, funcionario.getnome_completo());
            ps.setString(3, funcionario.getnumero_rg());
            ps.setString(4, funcionario.getorgao_emissor());
            ps.setString(5, funcionario.getnumero_cpf());
            ps.setString(6, funcionario.getendereco());
            ps.setString(7, funcionario.getnumero());
            ps.setString(8, funcionario.getcomplemento());
            ps.setString(9, funcionario.getbairro());
            ps.setString(10, funcionario.getcidade());
            ps.setString(11, funcionario.getestado());
            ps.setString(12, funcionario.gettelefone());
            ps.setString(13, funcionario.getcelular());
            ps.setString(14, funcionario.getnumero_ctps());
            ps.setString(15, funcionario.getnumero_pis());
            ps.setDate(16, funcionario.getdata_nascimento());
            ps.execute();
            ps.close();
    }
        }
    
    