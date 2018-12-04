package Functional_Programs;

import java.util.Scanner;

public class Factors 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		System.out.println("Prime factorization of "+num+" is:");
		
		for(int i=2;i*i<=num;i++)
		{
			while(num%i==0)
			{
				System.out.print(" "+i);
				num=num/i;
			}
			
		}
		
	}

}
