import javax.swing.*;

   public class RockPaperScissors{
    public static void main(String [] args){
   
   //rock,paper,scissors with computer
   
   String userChoice = JOptionPane.showInputDialog("choose:r(rock),p(paper)or s(scissors)");
   //computer is scissors
   
   if(userChoice.equals("r")){
   System.out.println("r>s : you win");
   
   }
   
   if(userChoice.equals("p")){
   System.out.println(" p<s : you lose");
   
   }
   if(userChoice.equals("s")){
   System.out.println("s=s : tie");
   
   }


   
   
   
   
     }
   
   }
