package Algorithm_Programs;

import java.util.Scanner;

public class insertionsort 
{
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
System.out.println("ENter size:");
int n=sc.nextInt();

	int a[]=new int[n];
	System.out.println("Enter Array Elements:");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Sorted Array:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
