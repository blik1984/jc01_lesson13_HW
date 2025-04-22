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

	public void add(Book book) {

			this.library.add(book);
		
		}
	public void del(int id) {
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).getId() == id) {
				library.remove(i);
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "Library [library=" + library + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(library);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(library, other.library);
	}
	}


