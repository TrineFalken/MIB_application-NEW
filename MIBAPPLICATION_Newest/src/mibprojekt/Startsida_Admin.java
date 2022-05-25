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
public class Startsida_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Startsida
     */
    private static InfDB idb;
    public Startsida_Admin(InfDB idb) {
        this.idb = idb;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        cbLoggaUt = new javax.swing.JComboBox<>();
        btnRegAlien = new javax.swing.JButton();
        btnRegAgent = new javax.swing.JButton();
        cbAgent = new javax.swing.JCheckBox();
        cbAlien = new javax.swing.JCheckBox();
        txtFalt = new javax.swing.JTextField();
        btnSok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnRaderaUtrustning = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbLoggaUt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Ändra Lösenord", "Logga ut" }));
        cbLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoggaUtActionPerformed(evt);
            }
        });
        getContentPane().add(cbLoggaUt, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        btnRegAlien.setText("Registrera Alien");
        btnRegAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAlienActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegAlien, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 126, -1));

        btnRegAgent.setText("Registrera Agent");
        btnRegAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAgentActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 126, -1));

        buttonGroup1.add(cbAgent);
        cbAgent.setText("Agent");
        getContentPane().add(cbAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        buttonGroup1.add(cbAlien);
        cbAlien.setText("Alien");
        getContentPane().add(cbAlien, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));
        getContentPane().add(txtFalt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 160, 30));

        btnSok.setText("SÖK");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });
        getContentPane().add(btnSok, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 30));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        jButton2.setText("omradechef");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        btnRaderaUtrustning.setText("RADERA UTRUSTNING");
        btnRaderaUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaUtrustningActionPerformed(evt);
            }
        });
        getContentPane().add(btnRaderaUtrustning, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mibprojekt/pictures/Bild_Startsida_Agent.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAgentActionPerformed
        new RegAgent(idb).setVisible(true);
    }//GEN-LAST:event_btnRegAgentActionPerformed

    private void cbLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoggaUtActionPerformed
        String action = cbLoggaUt.getSelectedItem().toString();
        switch(action){
            case "Logga ut":
                System.exit(0);
                break;
            case "Ändra Lösenord":
                new BytLosen(idb).setVisible(true);
                dispose();
                break;
        }
    }//GEN-LAST:event_cbLoggaUtActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
               String svarID = null;
       String category = null;
        if (Validering.textFaltHarVarde(txtFalt)){
                String sokningNamn = txtFalt.getText();
            try{
                if(cbAgent.isSelected()){
                      svarID = idb.fetchSingle("SELECT agent_ID from agent WHERE Namn= '" + sokningNamn + "'");
                       category = "agent";
                }
                else if (cbAlien.isSelected()){
                      svarID = idb.fetchSingle("SELECT alien_ID from alien WHERE Namn= '" + sokningNamn + "'");
                      System.out.println(svarID);
                      category = "alien";
                }
                else {
                    JOptionPane.showMessageDialog(null, "Pick a category");
                }
            }            
            catch (Exception annatUndantag){
                JOptionPane.showMessageDialog(null, "Something went wrong. Please contact your IT-Administrator.");
                System.out.println("InternFelmeddelande:" + annatUndantag.getMessage());  
            }
            if (svarID == null){
                JOptionPane.showMessageDialog(null, "You have entered wrong username or category.");            
            }
            else if(svarID !=null){
                new SokAgentAlien(idb, svarID, category).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnSokActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Alien_Ras(idb).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAlienActionPerformed
        new RegAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnRegAlienActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new Andra_Omradeschef(idb).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRaderaUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaUtrustningActionPerformed
       new RaderaUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_btnRaderaUtrustningActionPerformed

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
            java.util.logging.Logger.getLogger(Startsida_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startsida_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startsida_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startsida_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Startsida_Admin(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnRaderaUtrustning;
    private javax.swing.JButton btnRegAgent;
    private javax.swing.JButton btnRegAlien;
    private javax.swing.JButton btnSok;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbAgent;
    private javax.swing.JCheckBox cbAlien;
    private javax.swing.JComboBox<String> cbLoggaUt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField txtFalt;
    // End of variables declaration//GEN-END:variables
}
