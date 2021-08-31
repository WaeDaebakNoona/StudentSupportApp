import javax.swing.*;

   public class CalcPrice{
      public static void main(String [] args){
      
         //t shirt - deduct 5%,VAT of 15% is added
         //ask for a price for T-shirt
         
         String PriceInput = JOptionPane.showInputDialog("Give me a price" );
         
         double PriceNum = Double.parseDouble(PriceInput);
         double Deduction = 0.05 ;
         double Price = Deduction *PriceNum;
         double Vat = 0.15;
         double SellingPrice = Price * Vat + Price;
         
         System.out.println("Your final cost is: " + SellingPrice);
         
         
      
      }
   }  