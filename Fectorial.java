package com.masai;
import java.util.*;
public class Fectorial {
	public static void factorial(int n) {
		if(n<2|| n>100) {
			System.out.println("Invalid number");
		}
		else {
			int fact=1;
			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					int count=0;
					for(int j=1; j<=i; j++) {
						if(i%j==0) {
							count++;
						}
					}
					if(count==2) {
						System.out.println(i);	
					}
				}
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the munber");
		int num=sc.nextInt();
		// function calling----->
		factorial(num);
		// TODO Auto-generated method stub

	}

}
