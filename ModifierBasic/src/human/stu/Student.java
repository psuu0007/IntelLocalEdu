package human.stu;

public class Student {

	private String name;
	
	public String getInfo() {
		return "학생 정보\n" + name;
	}
	
//	The method setName(String) from the type Student is never used locally
	private void setName(String name) {
		
		this.name = name;
	}
	
	
}
