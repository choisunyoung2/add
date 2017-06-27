package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class TaxCalCulator{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.print("이름을 입력하세요.");
		String name=s.next();
		System.out.print("연봉을 입력하세요.");
		int salary=s.nextInt();
	    Double taxrate= 0.097;
		Double result= salary*taxrate;
	    System.out.print(String.format("연봉을"+"%d"+ "받으시는"+"%s"+"님이 납부할 세금은"+ "%f 만원입니다",salary,name,result));
	}
}
