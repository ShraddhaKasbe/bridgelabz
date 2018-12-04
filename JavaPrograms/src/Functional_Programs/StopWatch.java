package Functional_Programs;

import java.util.Scanner;

public class StopWatch
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press S to start the timer");
		String s=sc.next();
		long startTimer=System.currentTimeMillis();
		System.out.println("Start Time:"+startTimer);
		
		System.out.println("Press Z to stop the timer");
		String s1=sc.next();
		long stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time:"+stopTimer);
		 
		long elapsedTime=stopTimer-startTimer;
		System.out.println("Elapsed time between start and end is:"+elapsedTime);
		 		
	}
}
