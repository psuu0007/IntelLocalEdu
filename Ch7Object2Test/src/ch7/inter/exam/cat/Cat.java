package ch7.inter.exam.cat;

import ch7.inter.answer.inter.Animals;

public abstract class Cat implements Animals {
	
	abstract void call(); // 내가 기를 고양이의 이름을 붙여주자

	void talk(String grrr) {
		// TODO Auto-generated method stub
		System.out.println("고양이는 " + grrr + " 거려요");
	}

	public void metaData() { // 재정의 하지 말자
		System.out.println("나는 고양이라고 부른다");
	}
}
