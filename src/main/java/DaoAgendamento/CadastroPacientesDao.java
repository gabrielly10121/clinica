/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;


import EntidadesAgendamento.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class CadastroPacientesDao {

    public void pacientes(Paciente pacientes) throws SQLException{
        
        Connection cdp = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        
        String sql = "INSERT INTO Paciente (CODIGO_PACIENTE, NOME, NUMERO_RG, ORGAO_EMISSOR, NUMERO_CPF, ENDERECO,"
                + " NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, TELEFONE, CELULAR, DATA_NASCIMENTO, SEXO, TEM_CONVENIO, COD_CONVENIO, SENHA_ACESSO) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt (1, pacientes.getcodigo_paciente());
            ps.setString(2, pacientes.getnome());
            ps.setString(3, pacientes.getnumero_rg());
            ps.setString(4, pacientes.getorgao_emissor());
            ps.setString(5, pacientes.getnumero_cpf());
            ps.setString(6, pacientes.getendereco());
            ps.setString(7, pacientes.getnumero());
            ps.setString(8, pacientes.getcomplemento());
            ps.setString(9, pacientes.getbairro());
            ps.setString(10, pacientes.getcidade());
            ps.setString(11, pacientes.getestado());
            ps.setString(12, pacientes.gettelefone());
            ps.setString(13, pacientes.getcelular());
            ps.setString(14, pacientes.getdata_nascimento());
            ps.setString(15, pacientes.getsexo());
            ps.setString(16, pacientes.gettem_convenio());
            ps.setInt (17, pacientes.getcod_convenio());
            ps.setString(18, pacientes.getsenha_acesso());
            ps.execute();
            ps.close();
        }
    }

    