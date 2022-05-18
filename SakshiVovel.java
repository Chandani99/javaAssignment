package com.masai;
import java.util.Scanner;
public class SakshiVovel {
	void vovelCon(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("Char is Vovel");	
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("Char is Consonent");
			}
		else {
			System.out.println("Error");
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		VovelOrConso vc=new VovelOrConso();
      // function calling----->
		vc.vovelCon(ch);

	}

}
