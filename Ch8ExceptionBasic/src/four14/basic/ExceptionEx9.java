package four14.basic;

//사용자 정의 예외 만들기
public class ExceptionEx9 {

	public static void main(String[] args) {
		
//		기존의 예외 클래스를 활용할 수 있지만 
//		때론 새로운 예외 클래스를 만들어 사용할 수 도 있다.
		
		
		StartInstall9 st = new StartInstall9();
		
		try {
			st.setupMethod();
		} catch (MyException9Class e) {
			// TODO Auto-generated catch block
			e.getErrorMessage();
			
			System.out.println(e.getERR_CODE());
			
			e.printStackTrace();
		}
		
		
		
	}

	
	
}
