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
public class AdminManager {
    private Admin [] arr;
    private int size;
    private static DB db;

    public void AddAdminMessage(Admin a) throws ClassNotFoundException, SQLException {
        db = new DB();
        String query = "INSERT INTO naritaaDB.AdminMessagestbl(Message)Values('" + a.getMessage() + "');";
        db.update(query);
        arr = new Admin[size];
        size++;
    }
    public String DisplayAdminMessage() throws ClassNotFoundException, SQLException{
         db = new DB();
        String query = "SELECT * FROM naritaaDB.AdminMessagestbl;";
        ResultSet rs = db.query(query);
        String output = "";
        
        while (rs.next()) {
            output += rs.getString("Message") + "\n" ;
            output += "---------------" + "\n";
            
        }
        return output;
    }
}

