package g_access3;

import g_access3.sub.*;

//상속관계 - 부모 자식 관계
//		Access(부모) / Main(자식)

public class Main extends Access{

	public static void main(String[] args) {
		
		
		//이건 오류
		// protected는 같은 패키지 내 또는 자식 클래스에서만 접근할 수 있음.
		// 우선 main이 access와 다른 패키지 이므로 자식클래에서만 접근하는 방법 밖에 안 남음.
		// 이때 이때 Access 객체는 자식 클래스가 아니라 걍 본인객체를 만든것이므로 접근 불가
		// 다른 패키지여도 자식인 Main객체를 만들어서 protected 변수에 접근할 수 있었음.
		//Access me = new Access();
		
		Main me = new Main();
		
		// private는 같은폴더여도 오류
		// me.a = "프라이빗 변경";
		
		//안쓰는건 동일한 패키지 내에서만 가능
		//me.b = "디폴트 변경";
		
		// protected는 다른 패키지여도 자식이면 가능, 자식한테만 권한 줌
		me.c = "프로텍티트 변경";
		
		//public은 다른 패키지에 있어도 접근가능, 즉 모두 접근 가능
		me.d = "퍼블릭 변경";
		
		me.output();
		

	}

}

