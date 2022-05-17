/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Naritaa
 */
public class PersonArray {

        //person object arr
        private Person[] pArr = new Person[50];
        private int size = 0;
        
        public PersonArray(){
            String filePath = "data//Persons";
        
            Scanner sc = new Scanner(filePath);
            String name, surname;
            int age;
            
            while(sc.hasNext()){
                
                String line = sc.next();
                Scanner scLine = new Scanner(line);
                name = sc.next();
                surname = sc.next();
                age = sc.nextInt();
                scLine.close();
                pArr[size] = new Person(name, surname, age);
                size++;
            }
        }//end of personArr method
        public void print(){
            for(int i = pArr.length; i < 0; i++){
                System.out.println("");
            }
        }
        public void SortPeople(){
           
            for(int sortedIndex = pArr.length-1;sortedIndex >0; sortedIndex--){
                for(int currentIndex = 0;sortedIndex<currentIndex;currentIndex++){
                    if(pArr[currentIndex].getAge() > pArr[sortedIndex].getAge()){
                        int temp = pArr[currentIndex].getAge();
                        pArr[currentIndex].getAge() = pArr[sortedIndex].getAge();
                    }
                    
                }
            }
    
        }
}
