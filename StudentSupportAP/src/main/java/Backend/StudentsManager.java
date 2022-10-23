/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Backend.Utillity.DB;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Narita
 */
public class StudentsManager {

    private Students[] sArr;
    private int size;
    private static DB db;

    public void addStudent(Students s) throws ClassNotFoundException, SQLException {
        db = new DB();
        String query = "INSERT INTO `naritaaDB`.`Userstbl` (`Name`, `Surname`, `Age`, `Grade`, `Username`, `Password`)"
                + " VALUES (' " + s.getName() + "', '" + s.getSurname() + "', '" + s.getAge() + "', '" + s.getGrade() + "', '" + s.getUsername() + "', '" + s.getPassword() + "');";
        db.update(query);
        sArr[size] = s;
        size++;
    }

    public boolean checkUser(boolean admin, String u, String p) throws SQLException {
            //code inspired from PAT example2
        if (admin) {
            try {
                Scanner sc = new Scanner(new File("data//AdminPass.txt"));
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();

                    Scanner lineSc = new Scanner(line).useDelimiter("#");
                    String username = lineSc.next();
                    String password = lineSc.next();
                    if (username.equalsIgnoreCase(u) && password.equalsIgnoreCase(p)) {
                        return true;
                    }
                }
                sc.close();
                return false;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(StudentsManager.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("LOGIN: Could not connect to database");
            }
            return false;
        } else {
            String query = "SELECT * FROM naritaaDB.Userstbl;";
            ResultSet rs = db.query(query);
            if (!rs.isBeforeFirst()) {
                return false;
            } else {
                rs.next();
                String id = rs.getString("UsersID");
                String name = rs.getString("Name");
                String surname = rs.getString("Surname");
                int age = rs.getInt("Age");
                int grade = rs.getInt("Grade");
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                
//                sArr = new Students[];
                    return true;
                

            }

        }
        return false;

    }
    public String usersInfo() throws SQLException{
          String output = "";
          String query = "SELECT * FROM naritaaDB.Userstbl;";
          ResultSet rs = db.query(query);
          while(rs.next()){
              output += rs.getString("Name");
              output += rs.getString("Surname");
              output += rs.getInt("Age");
              output += rs.getInt("Grade");
              output += "\n";
          }
          return output;
      }

    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < size; i++) {
            output += sArr[i] + "\n";
        }
        return output;
    }

}
