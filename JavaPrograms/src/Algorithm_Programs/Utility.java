package Algorithm_Programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utility 
{
	/*ANAGRAM STRING OR NOT*/
	public static void isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			
			System.out.println("Strings are not Anagram");	
			
		}
		else
			{
				char c1[]=s1.toCharArray();
				char c2[]=s2.toCharArray();
				Arrays.sort(c1);
				Arrays.sort(c2);
				for(int i=0;i<c1.length;i++)
				{
					if(c1[i]==c2[i])
					{
						System.out.println("Strings are Anagram");
						break;
					}
					else
					{
						System.out.println("Strings are not Anagram");
						break;
					}
				}							
				
		    }
	 }
	/*PRIME NUMBER BETWEEN 1-1000*/
	public static void primeNumber()
	{
		for(int i=1;i<1000;i++)
		{
			boolean isprime=true;
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}
				
			}
			if(isprime)
			{
				System.out.print(i+" ");
			}
		}
	}
	

	/* Prime Palindrom Number and Prime Anagram Number*/
	public static boolean isPrime(int number) 
	{
		if (number < 2) {
			return false;
		}	
		for (int i = 2; i * i <= number; i++) 
		{
			
			if (number % i == 0) {
				return false;

			}
		} 
		return true;
	}
	public static boolean isPalindrome(String str) 
	{
		char arr[] = str.toLowerCase().toCharArray();
		boolean isPalindrome = true;
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++, j--) 
		{
			if (arr[i] == arr[j]) 
			{
				isPalindrome = true;
			} else 
			{
				isPalindrome = false;
				return isPalindrome;
			}
		}
		return isPalindrome;

	}
	
	public static boolean isAnagram1(String lString1, String lString2) 
	{
		boolean isAnagram = true;
		char charArray1[] = lString1.toLowerCase().toCharArray();
		char charArray2[] = lString2.toLowerCase().toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (charArray1.length != charArray2.length) 
		{
			return false;
		} 
		else 
		{
			for (int i = 0; i < charArray1.length; i++) {
				if (charArray1[i] == charArray2[i]) {
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}

			}
		}
		return isAnagram;
	}
	
	/** check the prime number is palindrome or not
	 * 
	 */
	public static void printPrimePalindrome()
	{
		System.out.println("Palindrome Prime number:");
		for (int lNumber = 2; lNumber < 1000; lNumber++)
		{
			if (isPrime(lNumber))
			{
				if (isPalindrome(Integer.toString(lNumber))) 
				{
					System.out.print(lNumber+" ");
				}
			}
		}
	}
	/**
	 * check the prime number is anagram or not
	 */
	public static void primeAnagram() 
	{
		ArrayList<String> primes = new ArrayList<>();
		System.out.println();
		System.out.println("Anagram Prime Numbers");
		for (int i = 0; i < 1000; i++) 
		{
			if (isPrime(i)) 
			{
				primes.add(String.valueOf(i));
			}
		}
		for (int i = 0; i < primes.size(); i++) 
		{
			for (int j = i + 1; j < primes.size(); j++) 
			{
				if (isAnagram1(primes.get(i), primes.get(j)))
				{
					System.out.println(primes.get(i) + "-" + primes.get(j));
				}
			}
		}
	}
	
	
	/*BINARY SEARCH, BUBBLE SORT, INSERTION SORT*/
	/*BINARY SEARCH FOR INTEGER*/
	public static void BinarySearchInteger()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array for binary search:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array elements in sorted order:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key to search an element:");
		int key=sc.nextInt();
		int start=0;
		int last=size-1;
		int mid=(start+last)/2;
		while(start<=last)
		{
			if(a[mid]<key)
			{
				start=mid+1;
			}
			else if(a[mid]==key)
			{
				System.out.println("Element "+key+" found at position "+mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(start+last)/2;
		}
		
		if(start>last)
		{
			System.out.println("Element not found");
		}
	}
	
	/*BINARY SEARCH FOR STRING*/
	public static void BinarySearchString() throws IOException
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		String names[]=new String[size];
		System.out.println("Enter Strings into array:");
		for(int i=0;i<size;i++)
		{
			names[i]=br.readLine();
		}
		System.out.print("Sorted Array of Strings:");
		for(int i=0;i<names.length;i++)
		{
			Arrays.sort(names);
			System.out.print(names[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the key to search an element:");
		String key=br.readLine();
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
	
	/*INSERTION SORT FOR INTEGER*/
	public static void InsertionSortInteger()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Sorted Array after insertion sort:");

		for(int j=1;j<a.length;j++)
		{
			int key=a[j];
			int i=j-1;
			while(i>-1 && a[i]>key)
			{
				a[i+1]=a[i];
				i--;
			}
			a[i+1]=key;	
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}		
	}
	
	/*INSERTION SORT FOR STRING*/
	public static void InsertionSortString() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		String s[]=new String[size];
		System.out.println("Enter Strings into Array:");
		for(int i=0;i<size;i++)
		{
			s[i]=br.readLine();
		}
		System.out.println("Sorted String Array after Insertion Sort:");
		for(int j=1;j<s.length;j++)
		{
			int i=j-1;
			String key=s[j];
			while(i>-1 && s[i].compareTo(key)>0)
			{
				s[i+1]=s[i];
				i--;
			}
			s[i+1]=key;	
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}
	
	/*BUBBLE SORT FOR INTEGER*/
	public static void BubbleSortInteger()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-1;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array after Bubble Sort:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	/*BUBBLE SORT FOR STRING */
	public static void BubbleSortString() throws IOException
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array size: ");
		int size=sc.nextInt();
		String s[]=new String[size];
		System.out.println("Enter String array elements in Array:");
		for(int i=0;i<s.length;i++)
		{
			s[i]=br.readLine();
		}
		for(int i=0;i<s.length;i++)
		{
			for(int j=1;j<s.length;j++)
			{
				if(s[j-1].compareTo(s[j])>0)
				{
					String temp=s[j-1];
					s[j-1]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("Sorted String elements after Bubble Sort:");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}
	
	/*BINARY SEARCH FOR WORDS FROM FILE*/
	public static void BinarySearchForWords() throws IOException
	{
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
				list.add(names[i]);
				System.out.print(names[i]+" ");
			}	
			
			System.out.println();
			System.out.println();
			
			Arrays.sort(names);
			System.out.println("Sorted array of String:");
			for(int i=0;i<names.length;i++)
			{
				System.out.print(names[i]+" ");
			}
			
			System.out.println();
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
	
	
	/*MERGE SORT FOR STRING*/
	public static void mergeSort(String s[],int l,int r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			mergeSort(s,l,mid);
			mergeSort(s,mid+1,r);
			merge(s,l,mid,r);
		}
		
	}
	
	public static void merge(String s[],int l,int mid,int r)
	{
		int n1=mid-l+1;
		int n2=r-mid;
		String temp1[]=new String[n1];
		String temp2[]=new String[n2];
		for(int i=0;i<n1;i++) 
		{
			temp1[i]=s[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			temp2[j]=s[mid+1+j];
		}
		
		int i=0;
		int j=0;
		int k=0;
		while(i<n1 && j<n2)
		{
			if(temp1[i].compareTo(temp2[j])<0)
			{

				s[k]=temp1[i];
				i++;
			}
			else
			{
				
				s[k]=temp2[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			s[k]=temp1[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			s[k]=temp2[j];
			j++;
			k++;
		}
		
	}
	
	
	/*Find the Fewest Notes to be returned for Vending Machine */
	
	public static void NoOfNotes(int amount)
	{
		int no_of_notes;
		if(amount>1000)
		{
			no_of_notes=amount/1000;
			amount=amount%1000;
			System.out.println("No of 1000 rupees notes required for change:"+no_of_notes);
		}
		if(amount>500)
		{
			no_of_notes=amount/500;
			amount=amount%500;
			System.out.println("No of 500 rupees notes required for change:"+no_of_notes);
		}
		if(amount>100)
		{
			no_of_notes=amount/100;
			amount=amount%100;
			System.out.println("No of notes 100 rupees required for change:"+no_of_notes);
		}
		if(amount>50)
		{
			no_of_notes=amount/50;
			amount=amount%50;
			System.out.println("No of notes 50 rupees required for change :"+no_of_notes);
		}
		
		if(amount>10)
		{
			no_of_notes=amount/10;
			amount=amount%10;
			System.out.println("No of notes 10 rupees required for change:"+no_of_notes);
		}
		if(amount>5)
		{
			no_of_notes=amount/5;
			amount=amount%5;
			System.out.println("No of 5 rupees coins required for change:"+no_of_notes);
		}
		if(amount>2)
		{
			no_of_notes=amount/2;
			amount=amount%2;
			System.out.println("No of 2 rupees coins required for change:"+no_of_notes);
		}
		if(amount>1)
		{
			no_of_notes=amount/1;
			amount=amount%1;
			System.out.println("No of 1 rupee coins required for change:"+no_of_notes);
		}
	}
	
	
	/*CALCULATING DAY OF THE WEEK FROM THE GIVEN DATE*/
	
	public static void dayOfWeek()
	{
		int d,m,y;
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter Day:");
			d=sc.nextInt();
			if(d<=31 || d>=1)
			{
				System.out.println("Day is between 1 and 31");
				
			}
		
			System.out.println("Enter Month:");
			m=sc.nextInt();
			if(m<=12 || m>=1)
			{
				System.out.println("Month is between January and Decemeber");
			}
		
		
			System.out.println("Enter Year:");
			y=sc.nextInt();
			if(y<10000 || y>-10000)
			{
				System.out.println("Year is between -10000 and 10000");
			}
	
		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0 =(d+x+31*m0/12) % 7;

			
		if(d0==0)
		{
			System.out.println("It's Sunday");
		}
		else if(d0==1)
		{
			System.out.println("It's Monday");
		}
		else if(d0==2)
		{
			System.out.println("It's Tuesday");
		}
		else if(d0==3)
		{
			System.out.println("It's Wednesday");
		}
		else if(d0==4)
		{
			System.out.println("It's Thursday");
		}
		else if(d0==5)
		{
			System.out.println("It's Friday");
		}
		else
		{
			System.out.println("It's Saturday");
		}
		
	}
	
	
	/*TEMPERATURE CONVERSION*/
	
	public static void temperaturConversion(double tempFar,double tempCel)
	{
		
		 double Fahrenheit= (tempCel * 9/5) + 32; 
		 System.out.println("Conversion of Temperature from Celsius to Fahrenheit:"+Fahrenheit);
		 double Celsius=(tempFar - 32)*5/9; 
		 System.out.println("Conversion of Temperature from Fahrenheit to Celsius:"+Celsius);
		 
	}
	
	
	/*CALCULATE MONTHLY PAYMENT*/
	
	public static void monthlyPayment(double P,int Yr,double R)
	{
		double n=12*Yr;
		double r=R/12*100;
		double payment=P*r/(1-Math.pow(1+r, -n));
		System.out.println("Monthly Payment:"+payment);
	}
	
	/*CALCULATING SQUARE OF A NON NEGATIVE NUMBER USING NEWTON'S METHOD*/
	
	public static void sqrt(int c)
	{
		double t=c;
		double epsilon=1e-15;
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2;
		}
		System.out.println("Square root of number "+c+" is:"+t);
	}
	
	/*COVERTING DECIMAL NUMBER INTO BINARY*/
	public static void toBinary(int num)
	{
		int[] bin=new int[40];
		int k=0;
		while(num>0)
		{
			bin[k++]=num%2;
			num=num/2;
		}
		for(int i = k-1;i >= 0;i--)
		{
		       System.out.print(bin[i]);
		     }
		

	}
	
	
	/*CONVERTING A DECIMAL NUMBER TO BINARY USING INBUILT FUNCTION AND SWAP THE
	 * NIBBLES
	 */
	
	public static void SwapNibbles(int num)
	{
		System.out.println("Decimal Number:"+num);
		String bin=Integer.toBinaryString(num);
		System.out.println("Binary Number after conversion:"+bin);
		String nibble1=bin.substring(0, 4);
		System.out.println("Nibble 1:"+nibble1);
		String nibble2=bin.substring(4,7);
		System.out.println("Nibble 2:"+nibble2);
		String swappNibble=nibble2.concat(nibble1);
		System.out.println("After swapping nibbles:"+swappNibble);
		int dec=Integer.parseInt(swappNibble,2);
		System.out.println("Decimal Number after swapping:"+dec);
		
		
	}
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

