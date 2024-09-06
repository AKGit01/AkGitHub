package Basic;

public class ExceptionEx {

	public static void main(String arg[]) {
		
		int a=2;
		int b=0;
		try {
			System.out.println(a/b);
		}

		catch (ArithmeticException  e) {
			System.out.println("fail div by zero");
		}
		
		catch (Exception e) {
			System.out.println("fail");
		}
		 finally {  
			 System.out.println("finally block is always executed");  
			 }     
	}
}
