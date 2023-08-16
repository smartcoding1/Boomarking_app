package com.bookmarkapp.controller;

import com.bookmarkapp.entites.Bookmark;
import com.bookmarkapp.entites.User;
import com.bookmarkapp.managers.BookmarkManger;

public class BookmarkController {
	
	private static BookmarkController instance= new BookmarkController();
	private BookmarkController() {}
	
	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		BookmarkManger.getInstance().saveUserBookmark(user, bookmark);
		
	}
	

}
