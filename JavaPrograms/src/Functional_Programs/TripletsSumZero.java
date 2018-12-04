package Functional_Programs;

import java.util.Scanner;

public class TripletsSumZero
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		int sum=0;
		int a[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{ 
					sum=a[i]+a[j]+a[k];
					if(sum==0)
					{
						System.out.println("Triplets are:"+a[i]+","+a[j]+","+a[k]);
					}
				}
			}
		}
		
	}

}
