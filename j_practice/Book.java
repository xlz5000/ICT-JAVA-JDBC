package j_practice;

public class Book extends Product{
	
	String isbn;
	String author;
	String bookTitle;
	
	Book(){
		
	}
	
	Book(int dist, String desc, String producer, int price, String isbn, String author, String bookTitle){
		super(dist, desc, producer, price);
		this.isbn = isbn;
		this.author = author;
		this.bookTitle = bookTitle;
	}
	
	String showinfo() {
		return ("상품ID>>" +dist +"\n상품설명>>" + desc + "\n생산자>>" + producer+ "\n가격:" + price
				+ "\nISBN>>" + isbn + "\n책 제목>>" + bookTitle + "\n저자>>" + author);
	}

	

}
