package f_exception;

import java.io.FileInputStream;

public class Ex03_throws {

	public static void main(String[] args) {
		try {
		readFile();
		System.out.println("문제없음");
		}catch(Exception ex) {
			System.out.println("실패:" + ex.getMessage());
		}
	}
	
	static void readFile() throws Exception{
		FileInputStream fis = new FileInputStream("z.txt");
		System.out.println("파일연결성공");// 만약 파일 이름 잘 못 적었을 경우
		// 이 바로 밑 프린트 구문 출력 안됨.
	}

}
