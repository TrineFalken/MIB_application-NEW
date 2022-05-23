/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibprojekt;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;

/**
 *
 * @author trnfa
 */
public class SokAgentAlien extends javax.swing.JFrame {

    /**
     * Creates new form sokAgent
     */
    private JCheckBox cbChoice;
    private JTextField searchIndividual;
    private InfDB idb;
    private String category;
    private String id;
    private String namn;
    private String datum;
    private String plats;
    private String telefon;

    private String ras = null;
    private String isAdmin = null;
    private String ansvarigAgent = null;

    
    public SokAgentAlien(InfDB idb, String id, String category) {
        this.idb = idb;
        this.id = id;
        this.category = category;
      //  fillRuta();
        initComponents();
        fyllAllt();
    }
    
    private void fyllAllt(){
        lblID.setText("ID: " + id);
        lblNamn.setText("Namn: " + fyllRuta("namn"));
        lblTele.setText("Telefon: " + fyllRuta("telefon"));
        
        switch(category){
            case "alien":
                lblDatum.setText("Registreringsdatum: " + fyllRuta("registreringsdatum"));
                lblOmrade.setText("Plats: " + fyllRuta("plats"));
                lblRas.setText("Ras: ---");
                lblAnsvarig.setText("Ansvarig Agent: " + fyllRuta("ansvarig_agent"));
                lblIsAdmin.setText(" ");
                break;
            case "agent":
                lblDatum.setText("Anställningsdatum: " + fyllRuta("anstallningsdatum"));
                lblOmrade.setText("Område: " + fyllRuta("omrade"));
                lblIsAdmin.setText("Är Admin: " + fyllRuta("administrator"));
                lblRas.setText(" ");
                lblAnsvarig.setText(" ");
        }
    }

    public String fyllRuta(String get){
        String svar = null;
        try{
            switch(category){
                case "agent":
                    svar = idb.fetchSingle("SELECT "+ get + " from agent where agent_id = "+ id); 
                    break;
                case "alien":
                    svar = idb.fetchSingle("SELECT " + get + " from alien where alien_id = " + id);
                    break;
            }
        }
        catch(Exception ettUndantag){
            System.out.println("OJ");
        }
        return svar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEdit = new javax.swing.JButton();
        lblNamn = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblTele = new javax.swing.JLabel();
        lblOmrade = new javax.swing.JLabel();
        lblAnsvarig = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        lblIsAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEdit.setText("EDIT");
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 213, 73, -1));

        lblNamn.setText("Namn:");
        getContentPane().add(lblNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 34, -1, 20));

        lblID.setText("ID:");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lblTele.setText("Telefon:");
        getContentPane().add(lblTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblOmrade.setText("Område:");
        getContentPane().add(lblOmrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblAnsvarig.setText("Ansvarig agent:");
        getContentPane().add(lblAnsvarig, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblRas.setText("Ras:");
        getContentPane().add(lblRas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblDatum.setText("RegDatum:");
        getContentPane().add(lblDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        lblIsAdmin.setText("Är Admin:");
        getContentPane().add(lblIsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SokAgentAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SokAgentAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SokAgentAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SokAgentAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new SokAgentAlien(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel lblAnsvarig;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIsAdmin;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblTele;
    // End of variables declaration//GEN-END:variables
}