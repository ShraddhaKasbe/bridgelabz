package Practice;

import java.util.Scanner;

public class ArrayDiemn 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,20,30,10,30};
		int a1[][]=new int[3][3];
		int r=0,c=0;;
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						if(r<3 && c<3)
						{
							a1[r][c++]=a[i];
							a1[r][c++]=i;
							a1[r][c++]=j;
								
							if(c==2)
							{
								r++;
							}
						}
					 }	
				 }
			}
			
			for(r=0;r<a1.length;r++)
			{
				for(c=0;c<a1.length;c++)
				{
					System.out.print(a1[r][c]+" ");
				}
				System.out.println();
			}	
	}
}
	
		



