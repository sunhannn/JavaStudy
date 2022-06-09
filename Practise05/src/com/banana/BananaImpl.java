package com.banana;
import java.util.*;

import com.mapex.mscore.ScoreVO;

import java.io.*;
class Mycomparator <T> implements Comparator<T>{
	public int compare (T o1, T o2) {
		BananaVO s1 = (BananaVO)o1;
		BananaVO s2 = (BananaVO)o2;
		
		int n = s1.getTot() - s2.getTot();
		
		if(n > 1) {
			return 1;
		}else if(n < 0) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class BananaImpl implements Score {

	 private Map<String, BananaVO> map;
	 
	 public BananaImpl() {
		 map = new HashMap<String,BananaVO>();
	 }
	
	
	
	@Override
	public int insert() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String hak;
		System.out.println("\n 학번 입력 : ");
		hak = br.readLine();
		
		if (map.containsKey(hak)) {
			System.out.println("이미 존재하는 학번입니다.");
			return 0;
		}
		BananaVO vo = new BananaVO();
		vo.setHak(hak);
		
		System.out.println("이름 입력 : ");
		vo.setName(br.readLine());
		
		System.out.println("국어 점수 : ");
		vo.setKor(Integer.parseInt(br.readLine()));
		
		System.out.println("영어 점수 : ");
		vo.setEng(Integer.parseInt(br.readLine()));
		
		System.out.println("수학 점수 : ");
				vo.setMat(Integer.parseInt(br.readLine()));
				
				map.put(hak, vo);
				
				System.out.println("입력 되었습니다.");
				return 1;
	}

	@Override
	public int update() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		
		String hak;
		System.out.println("\n 수정할 학번 입력 : ");
		hak = br.readLine();
		
		if (!map.containsKey(hak)) {
			System.out.println("존재하지 않는 학번입니다.");
			return 0;
		}
		BananaVO vo = new BananaVO();
		vo.setHak(hak);
		
		System.out.println("이름 입력 : ");
		//String name = br.readLine(); 똑같음
		vo.setName(br.readLine());
		
		System.out.println("국어 점수 : ");
		//int kor = Integer.parseInt(br.readLine());
		vo.setKor(Integer.parseInt(br.readLine()));
		
		System.out.println("영어 점수 : ");
		vo.setEng(Integer.parseInt(br.readLine()));
		
		System.out.println("수학 점수 : ");
		vo.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, vo);// map에 추가
		
		System.out.println("입력 되었습니다.");
		return 1;
	}

	@Override
	public int search() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
	}

	@Override
	public int delete() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeSort() {
		// TODO Auto-generated method stub

	}

}
