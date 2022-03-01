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
    public void setAccount(String accountInput){
        accountNumber = accountInput;
    }
    public String getAccount(){
        return accountNumber;
    }
    public void setBalance(double balanceInput){
        balance = balanceInput;
    }
    public double getBalance(){
        return balance;
    }
    
    public String changName(){
        
        String name = getName();
        int firstSpace = name.indexOf(" ");
        int lastSpace = name.lastIndexOf(" ") + 1;
        char firstIntitial = name.charAt(0);
        String lastName = name.substring(lastSpace);

        String changedname = lastName +"," + firstIntitial;
        return changedname;
    }
    public String toString(){
        return changName() + ", Balance: " + balance + ", Account: " + accountNumber;
    }
}
