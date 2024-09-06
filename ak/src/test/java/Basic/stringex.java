package Basic;

public class stringex {

    public static void main(String arg[]) {
        String s = "New to java world";
        
        //to search word 
        String t[] = s.split(" ");
        
        for (String str : t) {
            if (str.equals("java")) {
                System.out.println("found");
            }
        }
        
        //to reverse line
        StringBuilder reversed = new StringBuilder();
        for (int i=t.length-1;i>=0;i--) {
        	reversed=reversed.append(t[i]);
        	reversed.append(" ");
        }
        System.out.println(reversed.toString());
        
        //reverse the word
        
        String p = "publicissapient";
        String k="";
        char ch;
        for(int i=0;i<p.length();i++) {
        	ch=p.charAt(i);
        	k=ch+k;
        }
        System.out.println(k);
        
    }
}
