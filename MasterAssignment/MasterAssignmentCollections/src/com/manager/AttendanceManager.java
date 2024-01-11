package com.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.bean.MyDate;
import com.bean.Student;
import com.bean.Academy;
import com.bean.Attendance;

public class AttendanceManager {

	public static void addAttendance(int courseid) {
		List<Attendance> attendancelist = Academy.attendanceMap.get(courseid);
		 	Attendance a1=new Attendance(1, 1, "p", new MyDate(4,10,2022));
			Attendance a2=new Attendance(2, 2, "a", new MyDate(8,10,2022));
			Attendance a3=new Attendance(3, 3, "p", new MyDate(9,10,2022));
			Attendance a4=new Attendance(4, 4, "p", new MyDate(10,10,2022));
			Attendance a5=new Attendance(5, 5, "a", new MyDate(11,10,2022));
			
			if(attendancelist == null) {
				attendancelist = new ArrayList<>();
				Academy.attendanceMap.put(courseid, attendancelist);
			}
			attendancelist.add(a1);
			attendancelist.add(a2);
			attendancelist.add(a3);
			attendancelist.add(a4);
			attendancelist.add(a5);
			
	}
	public static List<Attendance> getAllAttendance(int courseid) {
		
		return Academy.attendanceMap.get(courseid);
	}
	public static void delectAttendanceReco(int a) {
		//2.Method to delete a student. Note student all records across all beans should be deleted. 
		Set <Entry<Integer, List<Attendance>>> set2 = Academy.attendanceMap.entrySet();
		Iterator<Entry<Integer, List<Attendance>>> itr5 = set2.iterator();
		while(itr5.hasNext()) {
			Entry<Integer, List<Attendance>> ent = itr5.next();
			List<Attendance> l2 =ent.getValue();
			Iterator<Attendance> itr6=l2.iterator();
			while(itr6.hasNext()) {
				Attendance t = itr6.next();
				if (t.studId==a) {
					System.out.println("IN Attend"+t.studId);
					itr6.remove();
				}
			}
		}
	}
	public static void printAttendance() {
		Set <Entry<Integer, List<Attendance>>> set = Academy.attendanceMap.entrySet();
		Iterator<Entry<Integer, List<Attendance>>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Integer, List<Attendance>> ent = itr.next();
			System.out.println("Course id : "+ent.getKey());
			System.out.println(ent.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
