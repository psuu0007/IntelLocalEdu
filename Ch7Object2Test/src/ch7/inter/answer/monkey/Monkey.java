package ch7.inter.answer.monkey;

import ch7.inter.answer.inter.Animals;

public class Monkey implements Animals{

	@Override
	public void eat(String bab) {
		// TODO Auto-generated method stub
		System.out.println("원숭이는 " + bab + "을 먹어요");
	}

	@Override
	public void work(String move) {
		// TODO Auto-generated method stub
		System.out.println("원숭이는 " + move + " 걸어요");
	}

	@Override
	public void sleep(String zzz) {
		// TODO Auto-generated method stub
		System.out.println("원숭이는 " + zzz + " 자요");
	}

	@Override
	public String toString() {
		return "원숭이";
	}
	
	

}
