import javax.swing.*;

   public class SwoppingTwoNumbers{
      public static void main(String [] args){
      
      String StrNum1 = JOptionPane.showInputDialog("Give me a number");
      String StrNum2 = JOptionPane.showInputDialog("Give me another number");
      int num1 = Integer.parseInt(StrNum1);
      int num2 = Integer.parseInt(StrNum2);
      
       int value = num1;
      num1 = num2;
      num2 = value;
      
      System.out.println("The 2 numbers swopped are: " + num1 + " and " + num2);


      
      }
   }
