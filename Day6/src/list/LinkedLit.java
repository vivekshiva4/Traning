package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLit {

	public static void main(String[] args) {
		LinkedList a= new LinkedList();
		a.add(5856);
		a.add(555);
		a.add(1,54445);
		a.addLast(269);
		a.addFirst(25);
		a.removeFirst();
		System.out.println(a);
		
		Iterator it=a.iterator();

		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}

	}

}
