package Functional_Programs;

import java.util.Scanner;

public class Quadratic
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A:");
		int a=sc.nextInt();
		System.out.println("Enter value of B:");
		int b=sc.nextInt();
		System.out.println("Enter value of C:");
		int c=sc.nextInt();
		System.out.println("Roots for the equation" +a+ "x^2 +" +b+"x +" +c);
		double delta=(b*b)-(4*a*c);
		double root1=(-b + Math.sqrt(delta))/(2*a);
		double root2= (-b - Math.sqrt(delta))/(2*a);
		
		if(delta>0)
		{
			System.out.println("There are two real roots");
			System.out.println("First Root:"+root1);
			System.out.println("Second Root:"+root2);
		}
		else if(delta==0)
		{
			System.out.println("There is one real root");
			System.out.println("Root:"+root1);
		}
		else
		{
			System.out.println("There are no real roots");
		}
		
		
	}

}
