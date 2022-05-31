package StarEx;

public class Kisetsu03	extends Kisetsu01 {
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Take it slow. Dropship ======>"+x+", y : "+y);
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("In the by, by, by, by");
	}
	
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Meaasge :: Can I take order");
	}
}
