package com.constex;

 class  BookEx01 {
	
	String title;
	String author;
	
	public void show() {
		
		System.out.println(title+" "+author);
		
		
	}
	public BookEx01() {
		//BookEx("","");
		this("","");
		System.out.println("생성자 호출함");
		
		
	}
	public BookEx01(String title) {
		this(title,"작자미상");
		
	}
	public BookEx01(String title, String author) {
		this.title = title;
		this.author = author;
		
	}
}
		


public class ThisEx03 {
	
	public static void main(String[] args) {
		
		BookEx01 be= new BookEx01("홍길동전","허균");
		BookEx01 be2 = new BookEx01("홍길동전");
		BookEx01 be3 = new BookEx01();
		//be.show();
		be2.show();
		//be3.show();
		
		
		

	}

}
