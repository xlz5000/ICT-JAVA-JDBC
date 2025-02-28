package com.ict.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ict.model.BookVO;
// repository는 db에서 데이터 저장하는 역할
// repository를 이용해 실행하는거는 service에서..

//실제로 DB 접속하고 쿼리를 실행해서 결과를 받은 클래스
public class BookRepository {
	
	
	//전체 검색이기 때문에 여러개가 나온다고 가정하자
	//그러면 반환형 LIst<모델-VO>
	public static List<BookVO> searchAll() {
		List<BookVO> list = new ArrayList<>();
		String query = "select * from book";
		
		try(Connection conn = DatabaseManager.getConnection();
//				Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery(query);
				PreparedStatement pstmt = conn.prepareStatement(query);
				ResultSet rs = pstmt.executeQuery();){
				// rs는 DB에서 온 결과다
				// 이 결과를 자바에서 처리하기 위해서 model 즉 vo 에 담자
				while(rs.next()) {
					// 한줄 정보를 꺼내서 VO에 담아 객체로 만들었다.
					BookVO bvo = new BookVO(rs.getInt("bookid"),rs.getInt("price"),
							rs.getString("bookname"), rs.getString("publisher"));
					// 객체가 여러개일때는 컬렉션을 사용해서 담자
					list.add(bvo);
				}
				 
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
	public static List<BookVO> searchOne(int res, String msg){
		List<BookVO> list = new ArrayList<>();
		String query = null;
		// 쿼리에서 % 를 인식할 때 오류 발생 => setString에서 넣어주자
		if(res == 1) {
			query ="select * from book where bookname like ?";
		}else if(res ==2) {
			query ="select * from book where publisher like ?";
		}
		try(Connection conn = DatabaseManager.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query)){
			pstmt.setString(1, '%' + msg + '%');
			
			
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
				BookVO bvo = 
						new BookVO(rs.getInt("bookid"), 
								rs.getInt("price"),
								rs.getString("bookname"),
								rs.getString("publisher"));
				list.add(bvo);
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		    
		
		return list;
	}
	
	
	public static int insertBook(String bookname, String publisher, int price) {
		int result = 0;
		String query = "insert into book(bookname, publisher, price) " 
		+ " values(?,?,?)";
		
		try (Connection conn = DatabaseManager.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query)){
			
			
			pstmt.setString(1, bookname);
			pstmt.setString(2, publisher);
			pstmt.setInt(3, price);
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	public static int updateBook(int bookid, String bookname, String publisher, int price) {
		int result = 0;
		String query = "update book set bookname=?, publisher=?, price=? where bookid = ?";
		
		try (Connection conn = DatabaseManager.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query)){
			
			
			pstmt.setString(1, bookname);
			pstmt.setString(2, publisher);
			pstmt.setInt(3, price);
			pstmt.setInt(4,  bookid);
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	public static int deleteBook(int bookid) {
		int result = 0;
		String query = "delete from book where bookid ="
				+ " ?";
		
		try (Connection conn = DatabaseManager.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query)){
			
			pstmt.setInt(1, bookid);
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	
}
