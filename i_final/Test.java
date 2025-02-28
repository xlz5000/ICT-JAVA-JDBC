package i_final;


/*
 	 final:  변경불가
 	 	-class : 부모클래스안됨
 	 	-field : 값변경 ( => 상수)
 	 	- method : overriding 안됨
 */

//  final 씀으로써 이 클래스는 부모 클래스로 사용 불가이므로 
// 이 코드에서 Student 자식을 두고 있어 오류가 뜸
/*final*/ class Parent{
	final String field = "부모님꺼";
	public final void jib() {
		System.out.println("부모님이 만드신거");
	}
	
}

class Child extends Parent{
	Child(){ // 생성자 안에 있으므로 부모의 field에 덮어씌어졌기에 p.field는 내꺼다
		//but 같은 프로젝트 내 i_sample 패키지 안의 a.java 파일에서는
		// 생성자 안에 밖에 있는 변수 이야기 이기에 부모의 값이 그대로 나온다.
		//field = "내꺼"; // 앞에서 field 앞에 final 붙였으므로 이건 오류
	}
	
//	public void jib() { // 앞아서 메소드 앞에 field썼으므로 이 함수도 수정불가
//		System.out.println("부모님꺼 물려받아 탕진");
//	}
}

public class Test {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();
	}
}
