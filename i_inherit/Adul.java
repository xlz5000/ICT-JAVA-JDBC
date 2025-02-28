package i_inherit;


//상속관계: extends
public class Adul extends Appa{
	
	//void있으면 생성자함수 아님, 이거는 자동 불림
	// 겉으로는 잘 모르겠지만 내부적으로는 아빠가 먼저 생성됨
	public Adul() {
		System.out.println("아들 생성");
	}
	
//	public void Adul() {
//		System.out.println("아들 생성");
//	}

	
	public void gene() {
		System.out.println("자식은 자식이다");
	}
	
	public void study() {
		System.out.println("아들은 학생");
	}
}
