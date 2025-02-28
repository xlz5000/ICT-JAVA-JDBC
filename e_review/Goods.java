package e_review;

public class Goods {
	//static함수가 건들어야하는 변수는 static, but 일반함수가 static 건들이는 것 가능
	private int no;
	private String gname;
	private String desc;
	
	//count 값을 객체들간 공유하기 위해 static 붙임
	private static int count;
	
	
	// class 접근하기 위해 static 붙임
	public static int getCount() {
		return count;
	}
	
	
	// 밑에 생성자 함수 3개 인자가 서로 다르게 가능한것을 overloading이라고 함.
	public Goods() {
		// 밑에 인자 3개 가진 생성자 함수를 썼으므로 인자 0개인 생성자함수가 자동 생성되지 x
		//생성자 함수 아예 안 만들었으면 자동으로 만들어줌.(인자 0개인 생성자함수를..)
		//그러므로 내가 만들어줘야함.
		
		this(1000, "상품", "우리상품");// 무조건 첫번째라인에 와야함
	}
	
	 public Goods(int no, String gname){
//			this.no = no;
//			this.gname = gname;
			
		 	//this(no, gname, null);
			this(no, gname, "");
			count++;
			
		}
	
	//void도 안됨, 생성자 함수이므로 class는 안 붙임
	 public Goods(int no, String gname, String desc){
		this.no = no;
		this.gname = gname;
		this.desc = desc;
		
	}
	
	void output() {
		System.out.println("번호:" + no +"/상품명:" + gname
				+ "/상품설명:" + desc);
	}

}
