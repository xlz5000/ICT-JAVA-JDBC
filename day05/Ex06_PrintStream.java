package day05;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;

public class Ex06_PrintStream {
	
	
	public static void main(String[] args) {
		
		//PrintStream은 주로 System.out, System.err에 사용되며
		// 바이트기반 스트림 이지만, 데이터를 문자로 변환하여 출력할 수 있는 기능 제공
		// 주요 기능: 자동 플러시 기능, 다양한 타입의 데이터를 출력 가능, 예외 처리 하지 않아도 된다.
		String path = Paths.get("D:", "workspaces", "0214-3.txt").toString();
		
		File file = new File(path);
		
		PrintStream ps = null;
		try {
			ps = new PrintStream(file);
			
			ps.print("Hello, World\n");// + "\n", // \n 이용시 println느낌쓰
			ps.println(100 ); 
			ps.print(true);
			ps.println('k');
			ps.print(123456.321);
			
			
		}catch(Exception e) {
			
		}finally {
			ps.close();
		}// 여기서는 try, catch 안해도 됨.
	}
}
