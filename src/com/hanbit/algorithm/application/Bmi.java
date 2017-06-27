package com.hanbit.algorithm.application;

import java.util.Scanner;
public class Bmi{
  public static void main(String[] args){
      Scanner s= new Scanner(System.in);
	  System.out.print("신장:enter your tall \n");
	  Double tall=s.nextDouble();
	  System.out.print("몸무게: enter your weight\n");				
	  Double weight=s.nextDouble();
	  Double bmi=weight/(tall*tall);
	  String weight_condition; 
	  if(bmi<18.5){
		   weight_condition="low weight";
	  }else if(bmi<25){
		 weight_condition="normal";
	  }else if (bmi<30.0){
		  weight_condition="heavy weight";
	  }else{
		 weight_condition="pig";
	  }
      System.out.print("my bmi:"+bmi+"="+weight_condition);
     

  }
}