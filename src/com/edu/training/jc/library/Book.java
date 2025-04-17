package com.edu.training.jc.library;

import java.util.Objects;

public class Book {
	private final int id;
	private String bookName;
	private String author;
	private String publishingHouse;
	private int publishingYear;
	private int numberPages;
	private double price;
	private String binding;

	public Book(int id) {
		this.id = id;
	}

	public Book(int id, String bookName, String author, String publishingHouse, int publishingYear, int numberPages,
			double price, String binding) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.publishingYear = publishingYear;
		this.numberPages = numberPages;
		this.price = price;
		this.binding = binding;

	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;

	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	public int getId() { // сеттер не делаем, предполагаем что ИД уникально и менять его нельзя,
							// уникальность обеспечивается где-то в другом месте на фронтЕ
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, binding, bookName, id, numberPages, price, publishingHouse, publishingYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(binding, other.binding)
				&& Objects.equals(bookName, other.bookName) && id == other.id && numberPages == other.numberPages
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publishingHouse, other.publishingHouse) && publishingYear == other.publishingYear;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", publishingHouse="
				+ publishingHouse + ", publishingYear=" + publishingYear + ", numberPages=" + numberPages + ", price="
				+ price + ", binding=" + binding + "]";
	}
}
