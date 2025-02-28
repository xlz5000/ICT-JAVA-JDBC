package b_encapsulation;

/*
 * 캡슐화
 * 	(기본적) 권한관리하자 
 * 
 * 	` 멤버 변수는 접근금지 : private
 * 	` 멤버메소드는 접근허용: public
 * 	
 */

public class Main {

	public static void main(String[] args) {
		//클래스 변수 선언		
		// 객체 생성(new이용)
		Student s = new Student();
		
		s.setName("홍길동");
		s.setKor(90);
		s.setEng(100);
		s.setMath(80);
		
		System.out.println("총점:" + s.calcTotal());
		
		//s.total = 100;
		System.out.println("평균:" + s.calcAvg());
		
		System.out.println("이름:" + s.getName());

	}

}
