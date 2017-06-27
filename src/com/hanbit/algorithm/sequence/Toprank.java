package com.hanbit.algorithm.sequence;


import java.util.Scanner;
public class Toprank{
	public static void main(String[] args){
		int sum=0,avg=0,max=0,gsum=0, min=0;
		Scanner s= new Scanner(System.in);
		System.out.print("1반의 총학생수는?");
		sum = s.nextInt();
		int[] student=new int[sum];
		
		for(int i=0;i<sum;i++){
		System.out.print("학생의 점수는?");
		student[i] = s.nextInt();
		}
		for(int i=0;i<student.length;i++){
			gsum +=student[i];
		}
		avg = gsum/sum;
		max=student[0];
		for(int i=1;i<student.length;i++){
		   if(student[i]>student[i-1] && student[i]>max){
			   max=student[i];
		   }	   
		}
		min=student[0];	
		for(int i=1;i<student.length;i++){
		   if(student[i]<student[i-1] && student[i]<max){
			   min=student[i];
		   }	   
		}
	
		
		System.out.print("1반의 평균점수는 "+avg);
		System.out.print("\t 1반의 최대점수는 "+max);
		System.out.print("\t 1반의 최소점수는 "+min);
	}
}