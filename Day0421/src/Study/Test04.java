package Study;
import java.util.*;

public class Test04 {
	/*
	 *	임의의 정수로 돈의 금액을 입력받아, 오만원권, 만원권, 오천원권, 천원권, 오백원, 백원, 50원
	 *10원 짜리, 일원짜리 동전 몇개로 변환되는지를 프로그램으로 구 
	 *  "금액을 입력하시오"
	 *  입력금액 : 65376
	 */

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int a, om, m, oc, c, b, ob, os, s, i;
	  
	  
	  
	  System.out.println("금액을 입력 : ");
	  a = sc.nextInt();
	  
	  if (a > 50000) {
		  om = a / 50000;
		  m = (a-50000 * om)/10000;
		  oc = (a-(50000*om)-(10000*m))/5000;
		  c = (a-(50000*om)-(10000*m)-(5000*oc))/1000;
		  ob = (a-(50000*om)-(10000*m)-(5000*oc)-(1000*c))/500;
		  b = (a-(50000*om)-(10000*m)-(5000*oc)-(1000*c)-(500*ob))/100;
		  os = (a-(50000*om)-(10000*m)-(5000*oc)-(1000*c)-(500*ob)-(100*b))/50;
		  s = (a-(50000*om)-(10000*m)-(5000*oc)-(1000*c)-(500*ob)-(100*b)-(50*os))/10;
		  i = (a-(50000*om)-(10000*m)-(5000*oc)-(1000*c)-(500*ob)-(100*b)-(50*os)-(10*s));
		  
		  System.out.println("돈의 갯수는 5만원권 "+om+"개 만원권 "+m+"개 5천원권 "+oc+"개 천원권 "+c+"개 오백원 "+ob+"개 백원 "+b+"개 오십원 "+os+"개 십원 "+s+"일원은 "+i+"개 입니다.");
	  }else {
		  System.out.println("5만원 이상으로 부탁드립니다.");
	  }
		
		
	  
		

	}

}
