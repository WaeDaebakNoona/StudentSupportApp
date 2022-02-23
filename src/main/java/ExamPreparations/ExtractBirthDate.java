/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPreparations;

import javax.swing.JOptionPane;

/**
 *
 * @author Naritaa
 */
public class ExtractBirthDate {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter ID number");
        
        String yearStr = input.substring(0,2);
        int yearInt = Integer.parseInt(yearStr);
        String monthStr = input.substring(2,4);
        String day = input.substring(4,6);
        
        if(yearInt > 50){
            yearStr = "19" + yearStr;

        }
        else{
            yearStr = "20" + yearStr;
        }
        System.out.println(day + "/" + monthStr + "/" + yearStr);
//        System.out.println("YEAR: " + yearStr);
//        System.out.println(monthStr);
//        System.out.println(day);        
        
    }
}
