import javax.swing.*;

public class GetInitials{
   public static void main(String []args){
   
   String name = JOptionPane.showInputDialog("What is your first name? ");
   String surname = JOptionPane.showInputDialog("What is your surname? ");
   char fi = name.charAt(0);
   char li = surname.charAt(0);

   System.out.println("Initials are : " + fi + li);
   
   
   }
   
   
   
}