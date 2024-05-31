package three10;

public class ParentTest {

	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.age = 40;
		
		p.play();
		
		
		Child c = new Child();
		
		c.age = 13;
		
		c.play();
		
		Child2 ch2 = new Child2();
		
		ch2.play();
		
	}
	
	
}
