package Study;

public class Test002 {

	public static void main(String[] args) {
		

		int x =10;
		int y = ++x;
		
		int i = 5;
		i++;// i = i+1 동일한 의미이다. sum=sum+1 (후위형)
		
		System.out.println(i);// i=6
		
		i = 5;
		System.out.println(i);
		++i;//(전위형)
		
		System.out.println(i);
		
		
		
	}

}
