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

   
        /**
         * This method takes in a dateTime and desired format.Then turns the
         * date into a string
         * @param dateTime takes in a LocalDateTime object
         * @param pattern takes in the pattern the user would like to see.An example 
         * would be "MM/dd/yyyy hh:mm"
         * @return the date in string format
         */
        public String toString(LocalDateTime dateTime, String pattern)throws IllegalArgumentException{
            if(dateTime == null|| pattern == null || pattern.isEmpty()){
                throw new IllegalArgumentException("a date and pattern must be provided");
            }
        String strDate = null; 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        strDate = formatter.format(dateTime);
        return strDate;
         }
        
        
        
        /**
         * This method takes in a Date along with the desired pattern/format
         * that the user would like to see printed out and converts it to a string
         * @param date takes in a date object
         * @param pattern takes in a string representation of the pattern the user
         * would like to see. For example a user may want to see the date in the 
         * the format of "dd/MM/yyyy"
         * @return returns the date in a string format
         */
        public String toString(LocalDate date, String pattern)throws IllegalArgumentException{
            if(date == null || pattern == null || pattern.isEmpty()){
                throw new IllegalArgumentException("You must provide a date and pattern");
            }
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
        String dateAsString = format.format(date);
        return dateAsString;
        }
        
        
        
        /**
         * This method takes in a string and converts it into a date.
         * @param date a string representation of a date. An example would be "19900411".
         * order must be in year,date,month
         * @return returns date format of the string that was passed in
         */
        public LocalDate toDate(String date)throws IllegalArgumentException{
            if(date == null || date.isEmpty()){
                throw new IllegalArgumentException("You must provide a date");
            }
        String theDate = date;
        LocalDate formatted = LocalDate.parse(theDate,DateTimeFormatter.BASIC_ISO_DATE);
        return formatted;
        }
        
    
        
      /**
       * This method takes in string representation of a date and a string pattern that a
       * user would like to see the date in.Then converts that string into a date
       * @param date a string representation of a date. For example "April 11 1990"
       * @param pattern a string representation of a the pattern. For example "MM/dd/yyyy"
       * @return a string date in the format of a date
       */
        
        public LocalDate toDate(String date, String pattern)throws IllegalArgumentException{
            if(date == null || pattern == null || date.isEmpty() || pattern.isEmpty()){
                throw new IllegalArgumentException("You must provide a date and pattern");
            }
        String theDate = date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate formattedDate = LocalDate.parse(theDate,formatter);
        return formattedDate;
        
        }
        
        
        /**
         * This method takes in a date and the number of weeks the user would like to 
         * add to that date. Then returns it in a date format.
         * @param date takes in a date object
         * @param numOfWeeks takes in an integer of how many weeks the user would like to add
         * to the date
         * @return the date with the weeks added to it
         */
        public LocalDate addWeeks(LocalDate date, int numOfWeeks)throws IllegalArgumentException{
            if (date==null || numOfWeeks < 0){
                throw new IllegalArgumentException("You must provide a date and number of weeks cannot be less than 0");
                
            }
        LocalDate theDate = date;
        return theDate.plusDays(numOfWeeks);
        
        }
        
    
}
