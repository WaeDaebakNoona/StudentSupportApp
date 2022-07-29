/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPreparations;

import java.util.Scanner;

/**
 *
 * @author Naritaa
 */
public class NamesArray {
    private String [] names;
    private int size;

    public NamesArray() {
        names = new String[100];
        String filepath = "data\\Names2";
        Scanner sc = new Scanner(filepath);
        
        while(sc.hasNext()){
            names[size] = sc.next();
            size++;
        }
        
        this.names = names;
        this.size = size;
    }
    public void sort(){
        for(int i = size-1; i>0; i--){
            for(int j = 0; j< i; j++){
                if(names[i].compareTo(names[i + 1])>0){
                String temp = names[i];
                names[i] = names[i+1];
                names[i+1] = temp;
                }
            }
        }
    }
    public int search(String name){
        //know binary search too
        for(int i = 0; i < names.length;i++){
            if(names[i].equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void insert(String name){
        
        
    }
    public void delete(String name){
        
    }
    public void shift(){
    }
    @Override
    public String toString() {
        return "NamesArray{" + "names=" + names + ", size=" + size + '}';
    }
    
    
    
    
}
