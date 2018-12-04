package Functional_Programs;

import java.util.Scanner;

public class PowerOfTwo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the power limit");
		int num=sc.nextInt();
		int power=1;
		System.out.println("Powers of 2 that are less than 2^"+num);
		for(int i=0;i<=num;i++)
		{
			
			System.out.println("2^"+i+" = " + power);
		    power=power*2;
			
		}
		sc.close();
	}

}


