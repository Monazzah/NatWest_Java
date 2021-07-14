package PracticeLessons;

import java.time.LocalDate;

public class MyClass {

	public static void main(String[] args) {
		
		//System.out.println("Hooray my first java app");
		//int number = 100;
		//String brand = "Nazscode";
		
		String name = new String ("Nazscode");
		System.out.println (name.toUpperCase());
		
		int a = 10;
		int b =a;
		a = 100;
		System.out.println(" a = " + a + " - b " + b);
		
		Person alex = new Person (name="alex");
		Person mariam = alex;
		System.out.println("before changing alex");
		System.out.println(alex.name + " " + mariam.name);
		
		alex.name = "Alexander";
		System.out.println("after changing alex");
		System.out.println(alex.name + " " + mariam.name);
		
		
		 }
		static class Person {
		String name;
		
		Person (String name) {
			this.name = name;
			
		}
			
		}
}
