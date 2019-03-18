package edu.java8.datetime;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAdjusters;
import java.time.zone.ZoneRules;

public class OtherSample {
public static void main(String[] args) {
	System.out.println("******************** enumsDayOfWeekAddition Date Start************************");
	enumsDayOfWeekAddition();
	System.out.println("******************** enumsDayOfWeekAddition Date End************************");
	
	
	System.out.println("******************** dateAdjusters Start************************");
	dateAdjusters();
	System.out.println("******************** dateAdjusters End************************");
	
	
	System.out.println("******************** createDate Start************************");
	createDate();
	System.out.println("******************** createDate End************************");
	
	System.out.println("******************** clock Start************************");
	clock();
	System.out.println("******************** clock End************************");
	
	
	System.out.println("******************** changeTimeZone Start************************");
	changeTimeZone();
	System.out.println("******************** changeTimeZone End************************");
	
	
	System.out.println("******************** formatDate Start************************");
	formatDate();
	System.out.println("******************** formatDate End************************");
}
public static void enumsDayOfWeekAddition() {
	System.out.println(DayOfWeek.of(2));                    //TUESDAY
	 
	DayOfWeek day = DayOfWeek.FRIDAY;
	System.out.println(day.getValue());                     //5
	 
	LocalDate localDate = LocalDate.now();
	System.out.println(localDate.with(DayOfWeek.MONDAY));  //2013-05-13  i.e. when was monday in current week ?
}

public static void dateAdjusters() {
	LocalDate date = LocalDate.of(2013, Month.MAY, 15);                     //Today
    
	LocalDate endOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
	System.out.println(endOfMonth.toString());                              //2013-05-31
	 
	LocalDate nextTue = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
	System.out.println(nextTue.toString());                                 //2013-05-21
}

public static void createDate() {
	//Builder pattern used to make date object
	 OffsetDateTime date1 = Year.of(2013)
	                        .atMonth(Month.MAY).atDay(15)
	                        .atTime(0, 0)
	                        .atOffset(ZoneOffset.of("+03:00"));
	 System.out.println(date1);                                     //2013-05-15T00:00+03:00
	 
	//factory method used to make date object
	OffsetDateTime date2 = OffsetDateTime.
	                        of(2013, 5, 15, 0, 0, 0, 0, ZoneOffset.of("+03:00"));
	System.out.println(date2);                                      //2013-05-15T00:00+03:00
	
}

public static void clock() {
	Clock clock = Clock.systemDefaultZone();
	System.out.println(clock);                      //SystemClock[Asia/Calcutta]
	System.out.println(clock.instant().toString()); //2013-05-15T06:36:33.837Z
	System.out.println(clock.getZone());            //Asia/Calcutta
	 
	Clock anotherClock = Clock.system(ZoneId.of("Europe/Tiraspol"));
	System.out.println(anotherClock);                       //SystemClock[Europe/Tiraspol]
	System.out.println(anotherClock.instant().toString());  //2013-05-15T06:36:33.857Z
	System.out.println(anotherClock.getZone());             //Europe/Tiraspol
	 
	Clock forwardedClock  = Clock.tick(anotherClock, Duration.ofSeconds(600));
	System.out.println(forwardedClock.instant().toString());  //2013-05-15T06:30Z
}

public static void changeTimeZone() {
	System.out.println(ZoneRules.of(ZoneOffset.of("+05:30")).isDaylightSavings(Instant.now()));
	System.out.println(ZoneRules.of(ZoneOffset.of("+05:30")).isFixedOffset());	
}

public static void formatDate() {
	DateTimeFormatterBuilder formatterBuilder = new DateTimeFormatterBuilder();
	formatterBuilder.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
	                .appendLiteral("-")
	                .appendZoneOrOffsetId();
	DateTimeFormatter formatter = formatterBuilder.toFormatter();
	System.out.println(formatter.format(ZonedDateTime.now()));
}
}
