package Algorithm_Programs;

import java.util.Scanner;

public class VendingMachine
{
	public static void main(String[] args)
	{
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		Utility.NoOfNotes(amount);
		
	}

}
