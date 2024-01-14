package com.bean;

public class Student implements Comparable<Student>{
	private int studentId;
	private String student_name;
	private long phone_number;
	private String email;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int Student_id, String student_name, long phone_number, String email) {
		this.setStudent_id(Student_id);
		this.setstudent_name(student_name);
		this.setphone_number(phone_number);
		this.setEmail(email);
	}

	public int getStudent_id() {
		return studentId;
	}

	public void setStudent_id(int Student_id) {
		this.studentId = Student_id;
	}

	public String getstudent_name() {
		return student_name;
	}

	public void setstudent_name(String student_name) {
		this.student_name = student_name;
	}

	public long getphone_number() {
		return phone_number;
	}

	public void setphone_number(long phone_number2) {
		this.phone_number = phone_number2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return ("student id:  " + this.getStudent_id() + "  " + "Student name:  " + this.getstudent_name() + "  "
				+ "phone no: " + this.getphone_number() + "  " + "email: " + this.getEmail() + "\n");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.student_name.compareTo(o.student_name);
	}

	

}
