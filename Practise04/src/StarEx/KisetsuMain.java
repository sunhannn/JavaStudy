package StarEx;

public class KisetsuMain  {
		
		
		
	public static void main(String [] args) {
		
		Kisetsu01[] u = new Kisetsu01[3];
		
		u[0] = new Kisetsu02();
		
		u[1] = new Kisetsu03();
		
		u[2] = new Kisetsu04();
		
		for(int i = 0; i < u.length; i++) {
			System.out.println("================");
			u[i].move(100,200);
			u[i].message();
			
			System.out.println("================");
			
			
		}
		
		
	}
	
	
	
}
