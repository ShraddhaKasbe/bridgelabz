package Algorithm_Programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Binaryword 
{
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String filename="/home/bridgeit/Shraddha/Names.txt";
		File file=new File(filename);
		FileInputStream fis=new FileInputStream(file);
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		ArrayList<String> list=new ArrayList<String>();
		String line;
		while((line=br.readLine()) != null)
		{
			System.out.println(line);
			
			String[] names=line.split(",");
			for(int i=0;i<names.length;i++)
			{
			System.out.println(names[i]);
			}
			for(int i=0;i<names.length;i++)
			{
				list.add(names[i]);	
			}
			Arrays.sort(names);
			for(int i=0;i<names.length;i++)
			{
				System.out.print(names[i]+" ");
			}
			System.out.println();
			System.out.println("Enter key element to search:");
			String key=sc.nextLine();
			int i=0;
			int j=names.length-1;
			int mid=(i+j)/2;
			while(i<=j)
			{
				if(names[mid].compareTo(key)>0)
				{
					j=mid-1;
				}
				else if(names[mid].compareTo(key)<0)
				{
					i=mid+1;
				}
				else
				{
					System.out.println("Element "+key+" found at position "+mid);
					break;
				}
				mid=(i+j)/2;
			}
				
			if(i>j)
			{
				System.out.println("Element not found");
			}	
			
		}	
		
	}

}
