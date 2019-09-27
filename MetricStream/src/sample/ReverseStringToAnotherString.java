package sample;

public class ReverseStringToAnotherString {

	public static void main(String[] args) {

		String s1="Hello";
		String s2="world";
		
		String temp="";
		
		temp=s1;
		s1=s2;
		s2=temp;
		
		
		System.out.println("Ist string is > "+s1);
		
		System.out.println("2nd string is > "+s2);
		
	}

}
