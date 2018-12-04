package Algorithm_Programs;

import java.util.Scanner;

public class FindNumber
{
	public static void yourNumber(int arr[])
	{
		int low=0;
		int high=arr.length-1;
		System.out.println("Think any number between "+low+" and "+ high);
		binarySearch(low, high);
	}
	static  void binarySearch(int low,int high)
	{
		
		Scanner sc=new Scanner(System.in);
		int mid=(high+low)/2;
		if(high-low==1)
		{
			System.out.println("your number is "+mid);
			System.exit(0);
		}
		System.out.println("Is it less than "+mid);
		boolean reply=sc.nextBoolean();
		if(reply)
			binarySearch(low,mid);
		else 
			binarySearch(mid, high);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int k=sc.nextInt();
		int n=(int) Math.pow(2, k);
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=i;
		}
		yourNumber(arr);
	}
}
