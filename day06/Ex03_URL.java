package day06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

//URL(Uniform Resource Locator, 통합 자원 위치)
// : 특정 자원의 위치(주소)를 나타내는 URI의 한 종류


//URI(Uniform Resource Identifier, 통합 자원 식별자)
// : 웹에서 특정 자원을 식별하는 고유한 식별자

public class Ex03_URL {

	public static void main(String[] args) {
		InputStream is =  null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 읽어가지고 와 이미 String즉 문자로 바뀌어있기에 bytestream으로 갈 필요가 x
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String path = Paths.get("D:", "workspaces", "2017-3.txt").toString();
		File file = new File(path);
		
		
		try {
			URL url = new URL("https://v.daum.net/v/20250217102302450");
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);// reader는 한줄씩 읽는게 있음
			
			// 1. 콘솔창으로 보기
			// String msg = null;
//			while((msg = br.readLine())!= null) {
//				System.out.println(msg);
//			}
			
			// 2. 파일에 저장
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			String msg = null;
			// String을 누적시키는 클래스는 StringBuffer 또는 StringBuilder
			// append()를 이용하면 된다.
			StringBuffer sb = new StringBuffer();
			
			while((msg = br.readLine())!= null) {
				sb.append(msg + "\n");
			}
			
			
			bw.write(sb.toString());
			bw.flush();
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				isr.close();
				is.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		

	}

}
