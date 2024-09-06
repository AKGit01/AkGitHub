package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setEx {

	public static void main(String arg[]) {
		
		Set<Integer> s1= new HashSet<>();
		
		s1.add(3);
		
		List<Integer> L1= new ArrayList<>();
		
		L1.add(4);
		L1.add(4);
		
		s1.addAll(L1);
		//s1.g
		
		System.out.println(s1);
		
		
	}
}
