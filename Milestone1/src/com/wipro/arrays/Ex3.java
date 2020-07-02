package com.wipro.arrays;
import java.util.Scanner;
public class Ex3 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i,c=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==key)
				c=i;
		}
		if(c==0)
			System.out.println("-1");
		else
			System.out.println(c);
	}
}
