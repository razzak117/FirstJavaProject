package com.zahir.basic;

public class swapingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
				
		/*int temp=x;
		
		x=y;
		y=temp;*/
		
		// Second Way
		
		x=x+y; 	//30
		y=x-y;	//10
		x=x-y;	//20
		
		System.out.println("X="+x+", Y="+y);
	}
}
