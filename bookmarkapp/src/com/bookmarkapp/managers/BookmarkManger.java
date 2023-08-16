package com.bookmarkapp.managers;

import com.bookamarkapp.dao.BookmarkDao;
import com.bookmarkapp.data.DataStore;
import com.bookmarkapp.entites.Book;
import com.bookmarkapp.entites.Bookmark;
import com.bookmarkapp.entites.Movie;
import com.bookmarkapp.entites.User;
import com.bookmarkapp.entites.UserBookmark;
import com.bookmarkapp.entites.Weblink;

public class BookmarkManger {
	private static BookmarkManger instance = new BookmarkManger();
	private static BookmarkDao bookmarkDao= new BookmarkDao();

	private BookmarkManger() {
	}

	public static BookmarkManger getInstance() {
		return instance;
	}

	public Movie createMovie (int id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors, String genere, double d) {
		Movie movie =new Movie();
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenere(genere);
		movie.setImdbRating(releaseYear);
		
		return movie;	
	}
	public Book createBook(int id,String title,int publicationyear,String publishers, String[] authors, String genere, double  amazonRating) {
		Book book=new Book();
		book.setId(id);
		book.setTitle(title);
		book.setPublicationyear(publicationyear);
		book.setPublishers(publishers);
		book.setAuthors(authors);
		book.setGenere(genere);
		book.setAmazonRating(publicationyear);
		return book;
	}
	
	public Weblink createWeblink(long id,String title,String url, String host) {
		Weblink weblink= new Weblink();
		weblink.setId(id);
		weblink.setTitle(title);
		weblink.setUrl(url);
		weblink.setHost(host);
		
		return weblink;
	}

		public Bookmark[][] getBookmarks(){
			return DataStore.getBookmarks();
		}

		public void saveUserBookmark(User user, Bookmark bookmark) {
		
			UserBookmark userBookmark= new UserBookmark();
			userBookmark.setUser(user);
			userBookmark.setBookmark(bookmark);
			
			BookmarkDao.saveUserBookmarks(userBookmark);
			
		}
	
}
