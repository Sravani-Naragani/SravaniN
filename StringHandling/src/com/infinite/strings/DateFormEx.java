package com.infinite.strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateFormEx {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(d));
		SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf1.format(d));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.parse("2022-08-30"));
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println("after adding 3 days "+ld.plusDays(3));
		System.out.println("after adding 2 months "+ld.plusMonths(2));
		System.out.println("lengthof month "+ld.lengthOfMonth());


		LocalDate ld1 = LocalDate.of(2000, 9, 23);
		System.out.println(ld1);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime lt1 = LocalTime.of(8, 34);
		System.out.println(lt1);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		for(String s : ZoneId.getAvailableZoneIds()){
			System.out.println(s);
		}
		LocalDateTime ldt1 = LocalDateTime.now(ZoneId.of("Asia/Kamchatka"));
		System.out.println(ldt1);
		Instant i = Instant.now();
		System.out.println(i);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		Duration dur = Duration.between(ldt1, ldt);
		System.out.println(dur);
		
		Clock c = Clock.systemDefaultZone();
		System.out.println(c.getZone());
	
		Clock c1 = Clock.systemUTC();
		System.out.println(c1.instant());
	
	


	}

}
