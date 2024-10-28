package org.scanner;

import java.util.Scanner;

public class InputScanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student RegNo:");
		int regno = s.nextInt();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Student Name:");
		String name = s1.nextLine();
		System.out.println("Enter the Mark1:");
		int mark1 = s.nextInt();
		System.out.println("Enter the Mark2:");
		int mark2 = s.nextInt();
		System.out.println("Enter the Mark3:");
		int mark3 = s.nextInt();
		System.out.println("Enter the Mark4:");
		int mark4 = s.nextInt();
		System.out.println("Enter the Mark5:");
		int mark5 = s.nextInt();
		int total=mark1+mark2+mark3+mark4+mark5;
		System.out.println("The total mark is:"+total);
		double avg=total/5;
		System.out.println("The Average mark is:"+avg);
		
	
	}

}
