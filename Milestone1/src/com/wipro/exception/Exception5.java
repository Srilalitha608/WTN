package com.wipro.exception;
public class Exception5 
{
	public static void main(String[] args) throws Exception
	{
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		if (age < 18 || age >= 60)
		System.out.println("Name: " + name + " Age: " + age);
		else
			System.out.println("Invalid age");
	}
}
