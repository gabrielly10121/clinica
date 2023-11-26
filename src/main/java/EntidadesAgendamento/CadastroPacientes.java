/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesAgendamento;

import javax.swing.JComboBox;

/**
 *
 * @author Gabri
 */
public class CadastroPacientes {
    private String Nome;
    private String Endereco;
    private String Bairro;
    private String LocalTrabalho;
    private String Cargo;
    private String Email;
    private int Telefone;
    private int DataInicio;
    private int DataNascimento;
    private int Celular;
    JComboBox TiposConvenio = new JComboBox();
    JComboBox Especialidade = new JComboBox();
    JComboBox Medico = new JComboBox();
    JComboBox TipoAtendimento = new JComboBox();
    
    public String getNome(){
        return Nome;
    }
    public String getEnderco(){
        return Endereco;
    }
    public String getBairro(){
        return Bairro;
    }
    public String LocalTrabalho(){
        return LocalTrabalho;
    }
    public String Cargo(){
        return Cargo;
    }
    public String Email(){
        return Email;
    }
    public int Telefone(){
        return Telefone;
    }
    public int DataInicio(){
        return DataInicio;
    }
    public int DataNascimento(){
        return DataNascimento;
    }
    public int Celular(){
        return Celular;
    }
    public JComboBox TiposConvenio(){
        return TiposConvenio;
    }
    public JComboBox Especialidade(){
        return Especialidade;
    }
    public JComboBox Medico(){
        return Medico;
    }
    public JComboBox TipoAtendimento(){
        return TipoAtendimento;
    }
}
