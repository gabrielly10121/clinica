/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras;

import Extras.CadastroPacientes;
import DaoAgendamento.PacientesDao;

/**
 *
 * @author Gabri
 */
public class ClinicaMedica {
    public static void main(String[] args)throws Exception{
        
        CadastroPacientes CP = CadastroPacientes();
        CP.setNome("gabrielly");
         CP.setEndereco();
         CP.setBairro();
         CP.setLocalTrabalho();
         CP.setCargo();
         CP.setEmail();
         CP.setTelefone();
         CP.setDataInicio();
         CP.setDataNascimento();
         CP.setCelular();
         CP.setTiposConvenio();
         CP.setEspecialidade();
         CP.setMedico();
         CP.setTipoAtendimento();
        
        new PacientesDao().CadastroPacientes(CP);
    }

    private static CadastroPacientes CadastroPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
