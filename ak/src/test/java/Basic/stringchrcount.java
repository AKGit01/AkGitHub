package Basic;

public class stringchrcount {

	public static void main (String arg[]) {
		String s="aabbbcca";
		int count =1;
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s.length()-1;i++) {
						
				if(s.charAt(i)==s.charAt(i+1)) {
					count = count+1;
					sb=sb.append(s.charAt(i)).append(s.charAt(i+1));
					//String p;
					//p=s.charAt(i)+count;
				}else
					{
					sb=sb.append(count);
					count=1;
					}				
		}
		sb=sb.append(s.charAt(s.length()-1)).append(count);
		
		System.out.println("Orignal string :" + s);
		System.out.println("Withcount char string :" + sb.toString());
		
		
	}
}
