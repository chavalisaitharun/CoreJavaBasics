package org.basics;

import java.util.Scanner;

public class FamilyDetails {
	public void Spouse() {
		
		System.out.println("Please enter your details: ");
		System.out.println("Enter your Name: ");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		System.out.println("Enter your Mobile Number: ");
		Long l=s.nextLong();
		System.out.println("Your name is: "+name);
		System.out.println("Your Mobile number is: "+l);

	}

}
