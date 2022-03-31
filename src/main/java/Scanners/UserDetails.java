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
//practice test
//done
public class UserDetails {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Enter name, surname and age. (spaces in between)");
        
        Scanner sc = new Scanner(userInput);
       
        String name = sc.next();
        String surname = sc.next();
        int age = sc.nextInt();
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age);
    }
    
}
