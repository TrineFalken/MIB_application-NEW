package mibprojekt;

import oru.inf.InfDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trnfa
 */
public class Startsida_Alien extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form Startsida
     */
    public Startsida_Alien(InfDB idb) {
        initComponents();
        this.idb = idb;
        ansvarigAgent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lableAnsvarigAgent = new javax.swing.JLabel();
        bytLosenKnapp = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 563));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lableAnsvarigAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 190));

        bytLosenKnapp.setText("change Password");
        bytLosenKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bytLosenKnappActionPerformed(evt);
            }
        });
        getContentPane().add(bytLosenKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 150, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mibprojekt/welcomealien.png"))); // NOI18N
        bg.setText("jLabel2");
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 780, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bytLosenKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bytLosenKnappActionPerformed
        new BytLosen(idb).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bytLosenKnappActionPerformed

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
            java.util.logging.Logger.getLogger(Startsida_Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startsida_Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startsida_Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startsida_Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              // new Startsida_Alien().setVisible(true);
            }
        });
    }

    public void ansvarigAgent(){
        //     jTextField1.setText(onlyDate.format(date));
    //jLabel1.setText(jTextField1.getText());
    try{
        String aAID = idb.fetchSingle("SELECT Ansvarig_Agent FROM alien WHERE Alien_ID = '" + LoggedUser.getUserID() + "'");
        String aA = idb.fetchSingle("SELECT Namn FROM agent WHERE Agent_ID = '" + aAID + "'");
        //lableAnsvarigAgent.setText(aA);
        lableAnsvarigAgent.setText(aA);
        }
        catch (Exception ettUndantag){
            //     JOptionPane.showMessageDialog(null, "Something went wrong. Please contact your IT-Administrator.");
            System.out.println("InternFelmeddelande:" + ettUndantag.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton bytLosenKnapp;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lableAnsvarigAgent;
    // End of variables declaration//GEN-END:variables
}
