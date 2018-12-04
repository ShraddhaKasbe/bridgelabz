package Functional_Programs;

import java.util.Random;
import java.util.Scanner;

public class HeadsAndTails 
{
	public static void calPercent(int num)
	{
		int head=0,tail=0;
		Random random=new Random();
		for(int i=0;i<=num;i++)
		{
			if(random.nextDouble()<0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}	
	
		}
			double head_percent=(head*100)/num;
			double tail_percent=100-head_percent;
			System.out.println("Head Percent:"+head_percent);
			System.out.println("Tail Percent:"+tail_percent);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of times to flip a coin");
		int num=sc.nextInt();
		calPercent(num);
		
	}

}
