package Study;
import java.io.*;
public class Suiyoubi04 {
	public static String  getString (String str) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str + " : ");
		String imsi = br.readLine();
		return imsi;
		
	}

	public static void main(String[] args) throws IOException{
		

		String name = getString("이름");
		System.out.println(name+"님 안녕하세여");
		
		
		
		
		
	}

}
