package Practice;

public class A 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60,70,80,90};
		int count=0;
		int a1[][]=new int[3][3];
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				
					for(int r=0;r<3;i++)
					{
						for(int c=0;c<3;j++)
						{
							a1[r][c++]=a[i];
							a1[r][c++]=i;
							a1[r][c++]=j;
				
							System.out.print(a1[r][c]+" ");
						}System.out.println();
					}
				}
			}
		}for(int r=0;r<a1.length;r++)
		{
			for(int c=0;c<a1.length;c++)
			{
				System.out.print(a1[r][c]+" ");
			}
			System.out.println();
		}
		
	}

}
