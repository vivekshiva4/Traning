package list;

import java.util.Iterator;
import java.util.Vector;

public class VectorCla {

	public static void main(String[] args) {

		Vector<Integer> a=new Vector<Integer>();
		a.add(5256);
		a.add(5225);
		a.add(2, 2520);
		
		System.out.println(a);
		
		Iterator<Integer> it=a.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"  ");
		}
		}

}
