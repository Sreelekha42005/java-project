package com.polymorphism;

public class Overloadingmethod {
	//public void printData(short a, short b) {
       // System.out.println("short:" + (a+b));
    //}
	
	//public void printData(int a, int b) {
       // System.out.println("int:" + (a+b));
   // }

   // public void printData(long a, long b) {
       // System.out.println("long:" + (a+b));
   // }

   //public void printData(float a, float b) {
       // System.out.println("float:"  + (a+b));
    //}

   // public void printData(double a, double b) {
       // System.out.println("double:"+ (a+b));
   // }

    public void printData(Integer a, Integer b) {
        System.out.println("Integer:" + (a+b));
    }

    
    
	public static void main(String[] args) {
		//short s1 = 20;
		//short s2 = 30;
		//new Overloadingmethod().printData(s1 , s2); // nearest value
		//new Overloadingmethod().printData(20 , 30);// implicit type casting
		new Overloadingmethod().printData(40 , 60);// wrapper classes
	    }
		

	}
	


