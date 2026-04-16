package com.student;
import java.util.Scanner;
public class StudentELC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name=sc.nextLine();
		System.out.println("enter student Id:");
		int id=sc.nextInt();
		System.out.println("enter course name:");
		String course=sc.next();
		System.out.println("Subject Marks");
		double marks=sc.nextDouble();
		StudentResult obj=new StudentResult(name,id,course,marks);
		int count=0;
		boolean result=true;
		while(result) {
			System.out.println("1. Add more subject marks\r\n"
					+ "2. Calculate grade\r\n"
					+ "3. View total marks\r\n"
					+ "4. Exit");
			count=sc.nextInt();
			switch(count) {
				case 1:
					System.out.println("enter the marks");
					double maks=sc.nextDouble();
					obj.addMarks(maks);
					break;
				case 2:
					System.out.println("Grade is");
					obj.calculateGrade();
					break;
				case 3:
					System.out.println("total marks are"+marks);
					break;
				case 4:
					System.out.println("Thank You");
					result=false;
				default:
					System.out.println("Invalid option");
					
			
			
		}
	}
sc.close();
}}