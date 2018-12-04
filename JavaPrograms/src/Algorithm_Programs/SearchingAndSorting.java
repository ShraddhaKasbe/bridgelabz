package Algorithm_Programs;

import java.io.IOException;

public class SearchingAndSorting
{
	public static void main(String[] args) throws IOException 
	{
		Utility ut=new Utility();
		long startTimer=System.currentTimeMillis();
		Utility.BinarySearchInteger();
		long stopTimer=System.currentTimeMillis();
		long elapsedTime=stopTimer-startTimer;
		System.out.println("Elapsed time of binary search for integer:"+elapsedTime);
		
		System.out.println();
		startTimer=System.currentTimeMillis();
		Utility.BinarySearchString();
		stopTimer=System.currentTimeMillis();
		elapsedTime=stopTimer-startTimer;
		System.out.println("Elapsed time of binary search for string:"+elapsedTime);
		
		System.out.println();
		startTimer=System.currentTimeMillis();
		Utility.InsertionSortInteger();
		stopTimer=System.currentTimeMillis();
		elapsedTime=stopTimer-startTimer;
		System.out.println("Elapsed time of insertion sort for integer:"+elapsedTime);
		
		System.out.println();
		startTimer=System.currentTimeMillis();
		Utility.InsertionSortString();
		stopTimer=System.currentTimeMillis();
		elapsedTime=stopTimer-startTimer;
		System.out.println("Elapsed time of insertion for string:"+elapsedTime);
		
		System.out.println();
		startTimer=System.currentTimeMillis();
		Utility.BubbleSortInteger();
		stopTimer=System.currentTimeMillis();
		System.out.println("Elapsed time of bubble sort for integer:"+elapsedTime);
		
		System.out.println();
		startTimer=System.currentTimeMillis();
		Utility.BubbleSortString();
		stopTimer=System.currentTimeMillis();
		elapsedTime=stopTimer-startTimer;
		System.out.println("Elapsed time of bubble sort for string:"+elapsedTime);
		
	}

}
