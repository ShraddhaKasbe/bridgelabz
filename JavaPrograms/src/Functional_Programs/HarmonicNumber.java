package Functional_Programs;

import java.util.Scanner;

public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Harmonic value:");
		int num=sc.nextInt();
		double sum=0;
		for(double i=1;i<=num;i++)
		{
			sum=sum+(1/i);
			if(i==1)
			System.out.print("1 + ");
			else if(i==num)
			System.out.print("1/"+i);
			else
			System.out.print("1/"+i+" + ");
			System.out.print("");
		}
		System.out.println();	
		System.out.println("THE SUM OF THIS SERIES IS:="+sum);
		
	}

}
