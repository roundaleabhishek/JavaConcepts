package com.learn.record;

import java.util.ArrayList;
import java.util.List;

public class RecordClient {
	
	public static void main(String[] args) {
		Book b1 = new Book("ABC", 500);
		Book b2 = new Book("PQR" , 125);
		
		System.out.println(b1);
		System.out.println(b2);
		List<Book> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		
		bookList.stream().filter(b -> b.price() >100);
		
		
		
		
	}

}
