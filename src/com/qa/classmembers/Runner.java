package com.qa.classmembers;

public class Runner {
	
public static void main(String[] args) {
	int Phys       = 148;
	int Chem       = 100;
	int Bio        = 130;
	int Total      = Phys + Chem + Bio;
	int Percentage = Total * 100/450;
	String message1= "Physics mark:";
	String message2= "Chemistry mark:";
	String message3= "Biology mark:";
	String message4= "Total:";
	String message5= "Percentage:";
	
		System.out.print(message1);System.out.println(Phys);
		System.out.print(message2);System.out.println(Chem);
		System.out.print(message3);System.out.println(Bio);
		System.out.print(message4);System.out.println(Total);
		System.out.print(message5);System.out.println(Percentage);
	
	
			
	
	
}

}
