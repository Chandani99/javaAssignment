package com.masai;
import java.util.Scanner;
public class Student {
	int rollNo;
	int marks;
	String name="";
	
	void studetails() {
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rollNo);
		System.out.println("Marks:"+marks);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1= new Student();
		s1.name="Ram";
		s1.rollNo=24;
		s1.marks=450;
		
		
		s1.studetails();
		Student s2= new Student();
		s2.name="Shyam";
		s2.rollNo=12;
		s2.marks=790;
		
		s2.studetails();
		
		s1=null;
		s2=null;
		System.out.println(s1);
		System.out.println(s2);
		// TODO Auto-generated method stub

	}

}
