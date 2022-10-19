/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author NaritaA
 */
public class StudentManager {
    
    private Student [] students;
    private int size;
    private String filePath = "data\\Students2.txt";
    //input formatter
    public StudentManager(){
        
        size = 0;
        Scanner sc = new Scanner(filePath);
        
        while(sc.hasNext()){
            String line = sc.nextLine();
            Scanner lineSc = new Scanner(line).useDelimiter("#");
            String name = lineSc.next();
            String surname = lineSc.next();
            String dateStr = lineSc.next();
            LocalDate date = LocalDate.of(dateStr);
            
        }
    }
    
    
}
