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
public class IsolateChars {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Enter a word");
        
        int len = userInput.length();
        char a = userInput.charAt(0);
        char z = userInput.charAt(len-1);
        //getting first and last letter
        System.out.println("First: " + a + "\n" + "Last: " + z );
        
        //display word backwards
        String output = "";
        //int i = 0; i<= len - 1; i++
        for(int i = userInput.length() - 1; i>= 0; i--){
            output = output + userInput.charAt(i);
        }
        System.out.println("Backwards: " + output);
        
        int half = (len/2);
        
        
        
        if (len % 2 ==0) {
            char mid1 = userInput.charAt(half-1) ;
            char mid2 = userInput.charAt(half) ;
            System.out.print("Middle: " +  mid1 + mid2);
        } else {
            char mid = userInput.charAt(half);
            System.out.println("middle: " + mid);
        }
        
       
        
        //only vowels in string = contains()
        
        String vowels = "aeiou";
        boolean ans = userInput.contains(vowels);
        
        
    }//psvm
    
}
