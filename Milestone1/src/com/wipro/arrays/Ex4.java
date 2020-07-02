package com.wipro.arrays;
import java.util.Scanner;
public class Ex4 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		char c;
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			c=(char)a[i];
			System.out.print(c+"\t");
		}
	}
}
