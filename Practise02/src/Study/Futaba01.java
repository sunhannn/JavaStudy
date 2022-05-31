package Study;


public class Futaba01 {

	public static void main(String[] args) {
		
	for (String s : args) 
		System.out.printf("%3s",s);
	
		String [] subject = {"국어 점수", "수학 점수", "영어 점수"};
		
		for (String ss : subject) 
			System.out.printf("%3s\n", ss);
			
			
		System.out.println();
		
		char ch[] = new char [4];
		
		char cha [] = {'J', 'A', 'V', 'A'};
		
		ch [0] = 'J';
		ch [1] = 'A';
		ch [2] = 'V';
		ch [3] = 'A';
		
		for (int i  = 0; i < ch.length;i++)
			System.out.println("ch ["+i+"] : "+ch[i]);
		
	
	}

}
