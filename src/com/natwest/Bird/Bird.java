package com.natwest.Bird;

public class Bird {
	private String name;
	private String colour;
	private double weight;


public Bird (String name, String colour, double weight) {
	super();
	this.name = name;
	this.colour = colour;
	this.weight = weight;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getColour() {
	return colour;
}


public void setColour(String colour) {
	this.colour = colour;
}


public double getWeight() {
	return weight;
}


public void setWeight(double weight) {
	this.weight = weight;
}
}
