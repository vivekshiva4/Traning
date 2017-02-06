package list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorClass {

	public static void main(String[] args) {

		ArrayList a=new ArrayList();
		a.add(258);
		a.add(528);
		a.add(14785);
		
		System.out.println(a);
		
		ListIterator it=a.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.print("\n");

		while(it.hasPrevious()){
			System.out.print(it.previous()+" ");
		}
		System.out.println("\n");
		while(it.hasNext()){
			int aa=(int) it.next();
			
			if(aa==14785)
				it.remove();
	
			
		}
		it.add(898988985);
		System.out.println(a);
		
	}

}
