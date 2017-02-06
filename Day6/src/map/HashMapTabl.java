package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashMapTabl {

	public static void main(String[] args) {

		Hashtable<Integer, String> a=new  Hashtable<Integer, String>();
		a.put(25, "value");
		a.put(2, "kiyyu");
		System.out.println(a);
		
		Set keys=a.entrySet();
		Iterator it=keys.iterator();
		while
			(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
