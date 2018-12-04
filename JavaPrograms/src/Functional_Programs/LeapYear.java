package Functional_Programs;

import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year=sc.nextInt();
		 if (year <= 9999 & year >999  )
		 {
			if(year%4==0 && year%100!=0 || year%400==0)
			{
				System.out.println("Entered year " +year+" year is a leap year");
			}
			else
			{
				System.out.println("Entered year " +year+" is not a leap year");
			}
			
		}
		
		 else
		 	{
			 System.out.println("Ensure entered year is of four digit");
		 	}
	sc.close();
	}

}
