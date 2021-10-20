/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch9_WhileLoops.DoLoops;

import javax.swing.JOptionPane;

/**
 *
 * @author Naritaa
 */
public class RainfallEx5 {
    public static void main(String []args){
    
        String rainFigures = JOptionPane.showInputDialog("Input figures");
        int intRainFigures = Integer.parseInt(rainFigures);
        
        
        int totalRain = 0;
        //count is number of days
        int count = 1;
        int maxRainfall = 0;
        int maxCount = 0;
        
        while(intRainFigures >=0){
            totalRain = totalRain + intRainFigures;
           
            
            if(maxRainfall <= intRainFigures){
                maxRainfall = intRainFigures;
                maxCount = count;
            }
            rainFigures = JOptionPane.showInputDialog("Input figures");
            intRainFigures = Integer.parseInt(rainFigures);
            count ++;
            
        }
        int ave = totalRain/count;
        System.out.println("Average daily rainfall: " + ave);
        System.out.println("Maximum: " + maxRainfall + " Day: " + maxCount);
    
    }   
}
