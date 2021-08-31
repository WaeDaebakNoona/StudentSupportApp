import javax.swing.*;

   public class LargerOfTwo{
      public static void main(String[]args){
      
      //input 2 numbers
      
         String inputNum1 = JOptionPane.showInputDialog("Input a number");
         String inputNum2 = JOptionPane.showInputDialog("Input a number");
         
         int intNum1 = Integer.parseInt(inputNum1);
         int intNum2 = Integer.parseInt(inputNum2);
   
            
            if(intNum1 > intNum2)
            {
            System.out.println("Number 1 is the larger number"); 
            }
            
            if(intNum1 < intNum2)
            {
            System.out.println("Number 2 is the larger number");
            }
            
            if(intNum1 == intNum2)
            {
            System.out.println("Number 1 and number 2 are equal");

            }
      
      
      
      
      }
        
   }