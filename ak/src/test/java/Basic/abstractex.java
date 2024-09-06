package Basic;

public abstract class abstractex {
	public abstract int add (int a,int b);
	 
	public int div (int a ,int b) {
		return(a/b);
	}
}

  class cal extends abstractex {
	public  int add (int a,int b) {
		return (a+b);
	}
}
