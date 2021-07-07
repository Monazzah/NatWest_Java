package com.qa.classmembers;

public class Runner{
	public static int phys;
	public static int chem;
	public static int bio;
	public static int total;
	public static int perc;
	
public static void main(String[] args) {
	phys       = 39;
	chem       = 10;
	bio        = 13;
	total      = phys + chem + bio;
	perc       = total * 100/450;
	
	System.out.println("Result in Physics:"+ phys+" Result in Chemistry:"+
			 chem+ " Result in Biology:"+ bio+" Total: " + total+ " Percentage score:"+ perc);
	if(perc<60) {
		System.out.println("Fail");
	}
}

public static void display () {
	System.out.println("Result in Physics:"+ phys+" Result in Chemistry:"+
			 chem+ " Result in Biology:"+ bio+" Total: "+ phys + chem + bio );
	
}// exam results class


}
