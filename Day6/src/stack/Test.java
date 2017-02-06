package stack;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Stack a=new Stack();
		a.push(258);
		a.push("kittu");
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.remove(0);
		System.out.println(a);

	
	}
}
