/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoAgendamento;

import EntidadesAgendamento.AgendaConsulta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabri
 */
public class AgendaConsultaDao {
    
    public void agendarConsulta (AgendaConsulta agendaConsulta ) throws SQLException{
        //conectar no banco de dados
       Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true","root","root");
        // criar a string de sql
        String sql = "INSERT INTO agendaconsulta (REGISTRO_AGENDA, CODIGO_USUARIO, CODIGO_PACIENTE, CODIGO_MEDICO, DATA, HORA, RETORNO, CANCELADO, MOTIVO_CANCELAMENTO) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        //Substituir os  caracteres coringa
           
            ps.setInt (1, agendaConsulta.getRegistro_agenda());
            ps.setInt(2, AgendaConsulta.getcodigo_usuario());
            ps.setInt(3, AgendaConsulta.getcodigo_paciente());
            ps.setInt(4, AgendaConsulta.getcodigo_medico());
            ps.setDate(5, AgendaConsulta.getdata());
            ps.setString(6, AgendaConsulta.gethora());
            ps.setString(7, AgendaConsulta.getretorno());
            ps.setString(8, AgendaConsulta.getcancelado());
            ps.setString(9, AgendaConsulta.getmotivo_cancelamento());
            //Executar a query
            ps.execute();
            //Fechar conexão com banco de dados
            ps.close();
    }
    
}
