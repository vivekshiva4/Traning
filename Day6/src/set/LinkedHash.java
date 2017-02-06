package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {

	public static void main(String[] args) {

		LinkedHashSet a=new LinkedHashSet();
		a.add(1546);
		a.add(25869);
		
		System.out.println(a);
		
		Iterator it=a.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
