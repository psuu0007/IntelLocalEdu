package five44.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicDateMain2 {

	public static void main(String[] args) {

//		자신의 생년월일을 표현하자

//		19870423 ???야 생일 축하한다^^
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		Date date = new Date();

		int year = 1998 - 1900;

		date.setYear(year);
		date.setMonth(8);
		date.setDate(1);

		String myDay = sdf.format(date);

		System.out.println(myDay + " ???아 생일 축하한다^^");

	}

}
