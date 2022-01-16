package com.generic;

public class ArrayDuplicate {
	//we find array duplicate here but it's not standard coding
	//standard coding is doing dynamic coding by using parameter method in framework and change the value in main method
	
	static int[]myArray= {2,3,3,4,5,6,6};
	
	public void getDuplicate() {
		
		for (int i=0; i<myArray.length;i++) {//1st loop=0
			for (int j=(i+1);j<myArray.length;j++) {//2nd loop
				
			if(myArray[i]==myArray[j]) {
				System.out.println("found my duplicate value="+myArray[j]);
				System.out.println(myArray[i]+"===="+myArray[j]);
	}
	
		
		} 
	
		
		   }	
		}
	public static void main(String[] args) {
		ArrayDuplicate obj= new ArrayDuplicate();
		obj.getDuplicate();
	
			
		//	System.out.println("my array value="+myArray[i]);
			
	}		
	}


