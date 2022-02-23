/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPreparations;

import javax.swing.JOptionPane;

/**
 *
 * @author Naritaa
 */
public class CheckPasswordStrength {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Input a password");
        
        boolean lowerLetter = false;
        boolean upperLetter = false;
        boolean isDigit = false;
        boolean otherChar = false;
     
        
        for(int i = 0; i< input.length(); i++){
            char currentLetter = input.charAt(i);
            
            if(Character.isLowerCase(currentLetter)){
                lowerLetter = true;
                
            }
            else{
                upperLetter = true;
       
            }
            if(Character.isDigit(currentLetter)){
                isDigit = true;   
               
            }
            if(!(Character.isDigit(currentLetter) && Character.isLetter(currentLetter))){
                otherChar = true;
        
            }
            
        
          
            }//end of for loop
            if(lowerLetter == true && upperLetter == true && isDigit == true && otherChar == true){
                System.out.println("Password is strong");
            }
            else{
                System.out.println("Password is weak");
            }
//            if(lowerLetter == true){
//                if(upperLetter == true){
//                    if(isDigit == true){
//                        if(otherChar == true){
//                            System.out.println("Strong");
//                        }
//                    }
//                }
//            }
//            else{
//                System.out.println("Weak");
//            }
    }
    
}//class
