package com.bookmarkapp.data;

import com.bookmarkapp.entites.Bookmark;
import com.bookmarkapp.entites.User;
import com.bookmarkapp.managers.BookmarkManger;
import com.bookmarkapp.managers.UserManager;

public class Launch {
    
	private static User[] users;
	private static Bookmark[][] bookmarks;
	
	private static void loadData() {
		System.out.println("1. laoding the data/...");
		DataStore.loadData();
		users=UserManager.getInstance().getUsers();
		bookmarks=BookmarkManger.getInstance().getBookmarks();
		System.out.println("printing the User data");
		printUserData();
		System.out.println("printing the bookmark data");
		printBookmarksdata();
					
	}
	
	private static void printUserData() {
		for(User user:users) {
			System.out.println(user);
		}
		
	}
	
	   private static void printBookmarksdata() {
		for(Bookmark[] bookmarklist:bookmarks)
		{
			for(Bookmark bookmark:bookmarklist) {
				System.out.println(bookmark);
			}
		}
	   }
		
		private static void startBookmarking() {
			System.out.println("StartBookmarking");
			for(User user:users)
			{
				View.bookmarks(user, bookmarks);
			}
			
		}
		

	public static void main(String[] args) {
    loadData();
    startBookmarking();
    
	}

	





}
