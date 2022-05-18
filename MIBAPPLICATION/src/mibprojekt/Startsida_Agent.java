package mibprojekt;

import javax.swing.JOptionPane;
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
public class Startsida_Agent extends javax.swing.JFrame {
    private InfDB idb;
    private static String omrade;
    /**
     * Creates new form Startsida
     */
    public Startsida_Agent(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMIBPortal = new javax.swing.JLabel();
        dropDown = new javax.swing.JComboBox<>();
        lblAgent = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnSok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMIBPortal.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        txtMIBPortal.setText("MIB PORTAL");
        getContentPane().add(txtMIBPortal, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 11, -1, 48));

        dropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Ändra Lösenord", "Logga ut" }));
        getContentPane().add(dropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 30, -1, -1));
        getContentPane().add(lblAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, 20));

        jButton1.setText("Visa Agent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel1.setText("Visa alla Aliens i Område :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));
        jComboBox1.setDoubleBuffered(true);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        btnSok.setText("Search");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });
        getContentPane().add(btnSok, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           try {
           String userID = LoggedUser.getUserID();
           String AID = idb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID = '" + userID + "'");
           lblAgent.setText(AID);
           }
           catch (Exception ettUndantag){
                        JOptionPane.showMessageDialog(null, "Something went wrong. Please contact your IT-Administrator.");
                        System.out.println("InternFelmeddelande:" + ettUndantag.getMessage());
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        omrade = jComboBox1.getSelectedItem().toString();
        new Alien_Omrade().setVisible(true);
    }//GEN-LAST:event_btnSokActionPerformed

    public static String getOmrade(){
        return omrade;
    }
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
            java.util.logging.Logger.getLogger(Startsida_Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startsida_Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startsida_Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startsida_Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Startsida_Agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JComboBox<String> dropDown;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel txtMIBPortal;
    // End of variables declaration//GEN-END:variables
}