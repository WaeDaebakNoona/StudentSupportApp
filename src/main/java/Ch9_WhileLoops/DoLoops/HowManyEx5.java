/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch9_WhileLoops.DoLoops;

/**
 *
 * @author Naritaa
 */
public class HowManyEx5 {
    public static void main (String [] args){
    
        //5.1 how many 1
        int numSeriestotal = 610 ;
        int numSeries = 2;
        int count = 0;
        
        while(numSeries < 610){
            numSeries = numSeries + 3;
            count++;      
        }
        System.out.println(" Quantity: " + numSeries + " Sum: " + count);
        //5.2
    }
    
}
