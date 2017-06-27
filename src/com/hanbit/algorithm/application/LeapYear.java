package com.hanbit.algorithm.application;

/*
연도를 4로 나눈 값이 0이면 윤년일 수 있다.
그러나 해당 연수가 100으,로 나누어 떨어지면 평면이다
2000년은 4로 나누어떨어져 윤년일 수 있지만
다시 100으로 나누어 떨어져 평년이다
평년이라해도 400으로 나눠 떨어지면 윤년이다.
*/
import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.print("연도입력하세요.");
		int year = s.nextInt();
		String result="윤년이 아닙니다";
	if(year%4==0 && !(year%100==0)){
		result="윤년입니다";
	}else if(year%400==0){
		result="윤년입니다";
	}
	System.out.print(result);
	}
}
