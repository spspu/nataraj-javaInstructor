package com.mainapp;

import com.mainapp.factory.BookFactory;
import com.mainapp.type.BookType;

public class Launch {
	public static void main(String[] args) throws Exception {
		try {
			BookType frictionalBooks=BookFactory.getBooks("frictional");
			System.out.println(frictionalBooks);
			System.out.println("count::"+frictionalBooks.getBooksList().size());
			System.out.println("---------------------------");
			BookType nonfrictionalBooks=BookFactory.getBooks("nonfrictional");
			System.out.println(nonfrictionalBooks);
			System.out.println("---------------------------");
			
			BookType frictionalBooks1=BookFactory.getBooks("frictional");
			System.out.println(frictionalBooks1);
			System.out.println("---------------------------");
			BookType nonfrictionalBooks1=BookFactory.getBooks("nonfrictional");
			System.out.println(nonfrictionalBooks1);
			
			frictionalBooks1.getBooksList().remove(2);
			System.out.println("cloned object data::"+frictionalBooks1);
			System.out.println("count::"+frictionalBooks1.getBooksList().size());
			System.out.println("original object data::"+frictionalBooks);
			System.out.println("count::"+frictionalBooks.getBooksList().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
