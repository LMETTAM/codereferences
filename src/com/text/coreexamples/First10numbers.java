package com.text.coreexamples;

public class First10numbers {

public static void main(String[] args){
		
	// initialize integer variable
		int bag = 0;
		
		/*for(int i=1; i<=10;i++){
			
			bag = bag+i;
		}*/
		while(bag < 10){
			System.out.println("current value: " + bag);
			bag++;
		}
		
		System.out.println(bag);
	}
}
