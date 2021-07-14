package com.natwest.conditionals;

public class Person  {
	public String name;
	public String age;
	public String jobTitle;

public Person (String name, String age, String jobTitle) {
	this.name = name;
	this.age = age;
	this.jobTitle = jobTitle;
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
}
}