package com.manager;

import com.bean.MyDate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Academy;
import com.bean.Course;

public class CourseManager {
	
	public static void addCourse() {
		Course c1 = new Course(1, "Computer", new MyDate(3 , 10 , 2022), "java", 100000, "2 months");
		Course c2 = new Course(2, "IT", new MyDate(6 , 10 , 2022), "Adv java", 150000, "3 months");
		Course c3 = new Course(3, "Java", new MyDate(7 , 10 , 2022), "Ad java", 400000, "3 months");
		Academy.courseList.add(c1);
		Academy.courseList.add(c2);
		Academy.courseList.add(c3);
	}
	public static void deleteCourse(int a) {
	//1.Add functions, add mod del search for Course 	
		Academy.courseList.remove(a);
	}
	public static void addNewCourse(Course c) {
	//1.Add functions, add mod del search for Course 
		Academy.courseList.add(c);
	}
	public static void search(Course c) {
	//1.Add functions, add mod del search for Course 
		Academy.courseList.contains(c);
	}

	public static void printCourses() {

		List<Course> courseList = Academy.courseList;
		for (Iterator<Course> iterator = courseList.iterator(); iterator.hasNext();) {
			Course course = (Course) iterator.next();
			System.out.println(course);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
