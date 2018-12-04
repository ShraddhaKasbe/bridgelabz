package Algorithm_Programs;

import java.util.Scanner;

public class MergeSortNumber
{
	public static void mergeSort(int a[],int left,int right)
	{
		if(left<right)
		{
			int mid=(left+right)/2;
			mergeSort(a,left,mid);
			mergeSort(a,mid+1,right);
			merge(a,left,mid,right);
		}
		
	}
	
	public static void merge(int a[],int left,int mid,int right)
	{
		int n1=mid-left+1;
		int n2=right-mid;
		int temp1[]=new int[n1];
		int temp2[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			temp1[i]=a[left+i];
		}
		for(int j=0;j<n2;j++)
		{
			temp2[j]=a[mid+1+j];
		}
		int i=0,j=0,k=0;
		while(i<n1 && j<n2)
		{
			if(temp1[i]<temp2[j])
			{
				a[k]=temp1[i];
				i++;
			}
			else
			{
				a[k]=temp2[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			a[k]=temp1[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			a[k]=temp2[j];
			j++;
			k++;
		}
			
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter aray size:");
		int size=sc.nextInt();
		System.out.println("Enter array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		mergeSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
