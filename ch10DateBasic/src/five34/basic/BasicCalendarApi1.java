package five34.basic;

import java.util.Calendar;

public class BasicCalendarApi1 {

//	하나의 월 보기
	public void printCal(int year, int month) {
		String weekTitle = "일\t월\t화\t수\t목\t금\t토";

		Calendar cal = Calendar.getInstance();

		cal.set(year, month - 1, 1);

		System.out.printf("\t\t%d년\t %d월\n", year, month);
		System.out.println(weekTitle);

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1~7 요일

		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 마지막날

//		첫째주 공백 날짜 출력
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("\t");
		}

//		실제 숫자 표기
		for (int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			if ((i + dayOfWeek - 1) % 7 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println();
	}
	
//	한 해 전체보기
	public void printCal(int year) {
		for (int i = 1; i <= 12; i++) {
			printCal(year, i);
		}
	}

}
