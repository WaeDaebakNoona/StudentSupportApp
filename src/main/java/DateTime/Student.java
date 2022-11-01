/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author NaritaA
 */
public class Student {

    private String name;
    private String surname;
    private LocalDate birthDate;

    public Student(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }
    
    
    //output formatter
    @Override
    public String toString() {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        
        return "Student{" + "name=" + name + ", surname=" + surname + ", birthDate=" + birthDate.format(dtf) + '}';
    }
    
    
    
}
