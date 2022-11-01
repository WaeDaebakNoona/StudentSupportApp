/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author NaritaA
 */
public class StudentManager {
    
    private Student [] sArr;
    private int size;
    private String filePath = "data\\Student2.txt";
    
    //input formatter
    
    public StudentManager() throws FileNotFoundException{
        
        sArr = new Student[10];
        size = 0;
        Scanner sc = new Scanner(new File(filePath));
        
        while(sc.hasNext()){
            String line = sc.nextLine();
            Scanner lineSc = new Scanner(line).useDelimiter("#");
            String name = lineSc.next();
            String surname = lineSc.next();
            String dateStr = lineSc.next();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy");
            LocalDate date = LocalDate.parse(dateStr, dtf);
            sArr[size] = new Student(name,surname,date);
            size++;
            
        }
    }

   public String toString(){
       String output = "";
       for(int i = 0 ; i<size ;i++){
            output += sArr[i].toString() + "\n";
       }
       return output;
   }
    
    
    
    
}
