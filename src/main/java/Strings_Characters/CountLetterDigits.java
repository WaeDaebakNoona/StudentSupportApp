/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings_Characters;

import javax.swing.JOptionPane;

/**
 *
 * @author NaritaA
 */
public class CountLetterDigits {
    public static void main(String[] args) {
        
        int count = 1;
        String input = JOptionPane.showInputDialog("input a character");
        
        //initialise variable
        
        while(!input.equals("x")){
            
           input = JOptionPane.showInputDialog("input a character");
           char inputChar = input.charAt(0);
           
           //Char upper = inputChar.toUpperCase();
           count++;
           
            if(!input.equals("x")){
            System.out.println(count);
            }
        }
       
    }
}
