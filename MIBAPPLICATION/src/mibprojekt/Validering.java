/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibprojekt;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jpn
 */
public class Validering {
    
    public static boolean textFaltHarVarde(JTextField rutaAttKolla)
    {
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter information before logging on.");
            resultat = false;
            rutaAttKolla.requestFocus();
        }       
        
        return resultat;
    }
    
    public static boolean isHeltal(JTextField rutaAttKolla)
    {
    boolean resultat = true; 
    
    try{
        String inStrang = rutaAttKolla.getText();
        Integer.parseInt(inStrang);        
        rutaAttKolla.requestFocus();
    }
    catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
        resultat = false;    
    }
    
       
    return resultat;
    }
    
    public static boolean doesNotContainSpace(JTextField rutaAttKolla){
        boolean resultat = true;
        
        String inStrang = rutaAttKolla.getText();
        if(inStrang.contains(" ")){
            JOptionPane.showMessageDialog(null, "Please avoid using spaces.");
            resultat = false;
            rutaAttKolla.requestFocus();
        }       
        
        return resultat;
    }
    
    public static boolean isOkLength(JTextField rutaAttKolla){
        //kollar att rutan har innehåll samt att tecken är under 10 tecken
        boolean resultat = true;      
        String inStrang = rutaAttKolla.getText();

        if(textFaltHarVarde(rutaAttKolla) && inStrang.length() < 10) {
            JOptionPane.showMessageDialog(null, "Please keep your password within the 10symbol limit.");
            resultat = false;
            rutaAttKolla.requestFocus();            
        }
        
        return resultat;
    }
    
}
