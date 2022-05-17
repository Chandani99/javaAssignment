package com.masai;

public class SwitchStmt {
   static public void city(String name) {
    	switch(name) {
    	case "Mumbai":
    		System.out.println("Financial city");
    		break;
    	case "Kolkata":
    		System.out.println("City of Joy");
    		break;
    	case "Delhi":
    		System.out.println("Capital of the country");
    		break;
    	case "Bnagalore":
    		System.out.println("Cyber City");
    		break;
    	default:
    		System.out.println("May be Other Indian City");
		    break;
    	}
    }
	public static void main(String[] args) {
		// function calling----->
		city("Delhi");
		// TODO Auto-generated method stub

	}

}
