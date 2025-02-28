package com.ict.controller;

import java.util.Scanner;

import com.ict.service.BookService;

public class MyController {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void startBookSystem() {
		esc: while(true) {
			System.out.println("=== BookSystem ===");
			System.out.println("1.전체 도서 검색");
			System.out.println("2.특정 도서 검색");
			System.out.println("3.도서 추가");
			System.out.println("4.도서 수정");
			System.out.println("5.도서 삭제");
			System.out.println("6.프로그램 종료");
			System.out.print("입력 >> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				searchAll();
				break;
			case 2:
				searchOne();
				break;
			case 3:
				insertBook();
				break;
			case 4:
				updateBook();
				break;
			case 5:
				deleteBook();
				break;
			case 6:
				break esc;
			default:
				System.out.println("제대로 입력해주세요 (1-6)");
				break;
			
			}
			
		}
	}
	
	
	// 전체 도서 검색의 결과를 하는 메서드
	private static void searchAll() {
		BookService.searchAll();
		
	}
	
	// 특정 도서 검색의 결과를 하는 메서드
	private static void searchOne() {
		System.out.println("1. 책 이름 검색 ");
		System.out.println("2. 출판사 검색");
		System.out.print("선택 >>");
		int res = scan.nextInt();
		scan.nextLine();
		switch(res) {
		case 1:
			System.out.print("책이름 : ");
			String bookname = scan.nextLine();
			// 받은 정보를 서비스에 보내자
			BookService.searchOne(res, bookname);
			break;
			
	
		case 2:
			System.out.print("출판사 : ");
			String publisher = scan.next();
			// 받은 정보를 서비스에 보내자
			BookService.searchOne(res, publisher);
			break;
			
		default:
			System.out.println("잘못입력하셨네요.");
			break;
		}
	}
	
	public static void insertBook() {
		try {
			System.out.println("추가할 도서의 정보를 입력하세요");
			scan.nextLine();
			System.out.print("bookname:");
			String bookname = scan.nextLine();
		
			
			System.out.print("publisher : ");
			String publisher = scan.nextLine();
			
			
			System.out.print("price : ");
			int price = scan.nextInt();
			
			
			int res = BookService.insertBook(bookname, publisher, price);
			if(res > 0) {
				// 전체 도서 검색의 결과를 처리하는 메서드
				BookService.searchAll();
			}
		} catch (Exception e) {
			System.out.println("잘못입력하셨네요");
		}
		
		
	}
	
	public static void updateBook() {
		try {
			System.out.println("추가할 도서의 정보를 입력하세요");
			scan.nextLine();
			System.out.print("bookid:");
			int bookid = scan.nextInt();
		
			scan.nextLine();
			System.out.print("bookname : ");
			String bookname = scan.nextLine();
			
			
			System.out.print("publisher : ");
			String publisher = scan.nextLine();
			
			
			System.out.print("price : ");
			int price = scan.nextInt();
			
			
			int res = BookService.updateBook(bookid, bookname, publisher, price);
			if(res > 0) {
				// 전체 도서 검색의 결과를 처리하는 메서드
				BookService.searchAll();
			}else {
				System.out.println("수정을 실패했습니다.");
			}
		} catch (Exception e) {
			System.out.println("잘못입력하셨네요");
		}
  }
	
	public static void deleteBook() {
		try {
			
			System.out.println("삭제할 책 번호 : ");
			int bookid = scan.nextInt();
		
			
			int res = BookService.deleteBook(bookid);
			if(res > 0) {
				// 전체 도서 검색의 결과를 처리하는 메서드
				BookService.searchAll();
			}else {
				System.out.println("수정을 실패했습니다.");
			}
		} catch (Exception e) {
			System.out.println("잘못입력하셨네요");
		}
  }
	
	
}
