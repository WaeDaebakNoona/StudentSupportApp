/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticAndConstantFields;

/**
 *
 * @author Naritaa
 */
public class FruitUI {
    public static void main(String[] args) {
        
        Fruit apple = new Fruit("apple",16,10.0);
        Fruit grapes = new Fruit("grapes",5,20.0);
        apple.sell(5);
        grapes.sell(1);
        System.out.println(Fruit.getTotalSales()); 
    }
}
