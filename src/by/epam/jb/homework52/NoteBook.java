package by.epam.jb.homework52;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
	private List<Note> notes = new ArrayList<Note>();

	public NoteBook() {
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void add(Note note) {
		notes.add(note);
	}

	public boolean delete(Note note) {
		return notes.remove(notes);
	}

	public Note findByContent(String content) {
		for (Note note : notes) {
			if (note.getNote().equals(content)) {
				return note;
			}
		}
		return null;
	}

	@Override
	public boolean equals(Object Note) {
		if (this == Note) {
			return true;
		}
		if (Note == null) {
			return false;
		}
		if (getClass() != Note.getClass()) {
			return false;
		}
		NoteBook other = (NoteBook) Note;
		if (notes != other.getNotes()) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 31;
		if (notes != null) {
			hash = 17 * hash + this.notes.hashCode();
		} else {
			hash *= 17;
		}
		return hash;
	}
}
