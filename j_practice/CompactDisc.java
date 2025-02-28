package j_practice;

public class CompactDisc extends Product{
	
	String albumTitle;
	String singer;
	
	CompactDisc(){
		
	}
	
	CompactDisc(int dist, String desc, String producer, int price, String albumTitle, String singer){
		super(dist, desc, producer, price);
		this.albumTitle = albumTitle;
		this.singer = singer;
	}
	
	String showinfo() {
		return ("상품ID>>" +dist +"\n상품설명>>" + desc + "\n생산자>>" + producer+ "\n가격:" + price
				+ "\n앨범 제목>>" + albumTitle + "\n가수>>" + singer);
	}
}
