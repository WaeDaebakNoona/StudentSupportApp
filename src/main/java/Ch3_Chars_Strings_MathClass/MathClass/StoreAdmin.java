import javax.swing.*;

  public class StoreAdmin{
      public static void main(String[]args){
      
      //info about cost of products
      
      System.out.println("Coca-cola: R13.90, BarOne's: R12.00 , Water: R9.50");
      String StrNumOfCoke = JOptionPane.showInputDialog("How many cans of coke?");
      int numOfCoke = Integer.parseInt(StrNumOfCoke);
      double CokeCost =  13.90;
      String StrNumOfBar = JOptionPane.showInputDialog("How many BarOne's ?");
      int numOfBar = Integer.parseInt(StrNumOfBar);
      double barCost = 12.00;
      String StrNumOfWater = JOptionPane.showInputDialog("How many bottles of water ?");
      int numOfWater= Integer.parseInt(StrNumOfWater);
      double waterCost = 9.50;
      
      //total cost for customer
      
      double totalCost = numOfCoke * CokeCost + numOfBar * barCost + numOfWater * waterCost;
      System.out.println("Thank you for your purchase, this is your total: " + "R "+ totalCost);
      
      //done
      
      }

   }
      

      
