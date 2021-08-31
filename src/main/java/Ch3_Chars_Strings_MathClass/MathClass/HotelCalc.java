import javax.swing.*;

public class HotelCalc{
   public static void main(String []args){
   
   String askU = JOptionPane.showInputDialog("The cost per night is R490.90 . How many people will be staying? ");
  int num = Integer.parseInt(askU);
  String askN = JOptionPane.showInputDialog("How many nights will you be staying for?");
  int nights = Integer.parseInt(askN);
  double cost = 490.90;
  double total = cost * num * nights;
  Math.round(total);
  JOptionPane.showMessageDialog(null, "Your total cost is " + "R" + total);
  double disc = total * 0.1 ;
  double disCost = total - disc;
  double dis = Math.round(disCost);
  String discount = JOptionPane.showInputDialog("Your total after the discount is: " + dis);
  
   
   
   
   
   
   
   
   }
   
   
   
}