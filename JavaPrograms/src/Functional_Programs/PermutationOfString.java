package Functional_Programs;

import java.util.Scanner;

public class PermutationOfString 
{
	
	public static void permute(char c[],int l)
	{
		if(l==c.length)
		{
			for(int i=0;i<c.length;i++)
			System.out.print(c[i]);
			System.out.println();
		}
		
		else
		{
			for(int i=l;i<c.length;i++)
			{
				char temp=c[l];
				c[l]=c[i];
				c[i]=temp;
				
				permute(c,l+1);
				
				temp=c[l];
				c[l]=c[i];
				c[i]=temp;		
			}
		}
	}
		
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		System.out.println("The permutation of String "+s+" is:");
		char c[]=s.toCharArray();
		permute(c,0);
		
		
	}

}
