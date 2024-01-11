package com.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.bean.Academy;
import com.bean.Attendance;
import com.bean.Course;
import com.bean.Student;
import com.bean.Transaction;

public class StudentManager1 {
	public static void addStudent() {
		ArrayList<Student> list1 = new ArrayList<>();
		Student s1 = new Student(1, "Suraj", 8834459669l, "suraj3445@gmailcom");
		Student s2 = new Student(2, "Abhishek", 6354855667l, "abhi9475@gmailcom");
		Student s3 = new Student(3, "Sudarshan", 9334455667l, "sudar8445@gmailcom");
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);

		ArrayList<Student> list2 = new ArrayList<>();
		Student s6 = new Student(6, "Sunish", 9759348687l, "sunish3945@gmailcom");
		list2.add(s6);

		ArrayList<Student> list3 = new ArrayList<>();
		Student s4 = new Student(4, "Snehal", 83343155667l, "snehal7445@gmailcom");
		Student s5 = new Student(5, "Ishver", 4752348687l, "ishver3845@gmailcom");
		list3.add(s4);
		list3.add(s5);

		Academy.studentMap.put(1, list1);
		Academy.studentMap.put(2, list2);
		Academy.studentMap.put(3, list3);
	}
	public static void showdetails() {
	//14.Show one table which has course name , course start date and total 
	//students, total revenue till date, total left fees, total projected 
	//revenue, percentage collection till date. 
		
	}
	

	public static void deleteStudent(int a) {
		// 2.Method to delete a student. Note student all records across all beans
		// should be deleted.
		Set<Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Integer, List<Student>> ent = itr.next();
			List<Student> list = ent.getValue();
			Iterator<Student> itr1 = list.iterator();
			while (itr1.hasNext()) {
				Student s = itr1.next();
				if (s.getStudent_id() == a) {
					itr1.remove();
				}
			}
		}
	}

	public static void modifyStudentInfo(int cid, int sid) {
		// 3.Method to add student modify details of student based on course id student
		// id, search
		Set<Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Integer, List<Student>> ent = itr.next();
			if (cid == ent.getKey()) {
				
			
			List<Student> list = ent.getValue();
			Iterator<Student> itr1 = list.iterator();
			while (itr1.hasNext()) {
				Student s = itr1.next();
				if (s.getStudent_id()==sid) {
					//12.Method to update mobile no of student. 
					s.setphone_number(99453);
				}
			}
			}
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void printStudent() {
		Set<Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Integer, List<Student>> ent = itr.next();
			System.out.println("Course id : " + ent.getKey());
			System.out.println(ent.getValue());
		}
	}
	public static void printMostFavCourse() {
		Set <Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		int cid=0;
		int max=0;
		while(itr.hasNext()) {
			Entry<Integer, List<Student>> ent = itr.next();
			if (ent.getValue().size()>max) {
				max=ent.getValue().size();
				cid=ent.getKey();
			}
		}
	
		
		System.out.println(cid);
		Iterator<Course> itr1 = Academy.courseList.iterator();
		while(itr1.hasNext()) {
			Course c = itr1.next();
			if (c.courseId==cid) {
				System.out.println(c.course_name);
			}
		}
	}
}
