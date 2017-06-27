package com.hanbit.algorithm.calculator;

import java.util.Scanner;
import java.io.*;
public class Calculator{
  public static void main(String[] args){
      Scanner s= new Scanner(System.in);
	  System.out.print("enter num1\n");
	  int a=s.nextInt();
	  System.out.print("enter opcode\n");				
	  String opcode=s.next();
	  System.out.print("enter num2\n");
	  int b=s.nextInt();
	  int result=0;
      if(opcode.equals("+")){
	      
		  result=a+b;
	  }else if(opcode.equals("-")){
		  
	  
		  result=a-b;
	  }else if(opcode.equals("*")){
		  
	  
		  result=a*b;
	  }else{
		  
	 
		  result=a/b;
	  }
	  System.out.print(a+opcode+b+"="+result+"\n");
	  System.out.print(String.format("%d %s %d =%d",a,opcode,b,result));
	  File f1=new File("C:\\Users\\1027\\Hello9.java");
	  File f2=new File("C:\\Users\\1027\\Hello10.java");
	  System.out.print(f1.renameTo(f2));	
     

  }
}