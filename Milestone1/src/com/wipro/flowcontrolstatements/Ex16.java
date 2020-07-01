package com.wipro.flowcontrolstatements;

public class Ex16 {

	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int r=0,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
