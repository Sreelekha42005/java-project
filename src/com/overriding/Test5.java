package com.overriding;
class Shape{
	public static void draw() {
		System.out.println("Drawing Shape");
	}
}
class Circle extends Shape {
	public static void draw() {
		System.out.println("Drawing Circle");
	}
	}
class Square extends Shape {
	public static void draw() {
		System.out.println("Drawing Square");
	}
	
}

public class Test5 {
	

	public static void main(String[] args) {
		
		Circle.draw();
		Square.draw();
	        }
	}



