package sample;


public class ReverseNumber {

		public int Reverse(int n){
			
			int rev=0;
			while(n!=0){
				rev=(rev*10)+(n%10);
				n=n/10;
			}
			
			return rev;
		}

		public static void main(String[] args) {


			ReverseNumber m= new ReverseNumber();
			int reverse = m.Reverse(12);
			System.out.println("The reverse number is > "+reverse);
	}

}
