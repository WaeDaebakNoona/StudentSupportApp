import javax.swing.*;

   public class TwoNumbers{
    public static void main(String [] args){
   
      String userInput1 = JOptionPane.showInputDialog("Give me a number ");
      String userInput2 = JOptionPane.showInputDialog("Give me another number ");
   
      int num1 = Integer.parseInt(userInput1);
      int num2 = Integer.parseInt(userInput2);

      if (num2 == 0){
      
      System.out.println("Error: Denominator cannot be 0");
      
      }
      
      else{
      
      int divide = num1/num2;
      System.out.println("result: "+ divide);
      
      }
      
      
   }

}