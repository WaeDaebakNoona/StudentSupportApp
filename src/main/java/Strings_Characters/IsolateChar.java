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
public class IsolateChar {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Input a word");
        char a = input.charAt(0);
        int len = input.length();
        char b = input.charAt(len-1);
        System.out.println("First letter: " + a + "\nLast letter: " + b);
        
       // for(int i =  ; i<= len; i++){
            
          //  int backwards = len - 1;
           // char backwardsChar = input.charAt(backwards);
            //System.out.println(backwardsChar);
            
            
       // }
        
        
        
    }
    
}
