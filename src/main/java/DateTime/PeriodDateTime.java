/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Naritaa
 */
public class PeriodDateTime {
    public static void main(String[] args) {
            
        LocalDate bDate = LocalDate.of(2005, Month.NOVEMBER, 8);
        LocalDate today = LocalDate.now();
        Period age = Period.between(bDate, today);
        System.out.println("I am " + age.getYears() + " years," + age.getMonths() + " months and " + age.getDays() + " days old");
        
    }
}
