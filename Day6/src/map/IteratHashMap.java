package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IteratHashMap {

	public static void main(String[] args) {


		HashMap<Integer, String> a=new HashMap<Integer, String>();
		
		a.put(1, "vivek");
		a.put(2, null);
		a.put(3, "vivek");
		a.put(null, "kittu");
		a.put(4, "value");
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(2));
		
		
		Set keys=a.entrySet();
		Iterator<Integer> it=keys.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}

}
