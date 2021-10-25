/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamPreparations;

import javax.swing.JOptionPane;
//kk
/**
 *
 * @author Naritaa
 */
public class SuperGardener {
    public static int gardenerPos, plantPos ,roundNum ;
    public static boolean hasWater;
    
    public static void main(String[] args) {
        gardenerPos = 3;
        plantPos = 5;
        hasWater = false;
        roundNum = 1;
        //call oneRound method
        SuperGardener.oneRound();
        for(int round = 0; round<6;){
            hasWater = false;
            //dont know what to do here last question
            SuperGardener.oneRound();
            round++;
            gardenerPos =(int)(Math.random()* 5);
            plantPos =(int)(Math.random()* 10 + 6 );
        }
      
    }
    public static void oneRound(){
        SuperGardener.drawGarden();
        String displayKey = JOptionPane.showInputDialog("What do you want to do?\n" + "L:Move left\n" + "R:Move right\n" + "F:Fill up\n" + "W:Water plant\n" + "Q:Quit");

        int numMoves = 0;
        while(true){
            

            if(displayKey.equals("Q")){
                break;
            }
            if(displayKey.equals("L") && gardenerPos != 1){
                gardenerPos = gardenerPos -1;
            }
            if(displayKey.equals("R") && gardenerPos != 10){
                gardenerPos = gardenerPos + 1;
            }
            if(displayKey.equals("F")){
                //fill up watering can?
                
                if(gardenerPos == 1){
                    hasWater = true;
                }
            }
            if(displayKey.equals("W")){
                if(gardenerPos == plantPos &&  hasWater == true){     
                }
            }
            if(gardenerPos == plantPos){
                System.out.println("ROUND OVER");
                System.out.println("The number of moves is: " + numMoves);
                System.out.println();
            }
            SuperGardener.drawGarden();
            displayKey = JOptionPane.showInputDialog("What do you want to do?\n" + "L:Move left\n" + "R:Move right\n" + "F:Fill up\n" + "W:Water plant\n" + "Q:Quit");

            numMoves++;
        }
    }
    public static void drawGarden(){
        System.out.println("Round: " + roundNum + "\t" + "Watering can full: "+ hasWater);
        System.out.print("W");
        for(int i = 1; i<11; i++){
            //code
            if(gardenerPos == i){
                System.out.print(" G "); 
            }
            else if(plantPos == i){
                System.out.print(" P ");
            
            }
            else{
                System.out.print(" - ");
            }
           
        
        } 
        System.out.println();
    }
}
