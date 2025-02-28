package j_practice;

public class Product {
	
	int dist;
	String desc;
	String producer;
	int price;
	
	Product(){
		
	}
	
	Product(int dist, String desc, String producer, int price){
		this.dist = dist;
		this.desc = desc;
		this.producer = producer;
		this.price = price;
	}
	
	String showinfo() {
		return ("상품ID>>" +dist +"\n상품설명>>" + desc + "\n생산자>>" + producer+ "\n가격:" + price);
	}

}
