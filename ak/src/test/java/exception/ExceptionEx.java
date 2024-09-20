package exception;

public class ExceptionEx {

	public static void main(String arg[]) {
		
		int a=2;
		int b=0;
		//String s ="";
		try {
			System.out.println(a/b);
		}

		catch (ArithmeticException  e) {
			System.out.println("fail div by zero");
			System.out.println(e.toString());
		}
		
		catch (Exception e) {
			System.out.println("fail");
			System.out.println(e.toString());
		}
		 finally {  
			 System.out.println("finally block is always executed");  
			 }     
	}
}
