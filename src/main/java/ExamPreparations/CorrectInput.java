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
public class CorrectInput {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter a string");
        
        String output = "";
        
        for(int i = 0; i<input.length(); i++){
            char currentLetter = input.charAt(i);
            if(currentLetter == '3'){
                currentLetter = 'e';
                output += "" + currentLetter;
            }
            else if(currentLetter == '7'){
                currentLetter = 'l';
                output += "" +currentLetter;
            }
            else{
                output += "" +currentLetter;
            }
            
        
        }
        System.out.println(output);
    }
    
}
