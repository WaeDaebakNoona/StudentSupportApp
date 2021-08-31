import javax.swing.*;

   public class Driving{
      public static void main(String[]args){
      
         String inputAge = JOptionPane.showInputDialog("What is your age?");
         int age = Integer.parseInt(inputAge);
         
            if(age < 18)
            {
            System.out.println("Too young to drive");
            }
            
            if(age >75)
            {
            System.out.println("Sorry you are over the legal age limit for driving");
            }
            else{
            System.out.println("Age ok.Have you got a driving licens?");
            }

      
      }
               
   }
