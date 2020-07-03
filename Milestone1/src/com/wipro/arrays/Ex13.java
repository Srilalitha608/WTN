package com.wipro.arrays;
public class Ex13 
{
	public static void main(String[] args) 
	{
		int n=args.length;
		int[][] a=new int[2][2];
		if(n<4)
			System.out.println("Please enter 4 numbers");
		else if(n==4)
		{
			int i,j,k=0;
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("Given array:");
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Reversed array:");
			for(i=1;i>=0;i--)
			{
				for(j=1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
