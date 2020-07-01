package com.wipro.flowcontrolstatements;

public class Ex1b {

	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int r=0;
		while(b!=0)
		{
			r=b%10;
			break;
		}
		if(r==a)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
