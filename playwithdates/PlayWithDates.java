
package playwithdates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class PlayWithDates {

  

    public static void main(String[] args) {
       
     LocalDate today = LocalDate.now();//shmerinh
        System.out.println(today);
      LocalDate hmeromhnia = LocalDate.of(2020, 3, 28);
        System.out.println(hmeromhnia); 
        String dateString = "2019-05-15";
      LocalDate hmnia = LocalDate.parse(dateString);
        System.out.println(hmnia);
      
       int dayOfMonth = today.getDayOfMonth();
        System.out.println(dayOfMonth);
        
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println(dayOfWeek);//shmerinh mera 
        
        today=today.plusDays(15).plusMonths(1).plusYears(2);
        System.out.println(today);
        
        String name = "Jack";
        name = name.concat("Sparrow");
        
        // "20/03/2020"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String inputDate = "20/03/2020";
        LocalDate dateFromString = LocalDate.parse(inputDate, formatter);
        System.out.println("Date From String = "+ dateFromString);
        
        String dateFromLocalDate = dateFromString.format(formatter);
        System.out.println("String From LocalDate = "+ dateFromLocalDate);
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        dateFromLocalDate = dateFromString.format(formatter2);
        System.out.println("Formatter2: String From LocalDate = "+ dateFromLocalDate);
        
        today = LocalDate.now();
        LocalDate tommorow = today.plusDays(1);
        System.out.println("today: "+ today);
        System.out.println("tommorow: "+ tommorow);
        boolean isAfter = today.isAfter(tommorow);
        System.out.println("today.isAfter(tommorow :"+ isAfter);
        boolean isBefore = today.isBefore(tommorow);
        System.out.println("today.isBefore(tommorow) :"+ isBefore);
        //important!!
        DayOfWeek myDayOfWeek =today.getDayOfWeek();
        System.out.println("today.getDayOfWeek:" +myDayOfWeek);
        LocalDate firstDateOfWeek = today;
        
        while(firstDateOfWeek.getDayOfWeek() != DayOfWeek.MONDAY){
            firstDateOfWeek = firstDateOfWeek.minusDays(1);  //afairei -1 synexeia mexri na vrei monday 
        }
        System.out.println("firstDateOfWeek: " + firstDateOfWeek);
        LocalDate lastDateOfWeek = firstDateOfWeek.plusDays(4);
        System.out.println("lastDateOfWeek: " +lastDateOfWeek);
        //kai elegxv me isAfter kai isBefore
        
        //end importand
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println(dateAndTime);
        
        
        Period period = Period.of(2, 3, 10);
        today = today.plus(period);
        System.out.println("today = "+today);
        
        
        
    }


}
