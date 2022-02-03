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
public class CompareName {
    public static void main(String[] args) {
        
        //initialise
        String userInput = JOptionPane.showInputDialog("Enter a name");
        String alphabetical = userInput;
        
        //test
        for(int i = 0; i<4; i++){
            //process
            int compareInt = userInput.compareTo(alphabetical);
            
            if(compareInt < 0){
                System.out.println(userInput + " is more alphabetical");
            }
            
            //change
            userInput = JOptionPane.showInputDialog("Enter a name");
        }
        
        
            
    }
    
}
