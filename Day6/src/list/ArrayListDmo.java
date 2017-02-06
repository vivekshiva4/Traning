package list;

import java.util.ArrayList;

public class ArrayListDmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("vivek");
		a.add(20);
		a.add(1, 25);
		System.out.println(a);
		a.remove(new Integer(20));
		System.out.println(a);
		a.add(null);
		a.add("vivek");
		System.out.println(a);

	}

}
