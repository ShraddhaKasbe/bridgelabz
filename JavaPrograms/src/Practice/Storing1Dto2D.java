package Practice;

public class Storing1Dto2D 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,20,30,40,50,60,40,30};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.println("Duplicate Element:"+a[i]);
					
				}
			}
		}
		
	}

}
