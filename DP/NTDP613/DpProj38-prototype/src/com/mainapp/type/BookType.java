package com.mainapp.type;

import java.util.ArrayList;
import java.util.List;

import com.mainapp.model.Book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class BookType {
	
	private String type;
	private List<Book> booksList=new ArrayList();
	
	public abstract void loadBooks();

}
