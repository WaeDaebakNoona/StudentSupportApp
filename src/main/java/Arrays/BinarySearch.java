/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Naritaa
 */
public class BinarySearch {
    public static void main(String[] args) {
        
        int search = 8;
        int searchIndex = -1;
        int [] numArr = {1,2,3,4,5,6,7,8,9,10};
        int start = 0;
        int end = numArr.length - 1;
        
        
        while(start<=end){
            int middle = (start+end)/2;
            
            if(numArr[middle]== search){
                searchIndex = middle;
                break;    
            }
            else if(numArr[middle] > search){
                end = middle - 1;    
            }
            else{
                start = middle + 1;
                
            }
        }   
    }   
}
