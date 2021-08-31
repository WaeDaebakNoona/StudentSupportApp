/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolpractical;

/**
 *
 * @author Naritaa
 */
import javax.swing.*;
public class UserName {
    public static void main(String [] args){
        
        String firstName = JOptionPane.showInputDialog("Type your first name");
        String lastName = JOptionPane.showInputDialog("Type your last name");
        String choiceStr = JOptionPane.showInputDialog("(1)Initials; \t (2) UpperCase; \t (3) numberOfLetters; \t (4)alphabeticallyFirst; \t (5)PrintName");
        int choiceInt = Integer.parseInt(choiceStr);
        
        switch(choiceInt){
                case 1:
                        char FN = firstName.charAt(0);
                        char LN = charAt(lastName);
                        System.out.println("Initials: "+ FN + LN);
                        break;
               case 2: 
                        String firstUpper = firstName.toUpperCase();
                        String lastUpper = lastName.toUpperCase();
                        System.out.println(firstUpper + "\t" + lastUpper);
                        break;
               case 3: 
                        int firstlength = firstName.length();
                        int lastLength = lastName.length();
                        System.out.println( firstlength + lastLength);
                        break;
               case 4: 
                        int compareNum = firstName.compareTo(lastName);
                        if(compareNum < 0){
                            System.out.println(firstName + "is more alphabetical");
                        }
                        else if(firstName.equals(lastName)){
                            System.out.println("They are equal");
              
                        }
                        else{
                            System.out.println(lastName +" is more alphabetical");
                        }
                        break;
               default:
                        System.out.println("First name: " + firstName + "Last name; " + lastName);
                        break;
                    
                        
                        
                        
                        
                       
                       
        }
        
    }
}
