package com.wipro.polymorphism;
public class Fruit 
{
	String name,taste;
	int size;
	 void Fruit(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println(name+""+taste);
	}
}
