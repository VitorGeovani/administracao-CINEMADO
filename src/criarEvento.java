/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Vitor
 */
public class criarEvento extends javax.swing.JFrame {

    /**
     * Creates new form criarEvento
     */
    public criarEvento() {
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

        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btnCriarEvento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Nome do evento:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 40, 100, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(190, 40, 270, 30);

        jLabel3.setText("Data:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 80, 100, 30);
        getContentPane().add(txtData);
        txtData.setBounds(150, 80, 170, 30);

        jLabel5.setText("Hora:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 120, 110, 30);

        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtHora);
        txtHora.setBounds(150, 120, 170, 30);

        jLabel7.setText("Local:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 160, 110, 30);

        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });
        getContentPane().add(txtLocal);
        txtLocal.setBounds(150, 160, 300, 30);

        jLabel4.setText("Descrição:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 200, 110, 30);

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(150, 200, 300, 80);

        btnCriarEvento.setText("Criar Evento");
        btnCriarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarEventoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCriarEvento);
        btnCriarEvento.setBounds(240, 310, 110, 40);

        setSize(new java.awt.Dimension(684, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnCriarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarEventoActionPerformed
        try {
            String nome = txtNome.getText();
            String data = txtData.getText();
            String hora = txtHora.getText();
            String local = txtLocal.getText();
            String descricao = txtDescricao.getText();

            appData app = new appData();
            app.criarEvento(nome, data, hora, local, descricao);
            JOptionPane.showMessageDialog(null, "Evento criado com sucesso!");

            txtNome.setText("");
            txtData.setText("");
            txtHora.setText("");
            txtLocal.setText("");
            txtDescricao.setText("");
        } catch (Exception e) {
            System.out.println("Erro ao criar evento: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCriarEventoActionPerformed

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
            java.util.logging.Logger.getLogger(criarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(criarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(criarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(criarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new criarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarEvento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}