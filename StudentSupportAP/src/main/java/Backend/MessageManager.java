/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Narita
 */
public class MessageManager {
    
    private Message [] mArr;
    private int size;
    private DB db;
    
    public void AddAnonStatement(String type, String message){
        
        String query = "INSERT INTO nitaaDB.Anonymoustblar(TypeOfHelp, UserStatement)Values('" + type + "','" + message + "');";
        db.update(query); 
    }
     public void AddHelpStatement(String type, String message){
        
        String query = "INSERT INTO naritaaDB.Helptbl(TypeOfHelp, UserStatement)Values('" + type + "','" + message + "');";
        db.update(query); 
    }


    
    
    
}
