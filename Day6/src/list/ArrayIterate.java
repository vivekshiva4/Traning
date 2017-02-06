package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterate {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add("kittu");
		a.add(250);
		
		Iterator it=a.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"--");
		}

	}

}
