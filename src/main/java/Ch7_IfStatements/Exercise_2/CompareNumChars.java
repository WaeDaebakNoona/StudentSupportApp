import javax.swing.*;

   public class CompareNumChars{
      public static void main(String[]args){
      
         String strW1 = JOptionPane.showInputDialog("Input a word");
         String strW2 = JOptionPane.showInputDialog("Input a word");
         
         //print short word first
         
            if(strW1.length() > strW2.length())
            {
            System.out.println(strW2 + " , " + strW1);
            }
            else
            {
            System.out.println(strW1 + " , " + strW2);
            }
   
   

      
      }
   }
