package com.arrays;

import java.util.Scanner;


public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter" +i+ "index value:");
			int elements = sc.nextInt();
			arr[i]=elements;
		}1
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println("sum of array elements:" + sum);
		sc.close();
		
		

	}

}
