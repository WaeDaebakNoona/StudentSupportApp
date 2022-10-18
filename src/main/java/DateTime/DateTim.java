/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalQueries;

/**
 *
 * @author Naritaa
 */
public class DateTim {
    public static void main(String[] args) {
        
        //local date/time/datetime
        
        LocalDate birthDate  = LocalDate.of(2005, Month.NOVEMBER, 8);   
        LocalDate nowDate = LocalDate.of(2022, Month.OCTOBER, 18);
        int diff = nowDate.getYear() - birthDate.getYear();
        System.out.println(diff);
        
        LocalDate JCdate = LocalDate.of(2005, Month.JUNE, 6);
        LocalDate myDate  = LocalDate.of(2005, Month.NOVEMBER, 8);
        
        if(JCdate.isBefore(birthDate)){
            System.out.println("JC is older than Narita");
        }
        else{
            System.out.println("Narita is wrong");
        }

        LocalDate today = LocalDate.now();
        //3 weeks 4 days
        LocalDate newDate = today.plusWeeks(3).plusDays(4);
        System.out.println("New date: " + newDate);
        
    }
    
}
