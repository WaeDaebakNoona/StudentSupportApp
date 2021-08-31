import javax.swing.*;

   public class TestAnotherNumber{
      public static void main(String[]args){
      
         String strInput = JOptionPane.showInputDialog("Input an integer");
         int intInput = Integer.parseInt(strInput);
         
         //number is positve/negative
      
         if(intInput > 0)
         {
            System.out.println(" Integer is positive ");  
         }
         else
         {
            System.out.println(" Integer is negative");
         }
              
            
         //if number is odd/even
         if(intInput % 2 == 0)
         {
            System.out.println(" Integer is even");
         }
         else
         {
            System.out.println(" Integer is odd");
         }
        
        
        
        
      //number is a mutiple of 7
      
         if(intInput % 7 == 0)
         {
            System.out.println(" Integer is a multiple of 7");
         }
         else
         {
            System.out.println(" Integer is not a multiple of 7");

         }
      
      
      
      
      
      
      
      }
   
   
   
   
   
   }