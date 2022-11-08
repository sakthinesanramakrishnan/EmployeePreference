package com.edu;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		String ename,edept;
		int eage;
		float esalary;
		double eyearsalary;
		Scanner sc=new Scanner(System.in);
		
		//user input
		System.out.println("Enter the ename");
		ename=sc.next();
		System.out.println("Enter the edept");
		edept=sc.next();
		System.out.println("Enter the eage");
		eage=sc.nextInt();
        System.out.println("Enter the esalary");
        esalary=sc.nextFloat();
        eyearsalary= esalary*12;
        System.out.println("The" +ename+" yearsalary is : "+eyearsalary);
        
	}

}
