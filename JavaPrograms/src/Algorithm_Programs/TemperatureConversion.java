package Algorithm_Programs;

import java.util.Scanner;

public class TemperatureConversion
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit:");
		double tempFar=sc.nextDouble();
		System.out.println("Enter the temperature in Celsius:");
		double tempCel=sc.nextDouble();
		Utility utility=new Utility();
		Utility.temperaturConversion(tempFar,tempCel);
		
	}

}
