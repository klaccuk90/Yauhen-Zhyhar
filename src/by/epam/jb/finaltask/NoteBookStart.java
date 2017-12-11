package by.epam.jb.finaltask;

public class NoteBookStart {

	public static void main(String[] args) {

		NoteBook myNoteBook = new NoteBook();

		myNoteBook.add(new Note("noteContent1", new Data(1, 1, 2000)));
		myNoteBook.add(new Note("noteContent2", new Data(2, 2, 2001)));
		myNoteBook.add(new Note("noteContent3", new Data(3, 3, 2002)));
		myNoteBook.add(new Note("noteContent4", new Data(4, 4, 2003)));

		searchByContent(myNoteBook);

		searchByDate(myNoteBook);

		printNoteBook(myNoteBook);
	}

	private static void searchByContent(NoteBook myNoteBook) {
		Note findNote = myNoteBook.findByNoteContent("noteContent");
		if (findNote != null) {
			printNote(findNote);
		} else {
			System.out.println("Note with this content is not existed");
		}
	}

	private static void searchByDate(NoteBook myNoteBook) {
		Note findByData = myNoteBook.findByData(new Data(3, 3, 2002));
		if (findByData != null) {
			printNote(findByData);
		} else {
			System.out.println("Note with this date is not existed");
		}
	}

	public static void printNoteBook(NoteBook noteBook) {
		System.out.println(noteBook.toString());
	}

	public static void printNote(Note note) {
		System.out.println(note.toString());
	}
}
