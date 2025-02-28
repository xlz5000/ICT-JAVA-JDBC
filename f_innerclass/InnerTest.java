package f_innerclass;

public class InnerTest {

	public static void main(String[] args) {
//		Outer o = new Outer();
//		Outer.Inner in = o.new Inner();
//		in.najabara();
		
//		Outer.Inner in = new Outer.Inner();
//		in.najabara();
		
		
		Outer.Inner.najabara();
	}

}

class Outer{
	// 원래 class에 static 못 붙이는데 Inner은 멤버로 취급되기에 static 붙일 수 있음
	static class Inner {
		static void najabara() {
			System.out.println("잡아보슈~");
		}
	}
}

/*
//이 코드 내에서는 여기 앞에 public 붙이면 x
class Outer{
	class Inner {
		void najabara() {
			System.out.println("잡아보슈~");
		}
	}
}
*/