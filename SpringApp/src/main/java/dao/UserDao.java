package dao;

import model.Login;
import model.User;

public interface UserDao {
	void register(User user);
	
	User ValidateUser(Login login);

}
