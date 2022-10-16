package org.practicaltest.service;

import java.util.ArrayList;
import java.util.TreeSet;

import org.practicaltest.dao.BookDAO;
import org.practicaltest.model.Book;

public class BookService {
	static ArrayList<Book> bookset = new ArrayList<>();
	public static void addBook(Book book) {
		// TODO Auto-generated method stub
		BookDAO.addBook(book);
	}
	public static ArrayList<Book> displayBook() {
		// TODO Auto-generated method stub
		return BookDAO.displayBook();
	}
}
