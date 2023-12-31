package com.bookmarkapp.data;

import com.bookmark.constants.BookGenre;
import com.bookmark.constants.Gender;
import com.bookmark.constants.MovieGenre;
import com.bookmark.constants.UserType;
import com.bookmarkapp.entites.Book;
import com.bookmarkapp.entites.Bookmark;
import com.bookmarkapp.entites.User;
import com.bookmarkapp.entites.UserBookmark;
import com.bookmarkapp.managers.BookmarkManger;
import com.bookmarkapp.managers.UserManager;

public class DataStore {
	public static final int USER_BOOKMARK_LIMIT = 5;
    public static final int TOTAL_USER_COUNT = 5;
	public static final int BOOKMARK_COUNT_PER_TYPE = 5;
	public static final int BOOKMARK_TYPES_COUNT = 3;
	public static User[] users=new User[TOTAL_USER_COUNT];
	public static Bookmark[][] bookmarks= new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
	public static UserBookmark[] userBookmarks= new UserBookmark[TOTAL_USER_COUNT*USER_BOOKMARK_LIMIT];
    private static int bookmarkIndex;
	public static void loadData() {
		loadUsers();
		loadWebLinks();
		loadMovie();
		loadBooks();
	}
	private static void loadUsers() {
		users[0]=UserManager.getInstance().craeteUser(1000,"user0@semanticsquare.com","test","John","M",Gender.MALE,UserType.USER);
		users[1]=UserManager.getInstance().craeteUser(1001,"user1@semanticsquare.com","test","Sam","M",Gender.MALE,UserType.USER);
		users[2]=UserManager.getInstance().craeteUser(1002,"user2@semanticsquare.com","test","Anita","M",Gender.MALE,UserType.EDITOR);
		users[3]=UserManager.getInstance().craeteUser(1003,"user3@semanticsquare.com","test","Sara","M",Gender.FEMALE,UserType.EDITOR);
		users[4]=UserManager.getInstance().craeteUser(1004,"user4@semanticsquare.com","test","Dheeru","M",Gender.MALE,UserType.CHIEF);

	
	}
	private static void loadWebLinks() {
		bookmarks[0][0]=BookmarkManger.getInstance().createWeblink(2000,"Taming Tiger, Part 2","http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html","http://www.javaworld.com");
		bookmarks[0][1]=BookmarkManger.getInstance().createWeblink(2001,"How do I import a pre-existing Java project into Eclipse and get up and running?","http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running","http://www.stackoverflow.com");
		bookmarks[0][2]=BookmarkManger.getInstance().createWeblink(2002,"Interface vs Abstract Class","http://mindprod.com/jgloss/interfacevsabstract.html","http://mindprod.com");
		bookmarks[0][3]=BookmarkManger.getInstance().createWeblink(2003,"NIO tutorial by Greg Travis","http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf","http://cs.brown.edu");
		bookmarks[0][4]=BookmarkManger.getInstance().createWeblink(2004,"Virtual Hosting and Tomcat","http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html","http://tomcat.apache.org");
        
	
	}
	private static void loadMovie() {
		bookmarks[1][0]=BookmarkManger.getInstance().createMovie(3000,"Citizen Kane","",1941,new String[] {"Orson Welles","Joseph Cotten"},new String[]{"Orson Welles"},MovieGenre.CLASSICS,8.5);
		bookmarks[1][1]=BookmarkManger.getInstance().createMovie(3001,"The Grapes of Wrath","",1940,new String[] {"Henry Fonda","Jane Darwell"},new String[]{"John Ford"},MovieGenre.CLASSICS,8.2);
		bookmarks[1][2]=BookmarkManger.getInstance().createMovie(3002,"A Touch of Greatness",""	,2004,new String[] {"Albert","Cullum"},new String[] {"Leslie Sullivan"},MovieGenre.DOCUMENTARIES,7.3);
		bookmarks[1][3]=BookmarkManger.getInstance().createMovie(3003,"The Big Bang Theor","",2007,new String[] {"Kaley Cuoco"},new String[] {"Jim Parsons Chuck","Lorre"},MovieGenre.TV_SHOWS,8.7);
		bookmarks[1][4]=BookmarkManger.getInstance().createMovie(3004,"Ikiru","",1952,new String[] {"Takashi Shimura","Minoru Chiaki"},new String[] {"Akira Kurosawa"},MovieGenre.FOREIGN_MOVIES,8.4);

	}
	private static void loadBooks() {
		bookmarks[2][0]=BookmarkManger.getInstance().createBook(4000,"Walden",1854,"Wilder Publications",new String[]{"Henry David","Thoreau"},BookGenre.PHILOSOPHY,4.3);
		bookmarks[2][1]=BookmarkManger.getInstance().createBook(4001,"Self-Reliance and Other Essays",1993,"Dover Publications",new String[]{"Ralph Waldo","Emerson"},BookGenre.PHILOSOPHY,4.5);
		bookmarks[2][2]=BookmarkManger.getInstance().createBook(4002,"Light From Many Lampsn",1998,"Wilder Publications",new String[]{"Lillian Eichler"," Watson"},BookGenre.PHILOSOPHY,4.3);
		bookmarks[2][3]=BookmarkManger.getInstance().createBook(4003,"Walden",2004,"Wilder Publications",new String[]{"Henry David","Thoreau"},BookGenre.TECHNICAL,4.9);
		bookmarks[2][4]=BookmarkManger.getInstance().createBook(4004,"Effective Java Programming Language  Guide",2007,"Wilder Publications",new String[]{"Joshua Bloch"},BookGenre.TECHNICAL,5.0);
		
				
				
	}
	public static User[] getUsers() {
		return users;
	}
	public static Bookmark[][] getBookmarks() {
		return bookmarks;
	}
	public static void add(UserBookmark userBookmark) {
		userBookmarks[bookmarkIndex]=userBookmark;
		bookmarkIndex++;
		
	}
}
