package com.library.controller;

import java.util.Scanner;

import com.library.service.LibraryService;

public class LibraryController {
	private static final Scanner scan = new Scanner(System.in);
	public static void startLibrarySystem() {
		esc: while(true) {
			System.out.println("=== 도서 관리 시스템 ===");
			System.out.println("1.도서 대출");
			System.out.println("2.반납");
			System.out.println("3.대출된 도서 목록 보기");
			System.out.println("4.도서 목록 보기");
			System.out.println("5.종료");
			System.out.print("입력 : ");
			
			int choice = scan.nextInt();
			switch(choice) {
			case 1: // 도서 대출 
				borrowBook();
				break;
			case 2: // 반납 
				returnBook();
				break;
			case 3: // 대출된 도서 목록 보기
				LibraryService.showBorrowedBooks();
				break;
			case 4: // bookdata 보여주기
				LibraryService.showBooks();
				break;
				
			case 5: // 종료
				break esc;
			default: 
				System.out.println("올바른 번호를 입력하세요.");
				break;
			}
		}
	}
	
	// 대출
	private static void borrowBook() {
		System.out.print("대출할 도서 ID : ");
		int bookdata_id = scan.nextInt();
		System.out.print("회원 ID : ");
		int member_id = scan.nextInt();
		LibraryService.borrowBook(bookdata_id, member_id);
	}
	
	// 반납
	private static void returnBook() {
		System.out.print("반납 도서 ID : ");
		int bookdata_id = scan.nextInt();
		System.out.print("회원 ID : ");
		int member_id = scan.nextInt();
		
		LibraryService.returnBook(bookdata_id, member_id);
	}
}
