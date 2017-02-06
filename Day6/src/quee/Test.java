package quee;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
		Queue a= new LinkedList();
		a.add(256);
		a.add("kittu");
		a.add(5555);
		a.add(58688);
		
		
		System.out.println(a);
		a.remove();
		
		System.out.println(a);
		a.remove();
		System.out.println(a);
	}

}
