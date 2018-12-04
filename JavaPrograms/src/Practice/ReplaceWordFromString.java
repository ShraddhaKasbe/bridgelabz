package Practice;

import java.util.Scanner;

public class ReplaceWordFromString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String name=sc.next();
		
		if(name.length()>2)
		{
			String s="Hello ";
			String s1="<<Your Name>>";
			String msg=s.concat(s1);
			System.out.println("Original Message:"+msg);
			s1=name;
			String replace=s.concat(s1);
			System.out.println("After Replacement:"+replace);
		}	
		
	}

}
