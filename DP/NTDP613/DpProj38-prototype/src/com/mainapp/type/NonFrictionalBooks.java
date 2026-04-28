package com.mainapp.type;

import com.mainapp.model.Book;

public class NonFrictionalBooks extends BookType{

	@Override
	public void loadBooks() {
		for(int i=1;i<=5;++i) {
			Book book=new Book();
			book.setBookId(i+1);
			book.setBookName("Book: "+i);
			getBooksList().add(book);
		}
		setType("Non-Frictional");
	}

}
