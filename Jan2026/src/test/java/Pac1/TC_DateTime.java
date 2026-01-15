package Pac1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class TC_DateTime {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter =DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatter1 =DateTimeFormatter.ofPattern("dd/mm/yyyy");
		// TODO Auto-generated method stub
		Instant currenttime= Instant.now();
		System.out.println("Current Time : "+currenttime);
		
		LocalDate now= LocalDate.now();
		LocalDate Independence = LocalDate.of(1947, Month.AUGUST, 15);
		Period period = Independence.until(Independence);
		
		System.out.println("Now : "+now);
		System.out.println("Independence : "+Independence);
		System.out.println("Tommorow : "+now.plusDays(1));
		System.out.println("LastMonth : "+now.minusMonths(1));
		System.out.println("Leap Year : "+now.isLeapYear());
		System.out.println("move to 30th day of month:"+now.withDayOfMonth(30));
		
		System.out.println("Period : "+period);
		System.out.println("Days : "+period.get(ChronoUnit.DAYS));
		System.out.println("Months : "+period.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+period.get(ChronoUnit.YEARS));
		ZonedDateTime ct = ZonedDateTime.now();
		ZonedDateTime ctinparis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Indian time : "+ct);
		System.out.println("Paris Time is : "+ctinparis);
		System.out.println(formatter);
		System.out.println(formatter1);
		
	}

}
