package Algorithm_Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		System.out.println("Enter Strings into array:");
		String s[]=new String[size];
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
		System.out.println("Elements before Merge Sort:");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		
		Utility.mergeSort(s,0,s.length-1);
		System.out.println();
		System.out.println("Elements after Merge Sort:");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		
	}

}
