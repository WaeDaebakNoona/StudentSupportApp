/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolpractical;

/**
 *
 * @author Naritaa
 */
public class numberManipulation {

    public static void main(String[] args) {
        //calling HCF method
        System.out.println(HCF(10, 25));
    }

    //method decleration
    public static int HCF(int num1, int num2) {

        int hcf = 1;

        for (int i = 1; i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }//HCF method 

}//pubC
