/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Naritaa
 */
public class Oldest {
    public static void main(String[] args) {
       // I can see you
       
        String userInput = JOptionPane.showInputDialog("input boys' names and ages");
        
        
        
       
        String currName = "";
        String oldestName = "";
        int oldestAge = 0;
        
        
        while(!userInput.equals("stop")){
            Scanner sc = new Scanner(userInput);
           currName = sc.next();
            int boyAge = sc.nextInt();
            if(boyAge > oldestAge){
                oldestAge = boyAge;
                oldestName = currName;
            }
            
         
            userInput = JOptionPane.showInputDialog("input boys' names and ages");
            
        }System.out.println("Oldest Name: " + oldestName + "Oldest number: " + oldestAge);
    }
    
}
