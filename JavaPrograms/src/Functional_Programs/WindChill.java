package Functional_Programs;

import java.util.Scanner;

public class WindChill
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature:");
		double t=sc.nextDouble();
		System.out.println("Enter Speed of the wind:");
		double v=sc.nextDouble();
		if(t<50 && v<120 && v>3)
		{
		double w=Math.abs(35.74+0.6215+(0.4275*t-35.75)*(Math.pow(v, 0.16)));
		System.out.println("Temperature is:"+t);
		System.out.println("Speed of the wind is:"+v);
		System.out.println("The effective temperature of windchill is:"+w);
		}
		else
		{
			System.out.println("Invalid value entered");
		}
	}

}
