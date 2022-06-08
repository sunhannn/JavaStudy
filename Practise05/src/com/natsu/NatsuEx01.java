package com.natsu;

import java.util.*;

public class NatsuEx01 {

	public class LinkedListEx {

		   private final String colors1[] = { "검정", "노랑", "녹색", "파랑", "주황", "연두" };
		   private final String colors2[] = { "초록", "빨강", "흰색", "남색", "보라" };

		   // 생성자
		   public LinkedListEx() {

		      List<String> list1 = new LinkedList<String>();
		      List<String> list2 = new LinkedList<String>();

		      for (String color : colors1) {
		         list1.add(color);
		      }
		      for (String color : colors2) {
		         list2.add(color);
		      }

		      list1.addAll(list2);

		      printList(list1);

		      removeItems(list1, 4, 7);// index 4~7 전까지 삭제

		      printList(list1);
		      // printList(list2); //list1.addAll 사용하면 list1값만 출력해도 나옴.
		      printReverseList(list1);
		   }

		   // 자료 제거
		   private void removeItems(List<String> list, int start, int end) {
		      list.subList(start, end).clear();
		   }

		   // 역순 출력

		   private void printReverseList(List<String> list) {
		      ListIterator<String> it = list.listIterator(list.size());

		      while (it.hasPrevious())
		         System.out.printf("%s\t", it.previous());
		   }

		   // 자료 출력 메소드
		   public void printList(List<String> list) {
		      for (String color : list) {
		         System.out.printf("%s\t", color);
		      }
		      System.out.println();
		   }

		   public void main(String[] args) {
		      LinkedListEx le = new LinkedListEx();

		   }

		}
}