package com.bean;

import java.util.Date;

public class Transaction {
	public int paidfees; // 1st entry 10k stud1 d1, 5k stud2 d2, 5k stud2 d3
	public int studId;
	MyDate trans_date;

	public Transaction(int paidfees, int trans_studentId, MyDate trans_date) {
		this.paidfees = paidfees;
		this.studId = trans_studentId;
		this.trans_date = trans_date;

	}

	public String toString() {
		return ("paid fees:  " + this.paidfees + " " + "transaction sid:  " + this.studId + " "
				+ "transaction date: " + this.trans_date + "\n");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
