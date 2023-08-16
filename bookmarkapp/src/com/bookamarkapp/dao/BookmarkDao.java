package com.bookamarkapp.dao;

import com.bookmarkapp.data.DataStore;
import com.bookmarkapp.entites.Bookmark;
import com.bookmarkapp.entites.UserBookmark;

public class BookmarkDao {

	public Bookmark[][] getBookmarks(){
		return DataStore.getBookmarks();
	}

	public static void saveUserBookmarks(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
		
	}
}
