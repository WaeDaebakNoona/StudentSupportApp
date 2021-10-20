/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch9_WhileLoops.DoLoops;

import javax.swing.JOptionPane;

/**
 *
 * @author NaritaA
 */
public class HeightsEx5 {

    public static void main(String[] args) {

        //enter heights {in meters} of unknown quantity of people
        String userInput = JOptionPane.showInputDialog("Enter a height in meters");
        double numUserInput = Double.parseDouble(userInput);

        double highestHeight = 0;

        while (numUserInput > 0) {

            if (highestHeight < numUserInput) {
                highestHeight = numUserInput;
            }

            userInput = JOptionPane.showInputDialog("Enter a height in meters");
            numUserInput = Double.parseDouble(userInput);

        }
        double roundNum = Math.round(highestHeight * 10);
        roundNum = roundNum /10;
              
        System.out.println("Tallest person: " + roundNum);

    }

}
