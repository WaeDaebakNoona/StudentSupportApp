/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPracticePrac;

/**
 *
 * @author Naritaa
 */
public class Card {
    private String name;
    private String type;
    private int basic;
    private int special;
    private int leader;
    private int unique;
    private static final int lightFactor = 3;
    private static final double darkFactor = 2.5; 
    
    public Card(String name,String type,int basic, int special,int leader,int unique){
        
        this.name = name;
        this.type = type;
        this.basic = basic;
        this.special = special;
        this.leader = leader;
        this.unique = unique;
    }
    public String getName(){
        return name;
    }
    
    public boolean checkLight(){   
        if(type.contains("Light")){
            return true;
        }
        else{
            return false;
        }   
    }
    
    public double calcPoints(){
        if(checkLight() == true){
            double lightNum = (basic + special + leader + unique) * lightFactor;
            return lightNum;
        }
        else{
            double darkNum = (basic + special + leader + unique) * darkFactor;
            return darkNum;
        }
    }
    public String getNameTypePoints(){
        return "" + name + calcPoints();
    }
    public String toString(){
        String str = name + type + basic + leader + unique;
        if(checkLight() == true){
            str = str + lightFactor;
            return str;
        }
        else{
            str = str + darkFactor;
            return str;
        }
    }
    
    
    
}
