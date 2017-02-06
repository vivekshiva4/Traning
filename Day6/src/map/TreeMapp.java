package map;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapp {

	public static void main(String[] args) {

		TreeMap< Integer, String> a=new TreeMap<Integer, String>();

		
		
		a.put(1, "vivek");
		a.put(3, null);
		a.put(2, "vivek");
		a.put(5, "kittu");
		a.put(4, "value");
		
		System.out.println(a);
		System.out.println(a.size());
		
	}

}
