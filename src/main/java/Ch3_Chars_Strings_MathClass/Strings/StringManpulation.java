/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narita
 */
import javax.swing.*;

public class StringManpulation {
    public static void main (String [] args){
    
    String userInput1 = JOptionPane.showInputDialog("Input a word");
    String userInput2 = JOptionPane.showInputDialog("Input a word");
    int num = userInput1.compareTo(userInput2);
    
     if(userInput1.equals(userInput2)){
        System.out.println("They are englishly equal");
        }
     else if(num < 0){
         String input1Up = userInput1.toUpperCase();
         String input1Low= userInput1.toLowerCase();
         System.out.println(" Input 1 is greater."+"\tuppercase: "+ input1Up + "\tlowercase: "+ input1Low); 
        }
     else{
         String input2Up = userInput2.toUpperCase();
         String input2Low = userInput2.toLowerCase();
         System.out.println(" Input 2 is greater. " + "\tuppercase: " + input2Up + "\tlowercase: "+ input2Low);
        }
    }
}
//what is ok?
//is it normal
//idk