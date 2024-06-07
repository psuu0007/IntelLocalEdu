package five29.basic;

import java.util.Calendar;

public class BasicDateMain3 {

	
	public static void main(String[] args) {
	
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		System.out.println("올 해의 년도: " + year);
		
		int month = today.get(Calendar.MONTH);
		System.out.println("월: " + month);
		
		System.out.println("이 해의 몇 째주: " + today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("이 달의 몇 째주: " + today.get(Calendar.WEEK_OF_MONTH));
		
		int date = today.get(Calendar.DATE);
		System.out.println("이 달의 몇 일: " + date);
		
		System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("요일(1~7, 일요일=1): " + today.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("이 달의 몇 째 요일: " 
			+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		int hour = today.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute = today.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = today.get(Calendar.SECOND);
		System.out.println(second);
		
	}
	
}
