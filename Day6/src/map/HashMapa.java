package map;

import java.util.HashMap;

public class HashMapa {

	public static void main(String[] args) {

		HashMap<Integer, String> a=new java.util.HashMap<Integer, String>();
		
		a.put(1, "vivek");
		a.put(2, null);
		a.put(3, "vivek");
		a.put(null, "kittu");
		a.put(4, "value");
		
		System.out.println(a);
		System.out.println(a.size());
		
	}

}
