package com.wipro.polymorphism;
public class Orange extends Fruit
{
	Orange(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println(name+" "+taste);
	}
}
