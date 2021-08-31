public class EggsSimModified{   
   public static void main(String[]args){
           
         
      int totalEggs;
      int totalPower;
      
      totalEggs = 25; 
           
      
      int min = 2;
      int max = 8;
      int range = 7;
      System.out.println("Day 1:" + "\tNumber of eggs: 25 ");
      //day loop
      
      for(int day = 1; day <= 7 ; day++){
         System.out.println();
         int numEggs = (int)(Math.random()* range + min);
         
         if(numEggs > totalEggs){
            numEggs = totalEggs;
         }
         
         totalEggs = totalEggs - numEggs;            
         System.out.println("Day: " + day);
         System.out.println("Total Eggs: "+ totalEggs);
         System.out.println("Eggs for the day: " + numEggs);
         
         int power = 0;
         totalPower = 0;
         
         String eggType = "";
         
         for(int egg = 1; egg <= numEggs; egg++){
           
            int eggPow = (int)(Math.random()* 3 + 1);
            
            if(eggPow == 1){
               eggType = "Elf";
               power = 430;
               System.out.println("Egg: " + egg + "\tType: "+ eggType + "\tPower: "+ power  );
            }
            if(eggPow == 2){
               eggType = "Vampire";
               power = 320;
               System.out.println("Egg: " + egg + "\tType: "+ eggType + "\tPower: "+ power );
            }
            if(eggPow == 3){
               eggType = "Zombie";
               power = 175;
               System.out.println("Egg: " + egg + "\tType: "+ eggType + "\tPower: "+ power );
            }   
            totalPower = totalPower + power;
           
             
            
            
         }
         System.out.println("Total power:" + totalPower);
         
         if(totalEggs == 0){
            System.out.println("Ran out of eggs");
            break;
         }
         
                    
      }
   }
}
  



