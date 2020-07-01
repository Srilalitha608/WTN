package com.wipro.flowcontrolstatements;

public class Ex7 {

	public static void main(String[] args) 
	{
		String str=args[0];
		char c=str.charAt(0);
		char temp;
		if(c>='A'&&c<='Z')
		{
			temp=Character.toLowerCase(c);
			System.out.println(c+"->"+temp);
		}
		else if(c>='a'&&c<='z')
		{
			temp=Character.toUpperCase(c);
			System.out.println(c+"->"+temp);
		}
	}

}
