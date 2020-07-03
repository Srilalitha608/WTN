package com.wipro.polymorphism;
public class Polymorphism1 
{
	public static void main(String[] args) 
	{
		Apple a=new Apple("apple","sweet",10);
		Orange o=new Orange("orange","sour",20);
		a.eat();
		o.eat();
	}
}
