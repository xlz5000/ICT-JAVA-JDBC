package day04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Ex07_File {

	public static void main(String[] args) {
//		Path path= Paths.get("D:", "workspaces", "util");
//		String pathName = path.toString();
		
		//get 매개변수중 네번째꺼 파일이름
		String pathName = Paths.get("D:", "workspaces", "util", "test01.txt").toString();
		File file = new File(pathName);
		
		String pathName2 = Paths.get("D:", "workspaces", "util", "study", "java").toString();
		File file2 = new File(pathName2);
		
		try {
			boolean b1 = file.createNewFile();
			if(b1) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
				// 실패하는 이유 경로가 틀리거나, 이미 있는 파일과 이름이 같을 때
			}
			System.out.println();
			
			//중간에 디렉토리가 없으면 생성 불가능 => mkdir
			boolean b2 = file2.mkdir();
			
			//중간에 디렉토리가 없어도 생성 불가능 => mkdirs
			b2 = file2.mkdirs();
			
			
			if(b2) {
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패");
			}
			
			// 파일 삭제
			boolean b3 = file.delete();
			if(b3) {
				System.out.println("파일 삭제 성공");
			}else {
				System.out.println("파일 삭제 실패");
			}
			
			System.out.println();
			
			// 디렉토리 삭제 : 비어있지 않으면 삭제 실패
			//				나중에 Files.walkFileTree() 사용
			String pathName3 = Paths.get("D:", "workspaces", "util", "java").toString();
			File file3 = new File(pathName3);
			
			boolean b4 = file.delete();
			if(b4) {
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패");
			}
			
			
			// 재귀호출: 자가자신을 부름
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
