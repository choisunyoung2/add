package com.hanbit.algorithm.sequence;

import java.util.Scanner;
public class ArithmeticSequence{
	public static void main(String[] args){
		//Scanner s=new Scanner(System.in);
		//System.out.print("수를 입력하세요\n");
		//int j=s.nextInt();
		
		int j=1;
		for(;j<10;){	
            int i=2;		
			for(;i<6;){ 			    
			      System.out.print(i+"*"+j+"="+(i*j)+"\t");
				  i++;
			}
			System.out.print("\n");
			j++;
		
			
		}
		System.out.print("\n");
		System.out.print("\n");
		j=1;
		for(;j<10;){	
            int i=6;		
			for(;i<10;){ 			    
			      System.out.print(i+"*"+j+"="+(i*j)+"\t");
				  i++;
			}
			System.out.print("\n");
			j++;
		
			
		}
		
	}
}