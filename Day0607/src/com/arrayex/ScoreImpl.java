package com.arrayex;

import java.util.*;






public class ScoreImpl implements Score {
	
		private Scanner sc = new Scanner(System.in);
		private List<ScoreVo> list = new ArrayList<ScoreVo>();
	
	
	
	
	@Override
	public void insert() {
		System.out.println("\n 자료 등록 ");
		String hak;
		System.out.println("학번 입력 : ");
		hak = sc.next();
		
		ScoreVo temp = readScore(hak);
		
		if(temp != null) {
			System.out.println("이미 등록된 학번입니다.");
			return ;
		}
		
		ScoreVo vo = new ScoreVo();
		vo.setHak(hak);
		System.out.println("이름 입력 : ");
//		String name = sc.next();
		vo.setName(sc.next());
		System.out.println("생년 월일 : ");
		vo.setBirth(sc.next());
		System.out.println("국어 점수 : ");
		vo.setKor(sc.nextInt());
		System.out.println("영어 점수 : ");
		vo.setEng(sc.nextInt());
		System.out.println("수학 점수 : ");
		vo.setMat(sc.nextInt());
		
		
		
		list.add(vo);
		System.out.println("자료 등록 완료!");
		
	}
		public ScoreVo readScore(String hak) {
			ScoreVo vo = null;
			
			for(ScoreVo temp : list) {
				if(temp.getHak().equals(hak)) {
					vo = temp;
					break;
				}
			}
			return vo;
		}
		
		
	

	@Override
	public void update() {
		
		System.out.println("\n자료 수정");
		String hak;
		System.out.println("수정할 학번입력 : ");
		hak = sc.next();
		
		ScoreVo vo = readScore(hak);
		if (vo == null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
			
		}
		System.out.println("이름 입력 : ");
		vo.setName(sc.next());
		System.out.println("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.println("국어 점수 : ");
		vo.setKor(sc.nextInt());
		System.out.println("영어 점수 : ");
		vo.setEng(sc.nextInt());
		System.out.println("수학 점수 : ");
		vo.setMat(sc.nextInt());
		
		System.out.println("수정 완료");
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listAll() {
		
		System.out.println("\n 전체 리스트 출력");
		Iterator<ScoreVo> it = list.iterator();
		
		while(it.hasNext()) {
			ScoreVo vo = it.next();
			System.out.println(vo);
		}
		
		
		
		
	}

	@Override
	public void serachName() {
		
		System.out.println("\n 이름 검색..");
		String name;
		System.out.println("검색할 이름 입력 : ");
		name = sc.next();
		
	}

	@Override
	public void searchHak() {
		System.out.println("\n 학번 검색 ..");
		String hak;
		System.out.println("검색할 학번 입력 : ");
		hak = sc.next();
		ScoreVo vo = readScore(hak);
		
		if (vo != null) {
			System.out.println(vo.getHak()+"\t");
			System.out.println(vo.getName()+"\t");
			System.out.println(vo.getBirth()+"\t");
			System.out.println(vo.getKor()+"\t");
			System.out.println(vo.getEng()+"\t");
			System.out.println(vo.getMat()+"\t");
			System.out.println(vo.getTot()+"\t");
			System.out.println(vo.getTot()/3);
		}
		
		System.out.println();
		
		
	}

}
