/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author joshuabrown
 */
public class DateUtilities8 {

   
        //Date to string
        //Done needs javadoc and validation
        public String toString(LocalDateTime dateTime, String pattern){
        String strDate = null; 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        strDate = formatter.format(dateTime);
        return strDate;
         }
        
        //Date to string
        //Done needs javadoc and validation
        public String toString(LocalDate date, String pattern){
        DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
        String dateAsString = format.format(date);
        return dateAsString;
        }
        
        
        
        //String to date
        //Done needs javadoc and validation
        public LocalDate toDate(String date){
        String theDate = date;
        LocalDate formatted = LocalDate.parse(theDate,DateTimeFormatter.BASIC_ISO_DATE);
        return formatted;
        }
        
       // String to date
        //Done needs javadoc and validation
        
        public LocalDate toDate(String date, String pattern){ 
        String theDate = date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate formattedDate = LocalDate.parse(theDate,formatter);
        return formattedDate;
        
        }
        
        
        //add a week to date
        //done needs javadoc and validation
        public LocalDate addWeeks(LocalDate date, int numOfWeeks){
        LocalDate theDate = date;
        return theDate.plusDays(numOfWeeks);
        
        }
        
    
}
