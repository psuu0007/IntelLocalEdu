package ch11.exam5;

//게터&세터
public class Student {

	public String name;
	public int number = 0;
	
	public Student() {
		super();
	}

	public Student(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeamNumber() {
		return number;
	}

	public void setTeamNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + "]";
	}
	
}
