package ch7.inter.answer.master;

import java.util.Arrays;

import ch7.inter.answer.inter.Animals;

public class Master {
	private String name = "";
	private int age = 0;
	
	private Animals[] myPets = null;

	
	
	public Master() {
		super();
	}

	
	public Master(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Master(String name, int age, Animals[] myPets) {
		super();
		this.name = name;
		this.age = age;
		this.myPets = myPets;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Animals[] getMyPets() {
		return myPets;
	}


	public void setMyPets(Animals[] myPets) {
		this.myPets = myPets;
	}


	@Override
	public String toString() {
		return "Master [name=" + name + ", age=" + age + ", myPets=" + Arrays.toString(myPets) + "]";
	}
	
}
