/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectsAndClasses;

import javax.swing.JOptionPane;

/**
 *
 * @author Naritaa
 */
public class ClientUI {
    public static void main(String[] args) {
        
        Client c = new Client("rita" ,"162534" , 1234.9);

        String clientName = c.getName();
        String clientAccount = c.getAccount();
        double clientBalance = c.getBalance();
        
        
        if(clientAccount.length() <= 6 && clientAccount.charAt(0) != '0'){
//            if(){
//            }
        }
        System.out.println(clientName + clientAccount + clientBalance);
        
        if(clientBalance < 0.0){
            //String overDrawn = JOptionPane.showMessageDialog(null, "Your balance is overdrawn");
            //System.out.println(overDrawn);
        }
    }
    
}
