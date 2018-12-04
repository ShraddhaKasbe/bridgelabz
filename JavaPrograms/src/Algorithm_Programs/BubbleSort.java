package Algorithm_Programs;

import java.util.Scanner;

public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements before Bubble Sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j-1]>a[j])
				{ 
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Elements after Bubble Sort");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
