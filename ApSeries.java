package com.masai;
import java.util.*;
public class ApSeries {
	public static void apseries(int number) {
		int total=(number*(number+1))/2;
		System.out.println(total);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
      // function calling----->
		apseries( num);

	}

}
