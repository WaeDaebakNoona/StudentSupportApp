/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch8_SwitchStatementsAndMore;

/**
 *
 * @author CLLB24
 */
//input and output choice

import javax.swing.*;

public class userChoices {
    public static void main(String[]args){
    
        String userInputStr = JOptionPane.showInputDialog("Choose a classical composer:\n(1)Beethoven;\n(2)Mozart;\n(3)Tchaikovsky ;\n(4)Haydn ;\n(5)Bach");
        int userInputInt = Integer.parseInt(userInputStr);
        
        if(userInputInt == 1){
            System.out.println("You chose Beethoven");
        }
        else if(userInputInt == 2){
            System.out.println("You chose Mozart");
        }
        else if(userInputInt == 3){
            System.out.println("You chose Tchaikovsky");
        }
        else if(userInputInt == 4){
            System.out.println("You chose Haydn");
        }
        else{
            System.out.println("You chose Bach");
        }
    
    }
}
