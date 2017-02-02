package overLoading;

public class Test {

	public static void main(String[] args) {
		One o=new One();
		o.load(20, 30);
		o.load("vivek  ", "kittu");
		o.load(202, " vivek");

	}

}
