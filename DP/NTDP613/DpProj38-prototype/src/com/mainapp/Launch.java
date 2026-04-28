package com.mainapp;

import com.mainapp.factory.BookFactory;
import com.mainapp.type.BookType;

public class Launch {
	public static void main(String[] args) {
		BookType frictionalBooks=BookFactory.getBook("frictional");
		System.out.println(frictionalBooks);
		System.out.println("---------------------------");
		BookType nonfrictionalBooks=BookFactory.getBook("nonfrictional");
		System.out.println(nonfrictionalBooks);
		System.out.println("---------------------------");
		
		BookType frictionalBooks1=BookFactory.getBook("frictional");
		System.out.println(frictionalBooks1);
		System.out.println("---------------------------");
		BookType nonfrictionalBooks1=BookFactory.getBook("nonfrictional");
		System.out.println(nonfrictionalBooks1);
		System.out.println("---------------------------");
		
	}

}
