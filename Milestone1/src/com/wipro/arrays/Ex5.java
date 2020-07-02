package com.wipro.arrays;
import java.util.Scanner;
public class Ex5 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The largest 2 numbers are:"+a[i-1]+","+a[i-2]);
		System.out.println("The smallest 2 numbers are:"+a[0]+","+a[1]);
	}
}
