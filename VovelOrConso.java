package com.masai;

import java.util.Scanner;

public class VovelOrConso {
	
   public void vovelCon(char ch) {
	   boolean flag=false;
	    String vovel="aeiouAEIOU";
	    for(int i=0; i<vovel.length(); i++) 
	    {
	    	if(vovel.charAt(i)==ch) {
	    		flag=true;
	    	}
	    }
	    if(flag==true) {
	    	System.out.println("Character is Vovel");	
	    }
	    else {
		    String upperCons="BCDFGHJKLMNPQRSTVWXYZ";
		    String lowerCons="bcdfghjklmnpqrstvwxyz";
		    for(int j=0; j<upperCons.length(); j++) {
		    	if(upperCons.charAt(j)==ch ||lowerCons.charAt(j)==ch ) {
		    		flag=true;
		    	}
		    }
		    if(flag==true) {
		    	System.out.println("Character is consonent");	
		    }
		    else {
		    	System.out.println("Error: Please enter any character");
		    }
	    }  
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		char ch=sc.next().charAt(0);
		VovelOrConso vc=new VovelOrConso();
      // function calling----->
		vc.vovelCon(ch);

	}
}
