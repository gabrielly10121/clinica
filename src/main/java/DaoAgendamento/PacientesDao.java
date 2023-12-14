/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;


import EntidadesAgendamento.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class PacientesDao {

    public void CadastroPacientes(CadastroPacientes CP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public class PacienteDao {

        
//        
//          public cadastrar(Paciente paciente) {
//            //conectar com o banco
//            //criar a sql de inserção
//            //executar sql
//            //fechar a conexao
//        }
//      
        
        public void cadastrar(Paciente pacientes) throws SQLException {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true", "root", "root");

            String sql = "INSERT INTO Paciente (CODIGO_PACIENTE, NOME, NUMERO_RG, ORGAO_EMISSOR, NUMERO_CPF, ENDERECO,"
                    + " NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, TELEFONE, CELULAR, DATA_NASCIMENTO, SEXO, TEM_CONVENIO, COD_CONVENIO, SENHA_ACESSO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, pacientes.getCodigoPaciente());
                ps.setString(2, pacientes.getNome());
                ps.setString(3, pacientes.getNumeroRg());
                ps.setString(4, pacientes.getOrgaoEmissor());
                ps.setString(5, pacientes.getNumeroCpf());
                ps.setString(6, pacientes.getEndereco());
                ps.setString(7, pacientes.getNumero());
                ps.setString(8, pacientes.getComplemento());
                ps.setString(9, pacientes.getBairro());
                ps.setString(10, pacientes.getCidade());
                ps.setString(11, pacientes.getEstado());
                ps.setString(12, pacientes.getTelefone());
                ps.setString(13, pacientes.getCelular());
                ps.setDate(14, (Date) pacientes.getDataNascimento());
                ps.setString(15, pacientes.getSexo());
                ps.setString(16, pacientes.getTemConvenio());
                ps.setInt(17, pacientes.getCodConvenio());
                ps.setString(18, pacientes.getSenhaAcesso());
                ps.executeUpdate();
                con.close();
            }
        }
        public void excluir (Paciente pacientes) throws SQLException {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true", "root", "root");

            String sql = "INSERT INTO Paciente (CODIGO_PACIENTE, NOME, NUMERO_RG, ORGAO_EMISSOR, NUMERO_CPF, ENDERECO,"
                    + " NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, TELEFONE, CELULAR, DATA_NASCIMENTO, SEXO, TEM_CONVENIO, COD_CONVENIO, SENHA_ACESSO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, pacientes.getCodigoPaciente());
                ps.setString(2, pacientes.getNome());
                ps.setString(3, pacientes.getNumeroRg());
                ps.setString(4, pacientes.getOrgaoEmissor());
                ps.setString(5, pacientes.getNumeroCpf());
                ps.setString(6, pacientes.getEndereco());
                ps.setString(7, pacientes.getNumero());
                ps.setString(8, pacientes.getComplemento());
                ps.setString(9, pacientes.getBairro());
                ps.setString(10, pacientes.getCidade());
                ps.setString(11, pacientes.getEstado());
                ps.setString(12, pacientes.getTelefone());
                ps.setString(13, pacientes.getCelular());
                ps.setDate(14, (Date) pacientes.getDataNascimento());
                ps.setString(15, pacientes.getSexo());
                ps.setString(16, pacientes.getTemConvenio());
                ps.setInt(17, pacientes.getCodConvenio());
                ps.setString(18, pacientes.getSenhaAcesso());
                ps.executeUpdate();
                con.close();
            }
        }
        public void salvar (Paciente pacientes) throws SQLException {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true", "root", "root");

            String sql = "INSERT INTO Paciente (CODIGO_PACIENTE, NOME, NUMERO_RG, ORGAO_EMISSOR, NUMERO_CPF, ENDERECO,"
                    + " NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, TELEFONE, CELULAR, DATA_NASCIMENTO, SEXO, TEM_CONVENIO, COD_CONVENIO, SENHA_ACESSO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, pacientes.getCodigoPaciente());
                ps.setString(2, pacientes.getNome());
                ps.setString(3, pacientes.getNumeroRg());
                ps.setString(4, pacientes.getOrgaoEmissor());
                ps.setString(5, pacientes.getNumeroCpf());
                ps.setString(6, pacientes.getEndereco());
                ps.setString(7, pacientes.getNumero());
                ps.setString(8, pacientes.getComplemento());
                ps.setString(9, pacientes.getBairro());
                ps.setString(10, pacientes.getCidade());
                ps.setString(11, pacientes.getEstado());
                ps.setString(12, pacientes.getTelefone());
                ps.setString(13, pacientes.getCelular());
                ps.setDate(14, (Date) pacientes.getDataNascimento());
                ps.setString(15, pacientes.getSexo());
                ps.setString(16, pacientes.getTemConvenio());
                ps.setInt(17, pacientes.getCodConvenio());
                ps.setString(18, pacientes.getSenhaAcesso());
                ps.executeUpdate();
                con.close();
            }
        }

        /**
         *
         * @param pacientes
         * @throws SQLException
         */
        public void alterar (Paciente pacientes) throws SQLException {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true", "root", "root");

            String sql = "INSERT INTO Paciente (CODIGO_PACIENTE, NOME, NUMERO_RG, ORGAO_EMISSOR, NUMERO_CPF, ENDERECO,"
                    + " NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, TELEFONE, CELULAR, DATA_NASCIMENTO, SEXO, TEM_CONVENIO, COD_CONVENIO, SENHA_ACESSO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, pacientes.getCodigoPaciente());
                ps.setString(2, pacientes.getNome());
                ps.setString(3, pacientes.getNumeroRg());
                ps.setString(4, pacientes.getOrgaoEmissor());
                ps.setString(5, pacientes.getNumeroCpf());
                ps.setString(6, pacientes.getEndereco());
                ps.setString(7, pacientes.getNumero());
                ps.setString(8, pacientes.getComplemento());
                ps.setString(9, pacientes.getBairro());
                ps.setString(10, pacientes.getCidade());
                ps.setString(11, pacientes.getEstado());
                ps.setString(12, pacientes.getTelefone());
                ps.setString(13, pacientes.getCelular());
                ps.setDate(14, (Date) pacientes.getDataNascimento());
                ps.setString(15, pacientes.getSexo());
                ps.setString(16, pacientes.getTemConvenio());
                ps.setInt(17, pacientes.getCodConvenio());
                ps.setString(18, pacientes.getSenhaAcesso());
                ps.executeUpdate();
                con.close();
            }
        }
    }
}
