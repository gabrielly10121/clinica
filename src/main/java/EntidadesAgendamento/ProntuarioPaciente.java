/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesAgendamento;

import org.w3c.dom.Text;

/**
 *
 * @author Gabri
 */
public class ProntuarioPaciente {
    
    private int registro;
    private int registroAgenda;
    private Text historico;
    private Text receituario;
    private Text exame;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public int getRegistroAgenda() {
        return registroAgenda;
    }

    public void setRegistroAgenda(int registroAgenda) {
        this.registroAgenda = registroAgenda;
    }

    public Text getHistorico() {
        return historico;
    }

    public void setHistorico(Text historico) {
        this.historico = historico;
    }

    public Text getReceituario() {
        return receituario;
    }

    public void setReceituario(Text receituario) {
        this.receituario = receituario;
    }

    public Text getExame() {
        return exame;
    }

    public void setExame(Text exame) {
        this.exame = exame;
    }

    public String getexame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getreceituario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String gethistorico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
