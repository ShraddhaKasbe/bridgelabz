package Algorithm_Programs;

import java.util.Scanner;

public class Binary
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		Utility utility=new Utility();
		Utility.SwapNibbles(num);
		
	}

}
