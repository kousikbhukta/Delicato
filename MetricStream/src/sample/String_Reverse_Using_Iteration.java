package sample;

public class String_Reverse_Using_Iteration {

	public static void main(String[] args) {
		// Using Iteration
		String str2="This is another string";
		String rev="";
		char charArray[] = str2.toCharArray();
		for(int i=charArray.length-1; i>=0; i--){
			rev+=charArray[+i];
		}
		System.out.println(rev);
		
		System.out.println("");
	}
}
