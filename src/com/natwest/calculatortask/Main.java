package com.natwest.calculatortask;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Calculator calc = new Calculator();
	Scanner scanner = new Scanner (System.in); 
	
	System.out.println("which method would you like to use?");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("0.Quit");
	
	int operation = scanner.nextInt();
	switch(operation) {
	
	case 1:
		System.out.println("Enter your first number");
		double number1 = scanner.nextDouble();
		System.out.println("Enter your second number");
		double number2 = scanner.nextDouble();
		System.out.println(calc.addTwo(number1, number2));
		break;
	
	case 2:
		System.out.println("Enter your first number");
		number1 = scanner.nextDouble();
		System.out.println("Enter your second number");
		number2 = scanner.nextDouble();
		System.out.println(calc.subTwo(number1, number2));
		break;
	
	case 3:
		System.out.println("Enter your first number");
		number1 = scanner.nextDouble();
		System.out.println("Enter your second number");
		number2 = scanner.nextDouble();
		System.out.println(calc.divTwo(number1, number2));
		break;
	
	case 4:
		System.out.println("Enter your first number");
		number1 = scanner.nextDouble();
		System.out.println("Enter your second number");
		number2 = scanner.nextDouble();
		System.out.println(calc.mulTwo(number1, number2));
		break;
		
	case 0:
		System.out.println("Quitting");
		
	default:
		System.out.println("invalid choice");
	break;
	}
	
	}
}