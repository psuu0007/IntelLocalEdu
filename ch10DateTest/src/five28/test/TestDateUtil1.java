package five28.test;

import java.util.Date;

public class TestDateUtil1 {

	@SuppressWarnings("deprecation")
	public String setDayKoreaVersion() {
		Date date = new Date();

		int dayNum = date.getDay();

		switch (dayNum) {
			case 0: {
				return "일";
			}
			case 1: {
				return "월";
			}
			case 2: {
				return "화";
			}
			case 3: {
				return "수";
			}
			case 4: {
				return "목";
			}
			case 5: {
				return "금";
			}
			case 6: {
				return "토";
			}
			default: {
				return "해당 요일 없음";
			}
		}
		
	}

	@SuppressWarnings("deprecation")
	public String getTodayDate() {
		Date now = new Date();
		
		String today;
		
		int year = now.getYear() + 1900;
		String month = this.getStringVersionDate(now.getMonth() + 1);
		String dateInt = this.getStringVersionDate(now.getDate());
		
		String day = this.setDayKoreaVersion();
		
		int hours = now.getHours();
		int minutes = now.getMinutes();
		int seconds = now.getSeconds();
		
		today = year + "년 " + month + "월 " + dateInt + "일 " 
				+ day + "요일 " + hours + "시 " + minutes + "분 " + seconds + "초";
		
		return today;
	}
	
	public String getStringVersionDate(int num) {
		
		String stringVersionDate = "0";
		
		if (num < 10) {
			stringVersionDate += num;
			return stringVersionDate;
		} else {
			return num + "";
		}
	}

}
