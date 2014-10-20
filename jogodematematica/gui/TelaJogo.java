/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.romulo.jogodematematica.gui;

import br.com.romulo.jogodematematica.controle.FabricaDeTabuada;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author romulo
 */
public class TelaJogo extends javax.swing.JFrame {

    FabricaDeTabuada fabrica = new FabricaDeTabuada();

    /**
     * Creates new form TelaJogo
     */
    public TelaJogo() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLCronometro = new javax.swing.JLabel();
        jLQtdAcertos = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLNumero2 = new javax.swing.JLabel();
        jLOperacao = new javax.swing.JLabel();
        jLNumero1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBOpcao1 = new javax.swing.JButton();
        jBOpcao2 = new javax.swing.JButton();
        jBOpcao3 = new javax.swing.JButton();
        jBOpcao4 = new javax.swing.JButton();
        jBPronto = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Acertos:");

        jLabel2.setBackground(java.awt.Color.black);
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Tempo:");

        jLCronometro.setBackground(java.awt.Color.black);
        jLCronometro.setForeground(java.awt.Color.black);
        jLCronometro.setText("00:00");

        jLQtdAcertos.setBackground(java.awt.Color.black);
        jLQtdAcertos.setForeground(java.awt.Color.black);
        jLQtdAcertos.setText("0");

        jPanel4.setBackground(java.awt.Color.lightGray);

        jLNumero2.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLNumero2.setForeground(java.awt.Color.yellow);
        jLNumero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNumero2.setText("N2");

        jLOperacao.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLOperacao.setForeground(java.awt.Color.yellow);
        jLOperacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOperacao.setText("OPR");

        jLNumero1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLNumero1.setForeground(java.awt.Color.yellow);
        jLNumero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNumero1.setText("N1");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.yellow);
        jLabel3.setText("=");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel4.setForeground(java.awt.Color.green);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLQtdAcertos)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLCronometro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLCronometro)
                    .addComponent(jLQtdAcertos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jBOpcao1.setBackground(new java.awt.Color(2, 135, 71));
        jBOpcao1.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jBOpcao1.setForeground(new java.awt.Color(128, 210, 45));
        jBOpcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOpcao1ActionPerformed(evt);
            }
        });

        jBOpcao2.setBackground(new java.awt.Color(2, 135, 71));
        jBOpcao2.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jBOpcao2.setForeground(new java.awt.Color(128, 210, 45));
        jBOpcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOpcao2ActionPerformed(evt);
            }
        });

        jBOpcao3.setBackground(new java.awt.Color(2, 135, 71));
        jBOpcao3.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jBOpcao3.setForeground(new java.awt.Color(128, 210, 45));
        jBOpcao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOpcao3ActionPerformed(evt);
            }
        });

        jBOpcao4.setBackground(new java.awt.Color(2, 135, 71));
        jBOpcao4.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jBOpcao4.setForeground(new java.awt.Color(128, 210, 45));
        jBOpcao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOpcao4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBOpcao3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBOpcao4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBOpcao4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBOpcao3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jBPronto.setText("Pronto!");
        jBPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jBPronto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPronto)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProntoActionPerformed
        trocarExpressao();
    }//GEN-LAST:event_jBProntoActionPerformed

    private void jBOpcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOpcao1ActionPerformed
        verificaAcertos(jLQtdAcertos,jBOpcao1, fabrica.getOp());
    }//GEN-LAST:event_jBOpcao1ActionPerformed

    private void jBOpcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOpcao2ActionPerformed
        verificaAcertos(jLQtdAcertos, jBOpcao2, fabrica.getOp());
    }//GEN-LAST:event_jBOpcao2ActionPerformed

    private void jBOpcao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOpcao3ActionPerformed
        verificaAcertos(jLQtdAcertos,jBOpcao3, fabrica.getOp());
    }//GEN-LAST:event_jBOpcao3ActionPerformed

    private void jBOpcao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOpcao4ActionPerformed
        verificaAcertos(jLQtdAcertos,jBOpcao4, fabrica.getOp());
    }//GEN-LAST:event_jBOpcao4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOpcao1;
    private javax.swing.JButton jBOpcao2;
    private javax.swing.JButton jBOpcao3;
    private javax.swing.JButton jBOpcao4;
    private javax.swing.JButton jBPronto;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLCronometro;
    private javax.swing.JLabel jLNumero1;
    private javax.swing.JLabel jLNumero2;
    private javax.swing.JLabel jLOperacao;
    private javax.swing.JLabel jLQtdAcertos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    public ArrayList botoes() {
        ArrayList bts = new ArrayList();
        bts.add(jBOpcao1);
        bts.add(jBOpcao2);
        bts.add(jBOpcao3);
        bts.add(jBOpcao4);
        return bts;
    }

    public void trocarExpressao() {
        new FabricaDeTabuada().gerarTabuadasSoma(botoes());
        jLNumero1.setText(String.valueOf(fabrica.getN1()));
        jLNumero2.setText(String.valueOf(fabrica.getN2()));
        jLOperacao.setText(fabrica.getOp());
    }

    public void verificaAcertos(JLabel lbAcerto,JButton botao, String operacaoAtual) {

        if (operacaoAtual == "+") {
            if (fabrica.getResultadoSoma() == Integer.parseInt(botao.getText())) {

                lbAcerto.setText(
                        String.valueOf(Integer.parseInt(
                                        lbAcerto.getText()) + 1));
                trocarExpressao();
            }else {
                trocarExpressao();
            }
            

        }
        if (operacaoAtual == "-") {
            if (fabrica.getResultadoSubtracao()== Integer.parseInt(botao.getText())) {

                lbAcerto.setText(
                        String.valueOf(Integer.parseInt(
                                        lbAcerto.getText()) + 1));
                trocarExpressao();
            }

        }
        if (operacaoAtual == "*") {
            if (fabrica.getResultadoMultiplicacao()== Integer.parseInt(botao.getText())) {

                botao.setText(
                        String.valueOf(Integer.parseInt(
                                        botao.getText()) + 1));
                trocarExpressao();
            }

        }
        if (operacaoAtual == "/") {
            if (fabrica.getResultadoDivisao() == Integer.parseInt(botao.getText())) {

                lbAcerto.setText(
                        String.valueOf(Integer.parseInt(
                                        lbAcerto.getText()) + 1));
                trocarExpressao();
            }

        }

    }
}