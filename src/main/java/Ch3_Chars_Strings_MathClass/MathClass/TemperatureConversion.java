import javax.swing.*;

   public class TemperatureConversion{
      public static void main(String[]args){
      
      //work out temp in F from C
      String tempInput = JOptionPane.showInputDialog("Give me a temperature in degrees celcius");
      
      double tempC = Double.parseDouble(tempInput);
      double tempF = (9 * tempC / 5)+32 ;
      
      System.out.println("The temperature in Fahrenheit is : " + tempF);
      
      
      
      
      
      }


}