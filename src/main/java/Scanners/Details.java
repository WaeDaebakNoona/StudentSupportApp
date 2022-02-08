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
public class Details {
    public static void main(String[] args) {
        
        String userInput = JOptionPane.showInputDialog("Enter name:\n" + "ID number: \n" + "Height(m): \n" + "You smoke(true/false):");
        
        Scanner sc = new Scanner(userInput);
        
        
        String name = sc.next();
        int id = sc.nextInt();
        double height = sc.nextDouble();
        boolean smoke = sc.nextBoolean();
        System.out.println("NAME: " + name + "\nID: " + id + "\nHEIGHT: " + height + "\nSMOKE: " + smoke);
         
        //while(sc.hasNext()){
        //    String answers = sc.next();
         //   System.out.println(answers);
        //}
        
        
    }
    
}
