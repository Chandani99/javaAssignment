package com.masai;

public class StaticNonStatic {
	static int x=20;
	int y=30;
	static void display() {
		System.out.println("Welcome to new era of java");
	}

	public static void main(String[] args) {
		// static member can be access without creating object
		System.out.println(x);
		display();
		
		//to access non-static member we need to create object first
		// then can access using object i.e. object.<memberName>;
		
		// TODO Auto-generated method stub
		StaticNonStatic sns=new StaticNonStatic();
	    int z=sns.y;
	    System.out.println(z);
	}

}
