import javax.swing.*;

   public class EasterAlgoTest{
      public static void main(String [] args ){
      
         String input = JOptionPane.showInputDialog("Input a year :)");
         int yearInt = Integer.parseInt(input);
         System.out.println(yearInt);
         
         int a = yearInt - 1900;
         int b = a%19;
         int c = (7 * b +1)/19;
         int d = (11 * b + 4 - c) % 29;
         int e = a/4;
         int f = (a + e + 31 - d)%7;
         int g = 25 - d - f;
         System.out.println(g);
         
         
         //if g is positive,the date falls on g April
         
            if(g > 0)
            {
            System.out.println("Easter date is on "+ g + " April");
            }
            
         //if g is negative ,easter falls in march & date is determined by counting backwards(G = 0 = march 31;G = -1 = March 30)
         
            else
            {
            int day = 31 + g;
            System.out.println("Easter date is on " + day + " March");
            }
      
      }


}