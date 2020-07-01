package com.wipro.flowcontrolstatements;

public class Ex12 {

	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}

}
