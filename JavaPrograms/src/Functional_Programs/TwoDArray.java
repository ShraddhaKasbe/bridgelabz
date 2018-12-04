package Functional_Programs;

import java.io.PrintWriter;
import java.util.Scanner;


public class TwoDArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of rows:");
		int row=sc.nextInt();
		System.out.println("Enter Number of columns:");
		int col=sc.nextInt();
		int i,j;
		int a[][]=new int[row][col];
		double a1[][]=new double[row][col];
		boolean a2[][]=new boolean[row][col];
		PrintWriter pw=new PrintWriter(System.out,true);
		pw.println("Array elements for Integer:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		pw.println("Array elements for Double:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a1[i][j]=sc.nextDouble();
			}
		}
		
		pw.println("Array elements for Boolean:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a2[i][j]=sc.nextBoolean();
			}
		}
		
		
		pw.println("Two Dimensional Array for Integer");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				pw.write(" "+a[i][j]+" ");
				
			}pw.println();
			
		}pw.println();
		
		pw.println("Two Dimensional Array for Double");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				pw.write(" "+a1[i][j]+" ");
				
			}pw.println();
			
		}pw.println();
		
		pw.println("Two Dimensional Array for Boolean");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				pw.write(" "+a2[i][j]+" ");
				
			}
			pw.println();
			
		}
		
		
	}

}
