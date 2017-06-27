package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class TimeTransfer{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.print("초를 입력하세요.");
		int second=s.nextInt();
		int hour = second/3600;
		int ssecond = second%3600;
		int minute = ssecond/60;
		int tsecond = ssecond%60;
		System.out.print(String.format("%d는  %d 시간 %d 분 %d초 ",second,hour,minute,tsecond));
  
		
	}
}
