package service;

import model.Login;
import model.User;

public interface UserService {
	
	void register(User user);
//	User ValidateUser(Login )
	User ValidateUser(Login login);
	

}
