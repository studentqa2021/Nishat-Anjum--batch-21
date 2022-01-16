package com.generic;

public class Swapvalue {
 void getSwap(int a,int b)
	 {
	System.out.println("a value before swap="+a);
	System.out.println("b value before swap="+b);
	a=(a+b);
	b=(a-b);
	a=(a-b);
	System.out.println("a value after swap="+a);
	System.out.println("b value after swap="+b);
	
}
 public static void main(String[] args) {
	Swapvalue obj=new Swapvalue();
	obj.getSwap(10, 20);
}
 
 
}
