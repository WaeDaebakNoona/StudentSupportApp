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
    
    public void nameSort(){
        //selection sort

        for(int i = 0; i < size - 1;i++){
            for(int j = i + 1; j<size;j++){
                
                if(people[i].getName().compareTo(people[j].getName()) > 0){
                Person temp = people[i];
                people[i] = people[j];
                people[j] = temp;
                
                }
            }
            
        } 
        
    }
    public void ageSort(){
        //bubble sort
        for(int i = size-1; i>0; i--){
            for(int j = 0; j<i; j++){
                if(people[j].getAge() > people[j+1].getAge() ){
                    Person temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                    
                    
                }
            }
        }
        
        
    }
    //binary search (search name and return an index)
    //add and delete
    public int binarySearch(String str){
        //user inserts name, return index
        int start = 0;
        int end = size -1;
        
        while(start<= end){
            int mid = (start+end)/2;
            
            if(people[mid].getName().equalsIgnoreCase(str)){
                return mid;
            }
            else if(people[mid].getName().compareToIgnoreCase(str)> 0){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            
            
        }
        return - 1;
    }
    
}
