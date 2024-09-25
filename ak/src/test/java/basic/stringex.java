package basic;

public class stringex {

    public static void main(String arg[]) {
        String s = "New to java world";
        String w,rs;
        String rf=" ";
        char c,l;
       // int count =0;
        //to search word 
        String t[] = s.split(" ");
        
        for (String str : t) {
            if (str.equals("java")) {
                System.out.println("found");
            }
        }
        //swap first and last ch of each word
        for (String str : t) {
            	c=str.charAt(0);
            	l=str.charAt(str.length()-1);
            	w=str.substring(1, str.length()-1);
            	rs=l+w+c+" ";
            	rf=rf+rs;
            	rs=" ";           
        }
        System.out.println("Reverse ch string = " + rf);
        
        //to reverse line
        StringBuilder reversed = new StringBuilder();
        for (int i=t.length-1;i>=0;i--) {
        	reversed=reversed.append(t[i]);
        	reversed.append(" ");
        }
        System.out.println("Resverse line = " +reversed.toString());
        
        //reverse the word
        
        String p = "publicissapient";
        String k="";
        char ch;
        for(int i=0;i<p.length();i++) {
        	ch=p.charAt(i);
        	k=ch+k+i;
        }
        System.out.println(k);
        
    }
}
