package com.masai;
import java.util.*;
public class CheckWrather {
     void check(boolean iS, boolean iR, double tempe) {
    	 if(iS==false && iR==false && tempe>=50.00) {
    		 System.out.println("Let's go out");
	     }
    	 else {
    		 System.out.println("Let's stay home");
	     }

    }
	public static void main(String[] args) {
		CheckWrather cw=new CheckWrather();
//		Scanner sc=new Scanner(System.in);
		
		cw.check(false, false, 60.0);
		// TODO Auto-generated method stub

	}

}
