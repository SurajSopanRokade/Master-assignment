package com.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.bean.MyDate;
import com.bean.Student;
import com.bean.Academy;
import com.bean.CompTestR;
import com.bean.Course;
import com.bean.TestResult;
import com.bean.Transaction;

public class TestResultManager  {
	public static void addTestResultManager(int courseid) {
		List<TestResult> testlist = Academy.test_map.get(courseid);
		TestResult t1 = new TestResult(new MyDate(12,1,2022),1,1,34,100);
//		TestResult t2 = new TestResult(new MyDate(13,2,2022),2,2,45,100);
//		TestResult t3 = new TestResult(new MyDate(13,2,2022),3,2,34,100);
		TestResult t4 = new TestResult(new MyDate(13,2,2022),4,2,64,100);
		TestResult t5 = new TestResult(new MyDate(14,3,2022),5,3,77,100);
		TestResult t6 = new TestResult(new MyDate(15,4,2022),6,4,26,100);
		TestResult t7 = new TestResult(new MyDate(16,5,2022),7,5,78,100);
		TestResult t8 = new TestResult(new MyDate(17,6,2022),8,6,39,100);
//		TestResult t9 = new TestResult(new MyDate(12,1,2022),9,1,45,100);
//		TestResult t10 = new TestResult(new MyDate(12,1,2022),10,1,23,100);
//		TestResult t11 = new TestResult(new MyDate(14,3,2022),11,3,78,100);
//		TestResult t12 = new TestResult(new MyDate(14,3,2022),12,3,89,100);
//		TestResult t13 = new TestResult(new MyDate(15,4,2022),13,4,45,100);
//		TestResult t14 = new TestResult(new MyDate(15,4,2022),14,4,34,100);
//		TestResult t15 = new TestResult(new MyDate(16,5,2022),15,5,23,100);
//		TestResult t16 = new TestResult(new MyDate(16,5,2022),16,5,24,100);
//		TestResult t17 = new TestResult(new MyDate(17,6,2022),17,6,26,100);
//		TestResult t18 = new TestResult(new MyDate(17,6,2022),18,6,25,100);
//		
				
		
		
		
		
		
		if (testlist == null) {
			testlist = new ArrayList<>();
			Academy.test_map.put(courseid, testlist);
		}
		
		testlist.add(t1);
//		testlist.add(t2);
//		testlist.add(t3);
		testlist.add(t4);
		testlist.add(t5);
		testlist.add(t6);
		testlist.add(t7);
		testlist.add(t8);
//		testlist.add(t9);
//		testlist.add(t10);
//		testlist.add(t11);
//		testlist.add(t12);
//		testlist.add(t13);
//		testlist.add(t14);
//		testlist.add(t15);
//		testlist.add(t16);
//		testlist.add(t17);
//		testlist.add(t18);
		
	}
	public static List<TestResult> getAllTransaction(int courseid) {

		return Academy.test_map.get(courseid);
	}
	public static void deleteTestResReco(int a) {
		//2.Method to delete a student. Note student all records across all beans should be deleted. 
		Set <Entry<Integer, List<TestResult>>> set = Academy.test_map.entrySet();
		Iterator<Entry<Integer, List<TestResult>>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Integer, List<TestResult>> ent = itr.next();
			List<TestResult> l3 = ent.getValue();
			Iterator<TestResult> itr1= l3.iterator();
			while(itr1.hasNext()) {
				TestResult t=itr1.next();
				if(t.studentId==a) {
					itr1.remove();
				}
			}
		}
	}
	public static void printTestResult() {
//		CompTestR c1 = new CompTestR();
	
		Set <Entry<Integer, List<TestResult>>> set = Academy.test_map.entrySet();
		Iterator<Entry<Integer, List<TestResult>>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Integer, List<TestResult>> ent = itr.next();
			CompTestR c1 = new CompTestR();
			Collections.sort(ent.getValue());
			System.out.println("Course id : "+ent.getKey());
			System.out.println(ent.getValue());
		}
	}
	public static void poorPerfStd() {
		Iterator<Course>itr =Academy.courseList.iterator();
		int sum=0;
		ArrayList<Student>slist= new ArrayList<> ();
		while(itr.hasNext()) {
			Course c = itr.next();
			int cid = c.courseId;
			Set <Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
			Iterator<Entry<Integer, List<Student>>> itr1 = set.iterator();
			while(itr1.hasNext()) {
				Entry<Integer, List<Student>> ent = itr1.next();
				if(cid==ent.getKey()) {
					List<Student> st =ent.getValue();
					Iterator<Student> itr3 = st.iterator();
					while(itr3.hasNext()) {
						Student s = itr3.next();
						int sid=s.getStudent_id();
						Set <Entry<Integer, List<TestResult>>> set1 = Academy.test_map.entrySet();
						Iterator<Entry<Integer, List<TestResult>>> itr2 = set1.iterator();
						while(itr2.hasNext()) {
							sum=0;
							Entry<Integer, List<TestResult>> ent1 = itr2.next();
							List<TestResult> list=ent1.getValue();
							Iterator <TestResult> itr4 = list.iterator();
							while(itr4.hasNext()) {
								TestResult t1 = itr4.next();
								int ssid = t1.studentId;
								if (sid==ssid) {
									sum=sum+t1.marks;
								}
							}
//							System.out.println("Sum : "+sum);
							if (sum/3<40) {
								slist.add(s);
							}
							
						}
					}
				}
			}
		}
		System.out.println(slist);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addTestResultManager(1);
		
	}
	
	
}
