   public class PrintChars{
      public static void main(String[]args){
      
      //1.1
         System.out.println("question 1.1");
         for(char ch = (char)97; ch <= (char)122; ch++){
         System.out.println(ch);
         
         }
         
       //1.2
         System.out.println("question 1.2");
         for(char cha = (char)122; cha >= (char)97; cha--){
         System.out.println(cha);
         
         }
      //2
         System.out.println("question 2");
         for(char allChar = (char)32; allChar <= (char)126; allChar++){
         System.out.println(allChar );
         }
      

      //3
      //this took me sooooooo long...i'm so proudddddddd
      
        for(char allChar = (char)32; allChar <= (char)126; allChar++){
        int intAllChar = (int)allChar;
        System.out.println("Ascii value of " + allChar + " = " + intAllChar);
        
        }

      
         
      
       
         
         
   
   
      }
   
   }