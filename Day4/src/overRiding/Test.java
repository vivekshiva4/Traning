package overRiding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
One o;
o=new Two();
o.display();
o.one();
//Above and Below both declarations are valid 
System.out.println("---------------------");
		Two t=new Two();
		t.display();
		t.one();
		t.go(40);
		
	}

}
