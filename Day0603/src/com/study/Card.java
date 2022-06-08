package com.study;

public class Card {

	
	public Card() {
		
		
		
		
	}
	
	public static void main(String[] args) {
		int num[] = new int [52];
		boolean boo[] = new boolean[52];
		
		int r, w;
		
		for (int i = 0; i < boo.length; i++) {
			boo[1] = false;
		}
		w = 0;
		
		
		
		while (w < 52) {
			r = (int)(Math.random() * 52);
			if (boo[r] == false) {
				boo[r] = true;
				num[w] = r;
				w++;
			}
		}
		int cardNum, cardSen;
		
		
		
		for (int i = 0 ;i < num.length ; i++) {
			cardNum = num[i] % 13 + 1;
			
			if ( cardNum == 1) {
				System.out.print("카드 숫자는 : "+num[i]+" , "+"A");
				
			
			}else if (cardNum == 11) {
				System.out.print("카드 숫자는 : "+num[i]+" , "+"J");
			}else if (cardNum == 12) {
				System.out.print("카드 숫자는 : "+num[i]+" , "+"Q");
			}else if (cardNum == 13) {
				System.out.print("카드 숫자는 : "+num[i]+" , "+"K");
			}else {
				
				System.out.print("카드 숫자는 : "+num[i]+" , "+cardNum);
			}
			cardSen = num[i] / 13;
			
			
			switch (cardSen) {
			case 0 : System.out.println("스페이드"); break;
			
			case 1 : System.out.println("다이아"); break;
			
			case 2 : System.out.println("하트"); break;
			
			case 3 : System.out.println("클로버"); break;
			
			}
			
		}
		
	}
	
}
