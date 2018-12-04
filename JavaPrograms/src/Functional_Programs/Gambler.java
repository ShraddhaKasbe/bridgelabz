package Functional_Programs;

import java.util.Scanner;

public class Gambler 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of times to play:");
		int num=sc.nextInt();
		System.out.println("Enter the available stake:");
		int stake=sc.nextInt();
		System.out.println("Enter the target to reach the goal:");
		int goal=sc.nextInt();
		int win=0;
		for(int i=0;i<num;i++)
		{
			int cash=stake;
		
		while(cash>0 && cash<goal)
		{
			if(Math.random()<0.5)
			{
				cash++;
			}
			else
			{
				cash--;
			}
		}
			if(cash==goal)
			{
				win++;
			}
		}	
			System.out.println("Number of wins:"+win);
			int percentOfWin=(win*100)/num;
			System.out.println("Percentage of wins:"+percentOfWin);
			int lossPercent=100-percentOfWin;
			System.out.println("Percentage of loss:"+lossPercent);
		}
		
	}


