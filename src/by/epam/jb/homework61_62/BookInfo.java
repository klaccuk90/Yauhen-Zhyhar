package by.epam.jb.homework61_62;

import java.util.ArrayList;
import java.util.List;

import by.epam.jb.homework522.Item;
import by.epam.jb.homework522.ItemInfo;

public class BookInfo {

	public List<Book> books = new ArrayList<Book>();

	public BookInfo() {
	}

	public List<Book> getBooks() {
		return books;
	}

	public void add(Book book) {
		books.add(book);
	}

	public boolean delete(List book) {
		return books.remove(books);
	}

	public Book findByContent(String content) {
		for (Book book : books) {
			if (book.getTitle().equals(content)) {
				return book;
			}
		}
		return null;
	}

	@Override
	public boolean equals(Object Book) {
		if (this == Book) {
			return true;
		}
		if (Book == null) {
			return false;
		}
		BookInfo other = (BookInfo) Book;
		if (books != other.getBooks()) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 31;
		if (books != null) {
			hash = 17 * hash + this.books.hashCode();
		} else {
			hash *= 17;
		}
		return hash;
	}

}
