package Algorithm_Programs;

import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anumber:");
		int num=sc.nextInt();
		Utility utility=new Utility();
		Utility.toBinary(num);
		
	}

}
