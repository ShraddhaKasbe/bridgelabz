package Algorithm_Programs;

import java.util.Scanner;

public class Anagram
{
	public static void main(String[] args)
	{
		Utility ut=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String:");
		String s1=sc.next();
		System.out.println("Enter Second String:");
		String s2=sc.next();
		ut.isAnagram(s1,s2);
		
	}

}
