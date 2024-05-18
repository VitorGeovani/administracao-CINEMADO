/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitor
 */
public class editarSubmissao extends javax.swing.JFrame {

    /**
     * Creates new form editarSubmissao
     * @param idFilme 
     */
    public editarSubmissao(int idFilme) {
        initComponents();
        preencherCampos(idFilme);
    }

    private void preencherCampos(int idFilme) {
        try {
            appData app = new appData();
            ResultSet rs = app.buscarFilme(idFilme);
            if (rs.next()) {
                txtTitulo.setText(rs.getString("titulo"));
                txtDiretor2.setText(rs.getString("diretor"));
                txtDuracao.setText(rs.getString("duracao"));
                cnbGenero.setSelectedItem(rs.getString("genero"));
                txtSinpse.setText(rs.getString("sinopse"));
                txtData.setText(rs.getString("data_lancamento"));
                cnbClassificacao.setSelectedItem(rs.getString("classificacao_indicativa"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher campos!");
        }
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
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiretor2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cnbGenero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtSinpse = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cnbClassificacao = new javax.swing.JComboBox<>();
        btnEditarSubmissao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Título do Filme:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 60, 100, 30);
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(150, 60, 270, 30);

        jLabel4.setText("Diretor:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 110, 110, 30);

        txtDiretor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiretor2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDiretor2);
        txtDiretor2.setBounds(120, 110, 300, 30);

        jLabel1.setText("Duração:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 160, 110, 30);

        txtDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDuracao);
        txtDuracao.setBounds(120, 160, 300, 30);

        jLabel3.setText("Gênero:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 210, 110, 30);

        cnbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romance", "Aventura", "Suspense", "Terror/Horror", "Ação", "Documentário", "Ficção científica", "Drama", "Comédia", "Fantasia", "Musical", "Mistério" }));
        cnbGenero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cnbGeneroItemStateChanged(evt);
            }
        });
        getContentPane().add(cnbGenero);
        cnbGenero.setBounds(120, 210, 300, 30);

        jLabel6.setText("Sinopse:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 250, 70, 30);

        txtSinpse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSinpseActionPerformed(evt);
            }
        });
        getContentPane().add(txtSinpse);
        txtSinpse.setBounds(120, 250, 300, 30);

        jLabel5.setText("Data Lançamento:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 290, 110, 30);

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        getContentPane().add(txtData);
        txtData.setBounds(190, 290, 230, 30);

        jLabel7.setText("Classificação indicativa:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 330, 130, 30);

        cnbClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre", "10 anos", "12 anos", "14 anos", "16 anos", "18 anos" }));
        getContentPane().add(cnbClassificacao);
        cnbClassificacao.setBounds(190, 330, 230, 30);

        btnEditarSubmissao.setText("Editar Filme");
        btnEditarSubmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSubmissaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarSubmissao);
        btnEditarSubmissao.setBounds(200, 390, 170, 40);

        setSize(new java.awt.Dimension(604, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiretor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiretor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiretor2ActionPerformed

    private void txtDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracaoActionPerformed

    private void cnbGeneroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cnbGeneroItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cnbGeneroItemStateChanged

    private void txtSinpseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSinpseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSinpseActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnEditarSubmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSubmissaoActionPerformed
        try {
            appData app = new appData();
            app.editarFilme(JFrame.EXIT_ON_CLOSE, txtTitulo.getText(), txtDiretor2.getText(), txtDuracao.getText(), cnbGenero.getSelectedItem().toString(), txtSinpse.getText(), txtData.getText(), cnbClassificacao.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "Filme editado com sucesso!");
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar filme!" +  e.getMessage());
        }
        
    }//GEN-LAST:event_btnEditarSubmissaoActionPerformed

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
            java.util.logging.Logger.getLogger(editarSubmissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarSubmissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarSubmissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarSubmissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarSubmissao(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarSubmissao;
    private javax.swing.JComboBox<String> cnbClassificacao;
    private javax.swing.JComboBox<String> cnbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDiretor2;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtSinpse;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
