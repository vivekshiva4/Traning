package cmm;

public class Test {

	public static void main(String[] args) {

		Workers w;
		w=new SalariedWorker();
		w.pay(40);
		w.diplay();
		
		w=new DailyWorker();
		w.pay(12);
		w.diplay();
	}

}
