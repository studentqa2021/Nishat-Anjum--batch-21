package com.testing;

import com.generic.Newbee;

public class NewbeeTest {
	
public static void main(String[] args) {
	
	
	Newbee obj=new Newbee();//nonstatic;need to create obj
	obj.getSalary();
	obj.getMoney();
	Newbee.getIncome();
	Newbee.getValue();//static return mehod//o need to create obj
	obj.getText(5,8.8);
}


	
}
