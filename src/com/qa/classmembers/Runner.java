package com.qa.classmembers;

public class Runner {
	public static int phys;
	public static int chem;
	public static int bio;
	public static int total;
	
public static void main(String[] args) {
	phys       = 148;
	chem       = 100;
	bio        = 130;
	total      = phys + chem + bio;
	int Percentage = Total * 100/450;
	display();
	}

public static void display () {
	System.out.println("Result in Physics:"+ phys+" Result in Chemistry:"+
			 chem+ " Result in Biology:"+ bio+" Total: "+ phys + chem + bio );
}

}
