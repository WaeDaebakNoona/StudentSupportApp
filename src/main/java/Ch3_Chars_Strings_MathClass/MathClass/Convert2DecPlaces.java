 import javax.swing.*;
 import java.lang.*;
 
 public class Convert2DecPlaces{
   public static void main(String[]args){
   
   //queston1
   String num;
   num = JOptionPane.showInputDialog("give me a real number");
   int numb = Integer.parseInt(num);
   double ans = numb * 100;
   System.out.println(Math.round(ans));
   System.out.println(ans/100);
  
   
   //question2
   //q2.1
   double x1 = Math.sqrt(25.7)- Math.pow(2.2 , 2);
   System.out.println(x1);
   //q2.2
   double x2 = Math.sqrt(Math.pow(12,2) + Math.pow (5,2))/13;
   System.out.println(x2);
   //q2.3
   double x3 = Math.pow(56.75 , 1/3.0) * Math.sqrt(100);
   System.out.println(x3);
   
   //question3
   double a1;
   int r = 9;
   a1 = Math.PI * (r * r);
   System.out.print(a1);
   double a2;
   int d = 30;
   a2 = Math.PI * d;
   System.out.println();
   System.out.println(a2);
    
    //question4
    //4.1
    String reNu = JOptionPane.showInputDialog("Give me a real number(number with decimal place)");
    double realNum = Double.parseDouble(reNu);
    String inNu = JOptionPane.showInputDialog("Give me an integer");
    int intPow = Integer.parseInt(inNu);
    double realSq = Math.sqrt(realNum);
    double realPow = Math.pow (realNum , intPow);

    System.out.println("REAL NUMBER\t\t\tSQUARE ROOT\t\tRAISED TO THE POWER OF 2" );
    System.out.println("realnum \t\t\t realSq \t\t\t realPow");  
    //display on screen
    JOptionPane.showMessageDialog(null,"REAL NUMBER:\t" + realNum);
    JOptionPane.showMessageDialog(null,"SQUARE ROOT:\t" + realSq);
    JOptionPane.showMessageDialog(null,"Raised to a power:\t" + realPow);

     //4.2
    String real2 = JOptionPane.showInputDialog("Give me a real number");
    double realNum2 = Double.parseDouble(real2);
    String anReal = JOptionPane.showInputDialog("Give me another real number");
    double real3 = Double.parseDouble(anReal);
    double realSq1 = Math.sqrt(realNum2);
    double realPow1 = Math.pow (realNum2 , real3);
    JOptionPane.showMessageDialog(null,"answer is:" + realPow1);
    
    //question5
    
    
    //question6
    String numD;
    numD = JOptionPane.showInputDialog("we are selling drinks for R22.89 each. How many would you like?" );
    double drinkN = Double.parseDouble(numD);
    JOptionPane.showMessageDialog(null,"you would like: " + drinkN + " drinks ");
    double sumDrink = drinkN * 22.89;
    JOptionPane.showMessageDialog(null," your total is " + sumDrink);
    String cha = JOptionPane.showInputDialog("How much will you be paying?");
    int change = Integer.parseInt(cha);
    double outP = change - sumDrink;
    double outM = Math.round(outP);
    JOptionPane.showMessageDialog(null,"Your change is : " + outM);
   
  
   
   }



}