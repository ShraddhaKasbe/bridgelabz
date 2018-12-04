package Functional_Programs;

import java.util.Scanner;

public class Distance
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value for point:");
		double x1=sc.nextDouble();
		System.out.println("Enter second value for point:");
		double y1=sc.nextDouble();
		double x=0,y=0;
		System.out.println("Origin:("+x+","+y+")");
		System.out.println("Point:("+x1+","+y1+")");
		
		double distance=Math.sqrt(Math.pow(x1,2)+Math.pow(y1, 2));
		System.out.println("The Euclidean's distance from point ("+x1+","+y1+") to the origin is:"+distance);
	}

}
