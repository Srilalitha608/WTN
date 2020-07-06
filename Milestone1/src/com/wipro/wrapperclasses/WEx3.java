package com.wipro.wrapperclasses;
import java.util.Scanner;
public class WEx3 
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
        sc = new Scanner(System.in);	
		int input = sc.nextInt();	
		String output = String.format("%8s", Integer.toBinaryString(input)).replace(' ', '0');
		System.out.println(output);
	}
}
