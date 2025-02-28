package a_temp;

public class Temp2 {

	public static void main(String[] args) {
		
		Data result = method();
		//처리(출력)
		result.output();
		
	}
	
	static Data method(){
		
		String name = "홍길동";
		int age = 25;
		double height=160.99;
		
		
		Data data = new Data();
		data.irum  = name;
		data.nai = age;
		data.ki = height;
		
		return data;
	}
}

//class는 서로 다른 타입들을 묶을 수 있음
class Data{
	
	// 멤버변수(member field) - 서로 다른 타입의 데이터들 
	String irum;
	int    nai;
	double ki;
	
	// 멤버함수(member method)
	void output() {// this는 써도 되고 안 써도 됨.
		System.out.println(this.irum + "/" + this.nai + "/" + this.ki);

		
	}
	
}
