package com.mainapp.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mainapp.model.Book;
import com.mainapp.type.BookType;
import com.mainapp.type.FrictionalBooks;
import com.mainapp.type.NonFrictionalBooks;

public class BookFactory {
	private static Map<String, BookType> cacheMap = new HashMap<>();
	static {
		BookType frictionalBooks = new FrictionalBooks();
		frictionalBooks.loadBooks();
		BookType nonfrictionalBooks = new NonFrictionalBooks();
		nonfrictionalBooks.loadBooks();
		cacheMap.put("frictional", frictionalBooks);
		cacheMap.put("nonfrictional", nonfrictionalBooks);
	}
	public static BookType getBooks(String type) throws Exception {

		BookType cachedBooks = cacheMap.get(type);
		BookType clonedBooks = (BookType) cachedBooks.clone();
		List<Book> clonedList = new ArrayList<>();
		for (Book b : cachedBooks.getBooksList()) {
			Book clonedBook = (Book) b.clone();
			clonedList.add(clonedBook);
		}
		clonedBooks.setBooksList(clonedList);
		clonedBooks.setType(cachedBooks.getType());
		return clonedBooks;
	}
}