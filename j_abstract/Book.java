package j_abstract;

public class Book extends Item{
	

	private String writer;
	private String publisher;
	
	public Book(){
		System.out.println("Book 기본 생성자");
	}
	
	public Book(String no, String title, String writer, String publisher){
//		super.no = no;
//		super.title = title;
		
		super(no, title);// super 첫번째 줄에 와야함
		this.writer = writer;
		this.publisher = publisher;
		System.out.println("Book 인자 생성자");
	}
	
	//상속을 하게 되면 부모와 자식꺼 구별이 안된다고 보면됨. 그래서
	//아래에서 변수앞에 소속 같은거?안써도 되는것
	public void output() {
		System.out.println("번호:" + no + "/ 제목:" + title
				+ "/ 저자:" + writer + "/ 출판사:" + publisher);
		
	}


}
