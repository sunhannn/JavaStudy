package com.study;

public class TreadEx01 implements Runnable {
	   private int[] temp;

	   public TreadEx01() {

	      temp = new int[10];
	      for (int start = 0; start < temp.length; start++) {
	         temp[start] = start;
	      }
	   }

	   @Override
	   public void run() {
	      for (int start : temp) {

	         try {
	            Thread.sleep(1000);// 속도1000이면 1초 10000이면 10초
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	         System.out.printf("스레드 이름 : %s", Thread.currentThread().getName());
	         System.out.printf("temp value : %d\n", start);

	      }

	   }

	   public static void main(String[] args) {

	      Thread te2 = new Thread();
	      Thread t = new Thread(te2, "헤헤헤");

	      t.start();// 시작메소드 호출

	   }

	}