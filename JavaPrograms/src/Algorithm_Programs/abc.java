package Algorithm_Programs;

import java.util.Arrays;

public class abc 
{
	public static void main(String[] args)
	{
		String s[]= {"xyz","pqr","mno","abc"};
		
		for(int i=0;i<s.length;i++)
		{
		
		Arrays.sort(s);
		System.out.print(s[i]+" ");
		}
		String key="xyz";
		
	    
	    
	    System.out.println();
	    int i=0;
	    int j=s.length-1;
	    int mid=(i+j)/2;
	    System.out.println(mid);
	    while(i<=j)
	    {
	    if(s[mid].compareTo(key)>0)
	    {
	    	j=mid-1;
	    }
	    else if(s[mid].compareTo(key)<0)
	    {
	    	i=mid+1;
	    }
	    else
	    {
	    	System.out.println("Element found");
	    	break;
	    }mid=(i+j)/2;
	    }
	   
	    if(i>j)
	    {
	    	System.out.println("ELement not found");
	    }
}
}
	

