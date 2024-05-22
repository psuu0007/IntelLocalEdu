
public class CastingBasic1 {

	public static void main(String[] args) {
		
//		boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다
//		기본형과 참조형은 서로 형변환할 수 없다.
//		서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만,
//		값의 범위가 작은 타입에서 큰 타입으로 형변환은 생략할 수 있다
		
		int firstNum = 0;
		int secondNum = 0;
		
		int totalNum = 0;
		double avg = 0.0;
		
//		총점과 평균을 구하시오
		
//		소수점 2째자리 반올림?
//		소수점 1자리 올림?
		
		firstNum = 10;
		secondNum = 7; // 반올림 올림처리
				
//		secondNum = 3; // 반올림 내림처리
		
		totalNum = firstNum + secondNum;
		
//		소수점 3째자리 내림?
		avg = (double)totalNum / 3;

		System.out.println(avg);
//											구하고 싶은 소수점 자리수
		avg = (int)((double)totalNum / 3 * 100) / 100.0;
//		433.33333333
//		433
//		4.33
		
		
		
		System.out.println(avg);
		
//		소수점 3번째 자리에서 
//		올림, 반올림
		
//		반올림
//		기능 분리
		avg = (double)totalNum / 3;
		System.out.println("1번 :" + avg);
		
		avg = avg + 0.005;
		System.out.println("2번 :" + avg);
		
		avg = avg * 100;
		System.out.println("3번 :" + avg);
		
		avg = (int)avg;
		System.out.println("4번 :" + avg);
		
		avg = avg / 100;
		System.out.println("5번 :" + avg);
	}
	
}
