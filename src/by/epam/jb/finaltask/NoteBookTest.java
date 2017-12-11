package by.epam.jb.finaltask;

import org.junit.Assert;
import org.junit.Test;

public class NoteBookTest {
	
	@Test
	public void testAddNote(){
		NoteBook noteBook = new NoteBook();
		Assert.assertEquals(0, noteBook.getNotes().size());
		Note note = new Note("content5", new Data(1,1,2222));
		noteBook.add(note);
		Assert.assertEquals(1, noteBook.getNotes().size());
		Assert.assertEquals(note, noteBook.getNotes().get(0));
	}
	
	@Test
	public void testRemoveNote(){
		NoteBook noteBook = new NoteBook();
		Note note = new Note("content5", new Data(1,1,2222));
		noteBook.add(note);
		Assert.assertEquals(1, noteBook.getNotes().size());
		noteBook.delete(note);
		Assert.assertEquals(0, noteBook.getNotes().size());
	}
	
	@Test
	public void testFindByNoteContent(){
		NoteBook noteBook = new NoteBook();
		Note note = new Note("content5", new Data(1,1,2222));
		Note note1 = new Note("content6", new Data(2,2,3333));
		noteBook.add(note);
		noteBook.add(note1);
		Note result = noteBook.findByNoteContent("content6");
		Assert.assertEquals(note1, result);
	}
	
	@Test
	public void testFindByNoteContentNull(){
		NoteBook noteBook = new NoteBook();
		Note result = noteBook.findByNoteContent("content10");
		Assert.assertNull(result);
	}
	
	@Test
	public void testFindByData(){
		NoteBook noteBook = new NoteBook();
		Note note = new Note("content5", new Data(1,1,2222));
		Note note1 = new Note("content6", new Data(2,2,3333));
		noteBook.add(note);
		noteBook.add(note1);
		Note result = noteBook.findByData(new Data(1,1,2222));
		Assert.assertEquals(note, result);
	}
	
	@Test
	public void testFindByDataNull(){
		NoteBook noteBook = new NoteBook();
		Note note = new Note("content5", new Data(1,1,2222));
		noteBook.add(note);
		Note result = noteBook.findByData(new Data(3,2,3333));
		Assert.assertNull(result);
	}
}
