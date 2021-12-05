package day20passbyvaluedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	/*
	   We can create object in 2 ways;
	   1)By using "new" keyword. For example "int arr[] = new int[3];"
	   2)We convert an existing object to another object "List<Integer> list = Arrays.asList(12, 13, 14);"
	*/
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		
		System.out.println(LocalDate.now());
		
		System.out.println(LocalTime.now());
		
		System.out.println(LocalDateTime.now());
		
		//How to manipulate date
		LocalDate currentDate = LocalDate.now();
		System.out.println("Bedor adding 7 days: " + currentDate);
		
		currentDate = currentDate.plusDays(7);
		System.out.println("After adding 7 days: " + currentDate);
		
		currentDate = currentDate.minusDays(2);
		System.out.println("After subtracting 2 days: " + currentDate);
		
		currentDate = currentDate.plusMonths(5);
		System.out.println("After adding 5 months: " + currentDate);
		
		currentDate = currentDate.minusYears(6).plusMonths(4).minusDays(5);
		System.out.println("Method chain: " + currentDate);
		
		//How to manipulate time
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime.getHour());
		
		currentTime.isAfter(LocalTime.of(23, 11));
		boolean isAfter = currentTime.isAfter(LocalTime.of(23, 11));
		System.out.println(isAfter);
		
		System.out.println(currentTime.NOON);
		System.out.println(Integer.MIN_VALUE);
		

	}

}
