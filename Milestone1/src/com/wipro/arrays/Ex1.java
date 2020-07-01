package com.wipro.arrays;
import java.util.Scanner;
public class Ex1 
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		float avg=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("Sum="+sum+","+"Average="+avg);
	}
}
