package cmm;

public class DailyWorker extends Workers {
	@Override
	public void pay(int hours) {

		days = 5;
		payForDay = 500;
		salaryRate = hours * days * payForDay;
		name = "vivek - Daily worker";

	}

}
