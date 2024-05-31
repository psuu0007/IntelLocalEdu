package ch7.inter.exam.cat;

public class FirstCat extends Cat{

	@Override
	public void eat(String bab) {
		// TODO Auto-generated method stub
		System.out.println("고양이가 " + bab + "을 먹어요");
	}

	@Override
	public void work(String move) {
		// TODO Auto-generated method stub
		System.out.println("고양이가 장난감을 가지고 " + move + " 걸어요");
	}

	@Override
	public void sleep(String zzz) {
		// TODO Auto-generated method stub
		System.out.println("고양이가 " + zzz + " 잔다");
	}

	// 첫번째 고양이의 애칭을 붙여주자
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("리치");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "리치";
	}
		
}
