package com.org.capg;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class UserRegistration {
	static String firstName;
	static Scanner sc=new Scanner(System.in);

	public static boolean matche(String regex,String input) {
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input);
		boolean b=m.matches();
		return b;
	}
	
	public static void setFirstName(){
		boolean flag=true;
		String pattern="[A-Z][a-z]{2,}";
		while(flag) {
			System.out.println("Enter the First Name:");
			String input=sc.nextLine();
			if(matche(pattern,input)) {
				firstName=input;
				flag=false;
			} 
			else {
				System.out.println("Enter a name that starts with Cap and has min 3 chars");
			}
		}
	}	
		
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration");
		setFirstName();
	}
}
