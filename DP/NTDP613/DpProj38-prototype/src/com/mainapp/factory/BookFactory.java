package com.mainapp.factory;

import com.mainapp.type.BookType;
import com.mainapp.type.FrictionalBooks;
import com.mainapp.type.NonFrictionalBooks;

public class BookFactory {
	public static BookType getBook(String type) {
		BookType bType=null;
		if(type.equalsIgnoreCase("frictional")) {
			bType=new FrictionalBooks();
			bType.loadBooks();
		}
		else if(type.equalsIgnoreCase("nonfrictional")) {
			bType=new NonFrictionalBooks();
			bType.loadBooks();
		}
		else
			throw new IllegalArgumentException("Invalid BookType");
		return bType;
	}

}
