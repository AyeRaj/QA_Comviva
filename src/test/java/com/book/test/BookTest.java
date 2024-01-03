package com.book.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.book.Book;
import com.book.LibraryCatalouge;

public class BookTest {

	@Test
	public void borrowbook() {
		LibraryCatalouge librarycatalouge = new LibraryCatalouge();

		Book book1 = new Book("Java", "Raj Kumar");

		librarycatalouge.addBook(book1);
		librarycatalouge.borrowBook("Java");
		assertFalse(book1.isAvailable());
		assertFalse(librarycatalouge.getBooks().isEmpty());
		assertEquals("Raj Kumar",librarycatalouge.getBooks().get(0).getAuthor());
	}

	@Test
	public void returnbook() {
		LibraryCatalouge librarycatalouge = new LibraryCatalouge();

		Book book1 = new Book("JUnit Testing", "Raj Kumar");

		librarycatalouge.addBook(book1);
		librarycatalouge.borrowBook("JUnit Testing");
		librarycatalouge.returnBook("JUnit Testing");
		assertTrue(book1.isAvailable());
	}

}