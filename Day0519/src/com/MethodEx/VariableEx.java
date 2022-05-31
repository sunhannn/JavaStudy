package com.MethodEx;

public class VariableEx {
	/*
	 *	메소드 정의시 통일된 인자의 자료형에 '...'	라고 명시하므로 이를 통해 메소드를 수행하는데
	  *		필요한 인자의 수를 유연(내부적으로 배열화 작업을 자동으로 해줌)하게 구현할 수 있다.
	  *메소드 오버로딩
 * 
 * -동일한(하나의) 클래스에서 같은 이름을 가진 메소드가 여러 개 정의되는 것을 의미함
 * -같은 이름의 메소드에 인자(매게변수)가 다른 경우
 * -인자가 다르다는 것은 인자의 개수가 다르거나, 인자의 자료형이 다르거나, 인자의 수가 다른것을 의미함
 * -같은 목적으로 비슷한 동작을 수행하는 메소드 들을 모아 이름을 같게 만들어 일관성을 유지하기 위함
 *
 * 접근 제한자      반환형      메소드명(자료형 인자, 자료형인자, ...)
 *       1. 접근제한자와 반환형은 상관 없음.
 *       2. 메소드의 이름은 반드시* 같아야 한다.(동일)
 *       3. 자료형이나 인자의 개수는 반드시 다르게 해야함
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
public void argsTest(String ...n) {
	for (int i = 0;i<n.length;i++) {
		System.out.println("n ["+i+"] : "+n[i]);
		
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableEx ve = new VariableEx();		
		
		ve.argsTest("a","b","c");
		ve.argsTest("100", "600", "1000");
	}

}
