package com.wipro.inheritance;
public class Main 
{
	public static void main(String[] args) 
	{
		Animal oa=new Animal();
		Bird ob=new Bird();
		oa.sleep();
		oa.eats();
		ob.sleep();
		ob.eats();
		ob.fly();
	}
}
