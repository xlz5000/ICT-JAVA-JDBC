package j_practice;

import java.util.Scanner;

public class ProductInfo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Product[] list = new Product[5];
		
		for(int k = 0; k <5; k++) {
			list[k] = new Product();
		}
		
		int i = 0;
		while(true) {
			System.out.print("상품추가(1), 모든 상품 조회(2), 끝내기(3)>>");
			int num1 = input.nextInt();
			
			if(num1 == 1) {
				
				
				System.out.print("상품 종류 책(1), 음악CD(2), 회화책(3)>>");
				int num2 = input.nextInt();
				input.nextLine();
				System.out.print("상품설명>>");
				String desc = input.nextLine();
				
				System.out.print("생산자>>");
				String producer = input.nextLine();
				
				System.out.print("가격>>");
				int price = input.nextInt();
				input.nextLine();
				
				if(num2 == 2) {
					
					System.out.print("앨범 제목>>");
					String album = input.nextLine();
					
					System.out.print("가수>>");
					String singer = input.nextLine();
					
					list[i] = new CompactDisc(i, desc, producer, price, album, singer);
				}else if(num2 == 3) {
					System.out.print("책 제목>>");
					String bookTitle = input.nextLine();
					
					System.out.print("저자>>");
					String author = input.nextLine();
					
					System.out.print("언어>>");
					String lan = input.nextLine();
					
					System.out.print("ISBN>>");
					String isbn = input.nextLine();
					
					list[i] = new ConversationBook(i, desc, producer, price, bookTitle, author, lan, isbn);
				}
				i++;
			}else if (num1 ==2) {
				
				for(int j = 0; j <i;j++) {
					System.out.println(list[j].showinfo());
					
				}
			}else if(num1 ==3 ){
				break;
			}else if(i==5){
				System.out.println("더 이상 추가할 수 없습니다.");
			}
			
		}
		System.out.println("더 이상 추가할 수 없습니다.");
		

	}
	
}
	
	