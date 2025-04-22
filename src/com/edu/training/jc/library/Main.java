package com.edu.training.jc.library;

public class Main {

	public static void main(String[] args) {
		int counter = 1;

		Book book1 = new Book(counter++, "Рога и копыта", "Остап Бендер", "АСТ", 1666, 113, 14.5, "мягкий");
		Book book2 = new Book(counter++, "Философия", "Иван Бендер", "Ширпотрёппечать", 2023, 99, 100, "твёрдый");
		Book book3 = new Book(counter++, "Методы приготовления шиншилл", "Дроздов", "Живой мир", 1999, 543, 68.9,
				"твердый");
		Book book4 = new Book(counter++, "Рога", "Остап, Дроздов", "Знания", 2021, 56, 51.9, "мягкий");
		Book book5 = new Book(counter++, "копыта", "Бендер", "АСТ", 2020, 113, 5, "мягкий");
		Book book6 = new Book(counter++, "И", "Остап Бендер", "Знания", 1997, 236, 777, "мягкий");
		Book book7 = new Book(counter++, "Энтомология", "Шванвич", "АСТ", 1948, 300, 450, "твёрдый");
		Book book8 = new Book(counter++, "Энтомология", "Шванвич", "АСТ", 1948, 300, 450, "твёрдый");

		Library library = new Library();

		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
		library.add(book5);
		library.add(book6);
		library.add(book7);
		library.add(book8);

		Library lib2 = selectAction("publishingHouse", "АСТ", library); // фильтра часто делаются через выпадающие
																		// списки доступных
																		// элементов для фильтрации и обрабатывать
																		// недопустимые значения нет большого смысла
		printLibrary(lib2);

		Library lib3 = selectAction("author", "Бендер", library);
		printLibrary(lib3);

		Library lib4 = selectAction("afterPublishingYear", "1800", library);
		printLibrary(lib4);

	}

	public static Library selectAction(String flag, String flagValue, Library library) {
		Library lib;
		if (flag.equals("author")) {
			lib = selectionAuthor(flagValue, library);
		} else if (flag.equals("publishingHouse")) {
			lib = selectionPublishingHouse(flagValue, library);
		} else if (flag.equals("afterPublishingYear")) {
			lib = selectionAfterPublishingYear(flagValue, library);
		} else
			lib = new Library();
		return lib;
	}

	public static Library selectionAuthor(String author, Library lib) {
		Library libAuthor = new Library();
		for (int i = 0; i < lib.getSize(); i++) {
			if (lib.getBook(i).getAuthor().contains(author)) {
				libAuthor.add(lib.getBook(i));
			}
		}
		return libAuthor;
	}

	public static Library selectionPublishingHouse(String publishingHouse, Library lib) {
		Library libPublishingHouse = new Library();
		for (int i = 0; i < lib.getSize(); i++) {
			if (lib.getBook(i).getPublishingHouse().contains(publishingHouse)) {
				libPublishingHouse.addBook(lib.getBook(i));
			}
		}
		return libPublishingHouse;
	}

	public static Library selectionAfterPublishingYear(String publishingYear, Library lib) {
		Library libAfterPublishingYear = new Library();
		for (int i = 0; i < lib.getSize(); i++) {
			if (lib.getBook(i).getPublishingYear() > Integer.parseInt(publishingYear)) {
				libAfterPublishingYear.add(lib.getBook(i));
			}
		}
		return libAfterPublishingYear;
	}

	public static void printLibrary(Library lib) {
		for (int i = 0; i < lib.getSize(); i++) {
			System.out.println(lib.getBook(i).toString());
		}
	}
}
