package two64;

public class RefernceEx2 {

	void change(Data d) { // 참조형 매개변수
		d.x = 2000;
		System.out.println("change(Data d): " + d.x);
	}
	
}
