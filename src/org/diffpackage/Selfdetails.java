package org.diffpackage;

import java.util.Scanner;

public class Selfdetails {
	public void employee() {
	System.out.println("Please enter your details: ");
	System.out.println("Enter your Name: ");
	Scanner s=new Scanner(System.in);
	String name=s.nextLine();
	System.out.println("Enter your Company Name: ");
	String cname=s.nextLine();
	System.out.println("Enter your employee Id: ");
	long id=s.nextLong();
	System.out.println("Your name is: "+name);
	System.out.println("Your Company Name is: "+cname);
	System.out.println("Your empID is: "+id);
}
}