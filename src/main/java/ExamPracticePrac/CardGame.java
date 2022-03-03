//import javax.swing.*;
//
//public class CardGame{
//   public static void main(String[]args){
//   
//   //characters; each character can either be "light","dark"or a "support";each character has three cards
//   //each card has an attack value between 1-5 and a defence value between 1-5(both are randomly generated)
//   String name;
//   double totalPoints;
//   String side = "";
//   double points;
//   int numChar = 0;
//   //character forloop
//   int highestScore=0;
//   String highestName = "";
//   for(int characterNum = 1;characterNum <=7;characterNum++ ){
//      name = JOptionPane.showInputDialog("Enter your name.");
//      System.out.println();
//      System.out.println();
//      System.out.println("Name: " + name +"-"+ side + "side");
//      
//      int type = (int)(Math.random()* 3 + 1);
//      
//         
//         if(type == 1){
//            side = "Light";
//         }
//         else if(type == 2){
//            side = "Dark";
//         }
//         else{
//            side = "Support";
//         }
//         
//         totalPoints = 0;
//         points = 0;
//         for(int i = 1 ; i <=3 ; i++){
//         
//            int attack = (int)(Math.random()* 5 + 1);
//            int defence = (int)(Math.random()* 5 + 1);
//            
//            double luckL = name.length()+1;
//            //QUESTIONNNNNNNNNN!
//            double luckFactor = (Math.round(luckL/3.5*100)/10.0);
//            //System.out.println(luckFactor);
//            points = (attack + defence)*luckFactor;  
//            totalPoints = totalPoints + points;
//            System.out.println("Attack: " + attack + "\tDefence: " + defence + "\tLuck: " + luckFactor + "\tPoints: "+ points);
//         }
//         
//         if(totalPoints >= highestScore){
//         highestScore = totalPoints;
//         highestname = name
//         }
//         
//        System.out.println("Total Points: " + totalPoints); 
//     
//         if(totalPoints >=100){
//         break;
//         }
//         else if(totalPoints<100){
//         numChar= numChar + characterNum;
//         }  
//         
//              
//   }
// 
//
//   
// 
//      System.out.println("There were: "+ numChar + " characters");
//      // if(characterNum)
//
//
// 
//}
//
//}