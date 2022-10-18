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
public class StringToDate {
    public static void main(String[] args) {
        
        String dayStr = "12-July-2022";
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        LocalDate day = LocalDate.parse(dayStr, date);
        System.out.println(day);
    }
}
