/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticAndConstantFields;

/**
 *
 * @author Naritaa
 */
public class Fruit {
    
    private String description; 
    private int qty;
    private double costPrice;
    private double sellingPrice;
    public final int markup = 75;
    private int totalQty;
    private double totalCost;
    private static double totalSales;
    
    public Fruit(String d, int q, double c){
        description = d;
        qty = q;
        costPrice = c;
        sellingPrice = costPrice + costPrice * markup/100;
        
        totalQty+=q;
        totalCost+=c;
    }
    public String toString(){
        return "Description: " + description + "\nQuantity: " + qty + "\nCost price: " + costPrice;
    }
    public String getDescription(){
        return description;
    }
    public int getQty(){
        return qty;
    }
    public double getSellingPrice(){
        return sellingPrice;
    }
    public int getTotalQty(){
        return totalQty;
    }
    public double getTotalCost(){
        return totalCost;
    }
    public static double getTotalSales(){
        return totalSales;
    }
    public void sell(int q){
        qty = qty - q;
        totalQty = totalQty - q;
        totalSales = totalSales + q * sellingPrice;
    }
    
    
}
