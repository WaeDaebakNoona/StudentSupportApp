/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Naritaa
 */
public class LinearSearch {
    public static void main(String[] args) {
        int [] numArr = {3,8,2,9,1,5,7,8,5,10};
        
        int index = linearSearch(7, numArr);
    }
    
    public static int linearSearch(int search, int[] numArr){
        
        for(int i = 0;i<numArr.length;i++){
            if(numArr[i] == search){
                return i;
            }            
        }
        return -1;
    }
}

