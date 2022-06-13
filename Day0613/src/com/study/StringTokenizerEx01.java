package com.study;
/*
 * 	java.util 패키지에 포함
 * "2022/06/13" 이라는 문자열을 delim(구분자들 /로)각각 2022,06,13으로 분리할때 사용함
 * 	각각의 문자열을 토큰이라고 함
 * 
 */
import java.util.*;
public class StringTokenizerEx01(String str, String delim) {
	StringTokenizer st;
	System.out.println("str + "+str);
	st = new StringTokenizer(str,delim);
}
public void print(){
	System.out.println("token count : "+st.countTokens());
	while (st.hasMoreTokens()) {
		String token = st.nextToken();
		System.out.println(token);
	
}
	public static void main(String[] args) {
		
//		st = new StringTokenizer(str, delim);
		StringTokenizer st1 = new StringTokenizer("Happy Day");
		st1.print();
		StringTokenizer st2 = new StringTokenizer("2022/06/13 ","/");
		st2.print();
		
		
	}

}
