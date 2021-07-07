package com.qa.classmembers;

public class calculator {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 6;	
		int sum = num1 + num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		System.out.println(sum);
		System.out.println(mul);
		
		if(num2 < num1) {
		System.out.println(div);
		} else if (num2 > num1) {
		System.out.println("cannot be performed");
		}
		
		
	}
}
