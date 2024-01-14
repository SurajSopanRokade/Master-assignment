package com.bean;


public class Course {
	public int  courseId;
	public String course_name;
	MyDate startDate ;
	public String subject;
	public int courseFees;
	public String duration ;
	
	public Course(int  courseId,String course_name,MyDate startDate,String subject,int fees,String duration )
	{
		this.courseId=courseId;
		this.course_name=course_name;
		this.startDate=startDate;
		this.subject=subject;
		this.courseFees=fees;
		this.duration=duration;
	}
	public String toString()
	{
		return("course id:  "+this.courseId+" "+"course name:  "+this.course_name+" "+"start date: "
	+this.startDate+" "+"subject: "+this.subject+" "+"course fees: "+courseFees+" "+"course duration: "+this.duration+"\n");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
