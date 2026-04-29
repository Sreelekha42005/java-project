package com.overriding;
class Parent{
	public static void print() {
		System.out.println("parent");
		
	}
}
class Child extends Parent{
	public static void print() {
		System.out.println("child");
	}
}

public class Test4 {

	public static void main(String[] args) {
		
	Parent.	print();
	Child.	print();

	}

}
