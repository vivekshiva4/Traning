package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<Integer> a = new TreeSet<Integer>();
		a.add(58586);
		a.add(5555);
		a.add(4747);
		System.out.println(a);

		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");

		}
		System.out.println(a);

	}

}
