package overLoading;

public class TestParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 o=new Child1();
		o.load(20, 30);
		o.load("vivek  ", "kittu");
		o.load(20, " vivek ");

	}

}
