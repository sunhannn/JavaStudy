package com.constex;
//생성자가 없어도 컴파일러가 자동으로 만든다.

public class Book {
	
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "작자미상";
				
		
	}
	
	public Book(String t,String a) {
		title = t;
		author = a;
				
		
	}
	
	
	

}
