import javax.swing.*;

   public class forLoops{
      public static void main(String[]args){
      
          //where do i start
         //where do i stop
        //what has to be changed (increased or decreased)  
       
       //level 1 ;print using loops
         
       String word = "kyra loves rita";
       
       for(int i = 0; i< word.length(); i++)
          System.out.print(word.charAt(i));
       
       //Level 2 ; print out backwards
       
       System.out.println();
       for(int j = word.length()-1; j>=0 ; j-- ){
       
          System.out.print(word.charAt(j));
       }
       
       //Level 3; n*a*m*e*
       
       String name = "n*a*r*i*t*a*";
       
       System.out.println();
       
       for(int s = 0 ; s < name.length(); s = s +2){
        
          System.out.print(name.charAt(s)); 
        }

       //Level 4; arrow pyramid thingy
       
       System.out.println();
       
       String star = "*";
       for(int a = 0 ; a < star.length(); a++){
       
         System.out.print(star.charAt(a));
         System.out.println();
         
         
       }
   
   }

}