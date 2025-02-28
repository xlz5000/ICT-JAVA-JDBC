package day06;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex02_InetAddress {
	
	public static void main(String[] args) {
		// InetAddress : 자바에서 IP주소를 표현하는 클래스
		//               생성자가 있지만 new 연산자를 사용해서 생성할 수 없다.
		//               static 메서드를 이용해서 생성한다. //instance변수, 메소드는 객체 생성될때 같이 생성,
		//                                         //static은 객체 생성과 상관없이 미리 만들어진 놈 
		//               localhost : 현재 내가 사용하고 있는 컴퓨터를 뜻함.
		//                           보통은 127.0.0.1과 같은 의미
		//
		

		// InetAddress 생성
		try {
			InetAddress addr = InetAddress.getLocalHost(); // = 뒤에 부분에 커서 가져다대면 InetAddress 반환형임이 나옴
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println();
		
		// 구글
		addr = InetAddress.getByName("www.google.com");
		System.out.println("이름 : " + addr.getHostName());
		System.out.println("주소 : " + addr.getHostAddress());
		System.out.println("toString : " + addr.toString());
		System.out.println();
		
		// 네이버
		addr = InetAddress.getByName("m.naver.com");
		System.out.println("이름 : " + addr.getHostName());
		System.out.println("주소 : " + addr.getHostAddress());
		System.out.println("toString : " + addr.toString());
		System.out.println();
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
