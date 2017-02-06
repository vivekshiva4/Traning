package list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratRemove {

	public static void main(String[] args) {
		
		ArrayList a=new  ArrayList();
		a.add("kittu");
		a.add("25698");
		a.add(2, "element");
		System.out.println(a);
		
		Iterator it =a.iterator();
		while(it.hasNext()){
			String z=(String) it.next();
			if(z.equals("kittu"))
			{
				it.remove();
				System.out.println(z);
			}
				
			}
		System.out.println(a);
			
	}

}
