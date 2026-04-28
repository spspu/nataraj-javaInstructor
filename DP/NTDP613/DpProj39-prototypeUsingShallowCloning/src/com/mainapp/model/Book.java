package com.mainapp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Book implements Cloneable{
	
	private Integer bookId;
	private String bookName;
	private String status;
	private Float price;
	
	public Book() {
		System.out.println("Book:: 0-param constructor: "+this.hashCode());
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
