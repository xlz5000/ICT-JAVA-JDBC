package j_abstract;

public class DVD extends Item{

	private String actor;
	private String director;
	
	public DVD(){
		
	}
	
	public DVD(String no, String title, String actor, String director){
		super.no = no;
		super.title = title;
		this.actor = actor;
		this.director = director;
	}
	
	public void output() {
		System.out.println("번호:" + no + "/ 제목:" + title
				+ "/ 배우:" + actor + "/ 감독:" + director);
	}

}
