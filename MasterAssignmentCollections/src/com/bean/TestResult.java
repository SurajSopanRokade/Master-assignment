package com.bean;

import java.util.Date;

import com.manager.TestResultManager;

public class TestResult implements Comparable<TestResult>{
	MyDate testdate;
	public int testid;
	public int studentId;
	public int marks;
	public int out_of_marks;

	public TestResult(MyDate testdate, int testid, int Test_studentId, int marks, int out_of_marks) {

		this.testdate = testdate;
		this.testid = testid;
		this.studentId = Test_studentId;
		this.marks = marks;
		this.out_of_marks = out_of_marks;
	}

	public String toString() {
		return ("test date:  " + this.testdate + " " + "test id:  " + this.testid + " " + "test Test_studentId: "
				+ this.studentId + " " + "test marks: " + this.marks + " " + "test out of marks: "
				+ this.out_of_marks + "\n");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(TestResult o) {
		// TODO Auto-generated method stub
		if (this.marks==o.marks)
			return 0;
		else if (this.marks>o.marks)
			return -1;
		else
			return 1;
	}

	

	

}
