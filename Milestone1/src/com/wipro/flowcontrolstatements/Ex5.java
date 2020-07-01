package com.wipro.flowcontrolstatements;

public class Ex5 {

	public static void main(String[] args) 
	{
		String str=args[0];
		char c=str.charAt(0);
		if(c>=65&&c<=90 || c>=97&&c<=122)
			System.out.println("Alphabet");
		else if(c>=48&c<=57)
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}

}
