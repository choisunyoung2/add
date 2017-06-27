package com.hanbit.algorithm.application.grade;

import java.util.Scanner;
public class SSN{
	 public static void main(String[] args){
		Scanner ssn= new Scanner(System.in);
		System.out.print("주민번호를 입력하세요.");
		String s=ssn.next();
		String gender="";
		String sYear=s.substring(0,2);
		int year=Integer.parseInt(sYear);
		int age=0;
			
	
		char ch = s.charAt(7);
		switch(ch){
			case '1': 
			gender="m";
			age=100-year+18;
			break;
			case '3':
			gender="m";
			age=18-year;
			break;
			case '2': 
			gender="f";
			age=100-year+18;
			break;
			case '4':
			gender="f";
			age=18-year;
			break;
			case '5': 
			gender="m_foreign";
			case '6':
			gender="f_foreign";
			break;
			default:
			gender="잘못 입력했어요";
			return;
			
		}
		
		System.out.println("*****************");
		System.out.println("이름 나이  성별");
		System.out.println(String.format("님의 성은 %s 이며 나이는 %d입니다",gender,age)); 
		
	 }
}
		