package sample;

import java.util.Scanner;

public class CountDigitInInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int count=0;
		
		while(num!=0){
			
			num=num/10;
			++count;
			
		}
		
		System.out.println("The length of the number is > "+count);
		sc.close();
	}

}
