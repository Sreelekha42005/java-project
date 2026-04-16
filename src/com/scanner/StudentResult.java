package com.scanner;

public class StudentResult {
        String studentName;
		int studentID;
		String courseName;
		double totalMarks;
		public  StudentResult(String studentName, int studentID, String courseName, double totalMarks) {
			this.studentName = studentName;
			this.studentID = studentID;
			this.courseName = courseName;
			this.totalMarks = totalMarks;
			System.out.println("Student Record Created Successfully");
		
				
				
			}
		public void addMARKS(double Marks) {
			if(Marks<=0) {
			System.out.println("invalid marks entered");	
			}else {
				totalMarks += Marks;
				System.out.println("totalMarks:" + totalMarks);
			}
		}
		public void calculateGrade() {
			String Grade="";
			if(totalMarks<=0) {
				System.out.println("\"Invalid marks entered\"");
			}else if(totalMarks>=90) {
				Grade ="A";
			}else if(totalMarks>=80 && totalMarks<=89) {
				Grade = "B";
				
			}else if(totalMarks>=70 && totalMarks<=79) {
				Grade = "C";
				
			}else if(totalMarks>=60 && totalMarks<=69) {
				Grade = "D";
		
			}else {
				Grade = "Fail";
			}
				System.out.println("total marks:" + totalMarks);
              System.out.println("Grade:"+ Grade);
		}
		public void display() {
			System.out.println("totalMarks:" + totalMarks);
		}	
		
	
			
		}
		
	


