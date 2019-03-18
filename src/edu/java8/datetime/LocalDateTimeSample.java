package edu.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeSample {
public static void main(String[] args) {
	System.out.println("******************** Local Date Start************************");
	localDate();
	System.out.println("******************** Local Date End************************");
	
	
	System.out.println("******************** Local Time Start************************");
	localTime();
	System.out.println("******************** Local Time End************************");
	
	
	System.out.println("******************** Local DateTime Start************************");
	localDateTime();
	System.out.println("******************** Local DateTime End************************");
	
	System.out.println("******************** Offset DateTime Start************************");
	offsetDateTime();
	System.out.println("******************** Offset DateTime End************************");
}

public static void localDate() {
	LocalDate localDate = LocalDate.now();
	System.out.println(localDate.toString());                //2013-05-15
	System.out.println(localDate.getDayOfWeek().toString()); //WEDNESDAY
	System.out.println(localDate.getDayOfMonth());           //15
	System.out.println(localDate.getDayOfYear());            //135
	System.out.println(localDate.isLeapYear());              //false
	System.out.println(localDate.plusDays(12).toString());   //2013-05-27
}

public static void localTime() {
	//LocalTime localTime = LocalTime.now();     //toString() in format 09:57:59.744
	System.out.println(LocalTime.now().toString());
	LocalTime localTime = LocalTime.of(12, 20);
	System.out.println(localTime.toString());    //12:20
	System.out.println(localTime.getHour());     //12
	System.out.println(localTime.getMinute());   //20
	System.out.println(localTime.getSecond());   //0
	System.out.println(localTime.MIDNIGHT);      //00:00
	System.out.println(localTime.NOON);          //12:00
}

public static void localDateTime(){
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println(localDateTime.toString());      //2013-05-15T10:01:14.911
	System.out.println(localDateTime.getDayOfMonth()); //15
	System.out.println(localDateTime.getHour());       //10
	System.out.println(localDateTime.getNano());       //911000000
}

/*OffsetDate, OffsetTime and OffsetDateTime*/
public static void offsetDateTime() {
	OffsetDateTime offsetDateTime = OffsetDateTime.now();
	System.out.println(offsetDateTime.toString());              //2013-05-15T10:10:37.257+05:30
	 
	offsetDateTime = OffsetDateTime.now(ZoneId.of("+05:30"));
	System.out.println(offsetDateTime.toString());              //2013-05-15T10:10:37.258+05:30
	 
	offsetDateTime = OffsetDateTime.now(ZoneId.of("-06:30"));
	System.out.println(offsetDateTime.toString());              //2013-05-14T22:10:37.258-06:30
	 
	ZonedDateTime zonedDateTime =
	                ZonedDateTime.now(ZoneId.of("Europe/Paris"));
	System.out.println(zonedDateTime.toString());               //2013-05-15T06:45:45.290+02:00[Europe/Paris]
}
}
