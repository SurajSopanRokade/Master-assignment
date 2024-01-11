package com.action;

import com.bean.Academy;
import com.bean.Course;
import com.bean.MyDate;
import com.manager.AllManager;
import com.manager.AttendanceManager;
import com.manager.CourseManager;
import com.manager.StudentManager;
import com.manager.StudentManager1;
import com.manager.TestResultManager;
import com.manager.TransactionManager;

public class TestAcademy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CourseManager.addCourse();
//		Course c5 = new Course(6,"Python",new MyDate(12,3,2023),"abc",120000,"4 months");
//		CourseManager.addNewCourse(c5);
//		CourseManager.deleteCourse(1);
//		CourseManager.printCourses();
		
		
		
		StudentManager1.addStudent();
//		StudentManager1.printStudent();
//		StudentManager1.printMostFavCourse();
//		TransactionManager.printAllPaid();
		
		TransactionManager.addTransaction(1);
//		TransactionManager.printTransaction();
		
		AttendanceManager.addAttendance(1);
		
		TestResultManager.addTestResultManager(1);
		
		AllManager.deleteRecordOfstudent(1);
		StudentManager1.printStudent();
		TransactionManager.printTransaction();
		
//		AttendanceManager.addAttendance(1);
		AttendanceManager.printAttendance();
		
//		TestResultManager.addTestResultManager(1);
		TestResultManager.printTestResult();
//		TestResultManager.poorPerfStd();
		
	}

}
