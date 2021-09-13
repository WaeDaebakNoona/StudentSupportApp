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
public class AvgGirlsNamesEx5 {
    public static void main(String [] args){
        String nameInput = JOptionPane.showInputDialog("Enter a girl's name");
        
        int lengthOfName = 0;
        int count =0;
        
        while(!(nameInput.equals("*"))){ 
            
            int intNum = nameInput.length();
            lengthOfName = intNum + lengthOfName ; 
            count ++;
           nameInput = JOptionPane.showInputDialog("Enter a girl's name");
            
    }
        int ave = lengthOfName/count;
        System.out.println(ave);
    
    }
}
