package i_inherit;

public class Test {

	public static void main(String[] args) {

// 부모 호출시 super() 사용
//		Appa parent = new Appa();
//		parent.gene();
//		parent.job();
		
		//[*] 자식변수에서 부모의 멤버 접근 가능
//		Adul child = new Adul();
//		child.gene();
//		child.study();
//		child.job(); //*
		
		
		// 메모리는 아빠만 올라와있는데 아들을 찾는 상황이라 에러
		//Adul ad = new Appa(); ==> 에러
		
		//[*] 부모변수에 자식 생성 가능
		// 아들 생성하기위해서는 아빠가 메모리에 먼저 올라와야함.
		// new Adul()을 함으로써 자식이므로 부모, 자식 이 생성되고 그 중에서 
	// Appa ap 로 생성된 부모, 자식 중 부모만 택해짐. 고로  자식의 메소드인 study는 할 수 x
//		Appa ap = new Adul();
//		ap.job(); //O
//		ap.gene();// 아빠꺼가 아니라 자식 꺼가 나옴, [***********] overriding
		//ap.study(); //X
		
		//[*] 형변환(casting)
		//		-기본형끼리
		//		-상속관계의 클래스끼리
		/*
		String s ="헬로우";
		StringBuffer sb = (STringBuffer)s;
		*/
		
		Appa parent = new Appa();
		Adul child = (Adul) parent; // 오류
		
		
		
//		Adul child = new Adul();
//		Appa parent = (Appa)child;

	}

}
