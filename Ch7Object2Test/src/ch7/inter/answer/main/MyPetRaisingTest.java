package ch7.inter.answer.main;

import ch7.inter.answer.cat.FirstCat;
import ch7.inter.answer.cat.SecondCat;
import ch7.inter.answer.chicken.Chicken;
import ch7.inter.answer.inter.Animals;
import ch7.inter.answer.master.Master;
import ch7.inter.answer.monkey.Monkey;

public class MyPetRaisingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 여러분은 고양이 2마리, 닭, 원숭이를 유심히 봤다.
		// 너무나 귀엽고 깜찍해서 키우고 싶은 생각이 들었다.
		// 각 동물의 행동을 구현하시오 
		
		
		// 동물을 키우는 사람 클래스 알아서 정의하고 
		// 동물 2마리만 입양이 가능하도록 작성
		// 입양을 하게된 동물들의 정보도 출력되게 작성하시오 
		Animals[] ani = new Animals[2];
		Master me = new Master("박성욱", 31);
		
		FirstCat fc = new FirstCat();
		SecondCat sc = new SecondCat();
		Chicken chicken = new Chicken();
		Monkey monkey = new Monkey();
		
		fc.call();
		fc.eat("생선");
		fc.work("네발로");
		fc.sleep("엎드려서");
		System.out.println("==========");
		
		sc.call();
		sc.eat("생선");
		sc.work("두발로");
		sc.sleep("웅크리며");
		System.out.println("==========");
		
		chicken.eat("사료");
		chicken.work("두발로");
		chicken.sleep("서서");
		System.out.println("==========");
		
		monkey.eat("바나나");
		monkey.work("네발 또는 두발로");
		monkey.sleep("누워서");
		
		ani[0] = fc;
		ani[1] = monkey;
		
		me.setMyPets(ani);
		
		System.out.println(me);
	}

}
