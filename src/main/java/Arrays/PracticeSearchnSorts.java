/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Naritaa
 */
public class PracticeSearchnSorts {
    public static void main(String[] args) {
                
    }
    public int binarySearch(){
        int search = 8;
        int searchInd = -1;
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == search){
                searchInd = mid;
                return search;   
            }
            else if(arr[mid]>search){
                end = mid -1;   
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
   
    
}
