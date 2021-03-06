/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibprojekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author trnfa
 */
public class RegAlien extends javax.swing.JFrame {

    /**
     * Creates new form RegAlien
     */
    private static InfDB idb;
    
    private static int alienID;
    private static String regDate;
    private static String losen;
    private static String namn;
    private static String telefon;
    private static int omrade;
    private static String ras;
    private static int rasBenamning;
    private static String ansvarigAgent;
    
    public RegAlien(InfDB idb) {
        initComponents();
        txtRasBenamning.setVisible(false);
        this.idb = idb;
        setAlienID();
        setAnsvarigAgent();
        setDate();
    }
    //konstruktor för att ändra alien info
    public RegAlien(InfDB idb, int alienID){
        initComponents();
        this.idb = idb;
        this.alienID = alienID;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlienNamn = new javax.swing.JLabel();
        comboOmrade = new javax.swing.JComboBox<>();
        lblAlienID = new javax.swing.JLabel();
        lblTelnummer = new javax.swing.JLabel();
        lbllRegDatum = new javax.swing.JLabel();
        lblPlaceras = new javax.swing.JLabel();
        lblLosen = new javax.swing.JLabel();
        lblAnsvarigAgent = new javax.swing.JLabel();
        btnReg = new javax.swing.JButton();
        txtTelefon = new javax.swing.JTextField();
        txtNamn = new javax.swing.JTextField();
        txtLosen = new javax.swing.JPasswordField();
        txtLosenUpp = new javax.swing.JPasswordField();
        lblLosenUpp = new javax.swing.JLabel();
        lblVisaAnsvarigAgent = new javax.swing.JLabel();
        lblVisaDatum = new javax.swing.JLabel();
        lblVisaID = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        comboRas = new javax.swing.JComboBox<>();
        lblRasBenamning = new javax.swing.JLabel();
        txtRasBenamning = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAlienNamn.setText("Alien Namn: *");

        comboOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Örebro", "Västerås", "Vilhelmina", "Borås" }));
        comboOmrade.setDoubleBuffered(true);

        lblAlienID.setText("ALIEN ID:");

        lblTelnummer.setText("Telefonnummer: ");

        lbllRegDatum.setText("Datum för Registrering:");

        lblPlaceras.setText("Placeras i: ");

        lblLosen.setText("Lösenord: *");

        lblAnsvarigAgent.setText("Ansvarig Agent:");

        btnReg.setText("OK");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        lblLosenUpp.setText("Upprepa Lösenord: *");

        lblRas.setText("Ras:");

        comboRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Worm", "Squid", "Boglodite" }));
        comboRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRasActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLosen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAnsvarigAgent)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblVisaAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblRas)
                                .addComponent(lblPlaceras)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblLosenUpp)
                                .addGap(18, 18, 18)
                                .addComponent(txtLosenUpp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lbllRegDatum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblVisaDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelnummer)
                    .addComponent(lblAlienNamn)
                    .addComponent(lblAlienID))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVisaID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboOmrade, 0, 102, Short.MAX_VALUE)
                            .addComponent(comboRas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addComponent(lblRasBenamning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRasBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlienID)
                    .addComponent(lblVisaID, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlienNamn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelnummer)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRasBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRasBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(lblPlaceras)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLosen)
                    .addComponent(txtLosenUpp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLosenUpp))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbllRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAnsvarigAgent))
                    .addComponent(lblVisaAnsvarigAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVisaDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReg)
                    .addComponent(btnCancel))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        setRas();
        setOmrade();
        if (setPW() && setNamn() && setTelefon() && setRasBenamning()){
                try{
                idb.fetchSingle("INSERT INTO alien (Alien_ID, Registreringsdatum, Losenord, Namn, Telefon, Plats, Ansvarig_agent)"
                    + "Values (" + alienID + ", ' " + regDate + "' , '" + losen + "' , '" + namn + "' , " + telefon + ", " + omrade + ", " + ansvarigAgent + ")");              
                switch(ras){
                    case "Worm":
                        idb.fetchSingle("INSERT INTO Worm (Alien_ID) VALUES (" + alienID + ")");
                        break;
                    case"Squid":
                        idb.fetchSingle("INSERT INTO Squid (Alien_ID, antal_Armar) VALUES (" + alienID + ", " + rasBenamning + ")");
                        break;
                    case "Boglodite":
                        idb.fetchSingle("INSERT INTO boglodite (Alien_ID, Antal_Boogies)VALUES (" + alienID + ", " + rasBenamning + ")");
                }
                
                    System.out.println("OK");
                    dispose();
                }
                
                catch (Exception ettUndantag){
                    System.out.println("InternFelmeddelande:" + ettUndantag.getMessage());  
                }
            }
    }//GEN-LAST:event_btnRegActionPerformed

    private void comboRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRasActionPerformed
       ras = comboRas.getSelectedItem().toString(); 
       switch(ras){
           case "Squid":
               lblRasBenamning.setText("Ange antal armar: ");
               txtRasBenamning.setVisible(true);
               break;
           case "Boglodite":
               lblRasBenamning.setText("Ange antal boogies: ");
               txtRasBenamning.setVisible(true);
               break;
           case "Worm":
               lblRasBenamning.setText(" ");
               txtRasBenamning.setVisible(false);
               break;
       }
    }//GEN-LAST:event_comboRasActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(RegAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegAlien(idb).setVisible(true);
            }
        });
    }
    public void setDate(){
        regDate = "2022-05-19";
        lblVisaDatum.setText(regDate);
    }
    
    public boolean setAlienID(){
        boolean ok = true;
        try{
            int nyttID = Integer.parseInt(idb.fetchSingle("Select MAX(Alien_ID) from Alien"));
            nyttID++;
            alienID = nyttID;
            lblVisaID.setText(String.valueOf(alienID));
        }
        catch(Exception ettUndantag){
            JOptionPane.showMessageDialog(null, "Something went wrong. Please contact your IT-Administrator. is not Alien");
            System.out.println("InternFelmeddelande:" + ettUndantag.getMessage());         
            ok = false;
        }
        return ok;
    }
    
    public boolean setAnsvarigAgent(){
        boolean ok = true;
        try{
           lblVisaAnsvarigAgent.setText(idb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID = '" + LoggedUser.getUserID() + "'"));
           ansvarigAgent = LoggedUser.getUserID();
        }
        catch(Exception ettUndantag){
            JOptionPane.showMessageDialog(null, "Something went wrong. Please contact your IT-Administrator. is not Alien");
            System.out.println("InternFelmeddelande:" + ettUndantag.getMessage());       
            ok = false;
        }
        return ok;
    }
    
    public boolean setPW(){
        boolean ok = true;
        String newPW = txtLosen.getText();
        String newPWUpp = txtLosenUpp.getText();
        
        if(Validering.losenOK(txtLosen)){
            if(newPW.equals(newPWUpp)){
                losen = newPW;
            }
            else{
                JOptionPane.showMessageDialog(null, "The two passwords does not match");
                ok = false;
            }
        } 
        else{
            ok = false;
        }
        return ok;
    }
    
    public boolean setNamn(){
        boolean ok = false;
        String forslagNamn = txtNamn.getText();
        if (Validering.textFaltHarVarde(txtNamn) && Validering.txtHarInteBaraSpace(txtNamn)){
           try {
                String nr = idb.fetchSingle("SELECT count(*) from alien where namn = '"+ forslagNamn + "'");
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
    public void setOmrade(){
        String plats = comboOmrade.getSelectedItem().toString();
        switch(plats){
            case "Örebro":
                omrade = 1;
                break;
            case "Västerås":
                omrade = 2;
                break;
            case "Vilhelmina":
                omrade = 3;
                break;
            case "Borås":
                omrade = 4;
                break;
        }              
    }
    public boolean setRasBenamning(){
        boolean ok = false;
        if(ras.equals("Boglodite") || ras.equals("Squid")){ 
            if (Validering.textFaltHarVarde(txtRasBenamning) && Validering.isHeltal(txtRasBenamning)){
                rasBenamning = Integer.parseInt(txtRasBenamning.getText());
                ok = true;
            }
        }
        else if (ras.equals("Worm"))
            ok = true;
        
        return ok;
    }
    
    public void setRas(){
        ras = comboRas.getSelectedItem().toString();      
    }
    public boolean setTelefon(){    
        boolean resultat = false;
        if (txtTelefon.getText().equals("")){
            telefon = null;
            resultat = true;
        }
        else if(Validering.okPhoneNumber(txtTelefon)){
            telefon = txtTelefon.getText();
            resultat = true;
        }
        return resultat;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox<String> comboOmrade;
    private javax.swing.JComboBox<String> comboRas;
    private javax.swing.JLabel lblAlienID;
    private javax.swing.JLabel lblAlienNamn;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JLabel lblLosenUpp;
    private javax.swing.JLabel lblPlaceras;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasBenamning;
    private javax.swing.JLabel lblTelnummer;
    private javax.swing.JLabel lblVisaAnsvarigAgent;
    private javax.swing.JLabel lblVisaDatum;
    private javax.swing.JLabel lblVisaID;
    private javax.swing.JLabel lbllRegDatum;
    private javax.swing.JPasswordField txtLosen;
    private javax.swing.JPasswordField txtLosenUpp;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRasBenamning;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
