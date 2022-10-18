/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Naritaa
 */
public class DateTimeFormatting {
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(date.format(dtf));
        dtf = DateTimeFormatter.ofPattern("dd-mm-yy");
        //date = LocalDate.of(2005,11,08);
        System.out.println();
        
        
       
    }
}
