package com.hanbit.algorithm.grade;

import java.util.Scanner;
public class GradeReport{
	 public static void main(String[] args){
		
		 Scanner s= new Scanner(System.in);
		int total=0,avg=0, kor=0, math=0,eng=0;
		System.out.print("이름을 입력하세요.");
		String name = s.next();
		System.out.print("국어성적을 입력하세요.");
		kor = s.nextInt();
		System.out.print("영어성적을 입력하세요.");
		eng = s.nextInt();
		System.out.print("수학성적을 입력하세요.");
		math = s.nextInt();
		total=kor+math+eng;
		avg=total/3;
		String result="";
		if(avg>=90){
			result="수";
		}else if(avg>=80){
			result="우";
		}else if(avg>=70){
			result="미";
		}
		else if(avg>=60){
			result="양";
		}
		else{
			result="가";
		}
		System.out.println("***************");
		System.out.print("이름      "); System.out.print("총점  ");
		System.out.print("평균"); System.out.print("등급");
		System.out.println("---------------------------------");
		System.out.print("|"); System.out.print(" "+name+" "); System.out.print("|"); System.out.print(total); System.out.print("|");
		System.out.print(avg); System.out.print("|"); System.out.print(result); System.out.print("|");
		System.out.println("***************");
		System.out.print(String.format("%s 님의 성적은 %s 입니다",name,result));
	 }
}