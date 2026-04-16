package com.student;

public class StudentResult {
	String studentName;
	int studentId;
	String courseName;
	double totalMarks;
	public StudentResult(String Name,int Id,String cName,double tMarks) {
		this.studentName=Name;
		this.studentId=Id;
		this.courseName=cName;
		this.totalMarks=tMarks;
		System.out.println("Student Record Created Successfully");
	}
	public void  addMarks(double marks) {
		if(marks<=0) {
			System.out.println("Invalid marks entered");
		}
		else {
			totalMarks+=marks;
			System.out.println("Marks are:"+totalMarks);
		}
	}
	public void calculateGrade() {
		
	if(totalMarks>=90) {
			System.out.println("Grade A");
		}
		else if((totalMarks>=80)&&(totalMarks<=89)) {
			System.out.println("Grade B");
		}
		else if((totalMarks>=70)&&(totalMarks<=79)) {
			System.out.println("Grade C");
		}
		else if(totalMarks<60) {
			System.out.println("Fail");
		}
		else {
			System.out.println("No marks available to calculate grade");
		}
	}

}
