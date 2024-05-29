package two64.test;

public class CallByExamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		
		Exam3 exam3 = new Exam3();
		exam3.n = 10;
		exam3.m = 20;
		result = exam3.add(exam3);
		
		System.out.println(result);
		System.out.println("exam3.n= " 
			+ exam3.n + "/ exam3.m= " + exam3.m);
	}

}
