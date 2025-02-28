package com.library.model;

import java.time.LocalDate;

// Loan 테이블과 일치하게 만들자
public class Loan {
	
	private int loan_id;
	private int bookdata_id;
	private int member_id;
	private String status;
	private LocalDate loan_date;
	
	
	public Loan(int loan_id, int bookdata_id, int member_id, String status, LocalDate loan_date) {
		this.loan_id = loan_id;
		this.bookdata_id = bookdata_id;
		this.member_id = member_id;
		this.status = status;
		this.loan_date = loan_date;
	}


	public int getLoan_id() {
		return loan_id;
	}


	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}


	public int getBookdata_id() {
		return bookdata_id;
	}


	public void setBookdata_id(int bookdata_id) {
		this.bookdata_id = bookdata_id;
	}


	public int getMember_id() {
		return member_id;
	}


	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public LocalDate getLoan_date() {
		return loan_date;
	}


	public void setLoan_date(LocalDate loan_date) {
		this.loan_date = loan_date;
	}
	
	
	@Override
	public String toString() {
		return "대출 ID : " + loan_id + " | 도서 ID :  " + bookdata_id + 
				" | 회원 ID : " + member_id + " | 대출일 : " + loan_date
				+ " | 상태 : " + status;
	}
	
	
	

}
