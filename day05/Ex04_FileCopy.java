package day05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Paths;

public class Ex04_FileCopy {
	
	public static void main(String[] args) {
		// 파일 입력                       // "이미지1.jpg" 한글 가능~
		String input = Paths.get("D:", "cute.jpg").toString();
		File in_file = new File(input);
		// 출력
		String output = Paths.get("D:", "workspaces", "util", "cust.jpg").toString();
		File out_file = new File(output);
		
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);
			
			
			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);
			
			
			// 한개씩 읽어서 바로 출력 -> 그래서 flush는 루프 안이 아닌 밖에 두는 게 간편
			int b = 0;
			while((b=bis.read())!= -1) {
				bos.write(b);
			}
			bos.flush();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
				bis.close();
				fos.close();
				bos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
	}
}
