package cmm;

public class SalariedWorker extends Workers {
	@Override
	public void pay(int hours) {

		payForHour = 500;
		salaryRate = hours * payForHour;
		name = "vicky - Salaried worker";
	}

}
