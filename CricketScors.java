package com.masai;
import java.util.*;
public class CricketScors {
	public static void total(int o, int t, int th, int f, int fi) {
		int total=o*1+t*2+th*3+f*4+fi*6;
		System.out.println(total);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1's");
		int r1=sc.nextInt();
		System.out.println("Enter 2's");
		int r2=sc.nextInt();
		System.out.println("Enter 3's");
		int r3=sc.nextInt();
		System.out.println("Enter 4's");
		int r4=sc.nextInt();
		System.out.println("Enter 6's");
		int r6=sc.nextInt();
		// function calling----->
		total(r1,r2,r3,r4,r6);
		// TODO Auto-generated method stub

	}

}
