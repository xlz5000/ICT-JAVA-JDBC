package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null;
		// try안에 정의시 try 안에서만 fis 사용 가능
		try {
			fis = new FileInputStream("abc.txt");
			System.out.println("파일연결");
			fis.read();
		
		// 예외를 종류별로 예외처리 가능
		// 구체적인 예외를 먼저 기술해야 함. 즉, Exception ex를 먼저 기술하는 것은 오류가 남
		}catch(FileNotFoundException ex) {
			System.out.println("파일이 존재하지 않는 예외:" + ex.getMessage());
		}catch(IOException ex) {
			System.out.println("파일 읽기 예외:" + ex.getMessage());
		}catch(Exception ex) {
			System.out.println("그 외 예외:" + ex.getMessage());
		}finally {
			try{fis.close();}catch(IOException ex) {}
		}
	}

}
