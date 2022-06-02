package com.except2;

public class ExceptionTset {

	public static void main(String[] args) {
		try {
			startInstall(); // 프로그램 설치 준비
			copyFiles(); // 파일 복사
		}catch(SpaceException e) {
			System.out.println("공간이 부족하니 충분히 확보 바랍니다.");
			System.out.println("확보 했으면 다시 설치 바랍니다.");
		}catch (MemoryException me) {
			System.out.println("메모리가 부족하니 충분히 확보 바랍니다.");
		}finally {
			deleteTempFiles();
		}
		
		
		
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		
		if(!enoughSpace()) {	// 프로그램 설치시 공간이 부족한 경우
			throw new SpaceException("설치할 공간이 매우 부족합니다.");
			
		}
			if (!enoughMemory()) {
				throw new MemoryException("메모리가 매우 부족합니다.");
					
				
			}
		
	}
	static boolean enoughSpace() {
		return false;
		
}	
	static boolean enoughMemory() {
		return true;
	}
	static void copyFiles() { // 파일 복사
		
	}
	static void deleteTempFiles() { // 임시 파일 삭제
		
	}
}
