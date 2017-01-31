package inter;

public class Person implements Profession,Family,Health {

	@Override
	public void getProfession(String prof) {
		
		System.out.println("profession of the person is "+prof);
		
	}
	@Override
	public void getCompanyName(String name) {
	
		
		System.out.println("Name of the person is "+name);
		
		
	}
	@Override
	public void getSalary(double salary) {

		
		System.out.println("salary of the person is "+salary);
		
		
	}
	@Override
	public void getNoOfMembers(int x) {
		
		System.out.println("total number of members are "+x);
		
		
	}
	@Override
	public void getHeadOfTheFamily(String name) {

		
		System.out.println("Head of the family is "+name);
		
	}
	
	@Override
	public void isGood() {
		System.out.println("Health is good");
		
		
	}
	
	
}
