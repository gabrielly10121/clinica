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
public class CadastroConveniosDao {
    
    public void convenios (Convenios convenios ) throws SQLException{
        
        Connection convenio = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        
        String sql = "INSERT INTO Convenios (CODIGO_CONVENIO, EMPRESA_CONVENIO, CNPJ, TELEFONE) "
                + "VALUES (?,?,?,?)";
        PreparedStatement ps = null;
        
        
            ps = (PreparedStatement) Conexao.getConexao(sql); 
            ps.setInt(1, convenios.getcodigo_convenio());
            ps.setString(2, convenios.getempresa_convenio());
            ps.setString(3, convenios.getcnpj());
            ps.setString(4, convenios.gettelefone());
            ps.execute();
            ps.close();
        
        }
    }

    