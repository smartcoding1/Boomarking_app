package com.bookmarkapp.entites;

import java.util.Arrays;

public class Book  extends Bookmark {
	private int publicationyear;
	private String publishers;
	private String[] authors;
	private String genere;
	private double amazonRating;
	public int getPublicationyear() {
		return publicationyear;
	}
	public void setPublicationyear(int publicationyear) {
		this.publicationyear = publicationyear;
	}
	public String getPublishers() {
		return publishers;
	}
	public void setPublishers(String publishers) {
		this.publishers = publishers;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public double getAmazonRating() {
		return amazonRating;
	}
	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}
	@Override
	public String toString() {
		return "Book [publicationyear=" + publicationyear + ", publishers=" + publishers + ", authors="
				+ Arrays.toString(authors) + ", genere=" + genere + ", amazonRating=" + amazonRating + "]";
	}
	
	

}
 