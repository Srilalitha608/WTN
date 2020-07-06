package com.wipro.wrapperclasses;
public class Employee implements Cloneable
{
		private String name;		
		public Employee(String name) 
		{
			this.name = name;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public Employee clone() 
		{
			try 
			{
				return (Employee) super.clone();
			} 
			catch (CloneNotSupportedException e) 
			{
				System.out.println("Cloning Not Allowed");
				return this;
			}		
		}
}

