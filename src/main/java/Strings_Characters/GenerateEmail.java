/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings_Characters;

import javax.swing.JOptionPane;

/**
 *
 * @author Naritaa
 */
public class GenerateEmail {
    public static void main(String[] args) {
        
        String userName = JOptionPane.showInputDialog("Enter your full name");
        
        //getting index of space
        int firstSpace = userName.indexOf(" ");
        //index of the place after the space
        int lastSpace = userName.lastIndexOf(" ") + 1;
        
        String firstName = userName.substring(0,firstSpace);
        String lastName =  userName.substring(lastSpace );
        
        System.out.println(firstName.toLowerCase() + "." + lastName.toLowerCase() + "@reddam.house");
    }
    
}
