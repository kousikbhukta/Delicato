package sample;

import java.util.Scanner;

public class SortingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array");

		int size = sc.nextInt();
		
		System.out.println("Please enter the value for the array");


		int[] ar = new int[size];
		for (int i = 0; i < size; i++) {

			ar[i] = sc.nextInt();
		}

		for (int j = 0; j < size; j++) {
			
			for(int k=j+1; k<size; k++){

			if (ar[j] > ar[k]) {
				
				int temp = ar[j];
				ar[j]=ar[k];
				ar[k]=temp;
			}
			}
		}

		System.out.println("The ascending order is");
		for(int i=size-1; i>=0; i--){
			
			System.out.println(ar[i]);
		}
		
		sc.close();
	}
}
