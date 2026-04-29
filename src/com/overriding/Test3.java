package com.overriding;
class Person{
	protected void display() {
		System.out.println("I am a person");
	}
}
class Student extends Person {
	protected void display() {
		System.out.println("I am a student");
	}
}
	


public class Test3 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
	}

}
