import javax.swing.*;

public class OddAndEven{
   public static void main(String [] args){
   
   //ask user to input a num and say whether it is odd or even
   
   String input = JOptionPane.showInputDialog("Give me a word ");
   int numInput = input.length();
      
   if(numInput%2 == 0  ){
      System.out.println("number is even");
   }
   
   else{
      System.out.println("number is odd");
   }


   
   
   }



}