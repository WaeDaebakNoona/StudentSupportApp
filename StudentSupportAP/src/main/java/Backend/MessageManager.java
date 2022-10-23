/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Backend.Utillity.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Narita
 */
public class MessageManager {
    
    private Message [] mArr;
    private int size;
    private static DB db;
    
    //adding users statement from the anonymous box
    public void AddAnonStatement(Message m) throws SQLException, ClassNotFoundException{
        db = new DB();
        String query = "INSERT INTO naritaaDB.Anonymoustbl(TypeOfHelp, UserStatement)Values('" + m.getType() + "','" + m.getStatement() + "');";
        db.update(query); 
        mArr = new Message[size];
        size++;
    }
    //adding users statement from the help ui
     public void AddHelpStatement(Message m) throws SQLException, ClassNotFoundException{
        db = new DB();
        String query = "INSERT INTO naritaaDB.Helptbl(TypeOfHelp, UserStatement)Values('" + m.getType() + "','" + m.getStatement() + "');";
        db.update(query); 
        mArr = new Message[size];
        size++;
    }

     public String displayAnonStatement() throws SQLException, ClassNotFoundException{
         db = new DB();
         String query = "SELECT * FROM naritaaDB.Anonymoustbl;";
         ResultSet rs = db.query(query);
         String output = "";
         while(rs.next()){
            output += rs.getString("TypeOfHelp") + ", ";
            output += rs.getString("UserStatement");
            output += "\n";
         }
         return output;
     }
      public String displayHelpStatement() throws SQLException, ClassNotFoundException{
         db = new DB();
         String query = "SELECT * FROM naritaaDB.Helptbl;";
         ResultSet rs = db.query(query);
         String output = "";
         while(rs.next()){
            output += rs.getString("TypeOfHelp") + ", ";
            output += rs.getString("UserStatement") + "\n";
            output += "\n";
         }
         return output;
     }
     public static String [] getMessageArray() throws ClassNotFoundException, SQLException{
         db = new DB();
         String query = "SELECT * FROM naritaaDB.Helptbl;";
         ResultSet rs = db.query(query);
         String output = "";
         int numMes = getNumMessage();
         String [] outputAr = new String[numMes];
         int currInd = 0;
         while(rs.next()){
            String type= rs.getString("TypeOfHelp") + ", ";
            String statement = rs.getString("UserStatement");
            outputAr[currInd] = type + statement;
            currInd++;
         }
         return outputAr;
     }
     public static int getNumMessage() throws SQLException{
         int count = 0;
         String query = "SELECT * FROM naritaaDB.Helptbl;";
         ResultSet rs = db.query(query);
         while(rs.next()){
             
             count++;
         }
         return count;

       
     }
    @Override
    public String toString() {
        String output = "";
        for(int i = 0; i<size;i++){
            output += mArr[i];
        }
        return output;
    }
    
    
    
}
