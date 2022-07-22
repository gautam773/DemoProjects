package com.gtmrockz;

public class DemoClass1 
{
	public static void main(String[] args) 
	{
	
		String s1="Gowtham";
		String s2="ham";
		
		boolean flag = false;
		
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=0;j<s2.length()-1;j++)
			{
				
				if(s1.charAt(i) == s2.charAt(j))
				{
					if(s1.charAt(i+1) == s2.charAt(j+1))
					{
						flag = true;
					}
					else
					{
						flag = false; 
					}
				}
				else
				{
					flag = false;
				}
			}
				
		}
		if(flag)
		{
			System.out.println(s2+" is Substring of "+s1);
		}
		else
		{
			System.out.println(s2+" is not a Substring of "+s1);
		}
	}
	
	

}
