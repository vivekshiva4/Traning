package all;

public class Test3 {

	public static void main(String[] args) {

		UserDao a=new UserDaoImp();
		a.findAll();
		a.findById(2);
	}

}
