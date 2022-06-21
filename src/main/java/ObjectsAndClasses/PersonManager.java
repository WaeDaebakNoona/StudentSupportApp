/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectsAndClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Naritaa
 */
public class PersonManager {
    
    private Person[] people = new Person[100];
    private int size = 0;
    
    public PersonManager() throws FileNotFoundException{
        
        Scanner fileSc = new Scanner(new File("People.txt"));
        
        while(fileSc.hasNextLine()){
            
            String line = fileSc.nextLine();
            Scanner scLine = new Scanner(line).useDelimiter("#");
            
            String name = scLine.next();
            String surname = scLine.next();
            int age = scLine.nextInt();
            
            people[size] = new Person(name, surname, age);
            size++;
        }
    }
    public String toString(){
        String output = "";
        for(int i = 0; i<size; i++){
             output+= people[i] + "\n";
        }
        return output;
    }
    
    public String nameSort(){
        //insertion sort
        int size = 0;
       
        return "";
        
    }
    public int ageSort(){
        return 0;
    }
    
    
    
}
