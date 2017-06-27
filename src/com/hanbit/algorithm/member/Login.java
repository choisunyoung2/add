package com.hanbit.algorithm.member;

import java.util.Scanner;
public class Login{
	public static final String USER_ID="choi";
	public static final String USER_PW="sun";
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("로그인");
		String id=s.next();
		System.out.print("암호");
		String pw=s.next();
		String r="";
		if(!id.equals(USER_ID)){
	      System.out.print("아이디 틀려요");
			r="not";	
		}else if(!pw.equals(USER_PW)){
          System.out.print("암호 틀려요");
			r="not";
		}else{ 
			r="welcome";
		}
		
		System.out.print("로그인되었습니다");
		
		
	}
}