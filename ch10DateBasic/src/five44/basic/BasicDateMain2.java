package five44.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicDateMain2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
//		날짜 형태 변환
		
		Date now = new Date();
		
		System.out.println(now);
		
		System.out.println("년: " + (now.getYear() + 1900));
//		0=1월, 1=2월, 2=3월, ,,, 10=11월, 11=12월
		System.out.println("월: " + (now.getMonth() + 1));
		System.out.println("일: " + now.getDate());
		
//		0=일요일, 1=월요일, 2=화요일, ,,, 5=금요일, 6=토요일		
		System.out.println("요일: " + now.getDay());
		
		System.out.println("시: " + now.getHours());
		System.out.println("분: " + now.getMinutes());
		System.out.println("초: " + now.getSeconds());
//		형식지정자
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy년MM월dd일 E요일 H시 m분 s초");
		
		String todayStr = sdf.format(now);
		
		System.out.println(todayStr);
		
		
		Date myChoiceDate = new Date();
		
		int year = 2024 - 1900;
		
		myChoiceDate.setYear(year);
		myChoiceDate.setMonth(7);
		myChoiceDate.setDate(16);
		myChoiceDate.setHours(8);
		myChoiceDate.setMinutes(30);
		myChoiceDate.setSeconds(10);
		
		System.out.println(myChoiceDate);
		
		
	}
	
}
