package com.arrays;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int[]arr =new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter" +i+ "index value:");
			int elements = sc.nextInt();
			arr[i]=elements;
		}
		int evenCount =0;
		int oddCount =0;
		for(int i=0;i<arr.length;i++) {

			if(arr[i] % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}

		System.out.println("Even count: " + evenCount);
		System.out.println("Odd count: " + oddCount);

		sc.close();

	}

}

