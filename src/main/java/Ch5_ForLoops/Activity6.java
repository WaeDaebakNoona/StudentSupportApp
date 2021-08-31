import javax.swing.*;

public class Activity6{
   public static void main(String[]args){
   int sum = 0 ;
   int times = 10;
   int comp = 0;
   //num1
   
   for(int i = 0 ; i <= times;i++){
      String inputStr = JOptionPane.showInputDialog("give me a non-zero number ");
      int num = Integer.parseInt(inputStr);
      sum += num ;
      if (num > comp){
      System.out.print("These numbers are positive: " + num);
         }
      else if (num < comp){
         System.out.print("These numbers are negative: " + num);
      
     
      }

   }
    
      System.out.println(sum);
      
      //1.3
      System.out.println(sum/times);
      
      //1.4
      //10,76,-3,-65,121,324,26,-43,256,771,7
      
      //1.5
      
//       if (num > comp){
//          System.out.print("These numbers are positive: " + num);
//          }
//       else if (num < comp){
//          System.out.print("These numbers are negative: " + num);
//       
//      
//       }
//      
//       
      
      
 
   }
}