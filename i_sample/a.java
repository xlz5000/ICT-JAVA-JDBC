package i_sample;

class Parent {
	int  i = 7;
	public int get() {  return i ; }
}
class Child extends Parent {
	int  i = 5 ;
	public int get() {  return i ; }
}
public class a {
	public static void main ( String [] args ) {
	   
	   Parent  p = new Parent ();
	   System.out.println("---------------------1---------------------");
	   System.out.println( p.i );
	   System.out.println( p.get( ) );
	   
	   Child  c = new Child ();
	   System.out.println("---------------------2---------------------");
	   System.out.println( c.i );
	   System.out.println( c.get( ) );
	   
	  //이건 오류
	  //Child  p2 = new Parent();
	   Parent  p2 = new Child();
	   System.out.println("---------------------3---------------------");
	   System.out.println( p2.i );
	   System.out.println( p2.get( ) );
	}
}