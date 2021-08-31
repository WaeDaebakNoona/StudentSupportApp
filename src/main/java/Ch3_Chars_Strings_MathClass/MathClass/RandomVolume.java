public class RandomVolume{
      public static void main(String[]args){
      
      //min and max
      int min = 15;
      int max = 44;
      
      //random
      int radius = (int)(Math.random() * max + min);
      double height = 15.68;
      double volume = 1/3.0 *(Math.PI * Math.pow(radius, 2)* height);
      
      //output
      System.out.println("The volume of the cone is:" + volume );
      double roundVol = Math.round(volume);
      System.out.println("Rounded off,the volume is:" + roundVol);
      
      
      }
      
      
 }
