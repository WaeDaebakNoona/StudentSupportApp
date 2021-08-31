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
import javax.swing.*;
public class UserChoiceSwitch {
    public static void main(String[]args){
        String userChoice = JOptionPane.showInputDialog("choose a classical composer:\n(1)Beethoven;\n(2)Mozart;\n(3)Tchaikovsky ;\n(4)Haydn ;\n(5)Bach");
        int userChoiceInt = Integer.parseInt(userChoice);
        
        switch(userChoiceInt){
            case 1:
                System.out.println("You chose Beethoven");
            case 2:
                System.out.println("You chose Mozart");
            case 3:
                System.out.println("You chose Tchaikovsky");
            case 4:
                System.out.println("You chose Haydn");
            case 5:
                System.out.println("You chose Bach");
            default:
                System.out.println("Clearly you aren't able to read");
        }
    }
    
}
