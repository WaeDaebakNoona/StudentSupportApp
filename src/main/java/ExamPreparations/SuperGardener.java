/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamPreparations;

import javax.swing.JOptionPane;

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

    }
    public static void oneRound(){
        SuperGardener.drawGarden();
        String displayInput = JOptionPane.showInputDialog("What do you want to do?\n" + "L:Move left\n" + "R:Move right\n" + "F:Fill up\n" + "W:Water plant\n" + "Q:Quit");
        for(int i = 0; i<-1; i++){
            SuperGardener.drawGarden();
            if(displayInput.equals("Q")){
                break;
            }
            if(displayInput.equals("L")){
                gardenerPos = gardenerPos -1;
            }
            if(displayInput.equals("R")){
                gardenerPos = gardenerPos + 1;
            }
        }
    }
    public static void drawGarden(){
        System.out.println("Round: " + roundNum + "\t" + "Watering can full: "+ hasWater);
        System.out.println("W");
        for(int i = 0; i<11; i++){
            System.out.println(" - ");
            //code
            if(gardenerPos == i){
                System.out.println(" G "); 
            }
            if(plantPos == i){
                System.out.println(" P ");
            
            }
            System.out.println("");
        
        }
    }
}
