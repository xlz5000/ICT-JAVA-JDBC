package i_inherit;

public class PolySample {

	public static void main(String[] args) {
		
		Item[] result = method();
		//출력
		
		for(int i = 0; i < result.length; i++) {
			result[i].output(); //************
		}
		

	}
	
	//static 안 붙이면 main 만 올라가기에 method는 그때는 정의 안되어 있어 오류
	//즉 static을 올려서 main과 함게 method도 메모리에 올려야 한다.
	static Item[] method() {
		Book b = new Book("001","파이썬", "ICT", "여기");
		CD	 c = new CD();
		DVD	 d = new DVD();
		
		// 다른 타입 묶고 싶은데 이때 부모가 같으니 부모 기준으로 묶자!
		Item[] obj = new Item[3];
		obj[0] = b;
		obj[1] = c;
		obj[2] = d;
		
		//주의 method 함수의 void도 해당 타입으로 바꿔주기
		return obj;
		
	}

}
