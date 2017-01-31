package inter;

public class Test {

	public static void main(String[] args) {
		Profession p=new Person();
		p.getProfession("job");
		p.getCompanyName("Bimarian");
		p.getSalary(25000.36);
		
		Family f=new Person();
		f.getNoOfMembers(4);
		f.getHeadOfTheFamily("srinivasulu");
		
		Health h=new Person();
		h.isGood();

	}

}
