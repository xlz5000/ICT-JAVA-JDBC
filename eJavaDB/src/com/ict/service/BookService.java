package com.ict.service;

import java.util.Iterator;
import java.util.List;

import com.ict.model.BookVO;
import com.ict.repository.BookRepository;

// 일처리 = 요구사항 처리 = 비지니스 로직 
public class BookService {
	
	public static void searchAll() {
		System.out.println("책이름\t책 이름\t\t출판사\t정가");
		// DB를 처리하기 위해서는 Repository
		List<BookVO> list = BookRepository.searchAll();
		// 화면 출력하자
		Iterator<BookVO> it =  list.iterator();
		while (it.hasNext()) {
			BookVO bookVO= (BookVO) it.next();
			System.out.println(bookVO.toString());
			
		}
	}
	
	// 한개나 여러 개 나올 가능성이 있으면 무조건 여러 개 나올 것을 기준으로 해야 함
	public static void searchOne(int res, String msg) {
		// DB 처리하기 위해서는 Repository
		List<BookVO> list = BookRepository.searchOne(res, msg);
		
		// list.size() > 0 == ! list.isEmpty()
		if(!list.isEmpty()) {
			System.out.println("책이름\t책 이름\t\t출판사\t정가");
			// 화면 출력하자
			Iterator<BookVO> it =  list.iterator();
			while (it.hasNext()) {
				BookVO bookVO= (BookVO) it.next();
				System.out.println(bookVO.toString());
			}
		}else {
			System.out.println("요청하신 자료는 존재하지 않습니다.");
		}
				
		
	}
	
	
	public static int insertBook(String bookname, String publisher, int price) {
		int result = 0;
		//DB 처리하기 위해서는 Repository
		result = BookRepository.insertBook(bookname, publisher, price);
		return result;
	}
	
	
	public static int updateBook(int bookid, String bookname, String publisher, int price) {
		int result = 0;
		//DB 처리하기 위해서는 Repository
		result = BookRepository.updateBook(bookid, bookname, publisher, price);
		return result;
		
	}
	
	
	public static int deleteBook(int bookid) {
		int result = 0;
		//DB 처리하기 위해서는 Repository
		result = BookRepository.deleteBook(bookid);
		return result;
		
	}

}
