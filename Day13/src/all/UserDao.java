package all;

import java.util.ArrayList;

public interface UserDao {
	
	public ArrayList<User> findAll();
	public int delete(int id);
	public User findById(int id);
	/*public int insert(User user);
	public int update(User user);*/



}
