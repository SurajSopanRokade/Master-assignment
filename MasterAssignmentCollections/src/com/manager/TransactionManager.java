package com.manager;

import java.util.ArrayList;
import com.bean.MyDate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.bean.Academy;
import com.bean.Course;
import com.bean.Student;
import com.bean.Transaction;

public class TransactionManager {
	
	
		public static void addTransaction(int courseid) {

			List<Transaction> transactionlist = Academy.transactionMap.get(courseid);
			Transaction t1 = new Transaction(50000, 1, new MyDate(3 , 10 , 2022));
			Transaction t8 = new Transaction(50000, 1, new MyDate(3 , 11 , 2022));
			Transaction t2 = new Transaction(80000, 2, new MyDate(4 , 10 , 2022));
			Transaction t3 = new Transaction(15000, 5, new MyDate(5 , 10 , 2022));
			Transaction t4 = new Transaction(20000, 3, new MyDate(21 , 10 , 2022));
			Transaction t5 = new Transaction(60000, 4, new MyDate(12 , 10 , 2022));
			Transaction t6 = new Transaction(150000, 6, new MyDate(14 , 10 , 2022));
			Transaction t7 = new Transaction(20000, 3, new MyDate(21 , 11 , 2022));
			Transaction t9 = new Transaction(20000, 3, new MyDate(21 , 12 , 2022));
			Transaction t10 = new Transaction(20000, 3, new MyDate(21 , 13 , 2022));
			Transaction t11 = new Transaction(20000, 3, new MyDate(21 , 14 , 2022));
			if (transactionlist == null) {
				transactionlist = new ArrayList<>();
				Academy.transactionMap.put(courseid, transactionlist);
			}
			transactionlist.add(t1);
			transactionlist.add(t2);
			transactionlist.add(t3);
			transactionlist.add(t4);
			transactionlist.add(t5);
			transactionlist.add(t6);
			transactionlist.add(t7);
			transactionlist.add(t8);
			transactionlist.add(t9);
			transactionlist.add(t10);
			transactionlist.add(t11);
		}

		public static List<Transaction> getAllTransaction(int courseid) {

			return Academy.transactionMap.get(courseid);
		}
		public static void deleteAllTrancReco(int a) {
			//2.Method to delete a student. Note student all records across all beans should be deleted. 
			Set <Entry<Integer, List<Transaction>>> set1 = Academy.transactionMap.entrySet();
			Iterator<Entry<Integer, List<Transaction>>> itr3 = set1.iterator();
			while(itr3.hasNext()) {
				Entry<Integer, List<Transaction>> ent = itr3.next();
				List<Transaction> l1 = ent.getValue();
				Iterator<Transaction> itr4=l1.iterator();
				while(itr4.hasNext()) {
					Transaction t1= itr4.next();
					if(t1.studId==a) {
						itr4.remove();
					}
				}
			}
		}
		public static void printTransaction() {
			Set <Entry<Integer, List<Transaction>>> set = Academy.transactionMap.entrySet();
			Iterator<Entry<Integer, List<Transaction>>> itr = set.iterator();
			while(itr.hasNext()) {
				Entry<Integer, List<Transaction>> ent = itr.next();
				System.out.println("Course id : "+ent.getKey());
				System.out.println(ent.getValue());
			}
		}
		public static void printAllPaid() {
			Iterator<Course>itr =Academy.courseList.iterator();
			int sum=0;
			ArrayList<Student>slist= new ArrayList<> ();
			ArrayList<Student>slist1= new ArrayList<> ();
			while(itr.hasNext()) {
				Course c = itr.next();
				int cid = c.courseId;
				int fees= c.courseFees;
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
							sum=0;
							Set <Entry<Integer, List<Transaction>>> set1 = Academy.transactionMap.entrySet();
							Iterator<Entry<Integer, List<Transaction>>> itr4 = set1.iterator();
							while(itr4.hasNext()) {
								Entry<Integer, List<Transaction>>ent1=itr4.next();
								List<Transaction> t = ent1.getValue();
								Iterator<Transaction> itr5 = t.iterator();
								while(itr5.hasNext()) {
									Transaction t1=itr5.next();
									if(sid==t1.studId) {
										sum=sum+t1.paidfees;
									}
								}
							}
							if (sum==fees) {
								slist.add(s);
							}
							else if (sum==0) {
								slist1.add(s);
							}
						}
					}
				}
			}
			System.out.println("Students who paid their full fees");
			System.out.println(slist);
			System.out.println("Students who not paid fees till date");
			System.out.println(slist1);
		}
			
		
	

}
