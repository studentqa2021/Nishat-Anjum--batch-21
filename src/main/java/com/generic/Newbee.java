package com.generic;

public class Newbee {
  public void getSalary(){
	  
	System.out.println("void method");
	}
  public String getMoney() {
	  System.out.println("return method");
	  return "Ayyash";
  }
  public static void getIncome() {
	  System.out.println("static void");
  }
  public static int getValue() {
	  System.out.println("static return");
	  return 1000;
  }
  public void getText (int a,double b) {//a=5,b=8//value in method level
	  
	System.out.println(a);
	System.out.println(b);
	System.out.println(a+b);
  }
}

