package javatest;

public class Human {
	String name;
	int age;
	double height;
	String occupation;
	String food;
	
	public Human(String name, int age, double height, String occupation, String food ) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.occupation = occupation;
		this.food = food;
	}
	
	public void speak() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(occupation);
	}
	
	public void eat() {
		System.out.println("eating..." + food );
	}
	
	public void walk() {
		System.out.println("I'm walking now...");
	}
}
