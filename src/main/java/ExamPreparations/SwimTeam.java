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
public class SwimTeam {
    
    public static String name,teamListA,teamListB,teamlistReserve;
    public static int countA,countB,countreserve;
    public static double aveTime;
    
    public static void main(String[] args) {
        teamListA = "Team A";
        teamListB = "team B";
        teamlistReserve = "Team Reserve";
        name = JOptionPane.showInputDialog("Enter swimmer's name");
        oneSwim();
        
    }//main method end
    
    public static void oneSwim(){
        System.out.println("Swimmer name: " + name);
        int swimMin = (int)(Math.random()* 4 + 2);
        int swimSec = (int)(Math.random()* 59 + 0);
       
    
    }
}//class end
