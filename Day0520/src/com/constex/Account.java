package com.constex;

public class Account {

	private String name; //예금주
	private long balance; //잔고
	
	public Account() {
	}
		public Account(String name) {
			
			this.name = name;
			
		}
		public String getName() {
			return name;
			
			
		}
		public long getBalance() {
			return balance;
			
			
		}
	// 입금
		public void deposit(long amount) {
			
			balance += amount;
		}
		//출금
		public void withdraw(long amount) {
			if (balance < amount) {
				System.out.println("잔액이 많이 부족합니다.");
				
				
			}else {
			balance -= amount;
			
		}
		
	}

	}
