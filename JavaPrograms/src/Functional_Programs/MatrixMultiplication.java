package Functional_Programs;

import java.io.PrintWriter;
import java.util.Scanner;

public class MatrixMultiplication
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int i,j,row,col;
		System.out.println("Enter number of rows:");
		row=sc.nextInt();
		System.out.println("Enter number of column:");
		col=sc.nextInt();
		
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int c[][]=new int[row][col];
		
		System.out.println("Enter the array element of matrix A:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the array element of matrix B:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
			}
		}
		
		
		System.out.println("Matrix A");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Matrix B");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Resultant Matrix after multiplication");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
	}
}
		
		