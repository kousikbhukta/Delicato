package sample;

public class UsingSuper {
	
	
	int r=67;
	void sum(int b){
		
		System.out.println(b);
	}
	
	UsingSuper(){
		super();
		System.out.println("This is constructor");
	}
	
	UsingSuper(int a){
		this();
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new UsingSuper(5);
		
	}

}
