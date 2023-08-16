package com.bookamarkapp.dao;

import com.bookmarkapp.data.DataStore;
import com.bookmarkapp.entites.User;

public class UserDao {

	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
