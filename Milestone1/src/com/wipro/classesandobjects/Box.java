package com.wipro.classesandobjects;

public class Box 
{
	double length,breadth,height;
	Box(double length,double breadth,double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	void display()
	{
		System.out.println(length*breadth+height);
	}
	public static void main(String[] args) 
	{
		Box o=new Box(2.3,3.4,4.5);
		o.display();
	}
}
