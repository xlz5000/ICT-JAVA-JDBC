package b_operator;


/*
 * 논리연산자
 * 
 * [1] 일반 논리
 * 
 * 				` || (OR)
 * 				` &&	(AND)
 * 
 * [2] 이진논리
 * 				` |	(OR)
 * 				` &	(AND)
 * 				` ^	(XOR) 같은신호면 0 다르면 1
 * 
 */
public class Ex07_BinaryLogical {
	public static void main(String[] args) {
		
		int a = 15; // 00000000 00000000 00000000 00001111
		int b = 10; // 00000000 00000000 00000000 00001010
					// -----------------------------------------
					// 00000000 00000000 00000000 00001010 &
					// 00000000 00000000 00000000 00001111 |
					// 00000000 00000000 00000000 00000101 같은신호면 0 다르면 1 ^
		
		int and = a & b;
		System.out.println(and);
		
		

		int or = a | b;
		System.out.println(or);
		
		int xor = a ^ b;
		System.out.println(xor);
		
	}

}
