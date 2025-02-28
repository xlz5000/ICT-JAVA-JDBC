package a_basic;

public class Main {

	public static void main(String[] args) {
		//클래스 변수 선언
		Student s;
		
		// 객체 생성(new이용)
		s = new Student();
		
		s.name = "홍길동";
		s.kor = 90;
		s.eng = 100;
		s.math = 80;
		
		System.out.println("총점:" + s.calcTotal());
		System.out.println("평균:" + s.calcAvg());

	}

}
