import javax.swing.*;

  public class GetMiddle{
      public static void main(String[]args){
      
      //input a five letter word
      String wordInput = JOptionPane.showInputDialog("Give me a five letter word");
      char word = wordInput.charAt(2);
      
      
      System.out.println("The middle letter of the word is: " + word);
      
      
      //done
      }
      
   
   }
