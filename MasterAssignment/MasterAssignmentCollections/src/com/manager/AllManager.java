package com.manager;

import com.bean.Academy;
import com.bean.Course;
import com.bean.MyDate;
import com.bean.Transaction;

public class AllManager {
	public static void printCourse() {
		CourseManager.addCourse();
		CourseManager.printCourses();
	}
	public static void printStudent1() {
		StudentManager1.addStudent();
		StudentManager1.printStudent();
	}
	public static void printTransaction() {
		TransactionManager.addTransaction(1);
		TransactionManager.printTransaction();
	}
	public static void printAttendance() {
		AttendanceManager.addAttendance(1);
		AttendanceManager.printAttendance();
	}
	public static void mostFavCourse() {
		StudentManager1.addStudent();
		StudentManager1.printMostFavCourse();
	}
	public static void deleteRecordOfstudent(int b) {
		//2.Method to delete a student. Note student all records across all beans should be deleted. 
		StudentManager1.deleteStudent(b);
		TransactionManager.deleteAllTrancReco(b);
		AttendanceManager.delectAttendanceReco(b);
		TestResultManager.deleteTestResReco(b);
	}
	public static void changeStudentCidAndSid() {
		StudentManager1.modifyStudentInfo(1,3);
	}
	public static void printAllPaidFeesStudent() {
		TransactionManager.addTransaction(1);
		TransactionManager.printAllPaid();
	}
	public static void poorPerfStd() {
		TestResultManager.addTestResultManager(1);
		TestResultManager.printTestResult();
		TestResultManager.poorPerfStd();
	}
	public static void addCour() {
		CourseManager.addCourse();
		Course c5 = new Course(6,"Python",new MyDate(12,3,2023),"abc",120000,"4 months");
		CourseManager.addNewCourse(c5);
	}
	public static void removCours(int b) {
		CourseManager.deleteCourse(b);
		CourseManager.printCourses();
	}
	public static void deleteAllAttreco(int b) {
		AttendanceManager.delectAttendanceReco(b);
	}
	 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
