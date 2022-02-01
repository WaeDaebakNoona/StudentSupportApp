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
public class SwopChars {
    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Enter a word");
        String input2 = JOptionPane.showInputDialog("Enter a word");
        
        //get char (1st letter)
        char a = input1.charAt(0);
        char b = input2.charAt(0);
        //get the length()
        int len1 = input1.length();
        int len2 = input2.length();
        
        //substring = the begining and end number 
        String one = input1.substring(1);
        String two = input2.substring(1);

        System.out.println( b + one + "\n" + a + two);
         //yay got it!
        

     
    }
    
}
