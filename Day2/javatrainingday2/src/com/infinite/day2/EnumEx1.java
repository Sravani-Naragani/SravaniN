package com.infinite.day2;
public class EnumEx1 {
    enum WeekdDays{
	     SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    }

	public static void main(String[] args) {
		WeekdDays wd = WeekdDays.TUESDAY;
		System.out.println(wd);
		String str = "FRIDAY";
		wd = WeekdDays.valueOf(str);
		System.out.println(wd);
	}
}