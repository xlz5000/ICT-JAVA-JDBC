package f_exception;

class Test{
	static void method() throws Exception {
	  throw new Exception();
//	  try {
//		  System.out.println("a");
//	  }catch(Exception ex){
//		  System.out.println("b");
//	  }
	}
	public static void main( String [] args ) {   
		 try{
			 method();
	} catch( Exception ex ) {
			 System.out.println("예외처리");
		 } 
	}
}

