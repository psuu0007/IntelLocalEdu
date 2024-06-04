package four14.basic;

//일반 클래스 
public class MyException9Class extends Exception{
	
	private final int ERR_CODE;
	
	public MyException9Class(String msg, int errCode) {
		// TODO Auto-generated constructor stub
		super(msg); // Exception 생성자 호출
		ERR_CODE = errCode;
	}
	
	public int getERR_CODE() {
		return ERR_CODE;
	}

	public void getErrorMessage() {
		System.out.println("뭔지 모르지만 오류났으니까");
		System.err.println("010-1234-5678로 연락 ㄱㄱ");
		super.printStackTrace();
	}
	
}
