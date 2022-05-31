package StarEx;

public class Kisetsu04  extends Kisetsu01{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Move it! Move it! Sir =======> x : "+x+", y : "+y);
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Destination?");
	}
	
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message :: Go, Siege!");
	}
	
	
	void Siegemod() {
		System.out.println("Yes, Sir!");
		
	}
	
}
