package e_static;

public class Sample2 {

	String general = "일반변수";
	static String staticVar = "static변수";
	
	
	public static void main(String[] args) {
		
		//-------------------------
		//[1]
		// 결론: static 붙인 칭구들끼리만 가능하다~
		//
		// general 오류가 나는 이유:
		// static은 미리 메모리에 올라온다. 그러므로 static 메소드인
		// main과 static 변수인 staticVar은 객체 생성 전에 미리 올라옴
		// 그러므로 이 상황에서는 아직 안 올라온 general은 오류
		//System.out.println(general);
		System.out.println(staticVar);
		
		Sample2 s = new Sample2();
		System.out.println(s.general);

	}

}
