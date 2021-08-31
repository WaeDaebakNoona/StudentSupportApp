/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juneexampractice;

/**
 *
 * @author Naritaa
 */
public class gameSimulator 
{
    
    //main
    public static void main (String [] args)
    {
        System.out.println("BOSS TOTAL HEALTH: " + getBossHealth());
        String attackType = "";
        int attackDamage = 0;
        switch(num_generated()){
            case 1 :
                 attackType = "MISS";
                 attackDamage = 0;
                 System.out.println("ATTACK: " + num_generated() + "ATTACK TYPE: " + attackType + "ATTACK DAMAGE: " + attackDamage );
            case 2: case 3: case 4:
                attackType = "NORMAL";
                attackDamage = num_generated() * 15;
                System.out.println("ATTACK: " + num_generated() + "ATTACK TYPE: " + attackType + "ATTACK DAMAGE: " + attackDamage );
            case 5 :
                attackType = "CRITICAL";
                attackDamage = getBossHealth()/2;
        
        }
    }
   

        //levels
        public static int getLevels(){
            
            for(int level = 0; level <=10; level ++)
            {

                System.out.println("LEVEL: " + level);
                System.out.println();
                System.out.println();
            }
            return getLevels;
        }
    public static int getLevelMultiplier()
    {
        int mathRand = (int)(Math.random()*3) + 1 ;
        return mathRand;
        
    }
    public static int getBossHealth()
    {
    int bossHealth = 50 + getLevels() * 10 * getLevelMultiplier();
        return bossHealth;
    }
    public static int getAttack(){
        
        for(int attack = 1; attack <= 4; attack ++){

        }//end of forloop
    return getAttack();
    }//end of getAttack method
    //numGenrate method
    public static int num_generated(){
        
    int numGenerated = (int)(Math.random()* 5)+1; 
    
    return numGenerated;
    }
    
}   
    

