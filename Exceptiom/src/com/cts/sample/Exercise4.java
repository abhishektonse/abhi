package com.cts.sample;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child c = new Child();
       c.print();
       
	}

}

abstract class Parent{
	int b = 8;
	abstract void print();
	
	Parent(){
		print();
	}
}

class Child extends Parent{
	int a = 6;
	 void print() {
		 System.out.println("Child class"+ a);
	  }
				
}