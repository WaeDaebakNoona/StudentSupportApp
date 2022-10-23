/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import Backend.Utillity.DB;
import java.sql.SQLException;

/**
 *
 * @author Narita
 */
public class NewClass {
    private static DB db;
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        db = new DB();
        String query = "INSERT INTO `naritaaDB`.`Userstbl` (`Name`, `Surname`, `Age`, `Grade`, `Username`, `Password`)"
                + " VALUES (' " + "Naru" + "', '" + "abbu" + "', '" + 12 +"', '" + 6+ "', '" +"ilikefoos"+"', '" + "me"+"');";
        db.update(query);
    }
    
}
