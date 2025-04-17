package com.edu.training.jc.library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> library = new ArrayList<>();

	public Library() {

	}

	public ArrayList<Book> getLibrary() {
		return library;
	}

	public void setLibrary(ArrayList<Book> library) {
		this.library = library;
	}

	public int getSize() {
		return library.size();
	}

	public Book getBook(int index) {
		return library.get(index);
	}

	public void addBook(Book book) {

			this.library.add(book);
		
		}
	}


