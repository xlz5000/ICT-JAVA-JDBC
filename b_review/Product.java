package b_review;

public class Product {
	
	private String productNo;
	private String productName;
	private int stock;
	
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void income(int a) {
		
		stock += a;
		
	}
	public void sale(int a) {
		stock -= a;
		
		
	}
	
	public void output(int a) {
		System.out.println("상품번호:" + productNo + ",상품명:" + productName + ",재고량:" + a);
		
	}

}
