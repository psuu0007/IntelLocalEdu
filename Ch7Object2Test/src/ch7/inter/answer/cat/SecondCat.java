package ch7.inter.answer.cat;

public class SecondCat extends Cat{

	// 두번째 고양이의 이름을 붙여주자
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("아니용");
	}

	@Override
	public void eat(String bab) {
		// TODO Auto-generated method stub
		System.out.println("고양이는 " + bab + "을 먹어요");
	}

	
	@Override
	public void work(String move) {
		// TODO Auto-generated method stub
		System.out.println("고양이는 " + move + " 걸어요");
	}

	@Override
	public void sleep(String zzz) {
		// TODO Auto-generated method stub
		System.out.println("고양이는 " + zzz + " 자요");
	}

	
}
