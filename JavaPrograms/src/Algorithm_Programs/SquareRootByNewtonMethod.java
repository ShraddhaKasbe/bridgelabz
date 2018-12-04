package Algorithm_Programs;

import java.util.Scanner;

public class SquareRootByNewtonMethod
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int c=sc.nextInt();
		Utility utility=new Utility();
		Utility.sqrt(c);
	}
	
			

}
