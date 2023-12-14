/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AgendamentoTelas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabri
 */
public class CincoRegistrodeRetorno extends javax.swing.JFrame {

    /**
     * Creates new form RegistrodeRetorno
     */
    public CincoRegistrodeRetorno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        txtAdministrativo = new javax.swing.JMenu();
        menuCadastroFuncionarios = new javax.swing.JMenuItem();
        menuCadastroUsuarios = new javax.swing.JMenuItem();
        menuCadastroEspecialidades = new javax.swing.JMenuItem();
        menuCadastroMedicos = new javax.swing.JMenuItem();
        menuCadastroConvenios = new javax.swing.JMenuItem();
        txtAgendamento = new javax.swing.JMenu();
        menuCadastroPaciente = new javax.swing.JMenuItem();
        menuAgendarConsulta = new javax.swing.JMenuItem();
        menuRegistroRetorno = new javax.swing.JMenuItem();
        menuCancelamentoConsulta = new javax.swing.JMenuItem();
        txtAtendimento = new javax.swing.JMenu();
        menuProntuarioPaciente = new javax.swing.JMenuItem();
        menuRegistroAtendimento = new javax.swing.JMenuItem();
        menuReceituario = new javax.swing.JMenuItem();
        menuExames = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMotivoRetorno = new javax.swing.JTextField();
        txtDetalheUltimaConsulta = new javax.swing.JTextField();
        txtResultadoExames = new javax.swing.JTextField();
        txtCodPaciente = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        txtAdministrativo.setText("Administrativo");

        menuCadastroFuncionarios.setText("Cadastro de Funcionários");
        menuCadastroFuncionarios.setToolTipText("");
        txtAdministrativo.add(menuCadastroFuncionarios);

        menuCadastroUsuarios.setText("Cadastro de Usuários");
        txtAdministrativo.add(menuCadastroUsuarios);

        menuCadastroEspecialidades.setText("Cadastro de Especialidades");
        txtAdministrativo.add(menuCadastroEspecialidades);

        menuCadastroMedicos.setText("Cadastro de Médicos");
        txtAdministrativo.add(menuCadastroMedicos);

        menuCadastroConvenios.setText("Cadastro de Convênios");
        txtAdministrativo.add(menuCadastroConvenios);

        jMenuBar2.add(txtAdministrativo);

        txtAgendamento.setText("Agendamento");

        menuCadastroPaciente.setText("Cadastro de Pacientes");
        menuCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroPacienteActionPerformed(evt);
            }
        });
        txtAgendamento.add(menuCadastroPaciente);

        menuAgendarConsulta.setText("Agenda de Consulta");
        txtAgendamento.add(menuAgendarConsulta);

        menuRegistroRetorno.setText("Registro de Retorno");
        txtAgendamento.add(menuRegistroRetorno);

        menuCancelamentoConsulta.setText("Cancelamento de Consulta");
        txtAgendamento.add(menuCancelamentoConsulta);

        jMenuBar2.add(txtAgendamento);

        txtAtendimento.setText("Atendimento");

        menuProntuarioPaciente.setText("Prontuário do Paciente");
        txtAtendimento.add(menuProntuarioPaciente);

        menuRegistroAtendimento.setText("Registro de Atendimento");
        txtAtendimento.add(menuRegistroAtendimento);

        menuReceituario.setText("Receituário");
        txtAtendimento.add(menuReceituario);

        menuExames.setText("Exames");
        txtAtendimento.add(menuExames);

        jMenuBar2.add(txtAtendimento);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenuBar2.add(menuSair);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 115, 115));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE RETORNO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Código  Do Paciente");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Data");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("Hora");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setText("Motivo Do Retorno");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel7.setText("Resultado Dos Exames");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel8.setText("Detalhes Da Última Consulta");

        txtName.setToolTipText("");

        jButton6.setText("SAIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(198, 198, 198))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoExames, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMotivoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDetalheUltimaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addComponent(jButton6))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDetalheUltimaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel6)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtResultadoExames, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtMotivoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroPacienteActionPerformed
        new TresCadastroDePaciente().setVisible(true);
    }//GEN-LAST:event_menuCadastroPacienteActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // Menu Sair
        this.dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //botao salvar
        try { //Novo Cadastro
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClinicaMedica", "root", "root");
            String query = "INSERT INTO RegistroRetorno (codigo_paciente, nome, data, hora, detalheUltimaConsulta, motivo_retorno,  resultado_exames) "
            
                    + "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pdst = con.prepareStatement(query);

            pdst.setInt(1, txtCodigoPacientes.getText());
            pdst.setString(2, txtName.getText());
            pdst.setString(3, txtData.getText());
            pdst.setString(4, txtHora.getText());
            pdst.setString(5, txtDetalheUltimaConsulta.getText());
            pdst.setString(6, txtMotivoRetorno.getText());
            pdst.setString(7, txtResultadoExames.getText());
           
            

            if (txtName()) {
                pdst.setBoolean(3, true);
            } else {
                pdst.setBoolean(3, false);
            }

            pdst.executeUpdate();
            pdst.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.");

            this.dispose();
        } catch (Exception exc) {
            System.out.println("Algo de errado aconteceu!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CincoRegistrodeRetorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CincoRegistrodeRetorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CincoRegistrodeRetorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CincoRegistrodeRetorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CincoRegistrodeRetorno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuAgendarConsulta;
    private javax.swing.JMenuItem menuCadastroConvenios;
    private javax.swing.JMenuItem menuCadastroEspecialidades;
    private javax.swing.JMenuItem menuCadastroFuncionarios;
    private javax.swing.JMenuItem menuCadastroMedicos;
    private javax.swing.JMenuItem menuCadastroPaciente;
    private javax.swing.JMenuItem menuCadastroUsuarios;
    private javax.swing.JMenuItem menuCancelamentoConsulta;
    private javax.swing.JMenuItem menuExames;
    private javax.swing.JMenuItem menuProntuarioPaciente;
    private javax.swing.JMenuItem menuReceituario;
    private javax.swing.JMenuItem menuRegistroAtendimento;
    private javax.swing.JMenuItem menuRegistroRetorno;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu txtAdministrativo;
    private javax.swing.JMenu txtAgendamento;
    private javax.swing.JMenu txtAtendimento;
    private javax.swing.JTextField txtCodPaciente;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDetalheUltimaConsulta;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMotivoRetorno;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtResultadoExames;
    // End of variables declaration//GEN-END:variables

    private void isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean txtName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
