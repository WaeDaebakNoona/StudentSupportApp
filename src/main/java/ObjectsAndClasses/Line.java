/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectsAndClasses;

/**
 *
 * @author Naritaa
 */
public class Line {
    int size;
    char pattern;
    
//    public Line(){
//        size = 2;
//        pattern = '*';
//    }
    public Line(int s, char p){
        size = s;
        pattern = p;
    }
    public void draw(){
        //for(int num = size; num>= 0; num--){

            for(int i = 1; i < size; i++){
            System.out.println(pattern);
            System.out.println();
            //for(int j = 0; j < size; j++){
                //System.out.println(pattern);      
            }
        }//end of draw() method
    public void drawVert(){
        for(int i = 0; i< size;i++){
            System.out.print(pattern);
        }
    }
}//end of class 
    
   
    

