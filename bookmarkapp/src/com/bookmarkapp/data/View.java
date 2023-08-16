package com.bookmarkapp.data;

import com.bookmarkapp.controller.BookmarkController;
import com.bookmarkapp.entites.Bookmark;
import com.bookmarkapp.entites.User;

public class View {
	
public static void bookmarks(User user, Bookmark[][] bookmarks)
{
	System.out.println("\n"+user.getEmail()+"is bookmarking");
	{
		for(int i=0;i<DataStore.USER_BOOKMARK_LIMIT;i++) {
			int typeOffset=(int)(Math.random()*DataStore.BOOKMARK_TYPES_COUNT);
			int bookmarkOffset= (int)(Math.random()*DataStore.BOOKMARK_COUNT_PER_TYPE);
			
			Bookmark bookmark= bookmarks[typeOffset][bookmarkOffset];
			BookmarkController.getInstance().saveUserBookmark(user,bookmark);
			
			System.out.println(bookmark);
		}
	}
}

}
