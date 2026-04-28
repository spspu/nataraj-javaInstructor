package com.mainapp.factory;

import java.util.HashMap;
import java.util.Map;

import com.mainapp.type.BookType;
import com.mainapp.type.FrictionalBooks;
import com.mainapp.type.NonFrictionalBooks;

public class BookFactory {
	private static Map<String,BookType> cacheMap=new HashMap();
	static {
		BookType frictionalBooks=new FrictionalBooks();
		frictionalBooks.loadBooks();
		BookType nonfrictionalBooks=new NonFrictionalBooks();
		nonfrictionalBooks.loadBooks();
		cacheMap.put("frictional", frictionalBooks);
		cacheMap.put("nonfrictional", nonfrictionalBooks);
	}
	public static BookType getBooks(String type) throws Exception{
		BookType clonedBooks=(BookType)cacheMap.get(type).clone();
		return clonedBooks;
	}

}
