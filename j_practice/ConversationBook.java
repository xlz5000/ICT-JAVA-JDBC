package j_practice;

public class ConversationBook extends Book{
	
	String lan;
	
	ConversationBook(){
		
	}
	
	ConversationBook(int dist, String desc, String producer, int price, String isbn, String author, String bookTitle, String lan){
		super(dist, desc, producer, price, isbn, author, bookTitle);
		this.lan = lan;
	}
	
	String showinfo() {
		return ("상품ID>>" +dist +"\n상품설명>>" + desc + "\n생산자>>" + producer+ "\n가격>>" + price
				+ "\nISBN>>" + isbn + "\n책 제목>>" + bookTitle + "\n저자>>" + author
				+ "\n언어>>" + lan);
	}

}
