package Functional_Programs;

import java.util.Scanner;

public class ReplaceUserName
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		String username=sc.next();
		if(username.length()>2)
		{
			String s="Hello <<UserName>>, How are you?";
			String replacestring=s.replace("<<UserName>>",username.toUpperCase());
			System.out.println(replacestring);
		}
		
		else
		{
			System.out.println("Username must contain minimum 3 characters");
		}
		sc.close();
		
	}

}
