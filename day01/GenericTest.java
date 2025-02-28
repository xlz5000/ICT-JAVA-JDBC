package day01;


// main 치고 ctrl + space =>
//public static void main(String[] args) {
//	
//}
public class GenericTest {
	public static void main(String[] args) {
		Cola cola = new Cola();
		Water water = new Water();
		
		//콜라컵
		Cup<Cola> cup = new Cup<Cola>();
		cup.setDrink(cola);
		System.out.println(cup.getDrink());
		
		
		//물컵
		Cup<Water> cup2 = new Cup<>();
		cup2.setDrink(water);
		System.out.println(cup2.getDrink());
	}
}
