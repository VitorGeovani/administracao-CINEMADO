/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;
/**
 *
 * @author gabrielle.ddutra
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAvaliacao = new javax.swing.JMenuItem();
        itmListar = new javax.swing.JMenuItem();
        itmSubmissao = new javax.swing.JMenuItem();
        itmProgramacao = new javax.swing.JMenuItem();
        itmIngressos = new javax.swing.JMenuItem();
        itmEventos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jMenu1.setText("MENU");

        itmAvaliacao.setText("Avaliação");
        itmAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAvaliacaoActionPerformed(evt);
            }
        });
        jMenu1.add(itmAvaliacao);

        itmListar.setText("Listar");
        itmListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarActionPerformed(evt);
            }
        });
        jMenu1.add(itmListar);

        itmSubmissao.setText("Submissão");
        itmSubmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSubmissaoActionPerformed(evt);
            }
        });
        jMenu1.add(itmSubmissao);

        itmProgramacao.setText("Programação");
        itmProgramacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmProgramacaoActionPerformed(evt);
            }
        });
        jMenu1.add(itmProgramacao);

        itmIngressos.setText("Ingressos");
        itmIngressos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmIngressosActionPerformed(evt);
            }
        });
        jMenu1.add(itmIngressos);

        itmEventos.setText("Eventos");
        jMenu1.add(itmEventos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAvaliacaoActionPerformed
        // Solicitar ao usuário que insira o ID do filme
        String idInput = JOptionPane.showInputDialog("Digite o ID do filme que deseja avaliar:");
        // Verificar se o usuário inseriu algum valor
        if (idInput != null && !idInput.isEmpty()) {
            int idFilme = Integer.parseInt(idInput);
            // Abrir a tela de avaliação com o ID do filme
            new Avaliacao(idFilme).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "ID do filme não fornecido.");
        }
        
        // new Avaliacao().setVisible(true);
    }//GEN-LAST:event_itmAvaliacaoActionPerformed

    private void itmListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarActionPerformed
        new Listar().setVisible(true);
    }//GEN-LAST:event_itmListarActionPerformed

    private void itmSubmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSubmissaoActionPerformed
        new Submissao().setVisible(true);
    }//GEN-LAST:event_itmSubmissaoActionPerformed

    private void itmProgramacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmProgramacaoActionPerformed
        new Programacao().setVisible(true);
    }//GEN-LAST:event_itmProgramacaoActionPerformed

    private void itmIngressosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmIngressosActionPerformed
        new Ingressos().setVisible(true);
    }//GEN-LAST:event_itmIngressosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAvaliacao;
    private javax.swing.JMenuItem itmEventos;
    private javax.swing.JMenuItem itmIngressos;
    private javax.swing.JMenuItem itmListar;
    private javax.swing.JMenuItem itmProgramacao;
    private javax.swing.JMenuItem itmSubmissao;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
