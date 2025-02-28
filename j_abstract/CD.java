package j_abstract;

public class CD extends Item{
	

	private String singer;
	
	public CD(){
		
	}
	
	public CD(String no, String title, String singer){
		super.no = no;
		super.title = title;
		this.singer = singer;
	}
	
	public void output() {
		System.out.println("번호:" + no + "/ 제목:" + title
				+ "/ 가수:" + singer);
	}

}
