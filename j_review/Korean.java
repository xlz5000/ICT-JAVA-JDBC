package j_review;

import java.nio.file.spi.FileSystemProvider;

// class 첫글자 대문자       //상속관계
public class Korean extends Language{
	
	
	//overriding
	public void greeting() {
		System.out.println("안녕하세요");
	}
	
	public void introduce() {
		System.out.println("저는 홍길동");
	}
	
	public void message() {
		System.out.println("짝궁님 오늘도 화이팅");
	}

}
