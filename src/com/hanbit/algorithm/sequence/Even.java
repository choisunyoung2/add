package com.hanbit.algorithm.sequence;

public class Even{
	public static void main(String[] args){
		int arr[]=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++){
		arr[i]=i+1;
		}
		for(int j=0;j<arr.length;j++){
			if(arr[j]%2==0){
				sum+=arr[j];
			}
		
		}
		System.out.print("even sum : " +sum);
	}
}