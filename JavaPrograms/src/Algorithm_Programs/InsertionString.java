package Algorithm_Programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		System.out.println("Enter Strings into Array:");
		String s[]=new String[size];
		for(int i=0;i<size;i++)
		{
			s[i]=sc.next();
		}
		System.out.println("Array before Insertion Sort");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		for(int j=1;j<s.length;j++)
		{
			int i=j-1;
			String key=s[j];
			while(i>-1 && s[i].compareTo(key)>0)
			{
				s[i+1]=s[i];
				i--;
			}
			s[i+1]=key;
			
		}
		System.out.println();
		System.out.println("Array after Insertion Sort");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}

}
