package com.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.bean.Academy;
import com.bean.Student;

public class StudentManager {
	public static void addDummyStudent() {
		addStudent(1);
		addStudent(2);
		addStudent(3);
	}
	public static void addStudent(int courseid) {
		List<Student> StudentList = Academy.studentMap.get(courseid);
		Student s1 = new Student(1,"Suraj",8834459669l,"suraj3445@gmailcom");
		Student s2 = new Student(2,"Abhishek",6354855667l,"abhi9475@gmailcom");
		Student s3 = new Student(3,"Sudarshan",9334455667l,"sudar8445@gmailcom");
		Student s4 = new Student(4,"Snehal",83343155667l,"snehal7445@gmailcom");
		Student s5 = new Student(5,"Ishver",4752348687l,"ishver3845@gmailcom");
		Student s6 = new Student(6,"Sunish",9759348687l,"sunish3945@gmailcom");
		
		
		if (StudentList==null) {
			StudentList = new ArrayList<>();
			Academy.studentMap.put(courseid, StudentList);
		}
		if (courseid==1) {
			StudentList.add(s1);
			StudentList.add(s4);
			StudentList.add(s6);
		}
		else if (courseid==2) {
			StudentList.add(s2);
			StudentList.add(s3);
		}
		else if (courseid==3) {
			StudentList.add(s5);
		}
		
	}
	public static void printStudent() {
		Set <Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Integer, List<Student>> ent = itr.next();
			System.out.println("Course id : "+ent.getKey());
			System.out.println(ent.getValue());
		}
	}
	public static void printMostFavCourse() {
		Set <Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Integer, List<Student>> ent = itr.next();
			
		}
	}
	
	
	
	

}

