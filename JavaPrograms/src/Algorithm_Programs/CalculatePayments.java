package Algorithm_Programs;

import java.util.Scanner;

public class CalculatePayments
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal amount:");
		double P=sc.nextDouble();
		System.out.println("Enter No of Years to pay:");
		int Yr=sc.nextInt();
		System.out.println("Enter Rate of interest:");
		double R=sc.nextDouble();
		Utility utility=new Utility();
		Utility.monthlyPayment(P,Yr,R);
		
	}

}
