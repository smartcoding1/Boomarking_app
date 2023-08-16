package com.bookmarkapp.managers;

import com.bookamarkapp.dao.UserDao;
import com.bookmarkapp.data.DataStore;
import com.bookmarkapp.entites.User;

public class UserManager {
	
	private static UserManager instance= new UserManager();
	private static UserDao dao=new UserDao();
	
	private UserManager() {}
	public static UserManager getInstance () {
		return instance;
	}

	public User craeteUser(long id, String email, String password, String fistName, String lastName, int gender, String userType)
	{
		User user=new User();
		user.setId(id);
		user.setEmail(email);
		user.setFirstName(fistName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;	
	}
	public User[] getUsers() {
		return DataStore.getUsers();
	}
	
}	
	
	
