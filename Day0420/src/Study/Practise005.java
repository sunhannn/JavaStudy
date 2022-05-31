package Study;
import java.io.*;

public class Practise005 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int y;
		String s;
		
		System.out.println("년도를 입력세요  : ");
		y = Integer.parseInt(br.readLine());
		
		
		s = ((y%4==0)&&(y%100 != 0)||(y%400 == 0))? "윤년" : "평년";
		
		System.out.println(y+"==> "+s);
		

	}

}
