package Study;

public class Futaba02 {

	public static void main(String[] args) {
		
		char aa [] = new char [26];
		
		for (int i = 0, b = 97; i < aa.length;i++,b++) {
			aa [i] = (char)b;
			System.out.printf("%c",aa[i]);
			
		}
		
		
		System.out.println();
		
		char [] alpha = new char [26];
		for (int i = 0; i < alpha.length;i++) {
			alpha [i] = (char)('A'+i);
			System.out.print(alpha);
		}

	}

}
