/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibprojekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author trnfa
 */
public class RegAgent extends javax.swing.JFrame {

    /**
     * Creates new form RegAgent
     */
    private static InfDB idb;
    
    private static int agentID;
    private static String anstallning;
    private static String losen;
    private static String namn; 
    private static String telefon;
    private static int omrade;
    private static String isAdmin;
    
    public RegAgent(InfDB idb) {
        this.idb = idb;
        initComponents();
        setAgentID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgentID = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblLosen = new javax.swing.JLabel();
        lblLosenUpprepa = new javax.swing.JLabel();
        lblOmrade = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        cbAdmin = new javax.swing.JComboBox<>();
        cbOmrade = new javax.swing.JComboBox<>();
        txtLosenUpprepa = new javax.swing.JPasswordField();
        txtLosen = new javax.swing.JPasswordField();
        txtTelefon = new javax.swing.JTextField();
        txtNamn = new javax.swing.JTextField();
        lblVisaID = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblAnstallning = new javax.swing.JLabel();
        txtAnstallning = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgentID.setText("Agent ID:");

        lblNamn.setText("Namn: *");

        lblTelefon.setText("Telefon:*");

        lblLosen.setText("Lösenord:*");

        lblLosenUpprepa.setText("Upprepa Lösenord:*");

        lblOmrade.setText("Tillhör Område:");

        lblAdmin.setText("Är Admin:");

        cbAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nej", "Ja" }));

        cbOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAnstallning.setText("ANstallnings Datum:*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLosenUpprepa)
                            .addComponent(lblLosen)
                            .addComponent(lblTelefon)
                            .addComponent(lblNamn)
                            .addComponent(lblAgentID)
                            .addComponent(lblAnstallning))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLosenUpprepa)
                            .addComponent(txtLosen)
                            .addComponent(txtTelefon)
                            .addComponent(txtNamn)
                            .addComponent(txtAnstallning, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(lblVisaID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOmrade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAdmin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblAgentID))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVisaID, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosen)
                    .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenUpprepa)
                    .addComponent(txtLosenUpprepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnstallning)
                    .addComponent(txtAnstallning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmrade)
                    .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdmin)
                    .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (setNamn() && setPW()&& setTelefon()&& setAnstallning()) {
            setOmrade();
            setAdmin();
            System.out.println(agentID + anstallning+  losen+ namn+  telefon+ omrade +isAdmin);
            try {
                idb.fetchSingle("INSERT INTO agent (Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Omrade)" +
                "VALUES (" + agentID + ", '" + namn + "', '" + telefon + "', '" + anstallning + "', '" + isAdmin + "', '" + losen + "' ," + omrade + ");");
                dispose();
            }
            catch(InfException ettUndantag){
                System.out.println("InternFelmeddelande:" + ettUndantag.getMessage()); 
            }
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
            java.util.logging.Logger.getLogger(RegAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegAgent(idb).setVisible(true);
            }
        });
    }
        public void setOmrade(){
            String inOmrade = cbOmrade.getSelectedItem().toString();
            switch(inOmrade){
                case "Svealand": 
                    omrade = 1;
                    break;
                case "Götaland":
                    omrade = 2;
                    break;
                case"Norrland":
                    omrade = 4;
                    break;
            }
        }
        public void setAdmin(){
           String isAdminCheck = cbAdmin.getSelectedItem().toString();
           switch (isAdminCheck){
            case"Nej":
                isAdmin = "N";
                break;
            case"Ja":
                isAdmin = "J";
                break;
            }
        }
        
        public boolean setAgentID(){
        boolean ok = true;
        try{
            int nyttID = Integer.parseInt(idb.fetchSingle("Select MAX(agent_ID) from agent"));
            nyttID++;
            agentID = nyttID;
            lblVisaID.setText(String.valueOf(agentID));
        }
        catch(Exception ettUndantag){
            JOptionPane.showMessageDialog(null, "Something went wrong. Please contact your IT-Administrator. is not Alien");
            System.out.println("InternFelmeddelande:" + ettUndantag.getMessage());         
            ok = false;
        }
        return ok;
    }
        public boolean setNamn(){
        boolean ok = false;
        String forslagNamn = txtNamn.getText();
        if (Validering.textFaltHarVarde(txtNamn) && Validering.txtHarInteBaraSpace(txtNamn)){
           try {
                String nr = idb.fetchSingle("SELECT count(*) from agent where namn = '"+ forslagNamn + "'");
                int antal = Integer.valueOf(nr);
                if (antal == 0){
                    namn = forslagNamn;
                    ok = true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please chose an unique name for the Alien.");
                }     
            }
            catch(Exception ettUndantag){
            JOptionPane.showMessageDialog(null, "Something went wrong");         
            }
        }
        return ok;
    }  
        
    public boolean setTelefon(){    
        boolean resultat = false;
        if(Validering.okPhoneNumber(txtTelefon)){
            telefon = txtTelefon.getText();
            resultat = true;
        }
        return resultat;
    }
    
    public boolean setPW(){
        boolean ok = true;
        String newPW = txtLosen.getText();
        String newPWUpp = txtLosenUpprepa.getText();
        
        if(Validering.losenOK(txtLosen)){
            if(newPW.equals(newPWUpp))
                losen = newPW;
            else{
                JOptionPane.showMessageDialog(null, "The two passwords does not match");
                ok = false;
            }
        } 
        else
            ok = false;

        return ok;
    }
    
    public boolean setAnstallning(){
        boolean ok = false;
        if (Validering.isDate(txtAnstallning)){
            anstallning = txtAnstallning.getText();
            ok = true;
        }    
        
        return ok;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAdmin;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAgentID;
    private javax.swing.JLabel lblAnstallning;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JLabel lblLosenUpprepa;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblVisaID;
    private javax.swing.JTextField txtAnstallning;
    private javax.swing.JPasswordField txtLosen;
    private javax.swing.JPasswordField txtLosenUpprepa;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}