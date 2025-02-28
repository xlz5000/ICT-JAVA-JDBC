package day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;

public class Ex10_BufferedReader {

	public static void main(String[] args) {
		// readLine() => 한줄씩 읽는다
		//              더 이상 읽을 수가 없으면 null
		
		String path = Paths.get("D:", "workspaces", "0214-5.txt").toString();
		File file = new File(path);
		
		FileReader fr = null;
		BufferedReader bf = null;
		
		try {
			fr = new FileReader(file);
			bf = new BufferedReader(fr);
			
			String msg = null;
			while((msg = bf.readLine())!= null) { // 주어진 파일에서 중간에 
				System.out.println(msg); // 빈줄이 있을경우 문제가 생길거라고 생각하는데
			}// 중간에 빈줄이 있을경우 이거는 빈줄이 아니라 \n 이것임.
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				bf.close();
				fr.close();
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

	}

}
