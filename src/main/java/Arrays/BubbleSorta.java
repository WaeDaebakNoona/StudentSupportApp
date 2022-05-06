/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author NaritaA
 */
public class BubbleSorta {
    public static void main(String[] args) {
        
        int [] arr = {4,5,6,7,8,9,1,2};
        
        for(int sortIndex = arr.length -1;sortIndex > 0; sortIndex--){
            for(int currentIndex = 0; currentIndex < sortIndex; currentIndex++){
                if(arr[currentIndex]>arr[sortIndex]){
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[sortIndex];
                    arr[sortIndex] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
