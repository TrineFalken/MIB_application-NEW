/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibprojekt;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author trnfa
 */
public class RaderaUtrustning extends javax.swing.JFrame {

    private String chosenItem;
    private static String kategori;
    private static String id;
    private static InfDB idb;
    
    public RaderaUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllcbUtrustning();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRadera = new javax.swing.JToggleButton();
        btnCancel = new javax.swing.JToggleButton();
        cbUtrustning = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRadera.setText("DELETE");
        btnRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cbUtrustning.setEditable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(cbUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRadera, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnRadera))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(cbUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(btnCancel)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed
    
    private String getChosenItemID(){
        try{
        id = idb.fetchSingle("SELECT utrustnings_ID FROM utrustning where benamning = '"+ cbUtrustning.getSelectedItem() + "'");
        }   
        catch (Exception e){
        System.out.println("Error");
        }
        return id;
    }
    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed
        getChosenItemID();
        String input = "You are about to delete equipment.";
        new ControlWindow(input, "utrustning").setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRaderaActionPerformed
    
     public static boolean deleteUtrustning(){
        getKategori();
        boolean raderad = false;
        try{
            idb.fetchSingle("Delete from utrustning where utrustnings_id = " + id);
            idb.fetchSingle("Delete from " + kategori + " where utrustnings_id = " + id );
            raderad = true;
        }
        catch(Exception e){
            System.out.println("radera error");
        }
        return raderad;
    }
    private static String getKategori(){
        try{
            String isVapen = idb.fetchSingle("SELECT * from vapen where utrustnings_id = " + id);
            String isTeknik = idb.fetchSingle("Select * from teknik where utrustnings_id = " + id);
            String isKommunikation = idb.fetchSingle("Select * from kommunikation where utrustnings_id = " + id);
            
            if(isVapen != null)
                kategori = "vapen";
            else if (isTeknik != null)
                kategori = "teknik";
            else if (isKommunikation != null)
                kategori = "kommunikation";
            else    
                System.out.println("error");
        }
        catch (Exception e){
            System.out.println("InternFelmeddelande:" + e.getMessage());
        }    
        return kategori;        
    }
    private void fyllcbUtrustning() {
        ArrayList<String> allaOmraden;
        try {
            allaOmraden = idb.fetchColumn("Select benamning from utrustning");
            for (String benamning : allaOmraden) {        
                cbUtrustning.addItem(benamning);
            }
        } catch (Exception annatUndantag) {
            JOptionPane.showMessageDialog(null, "Something went wrong. Please contact your IT-Administrator.");
            System.out.println("InternFelmeddelande:" + annatUndantag.getMessage());
        }
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
            java.util.logging.Logger.getLogger(RaderaUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaderaUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaderaUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaderaUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaderaUtrustning(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancel;
    private javax.swing.JToggleButton btnRadera;
    private javax.swing.JComboBox<String> cbUtrustning;
    // End of variables declaration//GEN-END:variables
}
