package by.epam.jb.homework61_62;

import by.epam.jb.homework522.Item;

public class Book {

	private String title;
	private String author;
	private Data year;

	public Book() {
		this("", "", null);
	}

	public Book(String title, String author, Data year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Data getYear() {
		return year;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(Data year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 17;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;
		if (year == null) {
			if (other.year != null) {
				return false;
			} else if (!year.equals(other.year))
				return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			} else if (!title.equals(other.title))
				return false;
		}
		if (author == null) {
			if (other.author != null) {
				return false;
			} else if (!author.equals(other.author))
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}

}
