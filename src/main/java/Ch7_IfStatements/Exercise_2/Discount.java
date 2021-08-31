import javax.swing.*;

   public class Discount{
      public static void main(String[]args){
      
         String userInput = JOptionPane.showInputDialog("Input an amount ");
         
         double purchaseNum = Double.parseDouble(userInput);
         
            if(purchaseNum >= 100)
            {
            
               double discount = 0.10;
               double afterDiscount = purchaseNum * discount;
               double total = purchaseNum - afterDiscount; 
               
               System.out.println("R "+ total);
               
            }
            
            else
            {
               System.out.println(purchaseNum);            
            }
         
      
      
      
      
      
      
      }


}