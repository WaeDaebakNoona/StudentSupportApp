import it.*;
import javax.swing.*;

   public class InputLine{
      public static void main(String[]args){
      
      Gogga bug = new Gogga();
      bug.setDirection(Gogga.RIGHT);
      bug.setPosition(1,1);  
      
      String input = JOptionPane.showInputDialog("Give me a number from 5 - 10");  
      int num = Integer.parseInt(input); 
       
         for(int loop = num ; loop>=0 ; loop = loop + 1{
            System.out.println(loop);
             System.out.println();
    }

      
      
      
      }
   
   }