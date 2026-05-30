package com.arrays;
import java.util.Scanner;

class Copyelements {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number of elements:");
	int n = sc.nextInt();

	int[] arr1 = new int[n];

	System.out.println("Enter array elements:");

	for(int i = 0; i < arr1.length; i++) {
		arr1[i] = sc.nextInt();
	}


	int[] arr2 = new int[n];

	
	for(int i = 0; i < arr1.length; i++) {
		arr2[i] = arr1[i];
	}

	
	System.out.println("Elements copied to new array:");

	for(int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i] + " ");
	}

	sc.close();
}
}