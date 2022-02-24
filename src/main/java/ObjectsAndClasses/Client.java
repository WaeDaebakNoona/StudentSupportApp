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
public class Client {
    
    private String clientName;
    private String accountNumber;
    private double balance;
    
    public Client(String inName, String inAccount, double inBalance){
        clientName = inName;
        accountNumber = inAccount;
        balance = inBalance;    
    }
    
    public void setName(String nameInput){
        clientName = nameInput;
    }
    public String getName(){
        return clientName;
    }
    
}
