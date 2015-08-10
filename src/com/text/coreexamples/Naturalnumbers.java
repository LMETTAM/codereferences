package com.text.coreexamples;

public class Naturalnumbers {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 10; i++) {
			if (i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		System.out.println("The sum of first below 10: " + sum);
		sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		System.out.println("The sum of second below 1000: " + sum);

	}


}
