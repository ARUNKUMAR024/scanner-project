package org.employeedetails;

import java.util.Scanner;

public class Employee { 



	public static void main(String[] args) {
		Scanner a =new Scanner(System.in); 
		Byte empid = a.nextByte(); 
		System.out.println("my emp id"+empid); 
		String empname = a.next(); 
		System.out.println("my empname is " +empname); 
		String empmail = a.next(); 
		System.out.println(" my emp id is" +empmail);  
		Long empphonenumber=a.nextLong();
		System.out.println("my phone number is "+empphonenumber); 
		float empsalery = a.nextFloat(); 
		System.out.println("mysalery is "+empsalery );
int empcity = a.nextInt(); 
System.out.println("my city is" +empcity); 
		
	}

}
 