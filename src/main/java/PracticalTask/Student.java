/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticalTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Naritaa
 */
public class Student {
    private String name;
    private String[] subjects;
    private int[] yearMarks;
    
    public Student() throws FileNotFoundException{
        subjects = new String[15];
        yearMarks = new int[15];
        
        String filepath = "data\\Student.txt";
        Scanner sc = new Scanner(new File(filepath));
        
        name = sc.nextLine();
        String subLine = sc.nextLine();
        String markLine = sc.nextLine();
        
        sc.close();
        
        Scanner subSc = new Scanner(subLine).useDelimiter("#");
        Scanner markSc = new Scanner(markLine).useDelimiter("#");
        
        for (int i = 0; i < 15; i++) {
            subjects[i] = subSc.next();
            yearMarks[i] = markSc.nextInt();
        }
        
    }//end of constructor
    
    public String yearReport(){
        String output = "YEAR REPORT \n" + "STUDENT: " + name.toUpperCase();
        for (int i = 0; i < 15; i++) {
            output = subjects[i].toUpperCase() + ":" + yearMarks[i];
            
        }
        return output;
    }//yearreport
    
    
    public String getSubject(int index){
        for(int i = 0; i < index; i++){
            if(i == index){
                return subjects[i];
            }
        }
        return "subject not found";
    }
    
    public void markSort(){
        //bubblesort
        for (int i = subjects.length -1; i >0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if(yearMarks[j]>yearMarks[j+1]){
                    int temp = yearMarks[j];
                    yearMarks[j] = yearMarks[j+1];
                    yearMarks[j+1] = temp;
                    sorted = false;
                }
                
            }
            if(sorted){
                break;
            }
            
        }
        
        //selection sort
        for (int i = 0; i < subjects.length; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < subjects.length; j++) {
                if(yearMarks[j]<yearMarks[smallestIndex]){
                    smallestIndex = j;
                }
                
            }
            int temp = yearMarks[smallestIndex];
            yearMarks[smallestIndex] = yearMarks[i];
            yearMarks[i] = temp;
            
        }
    }
    
    public int markSearch(int mark){
        int start = 0;
        int end = yearMarks.length;
        
        while(start<end){
            int mid = (start + end)/2;
            if(mid == mark){
                return mid;
            }
            else if(mid>mark){
                end = mid + 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
