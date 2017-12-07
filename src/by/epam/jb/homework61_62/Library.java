package by.epam.jb.homework61_62;

import java.util.List;

import by.epam.jb.homework522.Item;
import by.epam.jb.homework522.ItemInfo;

public class Library {

	public static void main(String[] args) {

		BookInfo myBookInfo = new BookInfo();

		myBookInfo.add(new Book("Name1", "Author1", new Data(1, 1, 1990)));
		myBookInfo.add(new Book("Name2", "Author2", new Data(2, 2, 1910)));
		myBookInfo.add(new Book("Name3", "Author3", new Data(3, 3, 1920)));
		myBookInfo.add(new Book("Name4", "Author4", new Data(4, 4, 1990)));

	/*	Book findBook = myBookInfo.findByContent("Name3");
		if (findBook != null) {
			print(findBook);
		} */
		print(myBookInfo); 
	}

	public static void print(BookInfo bookInfo) {
		List<Book> printBooks = bookInfo.getBooks();
		System.out.println("Books: ");
		for (int i = 0; i < printBooks.size(); i++) {
			Book book = printBooks.get(i);
			print(book);
		}
	}

	public static void print(Book book) {
		System.out.println("Title: " + book.getTitle() + ";" + " Author: " + book.getAuthor() + ";" + " Year [" + book.getYear().getDay()
				+ "/" + book.getYear().getMonth() + "/" + book.getYear().getYear() + "];");
	}
}
