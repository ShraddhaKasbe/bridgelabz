package Practice;

import java.util.Scanner;

public class FlipCoin 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times to flip the coin:");
		int num=sc.nextInt();
		int head=0,tail=0;
		for(int i=0;i<=num;i++)
		{
			if(Math.random()<0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}
		}
		System.out.println("Number of heads:"+head);
		System.out.println("Number of tails:"+tail);
		double head_Per=head*100/num;
		double tail_per=100-head_Per;
		System.out.println("Head Percent="+head_Per);
		System.out.println("Tail Percent="+tail_per);
		
		
	}

}
