package com.hanbit.algorithm.matrix;

import java.util.Scanner;
public class Matrix{
	public static void main(String[] args){

		/*String[][] mtx1= {
			{"good morning","good","bye"},
			{"mr","mrs","my"},
			{"sun","young","choi"}};
		System.out.print(mtx1[0][0]+"\t"+mtx1[1][0]+"\t"+mtx1[2][1]+"\n");*/
		
		int[][] mtx = new int[5][4];
		for(int i=0;i<mtx.length;i++){
			System.out.println("");
			for(int j=0;j<mtx[i].length;j++){
			    System.out.printf("[%d,%d]",i,j);			
		    }
		}
		
	}
}