package Rensyuu;
import java.util.*;
import java.util.logging.LogRecord;

public class Sung01 {
	
	int inwon;
	Record [] rec;
	
	public void set() {
		
		Scanner sc =new Scanner(System.in);
		
		do {
			System.out.println("인원 수 입력 : ");
			inwon = sc.nextInt();
			
		}while(inwon < 1 || inwon > 100);
		rec = new Record[inwon];
	}
	
	public void input();
	Scanner sc= new Scanner(System.in);
	

}
