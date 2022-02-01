/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings_Characters;

import javax.swing.JOptionPane;

/**
 *
 * @author Narita
 */
public class LastInList {
    public static void main(String[] args) {
        
        String userInput = JOptionPane.showInputDialog("Input a first name");
        String base = userInput;
        
        int count = 0;
        
        while(!userInput.equals("@@@")){
            
            count++;
            userInput = JOptionPane.showInputDialog("Input a first name");
        }
        
        System.out.println(count + " names were entered");
        
        int compare = userInput.compareTo(base);
        if(compare < 0 ){
            System.out.println(base + "is more alphabetical");
        }
        else if(compare > 0){
            System.out.println(userInput + "is more alphabetical");
        
        }
        else{
            System.out.println("they are the same");
        }
    }
    
}
