package Tanpopo;

public class Hata {
	
	private String name;
	private long balance;
	
	public Hata() {
		
	}
	
	public Hata(String name) {
		
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public long getBalance() {
		return balance;
		
	}
	public void deposit(long amount) {
		
		balance += amount;
	}
	public void withdraw(long amount) {
		if (balance < amount) {
			System.out.println("잔액이 많이 부족합니다.");
			
			
			
		}else {
			balance -= amount;
		}
		
	
		
		
		
	}
	
	
	
	
	
}
