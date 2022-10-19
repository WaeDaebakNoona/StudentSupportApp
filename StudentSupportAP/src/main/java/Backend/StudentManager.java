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
public class StudentManager {
    
    private Students [] student;
    private int size;
    
    public static DB db;
    
    public void addStudent(Students s){
        db = new DB();
        String query = "INSERT INTO `naritaaDB`.`Userstbl` (`Name`, `Surname`, `Age`, `Grade`)"
                + " VALUES (' " + s.getName() + "', '" + s.getSurname() + "', '" + s.getAge() +"', '" + s.getGrade()+"');";
       db.update(query);
        System.out.println(db.update(query));
       student[size] = s;
       size++;
    }
}
