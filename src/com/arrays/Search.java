package com.arrays;
import java.util.Scanner;
public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements:");
		int n= sc.nextInt();

		int[] arr = new int[n];

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter" +i+ "index value:");
			int elements = sc.nextInt();
			arr[i]=elements;
		

	}
		System.out.println("Enter element to search:");
		int search = sc.nextInt();

		boolean found = false;
		for(int i = 0; i < arr.length; i++) {

			if(arr[i] == search) {

				System.out.println("Element found at position: " + (i + 1));
				found = true;
				break;
			}
		}
		if(found == false) {
			System.out.println("Element not found");
		}

		sc.close();

}
}
