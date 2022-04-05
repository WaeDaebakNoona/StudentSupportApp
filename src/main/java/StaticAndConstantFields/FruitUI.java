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
        Fruit apple = new Fruit("apple",16,10);
        apple.sell(5);
        System.out.println(apple.toString());
        
        Fruit grapes = new Fruit("grapes",5,20);
        grapes.sell(1);
    }
}
