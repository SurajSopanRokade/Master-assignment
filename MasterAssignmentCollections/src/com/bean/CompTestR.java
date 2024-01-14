package com.bean;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class CompTestR implements Comparator<TestResult>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compare(TestResult o1, TestResult o2) {
		// TODO Auto-generated method stub
		
		Iterator <Entry<Integer, List<TestResult>>> itr  = Academy.test_map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, List<TestResult>> ent = itr.next();
			List<TestResult> list = ent.getValue();
			Iterator<TestResult> itr1=list.iterator();
			while(itr1.hasNext()) {
				TestResult t = itr1.next();
				int marks=t.marks;
				Iterator <Entry<Integer, List<Student>>> itr2 = Academy.studentMap.entrySet().iterator();
				while(itr2.hasNext()) {
					Entry<Integer, List<Student>> ent1 = itr2.next();
					List<Student> list1 = ent1.getValue();
					Iterator<Student> itr3=list1.iterator();
					while(itr3.hasNext()) {
						Student t1 = itr3.next();
						String sname=t1.getstudent_name();
						if(o1.marks==o2.marks) {
							System.out.println("I am in compare and compareTo method");
							Student s1 = new Student(1,"Dada",9786796596l,"suraj435@gmail.com");
							return s1.compareTo(t1);
						}
						else if (o1.marks<o2.marks)
							return 1;
						else
							return -1;
					}
				}
			}
		}
		return 0;
	}

	

}
