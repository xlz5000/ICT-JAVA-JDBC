package j_review2;

public class Main {

	public static void main(String[] args) {
		Student s = new Student("홍길동", "컴공");
		Student s2 = new Student("홍길동", "컴공");
		
		// s와 s2는 다른 객체이므로 각각 다른 주소를 가리키니
		// 당연히 다른 사람
//		if( s == s2 ) {
//			System.out.println("동일인");
//		}else {
//			System.out.println("다른 사람");
//		}
		
		// equals는 부모인 Object의 것
		// 이 코드도 다른 사람
		if( s.equals(s2) ) {
		System.out.println("동일인");
		}else {
		System.out.println("다른 사람");
		}
		
		System.out.println(s.toString());
	}
}
