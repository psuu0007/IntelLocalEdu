package ch7.inter.answer.chicken;

import ch7.inter.answer.inter.Animals;

public class Chicken implements Animals{

	@Override
	public void eat(String bab) {
		// TODO Auto-generated method stub
		System.out.println("닭은 " + bab + "을 먹어요");
	}

	@Override
	public void work(String move) {
		// TODO Auto-generated method stub
		System.out.println("닭은 " + move + " 걸어요");
	}

	@Override
	public void sleep(String zzz) {
		// TODO Auto-generated method stub
		System.out.println("닭은 " + zzz + " 자요");
	}

}
