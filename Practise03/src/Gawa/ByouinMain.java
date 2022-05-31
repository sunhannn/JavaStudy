package Gawa;

public class ByouinMain {

	public static void main(String[] args) {
		

		Byouin hosp = new Byouin();
		
		doubutu inu = new inu();
		doubutu neko = new neko();
		doubutu tora = new tora();
				
		hosp.inject(inu);
		hosp.inject(neko);
		hosp.inject(tora);
		
		
		
	}

}
